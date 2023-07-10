package com.gura.spring.image2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring.image2.dto.Image2Dto;

@Repository
public class Image2DaoImpl implements Image2Dao{
		
	@Autowired
	private SqlSession session;

	@Override
	public void insert(Image2Dto dto) {

		session.insert("image2.insert", dto);
		
	}

	@Override
	public Image2Dto getData(int num) {

		return session.selectOne("image2.getData", num);
	}

	@Override
	public void delete(int num) {
		session.delete("image2.delete", num);
		
	}

	@Override
	public List<Image2Dto> getList(Image2Dto dto) {

		return session.selectList("image2.getList", dto);
	}

	@Override
	public int getCount(Image2Dto dto) {
		return session.selectOne("image2.getCount", dto);
	}

	@Override
	public void update(Image2Dto dto) {
		session.update("image2.update", dto);
		
	} 
}
