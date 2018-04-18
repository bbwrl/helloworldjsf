package ch.clip;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class TestBean {
	
	public String getMessage() {
		return "Hello World - third try";
	}
		
}
