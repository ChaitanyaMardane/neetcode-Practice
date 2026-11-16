class Solution {
    public int findMin(int[] arr) {
        int l=0 , r = arr.length-1;
        int start=l,end =r;

        int n = arr.length;
        int mid = 0;
        // if(arr[r]>=arr[l])return arr[l];
        while(l<=r){
        mid = l + ((r-l)/2);
        int next = (mid+1)%n;
        int prev= (mid+n -1) %n;
        if(arr[mid]<arr[next] && arr[mid]<arr[prev])return arr[mid];
        if(arr[l]<=arr[mid]){ if(arr[mid] <=arr[r]) r=mid-1;else l=mid+1;}
        else if(arr[mid] <= arr[r]) r=mid-1;
        System.out.println(mid +" "  +l+" "  + r);
        }
        return arr[mid];
    }
}
