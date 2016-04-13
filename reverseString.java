/*
 The code for reversing a string
 */


public class reverseString {

	public static void main(String[] args) {
		//Test Strings
		String testString1 = "kenishandsome";
		String testString2 = "todayisnice";
		System.out.println(reverseString(testString1));
		System.out.println(reverseString(testString2));
	}
	public static String  reverseString(String s){
			Character temp = null;
			char[] stringArray = s.toCharArray();
			int pos = s.length() - 1;
			for(int i=0; i<=pos/2; i++){
				temp = stringArray[i];
				stringArray[i] = stringArray[pos-i];
				stringArray[pos-i] = temp;						
			}
		return String.copyValueOf(stringArray);		
	}
	
}
