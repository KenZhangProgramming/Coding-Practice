/*Print out the reverse of a String without using any data structures
 *  */
public class ReverseStringNoDataStructures {
	public static void main(String[] args){
		 /*************Print out the reverse of a String without using any data structures********/
		 	String input = "YoucandoitKen!";
			System.out.println(input); 		
			reverse(input,0);
		}
	
	public static void reverse(String input,int position){
		if(position < input.length()){
		char line = input.charAt(position++);
		input.replace("You", "");
				reverse(input,position);
		System.out.print(line);		
		}
	}
}
