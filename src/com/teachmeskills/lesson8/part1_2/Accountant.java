package com.teachmeskills.lesson8.part1_2;

/**
 * implementing a method into a created class
 */
public class Accountant implements IJobTitle{
    String position = "Accountant";

    public void printJobTitle(){
        System.out.println(this.position);
    }
}
