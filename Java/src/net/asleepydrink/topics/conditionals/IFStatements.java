// Our package name of where the file is created in, (YOU NEED THIS)
package net.asleepydrink.topics.conditionals;

/*
 *
 * NOTICE!
 *
 * In this class we use variables, if you don't know what a variable is
 * and wish to proceed with this please head to net.asleepydrink.topics.variables
 *
 */

// The class, (The name of the class is what your file is.)
public class IFStatements {

    // Define our number variable here, assigning it 0 when we define it.
    static int number = 0;

    // Start condition, this allows our program to run in this specific file.
    public static void main(String[] args) {
        /*
         * This is our if statement block,
         *
         * If statements go under the influence of if you have to check 1 thing and 1 thing only, use it. else wise use
         * a switch statement.
         *
         * If statements should only be used if you're checking 1 thing. If you constantly nest an if statement it will
         * look so bad, that you will be bullied for it. If you plan to check multiple things, you're better off using a
         * switch statement to check. OR you can chain them using an "if else if" statement.
         */
        if (number == 0) {
            /*
             * This is where your code gets executed.
             */
            System.out.println("Your number is 0!");
        } else {
            /*
             * If our number is not 0, then we will return back a default value.
             */
            System.out.println("I think you went a little to far off the charts... i don't think our number is " + number);
        }
    }

}
