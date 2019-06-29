import java.util.Scanner;

 class ams {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter  number");
       int no = s.nextInt();
        int t1=no;
        int leng=0;
        while(t1!=0){
            t1=t1/10;
            leng=leng+1;

        }
        int t2=no;
        int arm=0;
        int rem;
        while(t2!=0) {
            int mult = 1;
            rem = t2 % 10;
            for (int i = 1; i <= leng; i++) {
                mult = mult * rem;
            }
            arm = arm + mult;
            t2 = t2 / 10;
        }
            if(arm==no) {
                System.out.println(no+ "armstrong");
            }
                else{
                    System.out.println(no+"not armstrong");
                }
            }

    }



