import java.util.*;

class program4
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

        fPercentage = ((float)iObtained / (float)iTotal) * 100;

        System.out.println("Percentage is : "+fPercentage);
    }
}