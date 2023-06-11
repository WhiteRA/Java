package jAVA.Java;

public class t_1 {
    public static void main(String[] args) {
        class Solution {
            public String reverseWords(String s) {
                StringBuilder sb = new StringBuilder();
                s = s.trim();
                int n = s.length(), i = n - 1, j = n;
                while (i >= 0) {
                    if (s.charAt(i) == ' ') {
                        sb.append(s.substring(i + 1, j)).append(" ");
                        while (s.charAt(i) == ' ')
                            i--;
                        j = i + 1;
                    } else
                        i--;
                }
                //Handle the beginning separately
                sb.append(s.substring(0, j));
                return sb.toString();
            }
        } 
    }
}
