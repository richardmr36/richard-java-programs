package com.myprograms.designpatterns.gangoffour.behavioural.interpreter;

import java.util.List;

public interface Clause {
    List<String> interpret(Context ctx);
}
