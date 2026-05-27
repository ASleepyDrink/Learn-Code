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
public class text {

    /* This is our first variable, we named it hi, and gave it default text.
     * this is what each word means.
     *
     * static - Cannot be changed contains default values
     * String - This is for text, can be sentences or anything else.
     * hi - This is our variable name
     * = - We are about to define a value
     * "Why hello there!"; - Our value of our variable.
     *
     * Some things to note about String variables.
     *
     * You cannot have your text outside of double quotes. if you do you will get an error.
     * You must include a semi-collon at the end of every variable you define or else it will throw back an error.
     */
    static String hi = "Why hello there!";

    // Start condition, this allows our program to run in this specific file.
    public static void main(String[] args) {
        // Sending our variables data to the console
        System.out.println(hi);
    }

}
