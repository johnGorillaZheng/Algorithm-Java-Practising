
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1, b = 2;
		double[] testArray = new double[10000];
//		BasicSorting.exchange(a, b);
//		System.out.println(a);
		for(int i = 0; i < testArray.length; i ++){
			testArray[i] = Math.random();
		}
		
		BasicSorting.selectSort(testArray);
		
		for(int i = 0; i < testArray.length; i ++){
			System.out.println(testArray[i]);
		}
	}

}
