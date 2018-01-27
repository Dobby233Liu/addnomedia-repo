
import java.util.*;
import com.github.dobby233liu.addnomedialib.*;
public class foobarbaz
{
	public static void foobarbaz(String path){
	Boolean isNomediaAdded=addNomedia.addNomedia(path);
	if (isNomediaAdded){
	System.out.printf("Okay");
	}else{
	System.out.printf("Got err/File exists");
	}
	}
}
