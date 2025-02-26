import java.util.Scanner;

class Assignment20{

public static void main(String [] args){

Scanner scan =  new Scanner(System.in);

System.out.println("Enter the number: ");
int n= scan.nextInt();
int temp  = n;
int digits=0;
while (n!=0){

	
	n/=10;
	digits++;

}
System.out.println("The Number "+temp+" has "+digits+" digits.");
}

}
