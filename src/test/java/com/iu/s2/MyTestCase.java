package com.iu.s2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*-context.xml"
		/*  **이거는 폴더가 있든 없든 상관x *-context.xml은 context.xml로 끝나는 파일들
		 * "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		 * "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
		 */
									}
									/* 스트링 배열타입 ??-context까지의 파일 경로 적을 거임*/
						)//배포전, 개발자의 편의를 위해 만들어진 경로, 다 적어야 한다함.
public class MyTestCase {

	
	@Test
	public void test1() {
		System.out.println("Test Method");
	}

}
