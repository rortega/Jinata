package com.denim;

import java.util.List;

public class PlainForm extends MarkupDecorator {
	public PlainForm(Form newForm) {
		super(newForm);
	}
	public PlainForm(List<String> requestList) {
		super(requestList);
	}
	public String getMarkup(){	
		return "<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>";
	}
}
