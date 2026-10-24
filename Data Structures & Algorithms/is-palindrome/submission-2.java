class Solution {
    public boolean isPalindrome(String s) {
        char[] characters = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        for (int i = 0, j = characters.length-1; i < characters.length & i < j; i++, j--) {
            if(characters[i] != characters[j])
                return false;
        }
        return true;
    }
}
