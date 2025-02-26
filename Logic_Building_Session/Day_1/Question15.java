import java.util.Scanner;
public class Assignment15{
public static void main(String args[]){
	System.out.println("Enter the number: ");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	int fact=n;

	for (int i=1;i<n;i++){

	fact=fact*i;

}

System.out.println("Factorial of "+n+"is: "+fact);
}

}
