package com.denim;

import java.util.ArrayList;
import java.util.List;

abstract public class MarkupDecorator implements Form{
	protected Form tempForm;
	protected static ArrayList<String> requestList;
	

	public MarkupDecorator(Form newForm) {	
		tempForm = newForm;
	}
	public MarkupDecorator(List<String> requestList) {
	    this.requestList = (ArrayList<String>) requestList;
	}
	public String getMarkup(){		
		return tempForm.getMarkup()  + " add the hidden forms stuff....";
	}	
	public static  ArrayList<String> getRequestList(){
		return requestList;	
	}
	public static String getHost(){
		return requestList.get(1).substring(requestList.get(1).indexOf(" "), requestList.get(1).length()).trim();
	}
	public static String getUrlPath(){
		return requestList.get(0).substring(requestList.get(0).indexOf(" "), requestList.get(0).lastIndexOf(" ")).trim();
	}
	public static String getMethod(){	

		String[] method = requestList.get(0).split(" ");
		return method[0];
	}
	public static String getJSonObject(){
		
		return  requestList.get(requestList.size()-1).trim();
		
	}
}
