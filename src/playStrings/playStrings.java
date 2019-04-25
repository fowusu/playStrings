package playStrings;

public class playStrings {
	
	public static void main(String abc[]) {
		
		modString newObj = new modString();
		
		newObj.sortItString(); 
	   
	}
}

class modString{
	
	String current;
	String longest;
	
	public void sortItString() {
		
		
	}
	
	
	public void messWithString() {
		
		
		
	}
	
	public void findFunc(String msg ,String lookfor) {
		int i, found;

		i = found = 0;
		
		for (; i < msg.length(); i++) {

			if (msg.substring(i, i + 1).equals(lookfor.substring(0, 1))) {

				if (msg.length() - i >= lookfor.length()) {

					if (msg.substring(i, i + lookfor.length()).equals(lookfor)) {
						
						i = i + lookfor.length() - 1;
					}
					if (longest.length() > lookfor.length()) {
						longest = lookfor;
						
					}

				}
			}
		
		
	}
}
}


