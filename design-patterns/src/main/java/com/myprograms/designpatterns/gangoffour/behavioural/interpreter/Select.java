package com.myprograms.designpatterns.gangoffour.behavioural.interpreter;

import java.util.List;

public class Select implements Clause {

    private String column;
    private From from;

    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setColumn(column);
        return from.interpret(ctx);
    }
}
