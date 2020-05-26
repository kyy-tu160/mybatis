package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.spring.bean.book;

public interface bookMapper {
	@Select("SELECT * FROM BOOK")
	public List<book> fingAllBooks();
}
