import java.util.*;

class Number
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println(" "+iNo);
        }     
    }
}

class program13
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.Display(iValue);
    }
}