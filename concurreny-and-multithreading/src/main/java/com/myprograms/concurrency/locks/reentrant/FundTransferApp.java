package com.myprograms.concurrency.locks.reentrant;

public class FundTransferApp {
    public static void main(String[] args) {
        testTransferFundSucess();
        testTransferFundNoBalance();
        testTransferTimeOut();
        testWithdrawSucess();
        testWithdrawNoBalance();
        testWithdrawTimeOut();
        testDepositSucess();
        testDepositTimeOut();
    }

    private static void testTransferFundSucess() {
        Account mathew = new Account(1001, 10000, "Mathew George");
        Account reeba = new Account(1002, 10000, "Reeba Mathew");
        try {
            FundTransferService.transferFund(mathew, reeba, 3000);
        }
        catch (FundTransferException e) {
            e.printStackTrace();
        }
        System.out.println("testTransferFundSucess");
        System.out.println("Balance - Mathew " + mathew.getBalance());
        System.out.println("Balance - Reeba " + reeba.getBalance());
        System.out.println("==============================================");
    }

    private static void testTransferFundNoBalance() {
        Account mathew = new Account(1001, 2000, "Mathew George");
        Account reeba = new Account(1002, 10000, "Reeba Mathew");
        try {
            FundTransferService.transferFund(mathew, reeba, 3000);
        }
        catch (FundTransferException e) {
            System.out.println(e.getErrorCode().name());
        }
        System.out.println("testTransferFundNoBalance");
        System.out.println("Balance - Mathew " + mathew.getBalance());
        System.out.println("Balance - Reeba " + reeba.getBalance());
        System.out.println("==============================================");
    }

    private static void testTransferTimeOut() {
        Account mathew = new Account(1001, 1000, "Mathew George");
        Account reeba = new Account(1002, 10000, "Reeba Mathew");
        Thread t1 = new Thread(() -> {
            try {
                FundTransferService.transferFund(mathew, reeba, 3000);
            }
            catch (FundTransferException e) {
                System.out.println(e.getErrorCode().name());
            }
        });
        mathew.getLock().lock();
        t1.start();
        try {
            t1.join();
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("testTransferTimeOut");
        System.out.println("Balance - Mathew " + mathew.getBalance());
        System.out.println("Balance - Reeba " + reeba.getBalance());
        System.out.println("==============================================");
    }

    private static void testWithdrawSucess() {
        Account mathew = new Account(1001, 10000, "Mathew George");
        Account reeba = new Account(1002, 10000, "Reeba Mathew");
        try {
            FundTransferService.withdraw(mathew, 3000);
            FundTransferService.withdraw(reeba, 4000);
        }
        catch (FundTransferException e) {
            e.printStackTrace();
        }
        System.out.println("testWithdrawSucess");
        System.out.println("Balance - Mathew " + mathew.getBalance());
        System.out.println("Balance - Reeba " + reeba.getBalance());
        System.out.println("==============================================");
    }

    private static void testWithdrawNoBalance() {
        Account mathew = new Account(1001, 2000, "Mathew George");
        Account reeba = new Account(1002, 10000, "Reeba Mathew");
        try {
            FundTransferService.withdraw(mathew, 3000);
            FundTransferService.withdraw(mathew, 13000);
        }
        catch (FundTransferException e) {
            System.out.println(e.getErrorCode().name());
        }
        System.out.println("testWithdrawNoBalance");
        System.out.println("Balance - Mathew " + mathew.getBalance());
        System.out.println("Balance - Reeba " + reeba.getBalance());
        System.out.println("==============================================");
    }

    private static void testWithdrawTimeOut() {
        Account mathew = new Account(1001, 1000, "Mathew George");
        Thread t1 = new Thread(() -> {
            try {
                FundTransferService.withdraw(mathew, 3000);
            }
            catch (FundTransferException e) {
                System.out.println(e.getErrorCode().name());
            }
        });
        mathew.getLock().lock();
        t1.start();
        try {
            t1.join();
        }
        catch (InterruptedException ie) {
        }
        System.out.println("testTransferTimeOut");
        System.out.println("Balance - Mathew " + mathew.getBalance());
        System.out.println("==============================================");
    }

    private static void testDepositSucess() {
        Account mathew = new Account(1001, 10000, "Mathew George");
        Account reeba = new Account(1002, 10000, "Reeba Mathew");
        try {
            FundTransferService.deposit(mathew, 3000);
            FundTransferService.deposit(reeba, 4000);
        }
        catch (FundTransferException e) {
            e.printStackTrace();
        }
        System.out.println("testWithdrawSucess");
        System.out.println("Balance - Mathew " + mathew.getBalance());
        System.out.println("Balance - Reeba " + reeba.getBalance());
        System.out.println("==============================================");
    }

    private static void testDepositTimeOut() {
        Account mathew = new Account(1001, 1000, "Mathew George");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FundTransferService.deposit(mathew, 3000);
                }
                catch (FundTransferException e) {
                    System.out.println(e.getErrorCode().name());
                }
            }
        });
        mathew.getLock().lock();
        t1.start();
        try {
            t1.join();
        }
        catch (InterruptedException ie) {
        }
        System.out.println("testTransferTimeOut");
        System.out.println("Balance - Mathew " + mathew.getBalance());
        System.out.println("==============================================");
    }
}