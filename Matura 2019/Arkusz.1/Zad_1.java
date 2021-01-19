import java.util.Scanner;
class Zad_1 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt(); 
        }
        for(int i = 0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                n = a[i];
                break;
            }
        }
        System.out.println(n);
        sc.close();
    }
}
