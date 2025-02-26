class Largest_Number{
    public static void main(String[] args) {
        int a=2,b=1,c=3;

        if (a>b){
            if (a>c){
                System.out.println(a+" is the largest number");
            }
            else{
                System.out.println(c+" is the largest number");
            }
        }
        else if(b>c){
                System.out.println(b+" is the largest number");
        }
        else{
                System.out.println(c+" is the largest number");
        }
    }
}