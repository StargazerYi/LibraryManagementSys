package com.LMS.ssh.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.LMS.ssh.beans.User;
import com.LMS.ssh.dao.BaseDao;

public class UserDaoImpl extends HibernateDaoSupport implements BaseDao {

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}

	@Override
	public Object getObject(String queryString) throws HibernateException {
		// TODO Auto-generated method stub
		List<User> ls = getHibernateTemplate().find(queryString);
		return ls.get(0);
	}

	@Override
	public List<Object> getObjectList(String queryString) throws HibernateException {
		// TODO Auto-generated method stub
		List<Object> ls = getHibernateTemplate().find(queryString);
		return ls;
	}

	@Override
	public Object getObject(Object object) throws HibernateException {
		// TODO Auto-generated method stub
		List<User> ls = getHibernateTemplate().findByExample(object);
		return ls.get(0);
	}

}
