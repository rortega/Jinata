package com.denim.markup;

import com.denim.*;

public class SubmitButtonTag extends MarkupDecorator{
	
	public SubmitButtonTag(Form newForm){
		super(newForm);
	}
	
	public String getMarkup(){		
		return tempForm.getMarkup() + this.getContent() ;
	}
	
	private String getContent(){
		StringBuffer html = new StringBuffer();
		html.append("<br><input type=\"submit\" value=\"Submit Request\" >\n");
		return html.toString();	
	}
	
	

}
