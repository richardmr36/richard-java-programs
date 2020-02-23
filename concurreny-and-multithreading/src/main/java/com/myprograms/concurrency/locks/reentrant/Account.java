package com.myprograms.concurrency.locks.reentrant;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class Account implements Serializable {
    private static final long serialVersionUID = -935328553578153571L;
    private long accountId;
    private String customerName;
    private AtomicLong balance = new AtomicLong(0L);
    private ReentrantLock lock = new ReentrantLock();

    public Account(long acId, long bal, String cName) {
        accountId = acId;
        customerName = cName;
        balance.set(bal);
    }

    public ReentrantLock getLock() {
        return lock;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getBalance() {
        return balance.get();
    }

    public void setBalance(long balance) {
        this.balance.set(balance);
    }
}