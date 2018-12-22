import java.util.Scanner;
	class Task{
			public static void main(String[] args) {
				Scanner obj=new Scanner(System.in);
				System.out.print("Enter the year :");
				int year = obj.nextInt();
				int leap_year=year;
				if (year%400==0 || (year%4==0 && year%100!=0)){
					System.out.print("The next three leap_years are : ");
					for(int i=0; i<3; i++){
						leap_year=leap_year+4;
						System.out.print(leap_year+", ");
					}
					System.out.println("The previous three leap_years : ");
					for(int i=0; i<3; i--){
						leap_year=leap_year-4;
						System.out.println(leap_year+", ");
					}

				}
			}
	}