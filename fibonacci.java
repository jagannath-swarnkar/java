import java.util.Scanner;
class helloworld{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the input for fibonacci series : ");
		int input=obj.nextInt();
		int a=0,b=1,c,i;
		System.out.print(a+" "+b); //for printing 0 and 1
		for(i=2; i<input; i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		}
}