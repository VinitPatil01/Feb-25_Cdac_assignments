import java.util.Scanner;

class Assignment10{

public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter the number: ");
int number = scan.nextInt();

if (number%2==0){
	System.out.println(number+" is even");
}
else{
	System.out.println(number+" is odd");
}
}


}
