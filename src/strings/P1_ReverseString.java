package strings;

public class P1_ReverseString {
	public static void main(String[] args) {
		String input ="suraiya";
		
		char[] charArray =input.toCharArray();
		
		int left=0;
		int right =charArray.length -1;
		
		while(left<right) {
			char temp =charArray[left];
			charArray[left] =charArray[right];
			charArray[right] =temp;
			left++;
			right --; 
		}
		
		for (char c : charArray) {
			System.out.print(c);
		}
		
		
		
	}

}
