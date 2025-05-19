class Number
{
    public void Display()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println(" "+iCnt);
        }     
    }
}

class program12
{
    public static void main(String A[])
    {
        Number nobj = new Number();

        nobj.Display();
    }
}