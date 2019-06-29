public class fibo {
    public static void main(String args[]) {

        int n = 0, n1 = 1, count = 10,x,i;
        System.out.println(n+"\n"+ n1);
        for( i=2;i<=count;i++){
            x=n+n1;
            System.out.println(x);
            n=n1;
            n1=x;

        }

    }
}
