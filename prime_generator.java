import java.util.Scanner;
import java.util.ArrayList;

class TEST {
    
	public static void main(String[] args) {
		// Get the number of testcases
		Scanner input = new Scanner(System.in);
		int nt = Integer.parseInt(input.nextLine());
		ArrayList<Integer> out=new ArrayList<Integer>(); 
		if(nt<=10){
			for(int i=0; i<nt; i++){
				String value = input.nextLine();
				String[] var = value.split("\\s+", 2);
				int m = Integer.parseInt(var[0]);
				int n = Integer.parseInt(var[1]);
				if(1<=m && m<=n && n<=1000000000 && n-m<=100000){
					int prim=m+1;
					while(prim<=n){
						int isprime=0;
						for(int j=2; j<=prim/2; j++){
							if(prim%j == 0){
								isprime=1;
							}
						}
						if (isprime==0) out.add(prim);
						prim++;
					}
				}
				out.add(null);
			}
		}
		for(int q=0; q<out.size(); q++){
			if(out.get(q)==null) System.out.println("\n");
			else System.out.println(out.get(q));
		}
		input.close();
		System.exit(0);
}
}
