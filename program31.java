import java.util.*;

class Number 
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)          
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(" "+iCnt);
            }
        }
    } 
}
class program31
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayFactors(iValue);
    }
}