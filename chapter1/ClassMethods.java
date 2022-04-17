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
}