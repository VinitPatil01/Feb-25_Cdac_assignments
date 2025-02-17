import java.util.Scanner;

class Assignment8{

public static void main (String [] args){

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the First number:");
	int n1 = scan.nextInt();
	System.out.println("Enter the Second number:");
        int n2 = scan.nextInt();


	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;

	System.out.println("Value after swap is N1: "+n1 + "\tN2: "+n2);

}
}
