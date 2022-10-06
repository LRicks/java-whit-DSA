
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        int[] freq = new int[256];
        int len1 = str1.length(), len2 = str2.length();
        if(len1 != len2){
            return false;
        }
        for(int i = 0; i<len1; i++){
            freq[(int)(str1.charAt(i))]++;
        }
        for(int i = 0; i<len2; i++){
            if(freq[(int)(str2.charAt(i))] != 0){
                freq[(int)(str2.charAt(i))]--;
            }
            else{
                return false;
            }
        }
        return true;
	}

}
