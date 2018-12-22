class Euler{
	public static void main(String[] args) {
		int num=0;
		for( int i=1; i>0; i++){
			for (int j=2; j<=20; j++){
				if (i%j==0){
               num=num+1;
				}
				else{
					
					num=0;
               break;
				}
			}
			if (num==19){
				System.out.println(i);
				break;
			}
		}
	}
}