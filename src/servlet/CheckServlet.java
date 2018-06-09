package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CheckLogic;
import model.HealthBeans;

@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");

		String errorMsg = "";
		if(height == null || height.length() == 0) {
			errorMsg += "「身長」が入力されていません。";
		}
		if(weight == null || weight.length() == 0) {
			errorMsg += "「体重」が入力されていません。";
		}

		if(errorMsg.length() != 0) {
			request.setAttribute("errorMsg", errorMsg);
		}
		else {
			HealthBeans hb = new HealthBeans(height, weight);

			CheckLogic cl = new CheckLogic();
			cl.execute(hb);

			request.setAttribute("hb", hb);
		}

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		d.forward(request, response);

	}
}
