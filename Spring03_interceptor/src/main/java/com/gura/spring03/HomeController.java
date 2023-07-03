package com.gura.spring03;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// 놀러가기 요청 처리
	@RequestMapping("/play")
	public String play() {
		// /WEB-INF/views/play.jsp
		return "play";
	}
	
	// 이 프로젝트의 최상위 경로 요청이 오면
	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		// home.jsp  페이지에서 필요한 모델(data)를 HttpServletRequest 객체에 담아두기
		List<String> noticeList = new ArrayList<String>();
		noticeList.add("날씨가 많이 더워 지고 있어요!");
		noticeList.add("조만간 땀 흘리다가 졸도 합니다!");
		noticeList.add("아침에 씻는게 의미가 없어요!");
		
		// home.jsp 페이지에서 필요한 모델(data)를 HttpServletRequest 객체에 담아두기
		request.setAttribute("noticeList", noticeList);
		
		// /WEB-INF/views/home.jsp 페이지로 forward 이동해서 응답 하겠다는 의미
		// "home" 이라는 문자열을 리턴하면 앞에 "/WEB-INF/views/" 뒤에".jsp"가 자동으로 붙는다.	
		return "home";
	}
	
}

