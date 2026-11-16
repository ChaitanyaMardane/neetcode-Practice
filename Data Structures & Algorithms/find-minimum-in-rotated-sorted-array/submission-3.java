class Solution {
    public int findMin(int[] arr) {
        int l=0 , r = arr.length-1;
        int n = arr.length;
        int mid = 0;
        while(l<=r){
            mid = l + ((r-l)/2);
        System.out.println(mid);
if( mid!=0 && mid!=n- 1&& arr[mid]<arr[mid+1]  && arr[mid]<arr[mid-1] ) return arr[mid];
            if(arr[mid]>arr[r]){
                l=mid+1;

            }
            else{
                if( mid!=0 && arr[mid]<arr[mid-1])return arr[mid];
                 r=mid-1;
                 }

        }
        return arr[mid];
    }
}
