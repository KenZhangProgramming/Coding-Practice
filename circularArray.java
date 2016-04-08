/*Interesting question: find out whether one integer array is a circular array of another one
 * Assumption: All elements are distinct
 * The same array is the circular array of itself
 * */
public class circularArray {

	public static void main(String[] args) {
		//Testing Arrays(Set1) same length only last element first in front
		int[] array1 ={1,2,3,4,5,6,7,8};  
		int[] array2 ={8,1,2,3,4,5,6,7};

		//Testing Arrays(Set2) same length last few elements first in front
		int[] array3 ={1,2,3,4,5,6,7,8};
		int[] array4 ={6,7,8,1,2,3,4,5};		

		//Testing Arrays(Set3) different lengths
		int[] array5 = {1,2,3,4};	
		int[] array6 = {4,1,2};

		if (isCircularArray(array1,array5)){
			System.out.print("It is circular array!");
		}else{System.out.print("It is not circular array!");}
	}

	public static boolean isCircularArray(int[] array1, int[] array2){
		int sameElementCount = 0;
		if(array1.length != array2.length )
		{return false;}
		else{
			int index = 0;
			int arrayPositionCalc = 0;
			for(int i=0; i<array1.length; i++){
				if(array2[0] == array1[i]){
					index = i;
				}
			}
			arrayPositionCalc = array1.length - 1;

			for (int j=0; j <= arrayPositionCalc ;j++){
					if(index+j > arrayPositionCalc){
						if(array1[index + j - arrayPositionCalc - 1] != array2[j]){
							return false;
						}
					}else
					if(array1[index + j]!=array2[j]){
						return false;
					}	
				}
			}
				return true;
		}
	}
