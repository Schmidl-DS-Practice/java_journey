/** Program that illustrates
 * break, continue, switch, and conditional operators*/

package chapter1;

public class BreakContSwCondOperator
{
public static void main(String[] args)
    {
    int i = 10;
    int a = 10;
    while (i <= 15)
        {System.out.println(i);
        i += 1;
        if (i == 13)
            break;}

    // outer:
    //     while(a <= 20)
    //         {while (a <= 15)
    //             if (a == 12)
    //                 break outer;
    //             a += 1;} // Go to after outer
    // Control passes here after outer loop is exited

    // for (int b = 1; b <= 100; b++)
    //     {if (b % 10 == 0)
    //         continue;
    //     System.out.println(b);}

    int x = 2;
    int y = 3;
    int minVal = x <= y ? x : y;
    System.out.println(minVal);

    /*switch(someCharacter)
        {
            case '(':
            case '[':
            case '{':
            // Code to process opening symbols
            break;

            case ')':
            case ']':
            case '}':
            // Code to process closing symbols
            break;

            case '\n':
            // Code to handle newline character
            break;

            default:
            // Code to handle other cases
            break;
        } */
    }
}