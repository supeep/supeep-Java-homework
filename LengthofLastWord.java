public class LengthofLastWord {
    public static void main(String [] args){
        Solution lolw=new Solution();
        int a=lolw.lengthOfLastWord("Hello World");
        System.out.println(a);
    }
    
}

    class Solution {
        public int lengthOfLastWord(String s) {
            int a = s.length() - 1;
            while (s.charAt(a) == ' ') {
                a--;
            }
            int Length = 0;
            while (a >= 0 && s.charAt(a) != ' ') {
                Length++;
                a--;
            }
            return Length;
        }
}
