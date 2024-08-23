class Solution {
    public String fractionAddition(String exp) {
        int nume = 0;
        int deno = 1;
        int i = 0, n = exp.length();
        while(i < n){
            boolean isNeg = exp.charAt(i) == '-';
            if(exp.charAt(i) == '+' || exp.charAt(i) == '-') i++;

            int curNume = 0;
            int curDeno = 0;
            while(i < n && Character.isDigit(exp.charAt(i))){
                int val = exp.charAt(i++) - '0';
                curNume = (curNume * 10) + val;
            }
            i++;    // For Ignore '/' Char
            while(i < n && Character.isDigit(exp.charAt(i))){
                int val = exp.charAt(i++) - '0';
                curDeno = (curDeno * 10) + val;
            }

            if(isNeg) curNume *= -1;

            nume = (nume * curDeno) + (deno * curNume);
            deno = deno * curDeno;
        }

        int GCD = Math.abs(findGCD(nume, deno));
        nume /= GCD;
        deno /= GCD;

        return new String(Integer.toString(nume) + "/" + Integer.toString(deno));
    }
    
    int findGCD(int a, int b){   
        if (b == 0)   
            return a;     
        return findGCD(b, a % b);   
    }   
}