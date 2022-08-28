/** Program that illustrates
 * class methods*/

package chapter1;

public class ClassMethods {

    public static void main(String[] args)
    {
    int a = 3;
    int b = 7;

    System.out.println(min(a, b));
    }

    // Method declaration
    public static int min(int x, int y)
    {
    return x < y ? x : y;
    }
    /* int max(int a, int b, int c) // in some languages this may be unacceptable if max is already declared. java allows for overloading
    static final double PI = 3.1415926535897932; // convention is to name symbolic constants entirely in uppercase. if several words then
    as in  MAX_INT_VALUE. if the word static is omitted, then the variable (or constant) has a different meaning */

}