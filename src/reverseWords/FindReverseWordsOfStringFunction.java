package reverseWords;

public class FindReverseWordsOfStringFunction {
    public String reverseWords(String s) {
        // There is a reverse function in StringBuilder
    	StringBuilder result = new StringBuilder();
        
    	// Get all the words without space first
        String[] words = s.split(" ");
        
        // Make each word reverse
        for(int i = 0; i < words.length; i++){
        	words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        
        // Append will continue to add a string 
        for(String word : words){
        	result.append(word + " ");
        }
        
        // Need to trim() cause there is an extra space at the end
        return result.toString().trim();
    }
}
