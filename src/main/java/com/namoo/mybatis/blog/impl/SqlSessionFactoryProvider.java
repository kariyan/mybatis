package com.namoo.mybatis.blog.impl;

import org.apache.ibatis.session.SqlSessionFactory;

public class SqlSessionFactoryProvider {
	private static final String resource = "";//TODO ȯ�� ���� ���� ����

	private static SqlSessionFactory factory;
	
	public static SqlSessionFactory getSqlSessionFactory(){
		if(factory == null) createSqlSessionFactory();
		return factory;
	}

	private static void createSqlSessionFactory() {
		//TODO SqlSessionFactory ����
	}
	
}
