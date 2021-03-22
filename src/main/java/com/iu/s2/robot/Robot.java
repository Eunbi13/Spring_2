package com.iu.s2.robot;



public class Robot {
//얘가 가지고 잇다는 것은 멤버변수로 갖겠다는 소리
	
	private Arm_Left arm_Left;
	private Arm_Right arm_Right;
	
	private int age;
	private String name;
	private int price;
	
	public Robot() {
		
	}
	
	public Robot(int age, String name, int price) {
		this.age=age;
		this.name=name;
		this.price=price;//setter안만들고 값 넣는거 
	}
	
	
	public Arm_Left getArm_Left() {
		return arm_Left;
	}
	public void setArm_Left(Arm_Left arm_Left) {
		this.arm_Left = arm_Left;
	}
	public Arm_Right getArm_Right() {
		return arm_Right;
	}
	public void setArm_Right(Arm_Right arm_Right) {
		this.arm_Right = arm_Right;
	}
	
	
	
}
