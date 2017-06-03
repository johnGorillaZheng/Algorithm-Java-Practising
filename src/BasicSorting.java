
public class BasicSorting {
	/**
	 * 冒泡排序	
	 * 郑子旋		
	 * 2017年6月2日
	 */
	public static void bubbleSort(int[] arr){
		int len = arr.length;
		for(int i = 0; i < len - 1; i ++){
			for(int j = 0; j < len - 1 - i; j++){
				if(arr[j] > arr[j+1]){
					exchange(arr,j,j+1);
				}
			}
		}
	}
	
	/**
	 * 选择排序	
	 * 郑子旋	     
	 * 2017年6月2日
	 */	
	public static void selectSort(int[] testArray){
		int len = testArray.length;
		for(int i = 0; i < len; i++){
			int min = i;
			for(int j = i + 1; j < len; j++){
				if(testArray[j] < testArray[min]){
					min = j;
				}
			}
			exchange(testArray,i,min);
		}	
	}
	
	/**
	 * 插入排序
	 * 郑子旋
	 * 2017年6月2日
	 */
	public static void insertSort(int[] arr){
		int len = arr.length;
		for(int i = 0; i < len - 1; i++){
			for(int j = i+1; j >0; j--){
				if(arr[j-1]<arr[j]){
					break;
				}
				exchange(arr,j-1,j);
			}
		}
	}
	/**
	 * 快速排序
	 * 郑子旋
	 * 2017年6月3日
	 */
	public static void quickSort(int[] arr){
		qsort(arr,0,arr.length -1);
	}
	/**
	 * 
	 */
	public static void qsort(int[] arr, int low, int high){
		if(low < high){
			int par = partition(arr,low,high);
			qsort(arr,low,par - 1);
			qsort(arr,par+1,high);
		}
	}
	/**
	 * 
	 */
	public static int partition(int[] arr, int low, int high){
		int par = arr[low];
		while(low < high){
			while(low < high && arr[high] >= par) --high;
			arr[low] = arr[high];
			while(low < high && arr[low]  <= par) ++low;
			arr[high] = arr[low];
			
		}
		arr[low] = par;
		return low;
	}
	
	/**
	 * 交换两个数位置
	 * 郑子旋
	 * 2017年6月2日
	 */
	public static void exchange(int[] testArray,int a, int b){
		int mid;
		mid = testArray[a];
		testArray[a] = testArray[b];
		testArray[b] = mid;
	}

}
