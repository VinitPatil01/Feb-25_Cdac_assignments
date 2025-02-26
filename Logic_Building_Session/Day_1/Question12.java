import java.util.Scanner;

class Assignment12{

public static void main(String [] args){

Scanner scan =  new Scanner(System.in);

System.out.println("Enter the number: ");
int n= scan.nextInt();
int n1=n;
int rev_num=0;
while (n!=0){

	
	rev_num = rev_num*10;
	int dig=n%10;
	rev_num=rev_num+dig;
	n/=10;

}
System.out.println("The reverse of "+n1+" is "+rev_num);

}

}
