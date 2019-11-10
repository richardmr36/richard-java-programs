package com.myprograms.designpatterns.gangoffour.structural.composite.leaf;

import java.util.ArrayList;
import java.util.List;

import com.myprograms.designpatterns.gangoffour.structural.composite.component.Calculator;
import com.myprograms.designpatterns.gangoffour.structural.composite.component.Department;
import com.myprograms.designpatterns.gangoffour.structural.composite.component.Employee;
import com.myprograms.designpatterns.gangoffour.structural.composite.component.Work;

public class Engineer extends Employee {
    private List<Work> works = new ArrayList<Work>();

    public Engineer(long employeeId, String employeeName, String designation, Department department) {
        super(employeeId, employeeName, designation, department);
    }

    @Override
    public int teamSize() {
        return 1;
    }

    @Override
    public void assignWork(Employee manager, Work work) {
        this.works.add(work);
        System.out.println(this + " has assigned work of '" + work + "' by manager " + manager);
    }

    @Override
    public void performWork() {
        System.out.println(this + " is performing work of '" + works + "'");
        works.stream().forEach(work -> {
            work.getWork().stream().forEach(value -> {
                Calculator calculator = work.getWorkType();
                System.out.println(this + " has result of work of '" + work + "' as : " + calculator.calculate(value));
            });
        });
        works.clear();
    }
}
