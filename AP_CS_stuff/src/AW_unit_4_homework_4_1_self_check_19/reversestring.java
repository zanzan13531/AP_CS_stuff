package AW_unit_4_homework_4_1_self_check_19;

public class reversestring {
	
	public static String reversifystring(String s) {
	    
	    String a = "";
	    
	    for (int x = 0; x < s.length(); x++) {
	        
	        a += s.charAt(s.length()-(x+1));
	        
	    }
	    
	    return(a);
	   
	}
	
	public static void main(String[] args) {
		
		System.out.println(reversifystring("asdfasdf"));
		
	}
	
}
