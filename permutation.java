import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

//Assumption: there are no spaces between characters 
public class permutation {
 public static void main(String[] args)  {
		String testString = "abcd";
		String permutedString1 ="acbd";
		String permutedString2 ="cbad";
		String notPermuted = "abed";
		
		char[] testStringArray = testString.toCharArray();
		char[] testStringArray1 = permutedString1.toCharArray();	
		char[] testStringArray2 = permutedString2.toCharArray();
		char[] notPermutedArray = notPermuted.toCharArray();
		if(isPermutation(testStringArray,testStringArray2)){
			System.out.print("it is permutation!");
		}else{
			System.out.print("it is not permutation!");
		}
	 }
 
 public static boolean isPermutation(char[] chararray1, char[] chararray2){
	 	// If the character length is not the same, they must not be permutations of each other
	 	if(chararray1.length != chararray2.length){return false;}
		Arrays.sort(chararray1); // arrays.sort method nlgn time 
		Arrays.sort(chararray2);
		/*The java.util.Arrays.equals(char[] a, char[] a2) method
				returns true if the two specified arrays of chars are equal to one another.Two arrays are equal
				 if they contain the same elements in the same order.Two array references are considered equal 
				 if both are null. */
		return Arrays.equals(chararray1,chararray2);
		
		/*
		for(int i=0; i<chararray1.length;i++){		// compare the array n time 		
			if (chararray1[i] != chararray2[i]){
				return false;
			}						
		}	 
	 return true;*/
 }
}
