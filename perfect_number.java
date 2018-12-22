import java.util.Scanner;
class Perfect_number{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.print("Enter the number to check the perfect number :");
		int input= obj.nextInt();
		for ( int user=0; user<input; user++){
		int sum=0;
		for (int i=1; i<user; i++){
			if (user%i==0){
				sum=sum+i;
			}
		}if (sum==user) {
			System.out.println(user);
		}
	}
}
}