
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testSorting();
		testMatrix();
		
		
	
	}
	
	public static void testMatrix(){
		int[][] first = new int[5][5];
		int[][] second = new int[5][5];
		for(int i = 0; i < first.length; i++){
			for(int j = 0; j < first[0].length; j++){
				first[i][j] = (int) (Math.random()*100);
				second[i][j] = (int) (Math.random()*100);
				System.out.print(first[i][j] + "+");
				System.out.print(second[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
//		int[][] result = BasicMatrix.matrixAdd(first,second);
//		int[][] result = BasicMatrix.matrixSubtraction(first,second);
		for(int i = 0; i < first.length; i++){
			for(int j = 0; j < first[0].length; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	
	
	
	public static void testSorting(){
		int[] testArray = new int[10000];
//		BasicSorting.exchange(a, b);
//		System.out.println(a);
		for(int i = 0; i < testArray.length; i ++){
			testArray[i] = (int) (Math.random()*10000);
//			System.out.print(testArray[i] + " ");
//			if(i == testArray.length - 1)
//				System.out.print("\n");
		}		
//		BasicSorting.quickSort(testArray);
//		BasicSorting.quickSort_3Way(testArray);
//		BasicSorting.shellSort(testArray);	
//		BasicSorting.mergeSort(testArray);
		BasicSorting.bubbleSort(testArray);
		for(int i = 0; i < testArray.length; i ++){
			System.out.print(testArray[i] + " ");
		}
	}

}
