package it.unibo.cli.arguments.test;

class TestCommandLine {

    public static void main(final String[] args) {
        int totalLength = 0;
        for(String word: args){
            totalLength = totalLength + word.length();
            System.out.println(word + ", " + word.length() + " characters long");
        }
        System.out.println("The input string length is: " + totalLength);
        /*
         * Write the main method in such a way that it iterates through the
         * array of arguments, printing each one along with the length of the
         * string - the String class provides an
         *
         * int length()
         *
         * method that returns the length of the String.
         *
         * Example output:
         *
         * $ java it.unibo.cli.arguments.test.TestCommandLine Welcome to the lab
         *
         * The provided arguments are:
         *  * Welcome, 7 characters long
         *  * to, 2 characters long
         *  * the, 3 characters long
         *  * lab, 3 characters long
         */
    }
}
