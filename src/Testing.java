
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1, b = 2;
		int[] testArray = new int[500];
//		BasicSorting.exchange(a, b);
//		System.out.println(a);
		for(int i = 0; i < testArray.length; i ++){
			testArray[i] = (int) (Math.random()*10000);
		}
		
		BasicSorting.quickSort(testArray);
		
		for(int i = 0; i < testArray.length; i ++){
			System.out.println(testArray[i]);
		}
	}

}
