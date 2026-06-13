class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        st.push(Integer.parseInt(tokens[0]));
        for(int i=1;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n1+n2);
            } else if(tokens[i].equals("-")){
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2-n1);
            } else if(tokens[i].equals("*")){
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n1*n2);
            } else if(tokens[i].equals("/")){
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2/n1);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}
