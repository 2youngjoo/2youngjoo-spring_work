package com.gura.spring.image.dao;

import java.util.List;

import com.gura.spring.image.dto.ImageDto;

public interface ImageDao {
		// 상품 저장하기
		public void insert(ImageDto dto);
		// pk num에 해당하는 DB에서 gallery 게시글 하나의 
		public ImageDto getData(int num);
		// 상품 삭제하기
		public void delete(int num);
		// 상품 리스트 가져오기
		public List<ImageDto> getList(ImageDto dto);
		public int getCount(ImageDto dto);
		
		public void update(ImageDto dto);
}
