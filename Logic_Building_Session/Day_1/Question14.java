public class Assignment14{

public static void main(String [] args){

int n=10;

int start=0;
int next=1;

for (int i=0;i<n;i++){
	if (i==0){

	System.out.print(start+"\t");

}
	else if (i==1){
	System.out.print(next+"\t");
}

	else{
	int temp=next + start;
	start=next;
	next=temp;
	System.out.print(next+"\t");

}

}


}

}
