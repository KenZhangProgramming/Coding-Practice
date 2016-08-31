import java.util.HashSet;

public class uniquestring {
	public static void main(String[] args)  {
		String repeat = "abcab";
		String nonRepeat = "abcdefghi";
		/*test one O(n^2) method*/
		boolean isRepeat = isRepeat(nonRepeat);
		/*test two O(n) method*/
		boolean isRepeat1 = isRepeatFastVersion(repeat);
		if(isRepeat1){System.out.print("The array is not unique!");}	
		else{System.out.print("The array is unique!");}
	}
	
	/*The method runs in O(n^2) time which is too slow*/
	public static boolean isRepeat(String s){
		boolean isRepeat = false;
		char[] stringArray = s.toCharArray();
		for(int i = 0; i < stringArray.length; i++){
			for(int j =i+1; j< stringArray.length;j++){
				if(stringArray[i] == stringArray[j]){
					return true;
				}
			}
		}
		return false;
	}	
	
	/*The method runs in O(n) time which is ok*/
	public static boolean isRepeatFastVersion(String s){
		HashSet<Character> testDuplicates = new HashSet<Character>();
		for (char w : s.toCharArray()){
			if(!testDuplicates.add(w)){
				return true;
			}
		}
		return false;
	}


}
