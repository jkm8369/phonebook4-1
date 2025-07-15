package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDAO;
import com.javaex.vo.PersonVO;

@Service
public class PhonebookService {
	
	@Autowired
	private PhonebookDAO phonebookDAO;
	
	//메소드 일반
	//--전체 가져오기
	public List<PersonVO> exeList() {
		System.out.println("PhonebookService.exeList()");
		
		List<PersonVO> personList = phonebookDAO.personSelect();
		
		return personList;
	}
	
	//--한명 데이터 가져오기
	public PersonVO exeModifyForm(int personId) {
		System.out.println("PhonebookService.exeModifyForm()");
		
		PersonVO personVO = phonebookDAO.personSelectOne(personId);
		
		return personVO;
	}
	
	//--1명 저장하기
	public int exeAdd(PersonVO personVO) {
		System.out.println("PhonebookService.exeAdd()");
		//int count = phonebookDAO.personInsert(personVO);
		
		/*가정
		데이터가 여기서 생김 여기서 묶어야 됨
		1.vo를 만들고 묶으면 된다.
		2.map으로 묶는다(이번에만 쓴다) <-- 지금은 여기에 해당
		*/
		//뱍명수 010 02 031          하나가 숫자면 Object
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("name", "조강민");
		personMap.put("hp", "010-11");
		personMap.put("company", "031-44");
		
		int count = phonebookDAO.personInsert2(personMap);
		
		
		return count;
	}
	
	//--수정하기
	public int exeModify(PersonVO personVO) {
		System.out.println("PhonebookService.exeModify()");
		
		//phonebookDAO.personUpdate();
		
		
		return 0;
	}
	
	
}
