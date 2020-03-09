package com.myprograms.designpatterns.gangoffour.structural.composite.client;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.myprograms.designpatterns.gangoffour.structural.composite.component.Department;
import com.myprograms.designpatterns.gangoffour.structural.composite.composite.Manager;
import com.myprograms.designpatterns.gangoffour.structural.composite.leaf.Engineer;

public class CompositeApp {
    public static void main(String[] args) throws Exception {
        Engineer ajay = new Engineer(1001l, "Ajay", "Developer", Department.ENG);
        Engineer vijay = new Engineer(1002l, "Vijay", "SR. Developer", Department.ENG);
        Engineer jay = new Engineer(1003l, "Jay", "Lead", Department.ENG);
        Engineer martin = new Engineer(1004l, "Martin", "QA", Department.ENG);
        Manager kim = new Manager(1005l, "Kim", "Manager", Department.ENG);
        Engineer anders = new Engineer(1006l, "Andersen", "Developer", Department.ENG);
        Manager niels = new Manager(1007l, "Niels", "Sr. Manager", Department.ENG);
        Engineer robert = new Engineer(1008l, "Robert", "Developer", Department.ENG);
        Manager rachelle = new Manager(1009l, "Rachelle", "Product Manager", Department.ENG);
        Engineer shailesh = new Engineer(1010l, "Shailesh", "Engineer", Department.ENG);
        kim.manages(ajay);
        kim.manages(martin);
        kim.manages(vijay);

        niels.manages(jay);
        niels.manages(anders);
        niels.manages(shailesh);

        rachelle.manages(kim);
        rachelle.manages(robert);
        rachelle.manages(niels);

        String directory = "./src/main/java/com/myprograms/designpatterns/gangoffour/structural/composite/client/";
        addPropertiesFileFolderToClasspath(new File(directory));

        WorkLoader workLoad = new WorkLoader("work.properties");
        workLoad.getWorkList().stream().forEach(work -> {
            rachelle.assignWork(rachelle, work);
        });

        rachelle.performWork();

    }

    private static void addPropertiesFileFolderToClasspath(File dirFile) throws Exception {
        URL moduleURL = dirFile.toURI().toURL();
        final Class[] parameters = new Class[]{URL.class};

        URLClassLoader systemClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        Class urlClassLoaderClass = URLClassLoader.class;

        try {
            Method method = urlClassLoaderClass.getDeclaredMethod("addURL", parameters);
            method.setAccessible(true);
            method.invoke(systemClassLoader, moduleURL);
        } catch (Throwable t) {
            t.printStackTrace();
            throw new IOException("Error, could not add URL to system classloader");
        }
    }
}
