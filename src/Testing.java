
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1, b = 2;
		int[] testArray = new int[12];
//		BasicSorting.exchange(a, b);
//		System.out.println(a);
		for(int i = 0; i < testArray.length; i ++){
			testArray[i] = (int) (Math.random()*10000);
			System.out.print(testArray[i] + " ");
			if(i == testArray.length - 1)
				System.out.print("\n");
		}
		
//		BasicSorting.quickSort(testArray);
//		BasicSorting.quickSort_3Way(testArray);
//		BasicSorting.shellSort(testArray);	
		BasicSorting.mergeSort(testArray);
		for(int i = 0; i < testArray.length; i ++){
			System.out.print(testArray[i] + " ");
		}

		
	}

}
