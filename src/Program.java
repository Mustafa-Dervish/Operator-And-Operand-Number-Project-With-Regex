import java.nio.file.Files;
import java.nio.file.Paths;
public class Program  {
	public static  String readFileAsString(String fileName)throws Exception
	{
	    String data = "";
	    data = new String(Files.readAllBytes(Paths.get(fileName)));
	    return data;
	 }		
	public static void main(String[] args) throws Exception{
		String data = readFileAsString(args[0]);
		  data = data.replaceAll( "//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "$1 " );
		Operator Op=new Operator();		
		Op.data=data;
		Op.operator();	
	}
}
