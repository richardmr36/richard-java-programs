package com.myprograms.miscellaneous.objectreference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceApp {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        final ReferenceQueue queue = new ReferenceQueue();
        PhantomReference phantomReference = new PhantomReference(object, queue);
        object = null;

        Runnable runnable = () -> {
            try {
                System.out.println("Awaiting for GC...");
                // This will block till it is GC'ed
                PhantomReference reference = (PhantomReference) queue.remove();

                System.out.println("Reference has been GC'ed !!");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(runnable).start();
        Thread.sleep(2000);

        System.out.println("Invoking GC...");
        System.gc();
    }
}
