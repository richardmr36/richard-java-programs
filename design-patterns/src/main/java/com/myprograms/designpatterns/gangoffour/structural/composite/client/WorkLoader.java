package com.myprograms.designpatterns.gangoffour.structural.composite.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.myprograms.designpatterns.gangoffour.structural.composite.component.Calculator;
import com.myprograms.designpatterns.gangoffour.structural.composite.component.Work;

public class WorkLoader {
    protected Properties properties = new Properties();

    public WorkLoader(String fileName) {
        try (InputStream input = WorkLoader.class.getClassLoader().getResourceAsStream(fileName)) {
            // load a properties file
            properties.load(input);
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public List<Work> getWorkList() {
        List<Work> workList = new ArrayList<Work>();
        Set<Object> keys = properties.keySet();
        for (Object key : keys) {
            String workType = key.toString().substring("Calculate".length() + 1).toUpperCase();
            String values = properties.getProperty(key.toString());
            Work work = new Work(Calculator.valueOf(workType), Arrays.asList(values.split(", ")));
            workList.add(work);
        }
        return workList;
    }
}
