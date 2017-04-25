package com.dragon.exam;

public class LengthOfLong {
	public static void main(String[] args) {
		
	}
	public static int getMaxLength(String str){
		int start = 0; //设置开始下标
		int maxLength = 0; //设置最大长度
		int strLength = str.length(); //获取输入字符串长度
		
		for (int i = 1; i < strLength; i++) {
			//从第二个向后依次取值
			char temp = str.charAt(i);
			//从取值位置依次向前取值
			for(int j = i;j>start;j--){
				//依次向前比较到start位置
				if(str.charAt(j-1)==temp){
					//取最大长度
					maxLength = (maxLength>(i-start))?maxLength:(i-start);
					//重置开始位置到 首 相等处
					start=j;
				}
			}
		}
		return maxLength;
	}
}
