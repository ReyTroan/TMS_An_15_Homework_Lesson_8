package com.teachmeskills.lesson8.part1_2;

/**
 * created an array of classes with the implementation of the interface
 * and through a loop displayed the value on the screen
 */
public class Runner {

    public static void main(String[] args) {
        IJobTitle[] jobTitles = {new Director(), new Worker(), new Accountant()};

        for (IJobTitle job : jobTitles){
            job.printJobTitle();
        }

    }
}
