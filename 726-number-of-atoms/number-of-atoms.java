class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        Map<String, Integer> currentMap = new HashMap<>();
        int n = formula.length();
        int i = 0;

        while (i < n) {
            char c = formula.charAt(i);
            if (c == '(') {
                // Push the current map to stack and start a new one
                stack.push(currentMap);
                currentMap = new HashMap<>();
                i++;
            } else if (c == ')') {
                // End of a parenthesis, pop from stack and merge with current map
                int iStart = ++i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int multiplier = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;

                if (!stack.isEmpty()) {
                    Map<String, Integer> tempMap = currentMap;
                    currentMap = stack.pop();
                    for (String key : tempMap.keySet()) {
                        currentMap.put(key, currentMap.getOrDefault(key, 0) + tempMap.get(key) * multiplier);
                    }
                }
            } else {
                // Parse the element name
                int iStart = i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String element = formula.substring(iStart, i);
                
                // Parse the element count
                iStart = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int count = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;
                
                // Add the count to the current map
                currentMap.put(element, currentMap.getOrDefault(element, 0) + count);
            }
        }

        // Sort the elements and build the result
        StringBuilder result = new StringBuilder();
        List<String> elements = new ArrayList<>(currentMap.keySet());
        Collections.sort(elements);
        for (String element : elements) {
            result.append(element);
            int count = currentMap.get(element);
            if (count > 1) result.append(count);
        }
        return result.toString();
    }
}