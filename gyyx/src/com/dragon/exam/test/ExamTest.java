package com.dragon.exam.test;

import org.junit.Test;

import com.dragon.exam.LengthOfLong;

public class ExamTest {
	/**
	 * 空字符串测试
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		String s1 = "";
		int i1 = LengthOfLong.getMaxLength(s1);
		System.out.println(i1);
	}
	/**
	 * 无重复字符串测试
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int i2 = LengthOfLong.getMaxLength(s2);
		System.out.println(i2);
	}
	/**
	 * 有重复字符串测试
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int i2 = LengthOfLong.getMaxLength(s2);
		System.out.println(i2);
	}
	
	/**
	 * 有重复字符串测试+特殊字符
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception {
		String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int i2 = LengthOfLong.getMaxLength(s2);
		System.out.println(i2);
	}
	/**
	 * 乱序随机
	 * @throws Exception
	 */
	@Test
	public void test5() throws Exception {
		String s2 = "kuewhsq<?mgbbuqcl>jjivswmdkqtbxixmvtrrbljptnsnfwzqfjmaf<adrrwsofsbcnuvqhffbsaqxwpqcac#$%&'()*+,-./:;<=>?@[\\]^_`";
		int i2 = LengthOfLong.getMaxLength(s2);
		System.out.println(i2);
	}
	
}
