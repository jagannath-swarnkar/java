import java.util.Scanner;
	class Armstrong{
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			int a=0,b=0,c=0,d;
			System.out.print("Enter the number for Armstrong");
			int user=obj.nextInt();
			int input=user;
			for(int i=0;i<input;i++){
				a=user%10;
				a=a*a*a;
				user=user/10;
				c=c+a;
			}
			if (c==input){
			System.out.println("Armstrong");
			}
			else{
				System.out.println("not Armstrong");
			}
		
		}
	}
	