import java.util.*;
package p1;

public class C1
{
    int sum(int a,int b)
    {
        return(a+b);
    }
    int sub(int a,int b)
    {
        return(a-b);
    }
}

public interface I1
{
    int divide(int a,int b);
}

package p2;
import p1.*;

public class C2 implements I1
{
    int divide(int a,int b)
    {
        return(a/b);
    }
    public static void main(String args[])
    {
        C2 a=new C2();
        C1 b=new C1();

        System.out.println("Sum = "+b.sum(10,5));
        System.out.println("Sub = "+b.sub(10,5));
        System.out.println("Divide = "+a.divide(10,5));
    }
}
