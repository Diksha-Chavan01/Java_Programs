import java.util.*;

class Number
{
    public boolean CheckDivisible(int iNo)
    {
        if(((iNo % 5) == 0) && ((iNo % 3) == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program22
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckDivisible(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is divisible by 5 and 3");
        }
        else
        {
            System.out.println(iValue+" is not divisible by 5 or 3");
        }
    }
}