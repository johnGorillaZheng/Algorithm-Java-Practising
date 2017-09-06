
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSorting();
//		testMatrix();
		
		
	
	}
	
	public static void testMatrix(){
		int[][] first = new int[2][2];
		int[][] second = new int[5][5];
		
		for(int i = 0; i < first.length; i++){
			for(int j = 0; j < first[0].length; j++){
				first[i][j] = (int) (Math.random()*100);
				System.out.print(first[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i1 = 0; i1 < second.length; i1++){
			for(int j = 0; j < second[0].length; j++){
				second[i1][j] = (int) (Math.random()*100);
				System.out.print(second[i1][j] + " ");
				}
				System.out.print("\n");
		}
		System.out.print("\n");
//		int[][] result = BasicMatrix.matrixAdd(first,second);
//		int[][] result = BasicMatrix.matrixSubtraction(first,second);
//		int[][] result = BasicMatrix.matrixMultiple(first, second);
		int result = BasicMatrix.getDeterminant(first);
//		for(int i1 = 0; i1 < result.length; i1++){
//			for(int j = 0; j < result[0].length; j++){
//				System.out.print(result[i1][j] + " ");
//			}
//			System.out.print("\n");
		
//		}
		System.out.println(result);
	}

	
	
	
	
	public static void testSorting(){
		int[] testArray = new int[500000];
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
		long startTime = System.currentTimeMillis();
		BasicSorting.mergeSort(testArray);
		long endTime = System.currentTimeMillis(); //获取结束时间 
//		BasicSorting.bubbleSort(testArray);
		
		for(int i = 0; i < testArray.length; i ++){
			System.out.print(testArray[i] + " ");
		}
		 
		System.out.println("time taken:" + (endTime - startTime) + "ms");
	}

}
