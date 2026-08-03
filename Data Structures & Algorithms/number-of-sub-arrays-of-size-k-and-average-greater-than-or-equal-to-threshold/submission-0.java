class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int out =0, n = arr.length;
        for(int i=0; i<= n-k ; i++){
            int sum = arr[i];
            for (int j=i+1 ; j<i+k ; j++){
                sum += arr[j];
            }
            out = (sum / k) >= threshold ? out+1 : out ;

        }
        return out;
    }
}