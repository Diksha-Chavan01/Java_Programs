import java.util.*;

class Number 
{
    public int SumDigits(int iNo)
    {
        int iSum = 0, iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}
class program46
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.SumDigits(iValue);

        System.out.println("Summation of digits are : "+iRet);
    }
}