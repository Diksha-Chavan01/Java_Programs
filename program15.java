import java.util.*;

class Number
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println(iCnt+" : Hello");
        }     
    }
}

class program15
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.Display(iValue);
    }
}