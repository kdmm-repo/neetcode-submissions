class Solution {
    public int calPoints(String[] operations) {
        List<Integer> stack = new ArrayList();
        for(String op :operations ){
            switch(op){
                case "+" : 
                    int a = stack.get(stack.size()-1);
                    int b = stack.get(stack.size()-2);
                    stack.add(a+b);
                    break ;
                case "D" :
                    int score = stack.get(stack.size()-1);
                    stack.add(2*score);
                    break ;
                case "C" :
                    stack.remove(stack.size()-1);
                    break;
                default : 
                    stack.add(Integer.parseInt(op));
                    break;
            }
          System.out.println(stack);  
        }
        int total = 0;
        for (Integer i : stack){
              total += i;  
            System.out.println(total);  
        }
        return total;
    }
}