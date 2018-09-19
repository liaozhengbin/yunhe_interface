package cn.yunhe.dao.impl;



import java.util.List;
import cn.yunhe.entity.Class;
import cn.yunhe.dao.ClassDao;
import cn.yunhe.util.ORMUtil;

public class ClassDaoImpl implements ClassDao {

	@Override
	public String selectClass(int classId) {
		// TODO Auto-generated method stub
		String sql="select class_name from tb_class where class_id=?";
		Object[] classI={classId};
		List<Class> className=ORMUtil.ormutil().selectList(sql, classI, Class.class);
		
		return className.size()>0?className.get(0).getClass_name():null;
	}

	

}
