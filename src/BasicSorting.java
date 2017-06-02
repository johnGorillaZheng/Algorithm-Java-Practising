
public class BasicSorting {
	/**
	 * 冒泡排序	BubbleSort
	 * 郑子旋		Zixuan Zheng
	 * 2017年6月2日
	 */
	public static void bubbleSort(double[] arr){
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
	 * 选择排序	selectSort
	 * 郑子旋	    Zixuan Zheng 
	 * 2017年6月2日
	 */	
	public static void selectSort(double[] arr){
		int len = arr.length;
		for(int i = 0; i < len; i++){
			int min = i;
			for(int j = i + 1; j < len; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			exchange(arr,i,min);
		}	
	}
	
	/**
	 * 插入排序
	 * 郑子旋
	 * 2017年6月2日
	 */
	public static void insertSort(double[] arr){
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
	 * 交换两个数位置
	 * 郑子旋
	 * 2017年6月2日
	 */
	public static void exchange(double[] arr,int a, int b){
		double mid;
		mid = arr[a];
		arr[a] = arr[b];
		arr[b] = mid;
	}

}
