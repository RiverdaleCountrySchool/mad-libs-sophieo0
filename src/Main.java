public class Main {
    public static void main(String[] args) {
/*
MadLibs
Instructions
Create a Mad Libs game that has:

at least 5 strings as arguments
output that incorporates all inputs on at least 2 separate lines
Include documentation in the README.md.txt file to explain how to run your program.

Documentation Example
Compile and run MadLibs.java with the following arguments, separated by spaces, to get your Mad Libs message:

a plural noun
a verb ending in -ing
an adjective
a place
a food item
 */
        System.out.println("One day someone found " + args[0] + " and because of this, started " + args[1] + ".");
        System.out.println("This person felt so " + args[2] + " after " + args[1] + ". Later they went to " + args[3] + " and ate " + args[4]);
    }
}