import java.util.Scanner;
class Task{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string name: ");
		String user=input.nextLine();
		String total="";
		if (user.length()>1){
		for (int i=0; i<user.length();i++){
			if (user.length()==2) {
				total=(user+user);
			}
			else if (user.length()==3) {
				for(int k=0;k<2;k++){
				char a=user.charAt(k);
				total=total+Character.toString(a);
				}
				for(int j=1;j<3;j++){
					char b=user.charAt(j);
					total=total+Character.toString(b);
				}
				break;
			}
			else if (i<2 || i>(user.length()-3)) {
				char a=user.charAt(i);
				total=total+Character.toString(a);

			}
		}System.out.println(total);
	}else{
		System.out.println("Empty");
	}
	}
}