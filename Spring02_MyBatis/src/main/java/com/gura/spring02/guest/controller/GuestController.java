package com.gura.spring02.guest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring02.guest.dao.GuestDao;
import com.gura.spring02.guest.dto.GuestDto;
import com.gura.spring02.guest.service.GuestService;


@Controller
public class GuestController {
	// 컨트롤러는 비즈니스 로직을 대신 처리해주는 서비스에 의존한다.
	@Autowired
	private GuestService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/guest/update")
	public String update(GuestDto dto) {
		service.addGuest(dto);
		return "guest/update";
	}
	
	// 방명록 정보 수정 폼 요청 처리
	// mView는 하나의 사물함(key값=참조값)으로 
	// service와 controller가 같은 객체의 참조값(필요한 값)을 담아준다.
	@RequestMapping("/guest/updateform")
	public ModelAndView updateform(ModelAndView mView, int num) {
		// 서비스를 이용해서 ModelAndView 객체에 글 하나의 정보를 담아온다.
		service.getGuestInfo(mView, num);
		// view page로 forward 이동해서 수정 폼 응답하기
		mView.setViewName("guest/updateform");
		return mView;
		
	} 
	
	// 방명록 정보 삭제 요청 처리
	@RequestMapping(method = RequestMethod.POST, value = "/guest/delete")
	public String delete(GuestDto dto) {
		service.deleteGuest(dto);
		return "guest/delete";
	}
	
	// 방명록 추가 요청 처리
	@RequestMapping(method = RequestMethod.POST, value = "/guest/insert")
	public String insert(GuestDto dto) {
		service.addGuest(dto);
		return "guest/insert";
	}
	
	// 방명록 추가 폼 요청 처리
	@RequestMapping("/guest/insertform")
	public String insertform() {
		return "guest/insertform";
	}
	
	// 방명록 목록 보기 요청 처리
	@RequestMapping("/guest/list")
	public ModelAndView list(ModelAndView mView) {
		// 서비스의 메소드를 호출해서 ModelAndView 객체의 참조값을 전달하면 방명록 목록이 담긴다.
		service.getGuestList(mView);
		// view page 정보도 담고
		mView.setViewName("guest/list");
		/*
		 *  두개의 정보가 모두 담긴 ModelAndView 객체를 리턴해주면
		 *  addObject(key, value)를 통해서 담은 정보는 request scope에 담기고
		 *  setViewName(view page 위치)를 통해서 담은 정보는 해당 view page로 forward 이동해서 응답된다.
		 */
		return mView;
	}
}
