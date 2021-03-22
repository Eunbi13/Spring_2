package com.iu.s2.robot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class RobotTest {
	@Autowired
	private Robot robot;
	//private Arm_Left arm_Left;
	@Test// 이거 달아야 테스트 메서드가 됨
	public void test() {
		//assertNotNull(arm_Left);
		assertNotNull(robot.getArm_Left());//이게 왜 널이지,,? 멤버변수에 포함되어있기도하고bean으로 만들어줬는데 왜 null이지,,? 
		//진짜로 왜 널일까,,객체 생성될 때 선언만 된거라서,, 오토와이어드 같은 초기화가 안되어 있어서 기본값 null이 들어간거임 기본값!=초기화

		assertNotNull(robot.getArm_Right());
	}

}
