package com.denim.markup;

import java.awt.List;
import java.util.ArrayList;

import com.denim.*;

public class SimpleInputFieldForm extends MarkupDecorator{
	
	
	
	public SimpleInputFieldForm(Form newForm){
		
		super(newForm);
	
	}
	
	public String getMarkup(){
		
		
		StringBuffer param = new StringBuffer();
		ArrayList<String> list = this.getRequestList();
		
		String parameterString  = list.get(list.size()-1);
		String[] parameters = parameterString.split("&");
		
		
		for(String p : parameters){
			
			String[] paramValueName = p.split("="); 
			
			if(paramValueName.length == 1){
				param.append("<br><input type=\"text\" name=\""+java.net.URLDecoder.decode(paramValueName[0])+"\" value=\"\" />\n");
			}else{
				
				param.append("<br><input type=\"text\" name=\""+java.net.URLDecoder.decode(paramValueName[0])+"\" value=\""+java.net.URLDecoder.decode(paramValueName[1])+"\" />\n");
			}	
		}
		return tempForm.getMarkup()   + param.toString();
	}

}
