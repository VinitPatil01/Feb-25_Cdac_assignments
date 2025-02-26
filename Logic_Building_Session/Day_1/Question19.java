import java.util.Scanner;
import java.lang.Math;
class Assignment19{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter base number:");
int a = scan.nextInt();

System.out.println("Enter exponent number:");
int b = scan.nextInt();

System.out.println(a+" raised to the power "+b+" is: "+Math.pow(a, b));


}



}
