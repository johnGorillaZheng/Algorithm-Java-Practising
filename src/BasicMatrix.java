
public class BasicMatrix {
	/**
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public static int[][] matrixAdd(int[][] first, int[][] second){
		if(first[0].length == second[0].length &&
		   first.length == second.length){

		}
		int countRow = first.length;
		int countColumn = first[0].length;
		int result[][] = new int[countRow][countColumn];
		for(int i = 0; i < countRow; i++){
			for(int j = 0; j < countColumn; j++){
				result[i][j] = first[i][j] + second[i][j];
			}
		}
		return result;
	}
	/**
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public static int[][] matrixSubtraction(int[][] first, int[][] second){
		int countRow = first.length;
		int countColumn = first[0].length;
		int result[][] = new int[countRow][countColumn];
		for(int i = 0; i < countRow; i++){
			for(int j = 0; j < countColumn; j++){
				result[i][j] = first[i][j] - second[i][j];
			}
		}
		return result;
	}
	/**
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public static int[][] matrixMultiple(int[][] first, int[][] second){
		if(first.length != second[0].length){
			
		}
		int countRowFirst = first.length;
		int countRowSecond = second.length;
		int countColumnFirst = first[0].length;
		int countColumnSecond = second[0].length;
		int addFactor = 0;
		
		int[][] result = new int[countRowFirst][countColumnSecond];
		for(int i = 0; i < countRowFirst; i++){
			for(int j = 0; j < countColumnSecond; j++){
				for( int k = 0; k < countRowSecond; k ++){
					addFactor += first[i][k]*second[k][j];
				}
				result[i][j] = addFactor;
				addFactor = 0;
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param process
	 * @return
	 */
	public static int getDeterminant(int[][] process){
		int result = 0;
		int len = process.length;
		if(len > 2){
			for(int i = 0; i < len; i++){
				int[][] yuzs = new int[len-1][len-1];
				for(int j = 0; j < yuzs.length; j++){
					for(int k = 0; k < yuzs[0].length; k++){
						if(k < i){
							yuzs[j][k] = process[j+1][k];
						}else{
							yuzs[j][k] = process[j+1][k+1];
						}
					}
				}
				result += process[0][i]*getDeterminant(yuzs);
			}
		}else{
			if(process.length == 2){
				result = process[0][0]*process[1][1] - process[0][1]*process[1][0];
			}else{
				result = process[0][0];
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param process
	 * @return
	 */
	public static int[][] matrixAdjugate(int[][] process){
		int countRow = process.length;
		int countColumn = process[0].length;
		int[][] result = new int[countRow][countColumn];
		
		return result;
	}
}


