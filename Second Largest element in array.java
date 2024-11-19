class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int largest=Integer.MIN_VALUE,secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
            
        }
        return (secondlargest==Integer.MIN_VALUE)?-1:secondlargest;
    }
}
