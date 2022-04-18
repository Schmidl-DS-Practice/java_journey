/**Chapter 1 Exercises*/

package chapter1;

public class Exercises
{
    public static void main(String [] args)
    {
        // IN THEORY
        q111();
        q112();
        q113();
        q114();
        // IN PRACTICE
        q115();
        q116();
        q117();
        q118();
        // PROGRAMMING PROJECTS
        q119();
        q120();
        q121();
        q122();
    }
/*
IN SHORT
1.1) java and .javac
1.2) two or more line comment, single-line comment, doc string
1.3) byte, short, int, long, float, double, char, boolean
1.4) * performs multiplication between two numbers, *= increments the current number by the value given after the =
1.5) In Java, an operator applied to an expression yields an expression that has a value. Prefix increment - the semantics of ++x is that the value of the expression is the new value of x. Postfix increment - x++ means that the value of the expression is the original value of x.
1.6) for(initialization; test; update), while (expression), do{prompt user; read value;} while (value is no good);
1.7) break statement will break the loop if a condition is met, labeled break statement can use to break out of a nested loop
1.8) continue statement will move on to the next iteration of the loop without performing an action
1.9) method overloading means that you can have two methods in the same class, as long as they take at least one different type of arg
1.10) the actual arguments are copied into the formal parameters. Variables are passed using call-by-value.
*/

// IN THEORY
// 1.11
    public static void q111()
    {
        int b = 5, c = 8, a;
        a = b++ + c++; // b and c are both incremented after. b = 5, c = 8
        System.out.println(a); // a = 13, b = 6, c = 9
        a = b++ + ++c; // b is increment after and c is increment before. b = 6, c = 10
        System.out.println(a); // a = 16, b = 7, c = 10
        a = ++b + c++; // b is increment before and c incremeted after. b = 8, c = 10
        System.out.println(a); // a = 18, b = 8, c = 11
        a = ++b + ++c; // b and c are both incremeted before, b = 9 and c = 12
        System.out.println(a); // a = 21, b = 9, c = 12
    }
// 1.12)
    public static void q112()
    {

    }
// 1.13)
    public static void q113()
    {

    }
// 1.14)
    public static void q114()
    {

    }

// IN PRACTICE
// 1.15)
    public static void q115()
        {

        }
// 1.16)
    public static void q116()
        {

        }
// 1.17)
    public static void q117()
        {

        }
// 1.18)
    public static void q118()
        {

        }

// PROGRAMMING PROJECTS
// 1.19)
    public static void q119()
    {

    }
// 1.20)
public static void q120()
    {

    }
// 1.21)
    public static void q121()
    {

    }
// 1.22)
    public static void q122()
    {

    }
}