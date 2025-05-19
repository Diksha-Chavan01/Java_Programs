import java.util.*;

class Number
{
    public int Factorial(int iNo)
    {
        int iCnt = 0, iFact = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}

class program24
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.Factorial(iValue);

        System.out.println("Factorial is : "+iRet);
    }
}