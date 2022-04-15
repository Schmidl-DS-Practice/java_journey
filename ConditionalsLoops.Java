/** Program that illustrates
 * conditionals and loops */

public class ConitionalsLoops
{
    public static void main(String[] args) {
        int a = 10;
        if (a == 10)
            System.out.println("a = 10");
        else
            System.out.println("a != 10");

        System.out.print("1/a is ");
        if (a != 0)
            System.out.println(1/(double)a);
        else
            System.out.println("Undefined");
        System.out.print("this ");
        System.out.println("that");

        if (a == 10)
            System.out.println("a is ten");
        else {
            System.out.print("a is ");
            System.out.println(a);
        }
    }
}