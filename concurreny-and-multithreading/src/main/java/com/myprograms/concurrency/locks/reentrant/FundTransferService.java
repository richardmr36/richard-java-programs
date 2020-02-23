package com.myprograms.concurrency.locks.reentrant;

import java.util.concurrent.TimeUnit;

public class FundTransferService {
    /**
     * One Second time out
     */
    private static final long TIMEOUT_INTERVAL = 5 * 1000;

    public static boolean transferFund(Account from, Account to, long amount) throws FundTransferException {
        boolean haveMoney = haveEnoughBalance(from, amount);
        boolean success = false;
        if (haveMoney) {
            boolean doTry = true;
            long tryTime = System.currentTimeMillis() + TIMEOUT_INTERVAL;
            while (doTry) {
                try {
                    if (from.getLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                        if (to.getLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                            from.setBalance(from.getBalance() - amount);
                            to.setBalance(to.getBalance() + amount);
                            doTry = false;
                            success = true;
                            break;
                        }
                    }
                    if (System.currentTimeMillis() > tryTime) {
                        throw new FundTransferException(FundTransferException.ERROR_CODE.TRANSACTION_TIMEOUT);
                    }
                }
                catch (InterruptedException ie) {
                    throw new FundTransferException(FundTransferException.ERROR_CODE.SERVICE_UNAVAILABLE);
                }
                finally {
                    if (success) {
                        to.getLock().unlock();
                        from.getLock().unlock();
                    }
                }
            }
        }
        return success;
    }

    public static boolean deposit(Account account, long amount) throws FundTransferException {
        return doDepositOrWithdraw(account, amount, true);
    }

    public static boolean withdraw(Account account, long amount) throws FundTransferException {
        boolean haveMoney = haveEnoughBalance(account, amount);
        if (haveMoney) {
            return doDepositOrWithdraw(account, amount, false);
        }
        return false;
    }

    private static boolean doDepositOrWithdraw(Account account, long amount, boolean isDeposit)
            throws FundTransferException {
        boolean doTry = true;
        long tryTime = System.currentTimeMillis() + TIMEOUT_INTERVAL;
        boolean success = false;
        while (doTry) {
            try {
                if (account.getLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                    long balance = isDeposit == true ? account.getBalance() + amount : account.getBalance() - amount;
                    account.setBalance(balance);
                    doTry = false;
                    success = true;
                    break;
                }
                if (System.currentTimeMillis() > tryTime) {
                    throw new FundTransferException(FundTransferException.ERROR_CODE.TRANSACTION_TIMEOUT);
                }
            }
            catch (InterruptedException ie) {
                throw new FundTransferException(FundTransferException.ERROR_CODE.SERVICE_UNAVAILABLE);
            }
            finally {
                if (success) {
                    account.getLock().unlock();
                }
            }
        }
        return success;
    }

    private static boolean haveEnoughBalance(Account account, long amount) throws FundTransferException {
        boolean doTry = true;
        long tryTime = System.currentTimeMillis() + TIMEOUT_INTERVAL;
        boolean haveMoney = false;
        boolean gotLock = false;
        while (doTry) {
            try {
                if (account.getLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                    gotLock = true;
                    if (account.getBalance() < amount) {
                        haveMoney = false;
                        throw new FundTransferException(FundTransferException.ERROR_CODE.INSUFFICIENT_BALENCE);
                    }
                    else {
                        haveMoney = true;
                        break;
                    }
                }
                if (System.currentTimeMillis() > tryTime) {
                    throw new FundTransferException(FundTransferException.ERROR_CODE.TRANSACTION_TIMEOUT);
                }
            }
            catch (InterruptedException ie) {
                throw new FundTransferException(FundTransferException.ERROR_CODE.SERVICE_UNAVAILABLE);
            }
            finally {
                if (gotLock) {
                    account.getLock().unlock();
                }
            }
        }
        return haveMoney;
    }
}