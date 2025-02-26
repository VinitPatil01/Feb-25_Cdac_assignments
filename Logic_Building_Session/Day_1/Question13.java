import java.util.Scanner;

public class Assignment13{
public static void main(String args[]){

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter First Number: ");
	int N1 = scan.nextInt();
	
	System.out.println("Enter Second Number: ");
        int N2 = scan.nextInt();

	System.out.println("Enter Third Number: ");
        int N3 = scan.nextInt();



	float Average =(float) (N1+N2+N3)/3;

	System.out.printf("The average is: %.2f",Average);


}
}
