package sort;

public class Runner {
	
	public static void main(String[] args){
		Sort sorter=new InsertionSort();
		Integer[] i={55,3,96,4,44,2,65,29,23};
		for(Integer j:i){
			System.out.print(j+" ");
		}
		System.out.println();
		sorter.sort(i);
		for(Integer j:i){
			System.out.print(j+" ");
		}
	}

}
