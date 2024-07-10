class Solution {
    public int minOperations(String[] logs) {
        Stack<String> folderStack = new Stack<>();
        for(var log : logs){
            if(log.equals("../")){
                if(!folderStack.isEmpty())
                    folderStack.pop();
            } else if(!log.equals("./"))
                folderStack.push(log);
        }

        return folderStack.size();
    }
}