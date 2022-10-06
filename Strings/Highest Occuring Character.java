public class Solution {

	public static char highestOccuringChar(String str) {
        int[] freq = new int[26];
        for(int i = 0; i<str.length(); i++){
            freq[str.charAt(i)-'a']++;
        }
        int maxFreq = Integer.MIN_VALUE;
        char ans = '\0';
        for(int i = 0; i<26; i++){
            if(maxFreq < freq[i]){
                maxFreq = freq[i];
                ans = (char)(i+'a');
            }
        }
        return ans;
	}

}
