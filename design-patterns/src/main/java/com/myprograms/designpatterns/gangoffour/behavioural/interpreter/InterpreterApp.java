package com.myprograms.designpatterns.gangoffour.behavioural.interpreter;

import java.util.List;

public class InterpreterApp {
    public static void main(String[] args) {

        Clause query = new Select("name", new From("people"));
        Context ctx = new Context();
        List<String> result = query.interpret(ctx);
        System.out.println(result);

        Clause query2 = new Select("*", new From("people"));
        List<String> result2 = query2.interpret(ctx);
        System.out.println(result2);

        Clause query3 = new Select("name", new From("people", new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interpret(ctx);
        System.out.println(result3);
    }
}
