import java.util.*;

class Number 
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                break;
            }
        }
    
        if(iCnt > (iNo/2))
        {
            return true;
        }
        else 
        {
            return false;
        }
    } 
}
class program39
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Prime Number");
        }
        else
        {
            System.out.println(iValue+" is not Prime Number");
        }
    }
}