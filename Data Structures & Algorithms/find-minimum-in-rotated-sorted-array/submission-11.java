class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        // for( int i = 0 ;i < n-1; i++){
        //     if(arr[i]>arr[i+1]){
        //         return arr[i+1];
        //     }

        // }
        // return arr[0];
        int l = 0 ,  r = n-1;
        while(l<=r){
            int mid = l+ ((r-l)/2);
            if(arr[mid]> arr[n-1]){
                    if(arr[mid] > arr[mid+1])return arr[mid+1];
                    else l = mid+1;
            }else{
                // if(arr[mid] > arr[mid-1])return arr[mid];
              r=mid-1;
            }
        } 
        return arr[0];
        
    }
}
