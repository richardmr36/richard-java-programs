package com.myprograms.miscellaneous.enums.withdefinedmethods;

public class EnumWithDefinedMethods {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Operator operator = Operator.DIVIDE;
        int result = operator.execute(num1, num2);
        System.out.println("result: " + result);
    }
}
