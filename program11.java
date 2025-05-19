class Display
{
    public void Hello()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("Hello");
        }     
    }
}

class program11
{
    public static void main(String A[])
    {
        Display dobj = new Display();

        dobj.Hello();
    }
}