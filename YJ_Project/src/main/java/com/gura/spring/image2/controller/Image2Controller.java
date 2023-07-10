package com.gura.spring.image2.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring.image2.dto.Image2Dto;
import com.gura.spring.image2.service.Image2Service;

@Controller
public class Image2Controller {
	
	@Autowired
	private Image2Service service;
	
	// Image 게시글의 num이 parameter get 방식으로 넘어온다.
	// detail 페이지
	@RequestMapping(value="/image2/detail", method = RequestMethod.GET)
	public ModelAndView detail(ModelAndView mView, int num) {
		// 갤러리 detail 페이지에 필요한 data를 num으로 가져와, ModelAndView에 저장
		service.getDetail(mView, num);
		mView.setViewName("image2/detail");
		
		return mView;
	}
	
	@RequestMapping("/image2/list")
	public String getList(HttpServletRequest request) {
		
		service.getList(request);
		
		return "image2/list";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/image2/ajax_upload")
	@ResponseBody
	public Map<String, Object> ajaxUpload(Image2Dto dto, HttpServletRequest request){
		// 서비스를 이용해서 업로드된 이미지를 저장하고
		service.saveImage(dto, request);
		// {"isSuccess":true}] 형식의 json 문자열 응답
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("isSuccess", true);
		return map;
	}
	
	// image 사진 업로드 form 페이지로 이동
	@RequestMapping("/image2/upload_form")
	public String uploadForm() {
	      
	   return "image2/upload_form";
	}
	
	// image 사진 업로드 & DB 저장
	@RequestMapping(method=RequestMethod.POST, value="/image2/upload")
	public String upload(Image2Dto dto, HttpServletRequest request) {
	   // form에서 dto로 데이터 받아옴
	   // dto : caption, MultipartFile image를 갖고 있다.
	   // request : imagePath 만드는데 사용, session 영역의 id 가져오는데 사용
	   service.saveImage(dto, request); 
	   return "image2/upload";
	}
		
}
