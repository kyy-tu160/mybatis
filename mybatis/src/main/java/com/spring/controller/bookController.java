package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.book;
import com.spring.mapper.bookMapper;

@RestController
public class bookController {
	@Autowired
	private bookMapper mapper;
	
	@RequestMapping("/getAll")
	public List<book> getAll() {
		List<book> list = mapper.fingAllBooks();
		System.out.println("hello world");
		if (list==null) {
			throw new NullPointerException("数组为空！");
		}
		return list;
		
	}
}
