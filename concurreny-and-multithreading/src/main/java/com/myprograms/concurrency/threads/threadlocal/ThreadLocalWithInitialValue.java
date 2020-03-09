package com.myprograms.concurrency.threads.threadlocal;

public class ThreadLocalWithInitialValue {
    /*private static ThreadLocal threadLocal = new ThreadLocal() {
        @Override
        protected Object initialValue() {
            System.out.println("Returning Initial Value...");
            return Integer.valueOf(36);
        }
    };*/

    private static ThreadLocal threadLocal = ThreadLocal.withInitial(() -> {
        System.out.println("Returning Initial Value...");
        return Integer.valueOf(36);
    });

    public static void main(String[] args) {
        System.out.println("Calling thread local without setting...");
        System.out.println("Value Returned :  " + threadLocal.get());

        System.out.println("Calling thread local without setting again...");
        System.out.println("Value Returned :  " + threadLocal.get());
    }
}
