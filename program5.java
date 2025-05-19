import java.util.*;

class Number
{
    public float Percentage(int iTotalMarks, int iObtainedMarks)
    {
        float fPercentageValue = 0.0f;
        fPercentageValue = ((float)iObtainedMarks / (float)iTotalMarks) * 100;
        return fPercentageValue;
    }

}

class program5
{
    public static void main(String A[])
    {
        int iTotal = 0;
        int iObtained = 0;
        float fPercentage = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your total marks : ");
        iTotal = sobj.nextInt();

        System.out.println("Enter your obtained marks : ");
        iObtained = sobj.nextInt();

        Number nobj = new Number();

        fPercentage = nobj.Percentage(iTotal, iObtained);

        System.out.println("Percentage is : "+fPercentage);
    }
}