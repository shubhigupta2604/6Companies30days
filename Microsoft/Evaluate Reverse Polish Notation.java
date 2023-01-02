class Solution {
    public int evalRPN(String[] tokens) {
        int n1,n2;
		Stack<Integer> s = new Stack<Integer>();
		for (String str : tokens) {
			if(str.equals("+")) {
				s.add(s.pop() + s.pop());
			}
			else if(str.equals("/")) {
				n2 = s.pop();
				n1 = s.pop();
				s.add(n1 / n2);
			}
			else if(str.equals("*")) {
				s.add(s.pop() * s.pop());
			}
			else if(str.equals("-")) {
				n2 = s.pop();
				n1 = s.pop();
				s.add(n1 - n2);
			}
			else {
				s.add(Integer.parseInt(str));
			}
		}	
		return s.pop();
    }
}
