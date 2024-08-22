class Solution {
    public int findComplement(int num) 
    {
        int n = (int)(Math.pow(2, digits(num)) - 1); //calling digits(num) func (int)(2 ^ 3) = 8 - 1 = 7
        return n - num;                              //7 - 5 = 2
    }
    
    public static int digits(int n)
    {
        int c = 0;                  //c = 0
        while(n > 0)                //5 > 0, 2 > 0, 1 > 0
        {
            n = n / 2;              //n = 5/2 = 2, 2)2/2 = 1, 3)1/2 = 0
            c++;                    //c = 1, 2, 3
        }
        return c;                   //return 3
    }
}

// My Sol -->
// class Solution {
//     public int findComplement(int num) {
//         if(num == 1) return 0;

//         String comp = Integer.toBinaryString(num);
//         int ans = 0;
//         int power = comp.length() - 1;
//         for(char c : comp.toCharArray()){
//             int digit = Character.getNumericValue(c);
//             if(digit == 0){
//                 ans += 1 * Math.pow(2, power);
//                 power--;
//             } else{
//                 ans += 0 * Math.pow(2, power);
//                 power--;
//             }
//         }
//         return ans;
//     }
// }