/** Program that
 * illustrates operators */

package chapter1;

public class OperatorTest
{
    // Program to illustrate basic operators
    // The output is as follows
    // 12 8 6
    // 6 8 6
    // 6 8 14
    // 22 8 14
    // 24 10 33

    public static void main(String[] args) {
        int a = 12, b = 8, c = 6;

        // System.out.println(a + " " + b + " " + c);
        a = c;
        // System.out.println(a + " " + b + " " + c);
        c += b;
        // System.out.println(a + " " + b + " " + c);
        a = b + c;
        // System.out.println(a + " " + b + " " + c);
        a++; // original value of a
        ++b;
        // System.out.println(a + " " + b + " " + c);
        c = a++ + ++b; // c is obtained by adding the original value of a (23) to the incremented value of b (10)
                        // however when the print happens a has been incremented and is therefore 24
        // System.out.println(a + " " + b + " " + c);

        double quotient;
        int x = 6;
        int y = 10;
        // quotient = x / y; // probably wrong! return 0.0
        // System.out.println(quotient);

        // quotient = (double) x / y;
        // System.out.println(quotient);

        quotient = x / (double) y;
        System.out.println(quotient);
    }
}
