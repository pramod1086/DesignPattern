package org.example.designpattern.builderdesignpattern.prejava8;

public  class BuilderTest {

    public static void main(String [] args) {
        Employee employee = new Employee.Builder().title("test").build();
        System.out.println(employee.toString());



    }


}
