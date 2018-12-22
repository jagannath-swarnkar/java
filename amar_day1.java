import java.util.Scanner;
	class amar_day1{
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter a number : ");
			int user = obj.nextInt();
			for(int i=1; i<=user; i++){
				if (i%3==0){
					System.out.println(i);
				}
			}
		}
	}

