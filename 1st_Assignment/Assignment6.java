import java.util.Scanner;

class Assignment6{
	
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the first number: ");
	int a = scan.nextInt();
	System.out.println("Enter the first number: ");
	int b = scan.nextInt();


	System.out.println(a+"+"+b+"="+(a+b));
	System.out.println(a+"-"+b+"="+(a-b));
	System.out.println(a+"x"+b+"="+(a*b));
	System.out.println(a+"/"+b+"="+(a/b));
	System.out.println(a+"mod"+b+"="+(a%b));	

}

}
