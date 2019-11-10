package com.myprograms.miscellaneous.general;

public class VariableArguments {

    public static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;

        return min;
    }


    public static void main(String[] args) {
        //System.out.println(min(3,2,4,5,1));

        int n = 1;
        for (int i = 0; i < n; i++) {
            int d = 2;
            int a = 5;
            int m = 4;
            int b = 3;
            int x = 46;

            int sum = d;
            int total = 0;

            boolean flag = true;
            while (flag) {
                if (sum + a * m <= x) {
                    sum = sum + a * m;
                    total += m;
                }
                else {
                    for (int c = m; c > 0; c--) {
                        if (sum >= x) {
                            System.out.println(total);
                            flag = false;
                            break;
                        }
                        sum += a;
                        total++;
                    }
                }


                if (flag) {
                    sum += b;
                    total++;
                }
            }
        }

    }
}
