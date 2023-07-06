package com.gura.spring.image.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring.image.dto.ImageDto;

public interface ImageService {
	// 갤러리 list 가져오기
	public void getList(HttpServletRequest request);
	// 갤러리 detail 페이지에 필요한 data를 ModelAndView에 저장
	public void getDetail(ModelAndView mView, int num);
	// 갤러리에 사진 upload & DB에 저장하기
	public void saveImage(ImageDto dto, HttpServletRequest request);
	public void getImageData(int num, ModelAndView mView);
	public void deleteImage(int num, HttpServletRequest request);
}
