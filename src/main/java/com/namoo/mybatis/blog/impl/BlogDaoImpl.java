package com.namoo.mybatis.blog.impl;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;

import com.namoo.mybatis.blog.BlogDao;
import com.namoo.mybatis.blog.domain.Blog;

public class BlogDaoImpl implements BlogDao {

	private static Log log = LogFactory.getLog(BlogDaoImpl.class);
	
	private SqlSessionFactory sqlSessionFactory;

	public BlogDaoImpl() {
		sqlSessionFactory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public Blog findBlog(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blog findBlogByAuthorId(String authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> findAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> findBlogsByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registBlog(Blog blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBlog(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Blog selectBlogWithAuthor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blog selectBlogWithPost(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blog findBlogByCondition(Blog blog) {
		// TODO Auto-generated method stub
		return null;
	}	
}
