package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fil.dao.SupplierDao;
import com.fil.daoimpl.SupplierDaoImpl;
import com.fil.model.Supplier;

/**
 * Servlet implementation class EnterPartServlet
 */
@WebServlet("/EnterPartServlet")
public class EnterPartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SupplierDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterPartServlet() {
        super();
        // TODO Auto-generated constructor stub
        dao = new SupplierDaoImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer = response.getWriter();
		String partid = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String color = request.getParameter("color");
		int pid = Integer.parseInt(partid);
		Supplier s = new Supplier(pid,pname,color);
		dao.addSupplier(s);
		List<Supplier> list = dao.getAllSuppliers();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
