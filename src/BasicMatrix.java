
public class BasicMatrix {
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
	
	public static int[][] matrixSubtraction(int[][] first, int[][] second){
		if(first[0].length == second[0].length &&
		   first.length == second.length){

		}
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
}
