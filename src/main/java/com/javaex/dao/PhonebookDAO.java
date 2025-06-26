package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVO;

@Repository
public class PhonebookDAO {

	@Autowired
	private SqlSession sqlSession;
	
	//메소드일반
	//--전체 리스트
	public List<PersonVO> personSelect() {
		System.out.println("PhonebookDAO.personSelect()");
		
		List<PersonVO> personList = sqlSession.selectList("phonebook.selectList2");
		
		
		
		
		return personList;
	}
	
	//--한명 데이터 가져오기
	public PersonVO personSelectOne(int personId) {
		System.out.println("PhonebookDAO.personSelectOne()");
		
		PersonVO personVO = sqlSession.selectOne("phonebook.selectOne", personId);
		Map<String, Object> map = sqlSession.selectOne("phonebook.selectOne2", personId);
		System.out.println(map);
		System.out.println(map.get("name"));
		/*
		"personId"	1
		"name"		"박명수"
		"hp"		"010"
		"company"	"02"
		*/
		return personVO;
	}
	
	//--1명 저장
	public int personInsert(PersonVO personVO) {
		System.out.println("PhonebookDAO.personInsert()");
		System.out.println(personVO);
		
		int count = sqlSession.insert("phonebook.insert", personVO);
		
		return count;
		
	}
	
	//--1명 저장 map
	public int personInsert2(Map<String, String> personMap) {
		System.out.println("PhonebookDAO.personInsert2()");
		
		int count = sqlSession.insert("phonebook.insert2", personMap);
		
		return count;
		
	}
	
	
	
}
