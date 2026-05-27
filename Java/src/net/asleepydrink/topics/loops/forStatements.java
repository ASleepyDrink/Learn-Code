// Our package name of where the file is created in, (YOU NEED THIS)
package net.asleepydrink.topics.loops;

/*
 *
 * NOTICE!
 *
 * In this class we use console output, if you don't know how to use it console output will always be this.
 *
 * System.out.println();
 *
 */

// The class, (The name of the class is what your file is.)
public class forStatements {

    // Start condition, this allows our program to run in this specific file.
    public static void main(String[] args) {
        /*
         * This will define a numeric valued variable at 0
         * it will then check if its less than 5
         * if its less than 5 it will add 1 to the current count.
         *
         * Explanation:
         * int i = 0; - Defines the variable "i" as 0
         * i <= 5; - Checks if our variable "i" is less than 5
         * i++ - Adds 1 to the current variable "i"
         */
        for (int i = 0; i <= 5; i++) {
            /*
             * This will output the variable value below
             *
             * This is how it should look like in the end:
             * 0
             * 1
             * 2
             * 3
             * 4
             * 5
             */
            System.out.println(i);
        }
    }

}
