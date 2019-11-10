package com.myprograms.miscellaneous.reflectiontest;

import java.util.HashMap;

public class ReflectionJUnit {
    private void findMajority(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) +1;
                if (count > arr.length /2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);
            }
            else
                map.put(arr[i],1);
        }
        System.out.println(" No Majority element");
    }

    private void printIt(){
        System.out.println("printIt() no param");
    }

    private void printItString(String temp){
        System.out.println("printIt() with param String : " + temp);
    }

    private void printItInt(int temp){
        System.out.println("printIt() with param int : " + temp);
    }

    private int counter;

    private void setCounter(int counter){
        this.counter = counter;
        System.out.println("setCounter() set counter to : " + counter);
    }

    private void printCounter(){
        System.out.println("printCounter() : " + this.counter);
    }

}
