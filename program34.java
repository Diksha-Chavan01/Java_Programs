import java.util.*;

class Number 
{
    public int SumFactors(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)          
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    } 
}
class program34
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.SumFactors(iValue);

        System.out.println("summation of factors is : "+iRet);
    }
}