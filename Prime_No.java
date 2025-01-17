import java.util.*;

public  class Prime_No {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit at which you want to find prime no.: ");
        int n = sc.nextInt();
        int i , j;

        for (i = 2 ; i <= n ; i++)
        {
            int m = 0;
            for (j = 2 ; j < i ; j++)
            {
                if(i % j == 0)
                {
                    m = 1;
                }
            }
            if(m == 0)
            {
                System.out.println(i);
            }
        }
    }
}