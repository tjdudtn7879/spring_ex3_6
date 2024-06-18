package com.lgy.springex_3_6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDivAndRemains {
	public static void main(String[] args) {
		String configLoc="classpath:divAndRemainsCTX.xml";
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(configLoc);
		MyDivAndRemains myDivAndRemains=ctx.getBean("myDivAndRemains",MyDivAndRemains.class);
		
		myDivAndRemains.pc();
				
	}
}
