import java.util.*;

class Number
{
    public int Calculate(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        return iSum;     
    }
}

class program18
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.Calculate(iValue);

        System.out.println("Summation is : "+iRet);
    }
}