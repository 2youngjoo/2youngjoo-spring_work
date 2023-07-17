package com.example.boot07.gallery.dao;

import java.util.List;

import com.example.boot07.gallery.dto.GalleryDto;

public interface GalleryDao {
		// 갤러리에 사진 저장하기
		public void insert(GalleryDto dto);
		// pk num에 해당하는 DB에서 gallery 게시글 하나의 
		public GalleryDto getData(int num);
		// 갤러리에 사진 삭제하기
		public void delete(int num);
		// 갤러리 리스트 가져오기
		public List<GalleryDto> getList(GalleryDto dto);
		
		public int getCount(GalleryDto dto);
		
		public void update(GalleryDto dto);
}
