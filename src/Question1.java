import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        int n = scanner.nextInt();
        System.out.print("Enter the second non-negative integer: ");
        int m = scanner.nextInt();

        if(n<0 || m<0)
            throw new IllegalArgumentException("Error, enter non negative numbers only!");
        else if(n==0&&m==0)
            throw new IllegalArgumentException("Both numbers can not equal zero!");
        else
            System.out.println(GCD(n,m));
    }
    public static int GCD(int n, int m){
        if(m<=n && n%m==0)
            return m;
        else if(n<m)
            return GCD(m,n);
        else
            return GCD(m,n%m);
    }
}
