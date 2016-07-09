import java.util.Arrays;

public class selectionsort {
	 public static void main(String[] args)  {
		 
		 // u need an int array to hold all ur data
		 int data[] ={3,5,6,20,8,9,2,1};
		 selectionsort(data,0);
		 System.out.print(Arrays.toString(data));
	 }
	 
	 // u need a selectionsort method to do the seletion sort
	 public static void selectionsort(int[] data  ,int start){
		 // base case when counter is zero
		 if (start - (data.length-1) > 0){
			 return;
		 }
		 
		 else{
			 	swap(start,minPos(start,data),data);		
			 	selectionsort(data,start+1);
		 }		 
	 } 
	 
	 // u need a min method to find the minimum in the array with the starting index
	 public static int minPos(int index, int[] array){
			int min = array[index];
			boolean isMin = true;
			int test = array.length;
			for (int i=index; i< array.length; i++){
				for (int i1=index; i1<array.length;i1++){
					if (array[i] > array[i1]){
						isMin = false;
					} 
				}
				if (isMin){
					min = i;
					break;
				}
				isMin = true;
			}
			return min; 
		}
	 
	 // u need a swap method to do the swap
	 // max # of swaps is n-1
	 public static void swap(int i1, int i2,int[] data){
		 int holder = 0;
		 holder = data[i1];
		 data[i1] = data[i2];
		 data[i2] = holder;
	 }
}
