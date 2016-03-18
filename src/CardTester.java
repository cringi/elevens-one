/**
 * This is a class that tests the Card class.
 */
public class CardTester {
    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    private static Card control = new Card("four", "clubs", 4);
    private static Card same = new Card("four", "clubs", 4);
    private static Card difference = new Card("four", "diamonds", 4);

    public static void main(String[] args) {
		testEqual();
        testDifferent();
    }

    private static void testEqual() {
        System.out.println(same.toString() + " = " + control.toString() + "?");
        if (same.matches(control)) {
            System.out.println("THE TEST SUCCEEDED (1)");
        }
        else {
            System.out.println("THE TEST FAILED (1)");
        }
    }

    private static void testDifferent() {
        System.out.println(difference.toString() + " != " + control.toString() + "?");
        if (!difference.matches(control)) {
            System.out.println("THE TEST SUCCEEDED (2)");
        }
        else {
            System.out.println("THE TEST FAILED (2)");
        }
    }
}
