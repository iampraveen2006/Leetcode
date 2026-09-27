class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder(s);

        while (str.indexOf("(") != -1) {
            int start = str.lastIndexOf("(");
            int end = str.indexOf(")", start);

            StringBuilder temp = new StringBuilder(
                str.substring(start + 1, end)
            );

            temp.reverse();

            str.replace(start, end + 1, temp.toString());
        }

        return str.toString();
    }
}