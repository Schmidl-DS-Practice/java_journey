/** Program that illustrates
 * conditionals and loops */

public class ConditionalsLoops
{
    public static void main(String[] args)
    {
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
        while (a != 1)
            a -= 1;
        System.out.print("while loop over, a = ");
        System.out.println(a);

        for (int i = 1; i <= 100; i++) // for (initialization; test; update)
            System.out.println(i);

        // both initialzation and update may use a comma to allow multiple expressions
        // only declare type of first variable in initialization step
        for (int i = 0, sum = 0, n = 5; i <= n; i++, sum += n)
            System.out.println(i + "\t" + sum);

        // {} are need to have multiple statements
        for (int i = 1; i <= 10; i++)
            {
            System.out.println("i: " + i);
            for (int j = 1; j <= 10; j++)
                {
                System.out.println("j: " + `j);
                if (i + j == i * j)
                    System.out.println(i + ", " + j);
                }
            }

        /* the do statement is used less frequently.
        When we have to do something at least once,
        and for some reason a for loop is inappropriate,
        then the do statement is the method of choice.

        do
        {
        prompt user;
        read value;
        } while (value is no good);
        */

    }
}