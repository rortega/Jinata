package com.denim.markup;

import java.util.ArrayList;

import com.denim.Form;
import com.denim.MarkupDecorator;

public class XMLHttpRequest extends MarkupDecorator{
	public XMLHttpRequest(Form newForm){
		super(newForm);
	}
	public String getMarkup(){			
		StringBuffer reqScript = new StringBuffer();
		reqScript.append("var xmlhttp = new XMLHttpRequest();\n");
		reqScript.append("xmlhttp.open(\""+MarkupDecorator.getMethod()+"\",\""+MarkupDecorator.getHost()+MarkupDecorator.getUrlPath()+"\",true);\n");
		reqScript.append("xmlhttp.setRequestHeader(\"Content-Type\",\"application/json;charset=UTF-8\");\n");
		reqScript.append("xmlhttp.send(JSON.stringify("+MarkupDecorator.getJSonObject()+"));\n");
		return reqScript.toString();
	}
}
