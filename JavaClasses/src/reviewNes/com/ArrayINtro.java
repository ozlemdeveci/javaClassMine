package reviewNes.com;

public class ArrayINtro {
	public static void main(String[] args) {
		
		int[] a=new int[5];
		 a[0]=4;
		 a[1]=5;
		 a[2]=7;
		 a[3]=2;
		 a[4]=9;
		
		int[] b= {4,5,7,2,9};
	   int	sumB=0;
		for (int i=0; i<b.length; i++) {
			sumB=sumB+b[i];
		}System.out.println(sumB);
		System.out.println("    ");
		
		String[] s= {"Dog", "cat", "mouse","bird","donkey","monkey"};
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
