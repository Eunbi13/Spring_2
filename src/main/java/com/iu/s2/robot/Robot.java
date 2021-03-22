package com.iu.s2.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {
//얘가 가지고 잇다는 것은 멤버변수로 갖겠다는 소리
	@Autowired
	@Qualifier("ar")
	private Arm arm_Left;//이름을 바꾸는 경우와
	@Autowired
	@Qualifier("ar")
	private Arm arm_Right;//이름을 유지하는 경우 qualifier을 사용해서 저 이름을 집어 넣어라 할 수 잇음 //아니면@Resource("ar")이케도 가능
	
	public Arm getArm_Left() {
		return arm_Left;
	}
	public void setArm_Left(Arm arm_Left) {
		this.arm_Left = arm_Left;
	}
	public Arm getArm_Right() {
		return arm_Right;
	}
	public void setArm_Right(Arm arm_Right) {
		this.arm_Right = arm_Right;
	}
	
	
	
	
}
