// Write a Java method to check if a given number is power of 4
import java.util.Scanner;
import java.lang.Math;
public class Assign2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=n,flag=1;
        if(n==0)
            flag=0;
        else {
            while (n != 1) {
                if (n % 4 != 0) {
                    flag = 0;
                    break;
                }
                n = n / 4;
            }
        }
        if(flag==1)
        {
            System.out.println(num+" is a power of 4");
        }
        else
        {
            System.out.println(num+" is not a power of 4");
        }
    }
}