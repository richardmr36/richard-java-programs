package com.myprograms.miscellaneous.nashorn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornApp {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
        String script = "var welcome = 'Hello world!!'; welcome";

        try {
            System.out.println(scriptEngine.eval(script));
        }
        catch (ScriptException e) {
            e.printStackTrace();
        }

        File file = new File("./src/main/java/com/myprograms/miscellaneous/nashorn/script.js");

        try {
            Reader reader = new FileReader(file);
            System.out.println(scriptEngine.eval(reader));
        }
        catch (ScriptException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
