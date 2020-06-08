package com.java.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example02 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	// init() - service - doGet - destory 순서대로 실행
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("doGet 실행~~");
		String su = request.getParameter("su"); // 브라우저에서 get방식으로 넘어온 파라미터 /Example02?su=10
		System.out.println(su);
		
		// 문자형 -> 정수형
		int value = Integer.parseInt(su);
		
		//정수형 -> 문자형
		String a = String.valueOf(value);
		
		Integer i = value;
		String b = i.toString();
		System.out.println(a + "\t" + b);
	}
}
