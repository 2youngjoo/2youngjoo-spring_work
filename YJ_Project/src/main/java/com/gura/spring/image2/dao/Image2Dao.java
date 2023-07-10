package com.gura.spring.image2.dao;

import java.util.List;

import com.gura.spring.image2.dto.Image2Dto;

public interface Image2Dao {
		// 갤러리에 사진 저장하기
		public void insert(Image2Dto dto);
		// pk num에 해당하는 DB에서 gallery 게시글 하나의 
		public Image2Dto getData(int num);
		// 갤러리에 사진 삭제하기
		public void delete(int num);
		// 갤러리 리스트 가져오기
		public List<Image2Dto> getList(Image2Dto dto);
		
		public int getCount(Image2Dto dto);
		
		public void update(Image2Dto dto);
}
