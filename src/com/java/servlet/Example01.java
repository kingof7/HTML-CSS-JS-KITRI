package com.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example01 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	// 서블릿 페이지는 톰캣서버 메모리에 올라간다
	// 톰캣서버에는 파일 단위로 올라간다.
	// 요청이 들어가면 init() service()가 호출이 되고
	// service() 메소드가 doGet doPost를 호출하고
	// 개발자는 doGet doPost 를 구현해주면 된다.
	// request response 객체는 웹브라우저가 던져준다.
	
	// 서버 메모리 : content 단위로 올라간다. 
	// 각각의 content 안에 Context(=webTesting(프로젝트이름))가 있다.
	public Example01() {
		super();
	}
	// 생명주기
	// 초기화 - 서비스 - 소멸
	public void init() { // 초기화 ( 명시를 안해줘도 자동으로 호출된다.)
		System.out.println("서블릿 초기화 (처음요청시 단 한번 수행)");
	} 
	
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 서비스 - get, post함수 호출
		doGet(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		// 실제로 우리가 구현해야할 메소드
		System.out.println("서블릿 내용 doGet 함수입니다.");
	}
	public void destory() { // 소멸
		System.out.println("서블릿 소멸ㅎ");
	}
}
