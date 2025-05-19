import java.util.*;

class Number
{
    public static final int ERR_INVALID = -1;

    public long Factorial(int iNo)
    {
        int iCnt = 0;
        long iFact = 1;

        if(iNo < 0)
        {
            return ERR_INVALID;
        }

        iCnt = 1;
        while ( iCnt <= iNo)
        {
            iFact = iFact * iCnt;
            iCnt++;
        }
    
        return iFact;
    }
}

class program27
{
    public static void main(String A[])
    {
        int iValue = 0;
        long iRet = 0;

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