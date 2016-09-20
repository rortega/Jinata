package com.denim.markup;

import com.denim.*;

public class HeaderStart extends MarkupDecorator{
	public HeaderStart(Form newForm){
		super(newForm);
	}
	public String getMarkup(){		
		return tempForm.getMarkup() + this.getContent() ;
	}
	private String getContent(){
		
		StringBuffer html = new StringBuffer();
		html.append("<html lang=\"en\">\n");
		html.append("<head>\n");
		html.append("<title>Jinata-CSRF-Tool</title>\n");
		html.append("</head>\n");
		html.append("<body>\n");
		return html.toString();	
	}
}
