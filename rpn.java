import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

class rpn {
    // srini: test case a*b

	public static void main(String[] args) {
		// Get the number of testcases
		Scanner input = new Scanner(System.in);
		int nt = Integer.parseInt(input.nextLine());
		ArrayList<Integer> out=new ArrayList<Integer>();
		String[] rpnArr = new String[nt];
		int k=0;
		for(int i=0; i<nt; i++){
			String value = input.nextLine();
			String[] charList = value.split("");
			Stack opStack = new Stack();
			Stack rpnStack = new Stack();
			String temp;
			for(int j=0; j<charList.length; j++){
				switch(charList[j]){
				case "(": 
					break;				
				case ")": 
					rpnStack.push(opStack.pop());
					break;
				case "+": 
				case "-":	
				case "*":
				case "/": 	
				case "^":	
					opStack.push(charList[j]);
					break;	
				default: 
					if(charList[j].matches("[a-z]")){
						rpnStack.push(charList[j]);
					}
					break;
				}
			}
			for (int m=0; m<opStack.size();m++){
				rpnStack.push(opStack.get(m));
			}
			temp="";
			for (int l=0; l<rpnStack.size(); l++){
				temp += rpnStack.get(l);
			}
			rpnArr[k] = temp;
			k = k+1;
		}
		for(int q=0; q<rpnArr.length; q++){			
			System.out.println(rpnArr[q]);
		}
		input.close();
		System.exit(0);
}
}

