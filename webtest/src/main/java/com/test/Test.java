package com.test;

public class Test {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test(String name) {
        this.name = name;
    }
    public Test() {
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public void showdemo(){
        System.out.print("test");
    }
}
