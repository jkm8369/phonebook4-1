package com.javaex.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVO;

@Repository
public class PhonebookRepository {

	@Autowired
	private SqlSession sqlSession;
	
	//--전체 리스트
	public List<PersonVO> personSelectList() {
		System.out.println("PhonebookRepository.selectList()");
		
		List<PersonVO> personList = sqlSession.selectList("phonebook.selectList");
		
		return personList;
	}
	
	//--수정폼 한명 데이터 가져오기
	public Map<String, Object> personSelectOne(int personId) {
		System.out.println("PhonebookRepository.personSelectOne()");
		
		//PersonVO PersonVO = sqlSession.selectOne("phonebook.selectOne", personId);
		
		Map<String, Object> map = sqlSession.selectOne("phonebook.selectOne2", personId);
		
		return map;
	}

	//--등록
	
	
	
	//--수정하기
	
	
	
}
