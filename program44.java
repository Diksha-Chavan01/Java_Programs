import java.util.*;

class Number 
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0;

        while(iNo != 0)
        {
            iNo = iNo / 10;
            iCnt++;
        }
        return iCnt;
    }
}
class program44
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.CountDigits(iValue);

        System.out.println("Number of digits are : "+iRet);
    }
}