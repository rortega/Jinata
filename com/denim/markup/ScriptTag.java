package com.denim.markup;

import com.denim.*;

public class ScriptTag extends MarkupDecorator{
	public ScriptTag(Form newForm){
		super(newForm);
	}
	public String getMarkup(){		
		return tempForm.getMarkup() + this.getContent() ;
	}
	private String getContent(){
		StringBuffer html = new StringBuffer();
		html.append("<script>\n");
		html.append("document.getElementById('formid').submit();\n");
		html.append("</script>\n");	
		return html.toString();	
	}
}
