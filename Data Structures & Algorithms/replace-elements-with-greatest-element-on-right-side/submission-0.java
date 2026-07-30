class Solution {
    public int[] replaceElements(int[] arr) {
        int i= arr.length-1;
        int max= arr[arr.length-1];
        arr[i] = -1; 
        for(i=i-1 ; i>=0; i--){
            
            int max1 = Math.max(max, arr[i]);
            arr[i] = max;
            max =max1;
        }
        return arr;
    }
}