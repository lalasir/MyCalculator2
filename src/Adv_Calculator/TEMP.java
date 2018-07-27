package Adv_Calculator;
import java.util.*;


public class TEMP extends LinkedList<String> {
	
	/*
	

	
	public LinkedList<String> clist = scanList();
	public CalcList() {}
	
	private static final long serialVersionUID = 000;	//just for removing IDE warning message
	

	
	public LinkedList<String> scanList() {


		LinkedList<String> inputlist = new LinkedList<String>();
		Scanner in = new Scanner(System.in);
		
		int index = 0;
		
		for(boolean runstatus = true; runstatus == true ;) {
			
			
			
			String input =in.nextLine();
			if		(index== 0 && isInt(input)==true ) {
				switch(input) {

					case "":
						runstatus = false;
						break;
					default:
						
						inputlist.offer(input);
				}
			}
			else if	(index%2 == 0 && isInt(input)==true ) {
				switch(input) {

					case "":
						System.out.println("Need number");
						continue;
					default:
						
						inputlist.offer(input);
				}
			}
			else if	(index%2 == 1 && isInt(input)==false){
				switch(input) {
				case "":
					runstatus = false;
					break;
				default:
					
					inputlist.offer(input);
				}
				
			}
			else if	(index%2 == 0 && isInt(input)==false) {			//Wrong INPUT
				
				switch(input) {
				case "":
					System.out.println("Need number");
					continue;
				default:
					System.out.println("Should be number");
					continue;
				}
				
			}
			else if	(index%2 == 1 && isInt(input)==true){			//Wrong INPUT
				
				switch(input) {
				case "":
					runstatus = false;
					break;
				default:
					System.out.println("Should be Ops");
					continue;
				}
				
			}

			index++;

		}
		
		//System.out.println("Your input is:" + inputlist.toString());
		//in.close();
		System.out.println("size= "+inputlist.size());
		//toCalculate(inputlist);
		
		
		LinkedList<String> toclist = toCalculate(inputlist);
		System.out.println("tocalculate is= "+toclist.toString());
		//System.out.println("Your input is:" + toclist.toString());
		return inputlist;
		

	}
	
	
	public boolean isInt(String input) {
		
		try {
			 Integer.parseInt(input);
		}
		catch(NumberFormatException nfe){
			return false;
		}
		return true;
		
	}
	
	
	public void showList() {
		System.out.println("Your original input is:" + this.clist.toString());
	}
	
	
	
	
	
	
	
	public static LinkedList<String> toCalculate(LinkedList<String> list) {
		
		LinkedList<String> tclist = new LinkedList<String>();
		tclist = (LinkedList<String>)list.clone();
		
		//int i = 0;
		for(int i = 0; i<tclist.size()-1;) {
			
			if(tclist.get(i+1).equals("+")) {
				int first = Integer.parseInt(  (String)(tclist.get(i)));
				int second = Integer.parseInt( (String)(tclist.get(i+2)));
				int sum=first+second;
				tclist.addFirst(String.valueOf(sum));
				tclist.remove(1);
				tclist.remove(1);
				tclist.remove(1);
				
			}
			else if(tclist.get(i+1).equals("-")) {
					int first = Integer.parseInt(  (String)(tclist.get(i)));
					int second = Integer.parseInt( (String)(tclist.get(i+2)));
					int sum=first-second;
					tclist.addFirst(String.valueOf(sum));
					tclist.remove(1);
					tclist.remove(1);
					tclist.remove(1);
					
				}
		}
		
		return tclist;
		// 1 + 3 + 2 
	}
	
	
	
	
	
	
	*/
	
}




