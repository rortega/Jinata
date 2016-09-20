package com.denim.markup;

import java.awt.List;
import java.util.ArrayList;

import com.denim.*;

public class FormTagStart extends MarkupDecorator{
	public FormTagStart(Form newForm){
		super(newForm);
	}
	public String getMarkup(){		
		return tempForm.getMarkup() + this.getContent() ;
	}
	private String getContent(){
		ArrayList<String> val = MarkupDecorator.getRequestList();		
		String path = MarkupDecorator.getUrlPath();
		String host = MarkupDecorator.getHost();
		StringBuffer html = new StringBuffer();
		html.append("<form action=\"https://"+host+path+"\" id=\"formid\" method=\"post\">\n");
		return html.toString();
	
	}
}
