package com.example.boot07.gallery.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.boot07.gallery.dto.GalleryDto;

@Repository
public class GalleryDaoImpl implements GalleryDao{
		
	@Autowired
	private SqlSession session;

	@Override
	public void insert(GalleryDto dto) {
		/*
		 * 	Mapper's namespace : gallery
		 * 	sql's id : insert
		 * 	parameterType : GalleryDto
		 */
		session.insert("gallery.insert", dto);
		
	}

	@Override
	public GalleryDto getData(int num) {
		/*
		 * 	Mapper's namespace : gallery
		 * 	sql's id : Get
		 * 	parameterType : GalleryDto
		 */
		return session.selectOne("gallery.getData", num);
	}

	@Override
	public void delete(int num) {
		session.delete("gallery.delete", num);
		
	}

	@Override
	public List<GalleryDto> getList(GalleryDto dto) {
		/*
		 * 	Mapper's namespace : gallery
		 * 	sql's id : 
		 */
		return session.selectList("gallery.getList", dto);
	}

	@Override
	public int getCount(GalleryDto dto) {
		return session.selectOne("gallery.getCount", dto);
	}

	@Override
	public void update(GalleryDto dto) {
		session.update("gallery.update", dto);
		
	} 
}
