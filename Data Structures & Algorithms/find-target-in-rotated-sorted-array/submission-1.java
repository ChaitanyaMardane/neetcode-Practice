class Solution {
    public int search(int[] arr, int target) {
        
        int l=0 , r = arr.length-1;
        int n = arr.length;
        int mid = 0;
        // if(arr[r]>=arr[l])return arr[l];
        while(l<=r){
        mid = l + ((r-l)/2);
        
        if(arr[mid] ==target) return mid;
        if( arr[ l ] <= arr[mid] ){
                if(arr[l]<=target && target<= arr[mid])r=mid-1;
                else l=mid+1;
        }else {
            if(arr[r] >=target    && target > arr[mid])l= mid+1;
            else r =mid-1;
            
        }
        }
        
        return -1;
    }
}
