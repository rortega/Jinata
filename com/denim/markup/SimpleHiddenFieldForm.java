package com.denim.markup;

import java.util.ArrayList;

import com.denim.Form;
import com.denim.MarkupDecorator;

public class SimpleHiddenFieldForm extends MarkupDecorator{
	
	
	
	public SimpleHiddenFieldForm(Form newForm){
		super(newForm);
	}
	
	
	public String getMarkup(){
			
		StringBuffer param = new StringBuffer();
		ArrayList<String> list = MarkupDecorator.getRequestList();
		
		String parameterString  = list.get(list.size()-1);
		String[] parameters = parameterString.split("&");
		
		
		for(String p : parameters){
			
			String[] paramValueName = p.split("="); 
			
			if(paramValueName.length == 1){
				param.append("<input type=\"hidden\" name=\""+java.net.URLDecoder.decode(paramValueName[0])+"\" value=\"\" />\n");
			}else{
				
				param.append("<input type=\"hidden\" name=\""+java.net.URLDecoder.decode(paramValueName[0])+"\" value=\""+java.net.URLDecoder.decode(paramValueName[1])+"\" />\n");
			}	
		}
		return tempForm.getMarkup()   + param.toString();
	}
	
	
	
	
	
	
	
	
}
