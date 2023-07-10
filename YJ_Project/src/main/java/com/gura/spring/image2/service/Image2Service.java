package com.gura.spring.image2.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring.image2.dto.Image2Dto;

public interface Image2Service {
	// 상품 list 가져오기
	public void getList(HttpServletRequest request);
	// 상품 detail 페이지에 필요한 data를 ModelAndView에 저장
	public void getDetail(ModelAndView mView, int num);
	// 상품 사진 upload & DB에 저장하기
	public void saveImage(Image2Dto dto, HttpServletRequest request);
	public void getImageData(int num, ModelAndView mView);
	public void deleteImage(int num, HttpServletRequest request);
}
