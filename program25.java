import java.util.*;

class Number
{
    public static final int ERR_INVALID = -1;

    public int Factorial(int iNo)
    {
        int iCnt = 0, iFact = 1;

        if(iNo < 0)
        {
            return ERR_INVALID;
        }

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
    
        return iFact;
    }
}

class program25
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.Factorial(iValue);

        if(iRet == nobj.ERR_INVALID)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Factorial is : "+iRet);
        }      
    }
}