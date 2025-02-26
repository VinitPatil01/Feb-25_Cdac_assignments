import java.util.Scanner;
class Question3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = scan.nextInt();

        System.out.println("Enter Second Number:");
        int b = scan.nextInt();

        System.out.println("Enter Which Operation you want to perform");
        Character operation = scan.next().charAt(0);

        switch (operation) {
            case '+': 
                System.out.printf("Addition of %d and %d is: %d" ,a,b,a+b );
                break;
            case '-':
                System.out.printf("Subtraction of %d and %d is: %d" ,a,b,a-b );
                break;
            case '*':
                System.out.printf("Multiplication of %d and %d is: %d" ,a,b,a*b );
                break;
            case '/':
                if (b==0){  System.out.println("Undefined");    }
                else{   System.out.printf("Addition of %d and %d is: %d" ,a,b,a+b );    }
                break;
            default:
                System.out.println("Enter Correct Operand");
        }
    }
}
