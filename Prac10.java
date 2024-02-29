public class Prac10 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int r = 0;
        int c=0;
        System.out.println(rowLength+" "+columnLength);
        while(r<rowLength-1) {
            System.out.println(matrix[r][0]+" "+matrix[r][columnLength-1]);
            if(matrix[r][0] <= target && target <= matrix[r][columnLength-1] ) {
                break;
            }
            r++;

        }

        System.out.println("R value is "+r);

        if(r>rowLength-1){
            return false;
        } else {
            int start = 0;
            int end = columnLength -1;
            while(start<=end){
                int mid = (start+end)/2;
                if(matrix[r][mid] == target){
                    return true;
                } else if(matrix[r][mid] < target){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return false;

    }
}
