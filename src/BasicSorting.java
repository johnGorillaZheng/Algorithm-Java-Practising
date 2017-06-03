
public class BasicSorting {
	/**
	 * 名称：冒泡排序	
	 * 姓名：郑子旋		
	 * 时间：2017年6月2日
	 * 思路：在数组中比较并交换所有的元素
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
	 * 名称：选择排序	
	 * 姓名：郑子旋	     
	 * 时间：2017年6月2日
	 * 思路：通过每次遍历，寻找数组中最小元素，依次按顺序插入
	 * 		得到有序数组
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
	 * 名称：插入排序
	 * 姓名：郑子旋
	 * 时间：2017年6月2日
	 * 思路：原始思路是将一个数插入一个已排好序的数组中，
	 * 		在编程实现时思路是以第一个元素作为一个数组，
	 * 		则此数组为有序数组，将后面的元素一个一个插
	 * 		入，使得最终数组为有序数组
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
	 * 名称：快速排序
	 * 姓名：郑子旋
	 * 时间：2017年6月3日
	 * 思路：分治思想，将整个数组通过分治的方法不断的划分成小数组
	 * 		在每个数组中继续进行分治，划分成更小的，在各个小数组
	 * 		中进行排序
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
	 * 名称：快速排序中的划分板块
	 * 姓名：郑子旋
	 * 时间：2017年6月3日
	 * 思路：在每个划分模块中，先将首元素确定为基准，将数组中比基准大的
	 * 		部分扔到基准右边，小的到左边。极限状况：划分的子数组只有2个元素
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
	 * 名称：交换两个数位置
	 * 姓名：郑子旋
	 * 时间：2017年6月2日
	 */
	public static void exchange(int[] testArray,int a, int b){
		int mid;
		mid = testArray[a];
		testArray[a] = testArray[b];
		testArray[b] = mid;
	}

}
