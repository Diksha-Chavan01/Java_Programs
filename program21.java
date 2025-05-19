import java.util.*;

class Number
{
    public boolean CheckDivisible(int iNo)
    {
        if((iNo % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program21
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is divisible by 5 : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckDivisible(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is divisible by 5");
        }
        else
        {
            System.out.println(iValue+" is not divisible by 5");
        }
    }
}