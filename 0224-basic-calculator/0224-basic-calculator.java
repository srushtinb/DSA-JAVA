class Solution {
    public int calculate(String s) {
         int sum = 0, sign = 1;
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                sum += sign * num;
                continue; 
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;
            } else if (c == ')') {
                int prevSign = stack.pop();
                int prevSum = stack.pop();
                sum = prevSum + prevSign * sum;
            }
            i++;
        }

        return sum;
    }
}