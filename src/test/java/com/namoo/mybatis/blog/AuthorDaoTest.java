package com.namoo.mybatis.blog;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.namoo.mybatis.blog.AuthorDao;
import com.namoo.mybatis.blog.domain.Author;
import com.namoo.mybatis.blog.impl.AuthorDaoImpl;


public class AuthorDaoTest {

	private AuthorDao dao;
	
	@Before
	public void setUp() throws Exception {
		dao = new AuthorDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	
	@Test
	public void testFindAllAuthors(){
		//TODO
	}
	
	@Test
	public void testFindAuthor(){
		
		//TODO
	}
	
	@Test
	public void testFindAuthorByMapper(){
		
		//TODO
	}
	
	@Test
	public void testFindAuthorsByIds() {
		
		//TODO
	}
	
	@Test
	public void testFindAuthorByCondition() {
		
		//TODO
		
	}
	
	@Test
	public void testFindAuthorByConditionByBuilder() {
		
		//TODO

	}	
	
	@Test
	public void testUpdateAuthor() {
		
		//TODO
		
	}
	
	@Test
	public void testDeleteAuthor() {
		
		//TODO
	}
			
}
