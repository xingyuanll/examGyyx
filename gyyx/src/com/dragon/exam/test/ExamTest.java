package com.dragon.exam.test;

import org.junit.Test;

import com.dragon.exam.LengthOfLong;

public class ExamTest {

	@Test
	public void test1() throws Exception {
		String s1 = "";
		int i1 = LengthOfLong.getMaxLength(s1);
		System.out.println(i1);
	}
}