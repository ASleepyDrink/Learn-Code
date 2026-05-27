// Our package name of where the file is created in, (YOU NEED THIS)
package net.asleepydrink.topics.variables;

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
public class booleans {

    /* This is our third variable, we named it status, and gave it a default true or false.
     * this is what each word means.
     *
     * static - Cannot be changed contains default values
     * boolean - This is for
     * status - This is our variable name
     * = - We are about to define a value
     * false; - Our value of our variable.
     *
     * Some things to note about boolean variables.
     *
     * Boolean variables can only carry true or false
     */
    static boolean status = false;

    // Start condition, this allows our program to run in this specific file.
    public static void main(String[] args) {
        // Sending our variables data to the console
        System.out.println("The current status is: " + status);
    }

}
