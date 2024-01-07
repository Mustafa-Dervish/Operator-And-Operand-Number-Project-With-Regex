import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Operator {
  public String data;
	
	public void operator() throws Exception{
		    
	  String ikili = "(?<=[^\\+])\\+(?=[^\\+])|(?<=[^\\-])\\-(?=[^\\-])|\\*|\\/|\\%|(?<=[^\\=\\!\\+\\-\\*\\/\\&\\|\\^\\%\\<\\>])\\=(?=[^\\=])|\\^|(?<=[^\\|])\\|(?=[^\\|])|(?<=[^\\&])\\&(?=[^\\&])|\\+\\=|\\-\\=|\\&\\=|\\*\\=|\\|\\=|\\%\\=|\\^\\=|\\/\\=";
	  Matcher matcher =Pattern.compile(ikili).matcher(data);	   
	    int count=0;
	    while(matcher.find()){
	    	count++;    	
	    }	   	    
	    System.out.println("ikili = " +count);	  
	  String tekli ="\\+\\+|\\-\\-";
	  Matcher matcher1 =Pattern.compile(tekli).matcher(data);	   
	    int count1=0;
	    while(matcher1.find()){
	    	count1++;    	
	    }	   	    
	    System.out.println("tekli = " +count1);	  
	  String iliskiseyl = "\\>|\\<|\\=\\=|\\>\\=|\\<\\=|\\!\\=";
	  Matcher matcher2 =Pattern.compile(iliskiseyl).matcher(data);	   
	    int count2=0;
	    while(matcher2.find()){
	    	count2++;    	
	    }	   	    
	    System.out.println("iliskiseyl = " +count2);     
      String mantiksal = "\\&\\&|\\!(?=[^=])|\\|\\|"; 
	  Matcher matcher3 =Pattern.compile(mantiksal).matcher(data);	   
	    int count3=0;
	    while(matcher3.find()){
	    	count3++;    	
	    }	   	    
	    System.out.println("mantiksal = " +count3);
	   int saysal =count  +count1;
	    System.out.println("saysal = "+saysal );
	    int operand = 2*(count+count2 + count3)+count1;
	    System.out.println("operand =" + operand);
	   }	
}