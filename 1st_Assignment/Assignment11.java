import java.util.Scanner;

class Assignment11{

public static void main (String [] args){

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the First number:");
	int a = scan.nextInt();
	System.out.println("Enter the Second number:");
        int b = scan.nextInt();
	System.out.println("Enter the Third number:");
        int c = scan.nextInt();



	if(a>b){
		if (a>c){
		System.out.println("The Largest Number is: "+a);
		}
		else{
		System.out.println("The Largest Number is: "+c);
		}
	}
	else if (b>c){
		System.out.println("The Largest Number is: "+b);
	}
	else {
		System.out.println("The Largest Number is: "+c);
	}


}
}
