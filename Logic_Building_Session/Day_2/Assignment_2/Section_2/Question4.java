
import java.util.Scanner;



class Question4{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       System.out.println("Enter your purchase amount");
       double purchase= scan.nextDouble();
       System.out.println("Do you have membership card");
       boolean isMember = scan.nextBoolean();
       double discount;
       if (purchase>=1000) {
           discount=0.20;
       } else if(purchase>=500 && purchase<1000) {
            discount=0.1;
       }
       else{
            discount=0.05;
       }
        if (isMember){
            discount*=1.05;
        }

        double Final_price=purchase-discount;
        System.out.println("The Total price after discount is: "+ (purchase-discount));
        System.out.printf("You saved: Rs. %.2f\n", discount);
}
}