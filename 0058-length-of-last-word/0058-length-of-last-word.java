class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean wordStarted = false;

        for(int i = s.length() - 1; i >= 0; i--) {

            if(s.charAt(i) != ' ') {
                count++;
                wordStarted = true;
            } 
            else if(wordStarted) {
                return count;
            }

        }

        return count;
    }
}