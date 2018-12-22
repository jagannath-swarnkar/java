class Prime_position{
	public static void main(String[] args) {
		int temp=0;
		int count=0;
		for( int i=2;;i++){
			temp=0;
			for(int j=2; j<i; j++){
				if (i%j==0) {
					temp++;
					break;
				}
			}if (temp==0) {
				count++;
			}if (count==10000) {
				System.out.println(i);
				break;
			}
			}
		
	}
}