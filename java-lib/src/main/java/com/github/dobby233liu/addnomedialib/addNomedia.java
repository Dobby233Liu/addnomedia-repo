package com.github.dobby233liu.addnomedialib;

import java.util.*;
import java.io.*;

public class addNomedia
{

	
	
	

	    
	public static boolean addNomedia(String path){
		if (path==null){return false;}
		File file = new File(path+".nomedia");
		
		if (!file.exists()){
		try
		{
		file.createNewFile();
		return true;
		}
		catch (IOException e) {
		return false;
		}
		}else{
			return false;
		}
		}
	
}
