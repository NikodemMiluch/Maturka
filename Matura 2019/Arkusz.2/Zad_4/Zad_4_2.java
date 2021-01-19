import java.util.Scanner;

class Zadanie_4_2
{
    public static int sil(int a)
    {
        int x = 1;
        for(int i=1;i<=a;i++)
        {
            x = x * i;
        }
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        System.out.println(sil(a));
        sc.close();
    }
}

/*

rozdziel
silnie
dodaj
porownaj

 */