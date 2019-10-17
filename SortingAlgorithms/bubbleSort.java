
public class bubbleSort {
	public static void main(String [ ] args) {

	int[] numeretti = new int[] {};
	
	int i = 0;
	int j = 0;
	int min = numeretti[i];

	for(i = 0;i<numeretti.length;i++)
	{
		min = numeretti[i];
		
		for(j = i; j<numeretti.length; j++) {
			
			if (min > numeretti[j]) {
				
				min = numeretti[j];
				numeretti[j] = numeretti[i];
				numeretti[i] = min;
			}
		}
		
		System.out.println(min);
	}

}
}
