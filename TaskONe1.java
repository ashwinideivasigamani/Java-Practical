package taskprogram;

public class TaskONe1 {
	//lexicographical two strings

	public static void main(String[] args) {

		String s="ashwini has scored 89 marks";
		
		int digitCount=0;
		int alphaCount=0;
		for(int i=0;i<s.length();i++)
     {
	    char ch=s.charAt(i);
	    if(Character.isDigit(ch))
	    {
	    	digitCount++;
	    }
	    if(Character.isAlphabetic(ch))
	    {
	    	alphaCount++;
	    	
	    }
	    System.out.println("Total number of numeric values "+digitCount);
        System.out.println("Total number of numeric values "+alphaCount);
     }

	}

}
