import java.util.*;

class Number 
{
    public int CountEvenDigits(int iNo)
    {
        int iCnt = 0, iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iCnt++;
            } 
            iNo = iNo / 10;
        }
        return iCnt;
    }
}
class program45
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.CountEvenDigits(iValue);

        System.out.println("Number of even digits are : "+iRet);
    }
}