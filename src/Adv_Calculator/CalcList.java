package Adv_Calculator;
import java.util.*;


public class CalcList extends LinkedList<String> {
	
/*----constructors----*/
	
	public LinkedList<String> clist = scanList();
	public CalcList() {}
	
	private static final long serialVersionUID = 000;	//just for removing IDE warning message
	
/*--------------------*/
	
	public LinkedList<String> scanList() {


		LinkedList<String> inputlist = new LinkedList<String>();
		Scanner in = new Scanner(System.in);
		
		int index = 0;
		
		for(boolean runstatus = true; runstatus == true ;) {
			
			
			
			String input =in.nextLine();
			if		(index== 0 && isDouble(input)==true ) {
				switch(input) {

					case "":
						runstatus = false;
						break;
					default:
						
						inputlist.offer(input);
				}
			}
			else if	(index%2 == 0 && isDouble(input)==true ) {
				switch(input) {

					case "":
						System.out.println("Need number");
						continue;
					default:
						
						inputlist.offer(input);
				}
			}
			else if	(index%2 == 1 && isDouble(input)==false){
				switch(input) {
				case "":
					runstatus = false;
					break;
				default:
					
					inputlist.offer(input);
				}
				
			}
			else if	(index%2 == 0 && isDouble(input)==false) {			//Wrong INPUT
				
				switch(input) {
				case "":
					System.out.println("Need number");
					continue;
				default:
					System.out.println("Should be number");
					continue;
				}
				
			}
			else if	(index%2 == 1 && isDouble(input)==true){			//Wrong INPUT
				
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
		

		return inputlist;
		

	}
	

	
	public void showList() {
		System.out.println("Your original input is:" + this.clist.toString());
	}
	
	public void showResult() {
		
		String s = toCalculate(this.clist).get(0);
		//Double d = Double.parseDouble(s);
		System.out.println("=======================");
		System.out.println("Calculated Result: " + s);
		System.out.println("=======================");
	}
	
	
	
	private boolean isDouble(String input) {
		
		try {
			 Double.parseDouble(input);
		}
		catch(NumberFormatException nfe){
			return false;
		}
		return true;
		
	}
	
	
	
	private static LinkedList<String> toCalculate(LinkedList<String> list) {
		
		LinkedList<String> tclist = new LinkedList<String>();
		tclist = (LinkedList<String>)list.clone();
		
		for(int i = 0;i < tclist.size(); i++) {
			for(int s = 0;s < tclist.size();) {
				
				if( (tclist.get(s)).equals("*") ) {
					Double multiply1 = Double.parseDouble(tclist.get(s-1));
					Double multiply2 = Double.parseDouble(tclist.get(s+1));
					Double total = multiply1*multiply2;
					tclist.remove(s+1);
					tclist.remove(s);
					tclist.remove(s-1);
					tclist.add(s-1,String.valueOf(total));
					//System.out.println("at multi: " +tclist.toString());				//for debug use
					//System.out.println("s at multi: "+s);
					
				}else if( (tclist.get(s)).equals("/") ) {
					Double divide1 = Double.parseDouble(tclist.get(s-1));
					Double divide2 = Double.parseDouble(tclist.get(s+1));
					Double total = divide1/divide2;
					tclist.remove(s+1);
					tclist.remove(s);
					tclist.remove(s-1);
					tclist.add(s-1,String.valueOf(total));
					//System.out.println("at divide: " +tclist.toString());				//for debug use 
				}else {s++;}
				
				
			}
		}
		
		
		for(int i = 0; i<tclist.size()-1;) {
			
			if(tclist.get(i+1).equals("+")) {
				double first = Double.parseDouble(  (String)(tclist.get(i)));
				double second = Double.parseDouble( (String)(tclist.get(i+2)));
				double sum=first+second;
				tclist.addFirst(String.valueOf(sum));
				tclist.remove(1);
				tclist.remove(1);
				tclist.remove(1);
				
			}
			else if(tclist.get(i+1).equals("-")) {
				double first = Double.parseDouble(  (String)(tclist.get(i)));
				double second = Double.parseDouble( (String)(tclist.get(i+2)));
				double sum=first-second;
					tclist.addFirst(String.valueOf(sum));
					tclist.remove(1);
					tclist.remove(1);
					tclist.remove(1);
					
				}
		}
		
		
		return tclist;

	}
	
}




