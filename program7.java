import java.util.*;

class Number
{
    public static final int ERR_INVALID_AGE = -1;

    public int CalculateTicket(int iAge)
    {
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
    return ERR_INVALID_AGE;
    }
}
class program7
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your age : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.CalculateTicket(iValue);

        System.out.println("Your ticket price is : "+iRet);
    }
}