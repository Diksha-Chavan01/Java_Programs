import java.util.*;

class Number
{
    public static final int ERR_INVALID_AGE = -1;

    public int CalculateTicket(int iAge)
    {
        int iPrice = 0;

        if(iAge < 0)
        {
            return ERR_INVALID_AGE;
        }

        if((iAge >= 0) && (iAge <= 5))
        {
            return 0;
        }
        else if((iAge > 5) && (iAge <= 18))
        {
            return 700;
        }
        else if((iAge > 18) && (iAge <= 50))
        {
            return 999;
        }
        else if(iAge > 50)
        {
            return 500;
        }
    return iPrice;
    }
}

class program9
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your age : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.CalculateTicket(iValue);

        if(iRet == Number.ERR_INVALID_AGE)
        {
            System.out.println("Unable to calculate the ticket price as age is invalid");
        }
        else
        {
            System.out.println("Your ticket price is : "+iRet);
        }
    }
}