class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rl =0 , rr=matrix.length-1;
        int mid =0, row = -1;
        
        while(rl<=rr  ){
            mid = rl+((rr-rl)/2);
            if(matrix[mid][0]==target)return true;
            if(target>matrix[mid][0]){row=mid;rl= mid+1;}
            else {rr=mid-1;}
        }
        
       
        if(row==-1)return false;
        int  cl= 0 , cr=matrix[0].length-1;
        while(cl<=cr){
            mid = cl+((cr-cl)/2);
            if(matrix[row][mid]==target)return true;
            if(target>matrix[row][mid])cl= mid+1;
            else cr=mid-1;
        }
        return false;
    }
}
