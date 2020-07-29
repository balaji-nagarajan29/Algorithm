import java.util.HashSet;
public class Subsequence {
 // Set to store all the subsequences
 static HashSet<String> st = new HashSet<>();
 // It computes all the possible substring that
 // starts with vowel and end with consonent
 static void subsequence(String str)
 {
 // iterate over the entire string
 for (int i = 0; i < str.length(); i++) {

 // test ith character for vowel
 if (isVowel(str.charAt(i))) {

 // if the ith character is vowel
 // iterate from end of the string
 // and check for consonant.
 for (int j = (str.length() - 1); j >= i; j--) {

 // test jth character for consonant.
 if (isConsonant(str.charAt((j)))) {

 // once we get a consonant add it to
 // the hashset
 String str_sub = str.substring(i, j + 1);
 st.add(str_sub);
 // drop each character of the substring
 // and recur to generate all subsquence
 // of the substring
 for (int k = 1; k < str_sub.length() - 1; k++) {
 StringBuffer sb = new StringBuffer(str_sub);
 sb.deleteCharAt(k);
subsequence(sb.toString());
 }
 }
 }
 }
 }
 }
 // Utility method to check vowel
 static boolean isVowel(char c)
 {
 return (c == 'a' || c == 'e' || c == 'i' || c == 'o'
 || c == 'u');
 }
 // Utility method to check consonant
 static boolean isConsonant(char c)
 {
 return !(c == 'a' || c == 'e' || c == 'i' || c == 'o'
 || c == 'u');
 }
 // Driver code
 public static void main(String[] args)
 {
 String s = "lovejava";
 subsequence(s);
 System.out.println(st);
 }
}