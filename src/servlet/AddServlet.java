package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.StudentEntity;
import service.StudentService;
@WebServlet("/Add")
public class AddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String userName = req.getParameter("userName");
		int age = 22;/*Integer.parseInt(req.getParameter("age"));*/
		String address = req.getParameter("address");
		StudentService sts = new StudentService();
		StudentEntity list  = new StudentEntity(userName, age, address);
		int lists = sts.Addstu(list);
		HttpSession session = req.getSession();
		if (lists != 0) {
			session.setAttribute("lists", lists);
			resp.sendRedirect("Index");
		}
	}
	
}
