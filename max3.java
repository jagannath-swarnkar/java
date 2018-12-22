// class Test{
// 	public static void main(String[] args) {
// 		int max1=0,max2=0,max3=0;
// 		int[] user={5,3,4,12,5,3,44,115,35,24,2,6,15,32,84,55,65};
// 		for (int i=0; i<user.length; i++){
// 			if (user[i]>max1){
// 				max3=max2;
// 				max2=max1;
// 				max1=user[i];
// 			}
// 		}
// 		System.out.println(max1);
// 		System.out.println(max2);
// 		System.out.println(max3);
// 	}
// }

class Max{
	public static void main(String[] args) {
		int max1=0,max2=0,max3=0;
		int[] list={12,4,7,2,8,1,3,4,8,2,21,14,32,51,24,2,4,15};
		for (int i=0; i<list.length; i++){
			if(list[i]>max1){
			max3=max2;
			max2=max1;
			max1=list[i];
			}
			else if (list[i]>max2) {
				max3=max2;
				max2=list[i];
			}
			else if (list[i]>max3) {
				max3=list[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
	}
}