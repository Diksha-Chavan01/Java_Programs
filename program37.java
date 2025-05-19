import java.util.*;

class Number 
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0 , iSum = 0;

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

        if(iNo == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
}

class program37
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Perfect Number");
        }
        else
        {
            System.out.println(iValue+" is not Perfect Number");
        }
    }
}