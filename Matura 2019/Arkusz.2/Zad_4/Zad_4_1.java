import java.util.Scanner;

class Zadanie_4_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        int a = sc.nextInt();
        for(int i = 1;i<=a;i*=3)
        {
            if(a==i)
            {
                x = true;
                break;
            }
        }

        if(x==true){
            System.out.println("tak");
        }
        else
        {
            System.out.println("Nie");
        }
    }

}