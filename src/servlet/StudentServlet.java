package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.StudentEntity;
import service.StudentService;
@WebServlet("/Index")
public class StudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		StudentService sts = new StudentService();
		List<StudentEntity> list = new ArrayList<StudentEntity>();
		list = sts.Find();
		HttpSession session = req.getSession();
		if (list!=null) {
			session.setAttribute("lists", list);//single-product  dom1
			resp.sendRedirect("Index.jsp");//482ÐÐ
		}
	}
	
}
