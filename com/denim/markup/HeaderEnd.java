package com.denim.markup;

import com.denim.*;

public class HeaderEnd extends MarkupDecorator{
	
	public HeaderEnd(Form newForm){
		super(newForm);
	}
	
	public String getMarkup(){	
		return tempForm.getMarkup() + this.getContent();
    }
	
	
private String getContent(){	
		StringBuffer html = new StringBuffer();
	    html.append("</body>\n");
		html.append("</html>");
		return html.toString();
    }
}
