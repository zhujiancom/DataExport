package com.syd.ps.util;


public class FileUtil {
	public static String formartPath(String path){
		String result = "";
		result = path.replaceAll("\\\\", "\\\\\\\\");
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(FileUtil.formartPath("98\\23"));
	}
}
