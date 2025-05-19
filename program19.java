import java.util.*;

class Number
{
    public boolean CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program19
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is even or odd : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Even number");
        }
        else
        {
            System.out.println(iValue+" is Odd number");
        }
    }
}