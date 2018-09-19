package cn.yunhe.biz.impl;

import cn.yunhe.biz.ClassBiz;
import cn.yunhe.dao.ClassDao;
import cn.yunhe.dao.impl.ClassDaoImpl;

public class ClassBizImpl implements ClassBiz {
	ClassDao classDao=new ClassDaoImpl();
	@Override
	public String selectClassName(int classId) {
		// TODO Auto-generated method stub
		return classDao.selectClass(classId);
	}

}
