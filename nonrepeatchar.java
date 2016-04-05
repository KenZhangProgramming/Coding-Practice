import java.util.Hashtable;

/*Interesting question: find the first Nonreapted character 
 * The worst running time will O(n)
 *  */
public class nonrepeatchar {

	public static void main(String[] args) {
		//String testString ="aaaaabbbtddcccqppppppvdddddddd";
		Character nonRepeat = null;
		String testString ="aaabbbcccc";
		Hashtable<Character,Integer> MYHASH = new Hashtable<Character,Integer>();
		// Time: O(n)
		for(int i=0;i<testString.length();i++){
			if(MYHASH.containsKey(testString.charAt(i))){
				MYHASH.put(testString.charAt(i),MYHASH.get(testString.charAt(i))+1); 
			}else{
				MYHASH.put(testString.charAt(i), 1);
			}
		}
		// Time: O(n)
		for(int i=0; i<testString.length();i++){
			if(MYHASH.get(testString.charAt(i))==1){	
				nonRepeat = testString.charAt(i);
				break;
			}
		}
		
		if (nonRepeat == null){
			System.out.print("Characters in the string are all repeating!");
		}else
		{System.out.print(nonRepeat);}
	}
}
