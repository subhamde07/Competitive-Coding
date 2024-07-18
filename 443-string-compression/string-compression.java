class Solution {
    public int compress(char[] chars) {
        int index = 0;  // Position to write the compressed character(s)
        int i = 0;      // Position to read the original character(s)

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = currentChar;

            // Write the count if it's greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}