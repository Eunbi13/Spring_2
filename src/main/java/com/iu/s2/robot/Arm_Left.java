package com.iu.s2.robot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("al") 
public class Arm_Left extends Arm{
	
	
	public Arm_Left() {
		// TODO Auto-generated constructor stub
		this.setName("Left_Arm");
	
		
	}

}
