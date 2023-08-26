package com.teachmeskills.lesson8.part1_2;

/**
 * implementing a method into a created class
 */
public class Director implements IJobTitle{
    String position = "Director";

    public void printJobTitle(){
        System.out.println(this.position);
    }
 }

