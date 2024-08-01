class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(var age : details){
            if(age.length() == 15){
                if(Integer.parseInt(age.substring(11,13)) > 60){
                    count++;
                }
            }
            else{
                return 0;
            }
        }
        return count;
    }
}