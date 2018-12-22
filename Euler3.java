class Euler{
	public static void main(String[] args) {
		boolean flag=true;
		int result=0;
		Long input=600851475143L;
		for(int i=1; i<input;i++){
			flag=true;
			for (int j=2;j<i ;j++) {
				if (i%j==0) {
					flag=false;
					break;
				}
			}if (flag==true) {
				if (input%i==0) {
					result=i;
					System.out.println(result);
				}
			}
		}System.out.println(result);
	}
} 