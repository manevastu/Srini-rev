import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

class palin {
    // srini: test case a*b

	public static void main(String[] args) {
		// Get the number of testcases
		Scanner input = new Scanner(System.in);
		int nt = Integer.parseInt(input.nextLine());
		ArrayList<Integer> out=new ArrayList<Integer>();
		String[] rpnArr = new String[nt];
		int[] result = new int[nt];
		for(int i=0; i<nt; i++){
			Integer k = input.nextInt();
			for (int j=k+1; j<1000000; j++){
				String pal = String.valueOf(j);
				StringBuffer valueBuf = new StringBuffer(pal);
				String value = (valueBuf.reverse()).toString();
				if(pal.equals(value)) {
					result[i]=j;
					break;
				}				
			}
		}
		for(int k=0;k<result.length;k++){
			System.out.println(result[k]);
		}

		input.close();
		System.exit(0);
}
}

