package cn.yunhe.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yunhe.biz.ClassBiz;
import cn.yunhe.biz.RecordBiz;
import cn.yunhe.biz.ScoreBiz;
import cn.yunhe.biz.StudentBiz;
import cn.yunhe.biz.impl.ClassBizImpl;
import cn.yunhe.biz.impl.RecordBizImpl;
import cn.yunhe.biz.impl.ScoreBizImpl;
import cn.yunhe.biz.impl.StudentBizImpl;
import cn.yunhe.entity.Record;
import cn.yunhe.entity.Score;
import cn.yunhe.entity.Student;

import net.sf.json.JSONObject;

@WebServlet("/student")
public class StudentController  extends HttpServlet {
	private StudentBiz studentBiz=new StudentBizImpl();
	private ClassBiz classBiz=new ClassBizImpl();
	private ScoreBiz scoreBiz=new ScoreBizImpl();
	private RecordBiz recordBiz=new RecordBizImpl();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6697054053681153013L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String method=request.getParameter("method");
		if ("info".equals(method)) {//查询单个学员信息
			info(request, response);
		}else if("className".equals(method)){
			className(request, response);
		}else if("select".equals(method)){
			select(request, response);
		}else if("selectStu".equals(method)){
			selectStu(request, response);
		}else if("selectStu".equals(method)){
			selectStu(request, response);
		}else if("selectjishu".equals(method)){
			selectjishu(request, response);
		}else if("selectjilv".equals(method)){
			selectjilv(request, response);
		}else if("selectzhineng".equals(method)){
			selectzhineng(request, response);
		}else if("selectScore".equals(method)){
			selectScore(request, response);
		}else if("selectRecord".equals(method)){
			selectRecord(request, response);
		}
		
		
	}
	protected void selectjishu(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		int classId = 1;//暂时写死
		String cd = request.getParameter("classId");
		if (cd==null) {
			jo.put("status", 501);
		}else{
			cd=cd==null?"1":cd;
			if(cd!=null){
				classId = Integer.parseInt(cd);
			}
			try {
				//本月技术考核分情况
				List<Score> jishulist=scoreBiz.scoreList(classId, 2);
				jo.put("jishulist", jishulist);
				jo.put("status", 200);
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	protected void selectjilv(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		int classId = 1;//暂时写死
		String cd = request.getParameter("classId");
		if (cd==null) {
			jo.put("status", 501);
		}else{
			cd=cd==null?"1":cd;
			if(cd!=null){
				classId = Integer.parseInt(cd);
			}
			try {
				//本月纪律考核分情况
				List<Score> jilvlist=scoreBiz.scoreList(classId, 1);
				jo.put("jilvlist", jilvlist);
				jo.put("status", 200);
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	
	protected void selectzhineng(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		int classId = 1;//暂时写死
		String cd = request.getParameter("classId");
		if (cd==null) {
			jo.put("status", 501);
		}else{
			cd=cd==null?"1":cd;
			if(cd!=null){
				classId = Integer.parseInt(cd);
			}
			try {
				//本月职业能力考核分情况
				List<Score> zhinengList=scoreBiz.scoreList(classId, 3);
				jo.put("zhinengList", zhinengList);
				jo.put("status", 200);
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	protected void selectScore(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		String stuId=request.getParameter("stuId");
		if (stuId==null) {
			jo.put("status", 501);
		}else{
			
			try {
				//查看扣分情况
				List<Score> scorelist = scoreBiz.scoreList2(Integer.parseInt(stuId));
				jo.put("scorelist", scorelist);
				jo.put("status", 200);
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	protected void selectRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		String stuId=request.getParameter("stuId");
		String page=request.getParameter("page");
		String line=request.getParameter("line");
		if (stuId==null && page==null && line==null ) {
			jo.put("status", 501);
		}else{
			try {
				//查看打卡记录
				List<Record> recordlist = recordBiz.seleteRecord(Integer.parseInt(stuId),Integer.parseInt(page),Integer.parseInt(line));
				jo.put("recordlist", recordlist);
				//打卡总记录数
				int num=recordBiz.selectRecordId(Integer.parseInt(stuId));
				jo.put("num", num);
				jo.put("status", 200);
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	protected void selectStu(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		String stuId=request.getParameter("stuId");
		String className =request.getParameter("className");
		if (stuId==null && className==null) {
			jo.put("status", 501);
		}else{
			try {
				//查看学生详细信息
				jo.put("className", className);
				Student stu = studentBiz.selectStudentById(Integer.parseInt(stuId));
				jo.put("stu", stu);
				String sn=request.getServerName();
				jo.put("sn", sn);
				int port=request.getServerPort();
				jo.put("port", port);
				jo.put("status", 200);
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	
	protected void info(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		String stuId=request.getParameter("stuId");
		if (stuId==null) {
			jo.put("status", 501);
		}else{
			try {
				Student stuInfo = studentBiz.selectStudentById(Integer.parseInt(stuId));
				jo.put("status", 200);
				jo.put("info", stuInfo);
				
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	
	protected void className(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		int classId = 1;//暂时写死
		String cd = request.getParameter("classId");
		if (cd==null) {
			jo.put("status", 501);
		}else{
			try {
				cd=cd==null?"1":cd;
				if(cd!=null){
					classId = Integer.parseInt(cd);
				}
				//班级名称
				String className = classBiz.selectClassName(classId);
				jo.put("info", className);
				
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	
	protected void select(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		int classId = 1;//暂时写死
		String cd = request.getParameter("classId");
		if (cd==null) {
			jo.put("status", 501);
		}else{
			try {
				cd=cd==null?"1":cd;
				if(cd!=null){
					classId = Integer.parseInt(cd);
				}
				//综合分排名
				List<Student> stulist=studentBiz.selectStudent(classId);
				jo.put("info", stulist);
				
			} catch (Exception e) {
				jo.put("status", 500);
			}
		}
		response.getWriter().print(jo.toString());
	}
	
	
	
}
