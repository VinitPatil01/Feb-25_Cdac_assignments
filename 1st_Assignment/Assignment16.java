import java.util.Scanner;
public class Assignment16{
public static void main(String args[]){
	System.out.println("Enter the number: ");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	boolean isPrime=true;

	if (n<=1){
	System.out.println("The number "+n+" is not Prime." );
}

	for (int i=2;i<n;i++){
	if(n%i==0){
	isPrime=true;
	break;
}

}


if (isPrime){
System.out.println("The number "+n+" is Prime." );
}
else{
System.out.println("The number "+n+" is not Prime." );
}


}

}
