package com.teachmeskills.lesson8.part1_2;

/**
 * implementing a method into a created class
 */
public class Worker implements IJobTitle{
    public String position = "Worker";

    public void printJobTitle(){
        System.out.println(this.position);
    }
}
