import java.util.*;
class palin {

	public static void main(String[] args) {
		// Get the number of testcases
		Scanner input = new Scanner(System.in);
		int nt = Integer.parseInt(input.nextLine());
		int[] result = new int[nt];
		for(int i=0; i<nt; i++){
			Integer k = input.nextInt();
			for (int j=k+1; j<1000000; j++){
				boolean found = false;
				Integer number = j; // = and int
				Stack<Integer> stack = new Stack<Integer>();
				while (number > 0) {
				    stack.push( number % 10 );
				    number = number / 10;
				}
				int m=stack.size()-1;
				for(int l=0;l<stack.size();l++){
					if(stack.get(l)!=stack.get(m)) break;
					m--;
					if(l==(stack.size()-1)){
						found=true;
					}
				}
				if(found) 
				{
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

