class Solution {
    int missingNum(int arr[]) {
        // code here
        long  n=arr.length;
        long sum=0;
        
        //sum of elements of array
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        
        long Tsum=((n+1)*(n+2))/2; //sum of n natural number
        
        return (int)(Tsum-sum);
    }
}