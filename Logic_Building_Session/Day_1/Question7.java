import java.util.Scanner;

class Assignment7{

public static void main (String [] args){

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = scan.nextInt();

	for (int i=1;i<=10;i++){

	System.out.println(n+" x "+i+ "= "+(n*i));
}

}
}
