package org.wecancodeit.ecom;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Foo {
	
	@Resource			//This annotation means that the string "beetlebrox" is to be injected from another place
	private String beetlebrox; //Spring is looking for the String type, not the name; 
	
	@Override
	public String toString() {
		return "Foo [beetlebrox=this is the String you're looking for]"; 
	}

}
