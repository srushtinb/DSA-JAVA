class Solution {
    List<String> result = new ArrayList<>();

    public void dp(String s, int left, int right, int total){
        if(left == right && right == total){
            result.add(s);
            return;
        }
        if(left >= right && left <= total && right <= total){
            if(left == total){
                dp(s + ")", left, right + 1, total);
            } else if(left == right){
                dp(s + "(", left + 1, right, total);
            }else {
                dp(s + "(", left + 1, right, total);
                dp(s + ")", left, right + 1, total);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        dp("(", 1, 0, n);
        return result;
    }
}