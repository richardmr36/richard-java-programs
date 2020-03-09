package com.myprograms.miscellaneous.general;

public class ShutdownHookApp {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Executing Shutdown Hook!!")));
        System.out.println("End of main execution!");
    }
}
