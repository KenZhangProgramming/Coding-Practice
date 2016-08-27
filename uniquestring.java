
public class uniquestring {
	public static void main(String[] args)  {
		String repeat = "abcab";
		String nonRepeat = "abcdefghi";
		boolean isRepeat = false;
		char[] repeatArray = repeat.toCharArray();
		char[] nonRepeatArray = nonRepeat.toCharArray();
		char[] test = nonRepeatArray;
		for(int i = 0; i < test.length; i++){
			for(int j =i+1; j< test.length;j++){
				if(test[i] == test[j]){
					isRepeat = true;
				}
			}
		}
		if(isRepeat){System.out.print("The array is not unique!");}	
		else{System.out.print("The array is unique!");}
	}
}
