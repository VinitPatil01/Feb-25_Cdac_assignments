import java.util.Scanner;
class Assignment18{

public static void main (String [] args){
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the Temprature in Celcius");
	int n = scan.nextInt();

	float f = (float)(n*9/5)+32;
	
	System.out.println(n+"°C is equal to: "+f+"°F");


}
}
