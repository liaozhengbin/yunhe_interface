package cn.yunhe.dao.impl;

import java.util.List;
import java.util.Map;

import cn.yunhe.dao.RecordDao;
import cn.yunhe.entity.Record;
import cn.yunhe.entity.Student;
import cn.yunhe.util.ORMUtil;
import cn.yunhe.util.UtilityClass4;

public class RecordDaoImpl implements RecordDao {

	@Override
	public List<Record> seleteRecord(int xuehao,int page,int line) {
		// TODO Auto-generated method stub
		String sql="select date,stu_name,start_time,end_time,status from tb_record where stu_id=? LIMIT ?,?";
		Object[]  classid={xuehao,(page-1)*line,line};
		List<Record> stu=ORMUtil.ormutil().selectList(sql, classid, Record.class);
		return stu;
	}

	@Override
	public int selectRecordId(int xuehao) {
		// TODO Auto-generated method stub
		String sql="select count(*) num  from tb_record where stu_id=?";
		Object[]  classid={xuehao};
		List<Map<String, Object>> list=new UtilityClass4().performDQL(sql.toString(),classid);
		Long num=(Long) list.get(0).get("num");
		return num.intValue();
	}

}
