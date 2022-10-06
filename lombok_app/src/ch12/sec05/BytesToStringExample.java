package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample {
	static String toString(byte[] arr1) {
		StringBuilder buffer = new StringBuilder("[");
//		for (int i=0;i<arr1.length;i++) {
//			if (i != 0) {
//				buffer.append(", ");
//			}
//			buffer.append(arr1[i]);
//		}
//		buffer.delete(buffer.length()-2, buffer.length());
		
		if (arr1.length != 0) {
			buffer.append(arr1[0]);
		}
		for (int i=1;i<arr1.length;i++) {
			buffer.append(", ");
			buffer.append(arr1[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}
	
	public static void main(String[] args) throws Exception  {
		String data = "자바";
		
		//String -> byte 배열(기본: UTF-8 인코딩)
		byte[] arr1 = data.getBytes();
		
//		String buffer = "[";
//		for (int i=0;i<arr1.length;i++) {
//			if (0 != i) {
//				buffer += ", ";
//			}
//			buffer += arr1[i];
//		}
//		buffer += "]";
		System.out.println("arr1: " + BytesToStringExample.toString(arr1));
		
		//byte[] arr1 = data.getBytes("UTF-8");
		System.out.println("arr1: " + Arrays.toString(arr1));
//		
		//byte 배열 -> String(기본: UTF-8 디코딩)
		String str1 = new String(arr1);
		//String str1 = new String(arr1, "UTF-8");  //한글 1 글자 : 3byte, 영문,수치특수문자 : 1byte 
		System.out.println("str1: " + str1);
		System.out.println("str1.length: " + str1.length());
		System.out.println("str1.charAt(0): " + str1.charAt(0));
		
//		//String -> byte 배열(EUC-KR 인코딩)
		byte[] arr2 = data.getBytes("EUC-KR"); //한글 1글자 : 2byte 
		System.out.println("arr2: " + Arrays.toString(arr2));
//		
		//byte 배열 -> String(기본: UTF-8 디코딩)
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("str2: " + str2);
	}
}