package com.myprograms.designpatterns.gangoffour.behavioural.interpreter;

import java.util.List;

public class From implements Clause {

    private String table;
    private Where where;

    From(String table) {
        this.table = table;
    }

    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setTable(table);
        if (where == null) {
            return ctx.search();
        }
        return where.interpret(ctx);
    }
}
