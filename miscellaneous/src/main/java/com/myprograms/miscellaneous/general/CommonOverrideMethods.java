package com.myprograms.miscellaneous.general;

import java.util.Objects;

public class CommonOverrideMethods implements Cloneable {
    private int id;
    private String name;

    public CommonOverrideMethods(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonOverrideMethods that = (CommonOverrideMethods) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(id, name);
        int result = Integer.hashCode(id);
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CommonOverrideMethods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected CommonOverrideMethods clone() {
        try {
            return (CommonOverrideMethods) super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Cannot clone");
        }
        return null;
    }
}
