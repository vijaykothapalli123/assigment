import java.util.Scanner;

public class practice {
    public static void main(String args[]) {
        int a,b,x,y,t,lcm,gcd;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two number");
        x=sc.nextInt();
        y=sc.nextInt();
        a=x;
        b=y;
        while (b!=0){
            t=b;
            b=a%b;
            a=t;
        }
        gcd=a;
        lcm=(x*y)/gcd;
        System.out.println("hcf is " +gcd);
        System.out.println("lcm is " +lcm);

    }



}
