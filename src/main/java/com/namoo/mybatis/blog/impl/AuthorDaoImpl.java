package com.namoo.mybatis.blog.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.namoo.mybatis.blog.AuthorDao;
import com.namoo.mybatis.blog.domain.Author;
import com.namoo.mybatis.blog.mapper.AuthorMapper;


public class AuthorDaoImpl implements AuthorDao {

	private static Log log = LogFactory.getLog(AuthorDaoImpl.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AuthorDaoImpl(){
		sqlSessionFactory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	

	@Override
	public List<Author> findAllAuthors() {
		//TODO sqlSession method를 통한 전체 조회 
		return null;
	}
	
	@Override
	public List<Author> findAllAuthorsByMapper() {
		// TODO Mapper I/F를 통한 전체 조회
		return null;
	}	

	@Override
	public Author findAuthor(String id) {
		// TODO sqlSession method를 통한 조건 조회 
		return null;
	}
	
	@Override
	public Author findAuthorByMapper(String id) {
		// TODO Mapper I/F를 통한 조건 조회
		return null;
	}

	@Override
	public void registAuthor(Author author) {
		// TODO Mapper I/F를 통한 삽입
		
	}
	
	
	@Override
	public void deleteAuthor(String id) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public List<Author> findAuthorsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int updateAuthor(Author author) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public List<Author> findAuthorsByIds(List<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Author> findAuthorByCondition(Map<String, String> conditionMap) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Author> findAuthorByConditionByBuilder(
			Map<String, String> conditionMap) {
		// TODO Auto-generated method stub
		return null;
	}

			
}
