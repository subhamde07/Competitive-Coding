class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(var log : logs){
            if(!log.equals("./") && !log.equals("../")) count++;
            else if(count > 0 && log.equals("../")) count--;
        }
        return count;

        /*
        Stack<String> folderStack = new Stack<>();
        for(var log : logs){
            if(log.equals("../")){
                if(!folderStack.isEmpty())
                    folderStack.pop();
            } else if(!log.equals("./"))
                folderStack.push(log);
        }

        return folderStack.size();
        */
    }
}