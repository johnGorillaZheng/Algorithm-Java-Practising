
public class Leetcode {

    public static int findComplement(int num) {
        String binaryOfNum = Integer.toBinaryString(num);
        char[] process = binaryOfNum.toCharArray();
        String complement = "";
        for(int i = 0; i < process.length;i++){
        	if(process[i] == '1'){
        		process[i] = '0';
        	}else{
        		process[i] = '1';
        	}
        	complement += process[i];
        }
        int result = Integer.parseInt(complement,2);
		return result;
        
    }
    
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        if(r*c != nums.length * nums[0].length){
            return nums;
        }
        int[][] result = new int[r][c];
        int countRow = 0;
        int countColumn = 0;
        int countRow_origin = 0;
        int countColumn_origin = 0;
        for(int i = 0; i < row*column; i++){
           if(i%c == 0){
               countRow ++;
               countColumn = 0;
           } 
           if(i%column == 0){
               countRow_origin ++;
               countColumn_origin = 0;
           }
           result[countRow][countColumn] = nums[countRow_origin][countColumn_origin];
           countColumn ++;
           countColumn_origin ++;
        }
        return result;
    }
    public static int arrangeCoins(int n) {
        double deal = (double)n;
        double result = 0;
        double process = 0;
        for(float i = 0;; i++) {
        	process = i/2;
			process = process * (i+1);
            if( process == deal ) {
            	result = i;
            	break;
            }else if( deal - process < i+1){
                result = i;
                break;
            }
        }        

        return (int)result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int result = findComplement(8);
		//System.out.println((int)(Math.pow(3,19)));
		System.out.println(arrangeCoins(2146467959));
	}

}
