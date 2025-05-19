import java.util.*;

class Number 
{
    public void DisplayFactorsNonFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)          
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println("Factors is "+iCnt);
            }
            else
            {
                System.out.println("Non  Factors is "+iCnt);               
            }
        }
    } 
}
class program32
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayFactorsNonFactors(iValue);
    }
}