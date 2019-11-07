package com.ruda.s1;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;


import com.ruda.notice.NoticeDAO;


public class TestCase extends TestAbstractCase { //상속 받아서 테스트
	
	@Inject
	private NoticeDAO noticeDAO;

	@Test
	public void test() {
		assertNotNull(noticeDAO);
	}
	

}
