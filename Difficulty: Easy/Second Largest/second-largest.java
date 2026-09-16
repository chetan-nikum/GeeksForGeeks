class Solution {
    public int getSecondLargest(int[] arr) {
        
        int ans=-1;
        
        //largest element
        for(int i=0;i<arr.length;i++){
            if(ans<arr[i]){
                ans=arr[i];
            }
        }
        
        // second largest
        int second=-1;
        
        for(int i=0;i<arr.length;i++){
            if(second<arr[i]&&arr[i]!=ans){
                second=arr[i];
            }
        }
        return second;
        
    }
}