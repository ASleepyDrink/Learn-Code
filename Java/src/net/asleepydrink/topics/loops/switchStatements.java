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
public class switchStatements {

    // Define a variable
    static String hi = "hello";

    // Start condition, this allows our program to run in this specific file.
    public static void main(String[] args) {

        /*
         * This switch statement allows you to check a variable for specific data.
         *
         * So lets say if your variable contains the word "hello" instead of writing a ton of
         * if statements and chaining it, you can write a switch statement which will execute ONLY
         * the code that comes out of the switch statement.
         *
         * So if your variable says hi, it will only execute the code under the case of "hi".
         * If your variable says hello, it will only execute the code under the case of "hello"
         */
        switch (hi) {
            /*
             * Case, is like an "if" statement, but instead of running all the code to figure out what it's gotta run
             * it just runs that 1 block.
             */
            case "hi":
                /*
                 * All your code with in your switch statement would go here.
                 * You can put however much code you want in here, it will not matter.
                 */
                System.out.println("Your variable says hi!");
                // This keyword, 'break' escapes you out of the switch statement.
                break;
            case "hello": // <- Your "if" statement
                System.out.println("Your variable says hello!"); // <- Your entire code section within the statement
                break; // <- Your escape statement to exit this switch statement.
        }
    }

}
