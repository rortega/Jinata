package com.denim;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.denim.markup.*;

public class FormMaker {

	public static void main(String[] args){
		
		List<String> requestList = readFile(".\\payload.txt");		
		Form form_0 = new HeaderEnd( new FormTagEnd(new ScriptTag(new SimpleHiddenFieldForm( new FormTagStart( new HeaderStart(new PlainForm(requestList)))))));
		FormMaker.writeFile("SimpleForm.html", form_0.getMarkup());
		
		System.out.println("---------------------------------------------------");
		
		Form form_1 = new HeaderEnd( new FormTagEnd(new SubmitButtonTag(new SimpleHiddenFieldForm( new FormTagStart( new HeaderStart(new PlainForm(requestList)))))));
		FormMaker.writeFile("SimpleForm_1.html", form_1.getMarkup());
		
		System.out.println("---------------------------------------------------");
		
		Form form_2 = new HeaderEnd( new FormTagEnd(new SubmitButtonTag(new SimpleInputFieldForm( new FormTagStart( new HeaderStart(new PlainForm(requestList)))))));
		FormMaker.writeFile("SimpleForm_2.html", form_2.getMarkup());
		
		
		Form form_3 = new HeaderEnd((new XMLHttpRequest(new PlainForm(requestList))));
		FormMaker.writeFile("SimpleForm_3.html", form_3.getMarkup());
		
	}
	
	
	public static List<String> readFile(String file)  {		
		List<String> list = new ArrayList<String>(); 
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(file)));
            while (s.hasNextLine()) {
              list.add(s.nextLine());
            }
        } catch(IOException e)
        {
        	System.out.println(e.toString());	
        }
        
        finally {
            if (s != null) {
                s.close();
            }
        }
        return list;
    }	
	
	
	public static String  writeFile( String file, String content){
		try{
		    File outFile = new File (file);
		    FileWriter fWriter = new FileWriter (outFile);
		    System.out.println(outFile.getName());
		    PrintWriter pWriter = new PrintWriter (fWriter);
		    pWriter.println (content);
		    pWriter.close();
		}catch(Exception e){
			System.out.println(e.toString());
			return e.toString();
		}
		finally{

			return "";
		}
		    
	}
	
	
}
