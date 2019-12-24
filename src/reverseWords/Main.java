package reverseWords;

public class Main {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		
		System.out.println("Input: " + s);
		
		FindReverseWordsOfStringFunction solution = new FindReverseWordsOfStringFunction();
		
		System.out.println("Solution: " + solution.reverseWords(s));
	}
}
