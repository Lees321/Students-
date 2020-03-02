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
@WebServlet("/DeleteId")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int stuId = Integer.parseInt(req.getParameter("stuId"));
		StudentService sts = new StudentService();
		int list  = sts.deleteid(stuId);
		HttpSession session = req.getSession();
		if (list != 0) {
			session.setAttribute("lists", list);
			resp.sendRedirect("Index");
		}
	}
	
}
