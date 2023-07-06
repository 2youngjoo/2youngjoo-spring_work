package com.gura.spring.image.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring.image.dto.ImageDto;

@Repository
public class ImageDaoImpl implements ImageDao{
		
	@Autowired
	private SqlSession session;

	@Override
	public void insert(ImageDto dto) {

		session.insert("image.insert", dto);
		
	}

	@Override
	public ImageDto getData(int num) {

		return session.selectOne("image.getData", num);
	}

	@Override
	public void delete(int num) {
		session.delete("image.delete", num);
		
	}

	@Override
	public List<ImageDto> getList(ImageDto dto) {

		return session.selectList("image.getList", dto);
	}

	@Override
	public int getCount(ImageDto dto) {
		return session.selectOne("image.getCount", dto);
	}

	@Override
	public void update(ImageDto dto) {
		session.update("image.update", dto);
		
	} 
}
