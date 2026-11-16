
class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
       
        int r=Integer.MIN_VALUE;
        int l = 1 ;

        for( int x : arr){
            r=r<x?x:r;
            // l=l>x?x:l;
        }
         if(h==n)return r;
         if(n==1){
            l=1;
         }
        // System.out.println(l+"   "+r);

        int minhr=Integer.MAX_VALUE;
        
        while( l <= r){
            int mid = l + ((r-l)/2);
            // System.out.println("Mid"+mid);

            int hr = 0;
            for(int y : arr){
                if(y%mid==0){
                    hr+=y/mid;
                }else{
                    hr+=(y/mid) + 1;
                }
                    // System.out.println("hours " + hr);

                if(hr> h ){
                    l=mid+1;
                    hr=0;
                    break;
                }
            }
            if(hr > 0 && hr<=h){
                minhr=minhr>mid?mid : minhr;
                r=mid-1;
            }
                // System.out.println("ans "+minhr);

        }
        return minhr;
    }
}
