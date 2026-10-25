class Solution{
    public boolean isPalindrome(String s) {
        char[] characters = s.toLowerCase().toCharArray();

        for(int i = 0, j = characters.length-1; i < characters.length; i++, j--){
            if (!alphaNum(characters[i])) i++;
            if (!alphaNum(characters[j])) j--;

            if (characters[i] != characters[j]) return false;
        }

        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}