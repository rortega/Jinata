package com.denim.markup;

import com.denim.*;

public class FormTagEnd extends MarkupDecorator{

	public FormTagEnd(Form newForm){	
		super(newForm);
	}
	public String getMarkup(){		
		return tempForm.getMarkup() + this.getContent() ;
	}	
	private String getContent(){
		StringBuffer html = new StringBuffer();
		html.append("</form>\n");	
		return html.toString();	
	}
}
