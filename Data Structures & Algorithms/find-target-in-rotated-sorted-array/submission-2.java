class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int l = 0 , r = n-1;
        int pivote = pivote(arr);
        if(target == arr[pivote])return pivote;
        if(target==arr[n-1])return n-1;
        if(target >arr[n-1])r=pivote;
        else l=pivote;
        while(l<=r){
            int mid = l+ ((r-l)/2);
            if(arr[mid]==target) return mid;
            else if(arr[mid] > target) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
     public int pivote(int[] arr) {
        int n=arr.length;
          int l = 0 ,  r = n-1;
        while(l<=r){
            int mid = l+ ((r-l)/2);
            if(arr[mid]> arr[n-1]){
                    if(arr[mid] > arr[mid+1])return mid+1;
                    else l = mid+1;
            }else{
                // if(arr[mid] > arr[mid-1])return arr[mid];
              r=mid-1;
            }
        } 
        return 0;
    }
    
}
