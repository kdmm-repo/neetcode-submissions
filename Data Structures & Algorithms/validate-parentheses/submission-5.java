class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        if(s.length() <= 1) return false;
        for(char c: s.toCharArray()){
            switch(c) {
                case '(','[','{' -> st.push(c); 
                case ')' -> { if ( st.isEmpty()) {
                                    st.push(c);
                                } else if ('('!= st.pop()) { 
                                 return false;
                                }
                            }    
                case ']' -> { if ( st.isEmpty()) {
                                    st.push(c);
                                } else if ('['!= st.pop()) { 
                                 return false;
                                }
                            }   
                case '}' -> { if ( st.isEmpty()) {
                                    st.push(c);
                                } else if ('{'!= st.pop()) { 
                                 return false;
                                }
                            }

            };
           
        }
        return st.isEmpty();
    }
}
