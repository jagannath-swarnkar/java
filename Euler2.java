class Euler{
	public static void main(String[] args) {
		int a=0,b=1,c=0,sum=0;
		for(int i=0;i>=0; i++){
			if(c<4000000){
				c=a+b;
				a=b;
				b=c;
			}else{break;}
			if (c%2==0){
				sum=sum+c;
			}
		}System.out.println(sum);

	}
}