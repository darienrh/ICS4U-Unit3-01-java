/*
 * This program pushes and prints a stack.
 *
 * @author Darien
 * @version 1.0
 * @since   2021-12-18
 */

/** This program demonstrates a stack. */
final class Main {

    /**
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Creates an instance of MrCoxallStack and use the methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {
        final MrCoxallStack darienStack = new MrCoxallStack();
        final int number1 = 8;
        final int number2 = 56;

        darienStack.push(number1);
        darienStack.push(number2);
        darienStack.showStack();

        System.out.println("Done.");
    }
}