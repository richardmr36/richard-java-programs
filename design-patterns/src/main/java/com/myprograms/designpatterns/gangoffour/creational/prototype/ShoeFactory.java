package com.myprograms.designpatterns.gangoffour.creational.prototype;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ShoeFactory {

    private static Map<String, Object> prototypes = new HashMap<String, Object>();

    static {
        prototypes.put("Sport", new SportShoes());
        prototypes.put("Casual", new CasualShoes());
        prototypes.put("Formal", new FormalShoes());
    }

    public static Shoes makeObject(String shoesType) {
        Shoes shoes = (Shoes) prototypes.get(shoesType);
        //deep cloning (using in-memory)
        try {
            Shoes deepClonedShoes = shoes.deepCloning();
            System.out.println("Deep-Cloned Shoes ========== " + deepClonedShoes);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Shallow cloning
        Shoes shallowClonedShoes = null;
        try {
            shallowClonedShoes = (Shoes) shoes.shallowCloning();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Shallow-Cloned Shoes ========== " + shallowClonedShoes);
        return shallowClonedShoes;
    }
}
