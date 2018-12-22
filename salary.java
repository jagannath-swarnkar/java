import java.util.Scanner;
	class salary{
		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter the number of employes :");
			int n=obj.nextInt();
			int salary[] = new int[n];
			System.out.println("Enter the salary of the employers : ");
			for(int i=0; i<salary.length; i++)
			{
				salary[i] = obj.nextInt();
			}
			for(int i=0; i<salary.length; i++)
			{
				System.out.println("The salary amount is :" +salary);
			}

		}
	}