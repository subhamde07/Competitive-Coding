class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1){
            return new int[] { -1 };
        }
        int l = arr.length, mx = -1;
        // int[] ans = new int[l];
        for(int i=l-1 ; i>0 ; i--){
            int temp = arr[i];
            arr[i] = mx;
            mx = Math.max(temp, mx);
        }
        arr[0] = mx;
        return arr;
        
    }
}

