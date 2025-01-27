package org.example.designpattern.builderdesignpattern.java8;

public class GenericBuildTest {
    public static void main(String [] args){

        GenericPost ps = GenericBuilder
                .of(GenericPost::new)
                .with(GenericPost::setTitle,"test")
                .build();
        System.out.println(ps);
    }
}
