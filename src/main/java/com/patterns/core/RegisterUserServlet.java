package main.java.com.patterns.core;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.com.patterns.entity.ApplicationDao;
import main.java.com.patterns.entity.Person;
import main.java.com.patterns.entity.User;

/**
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet("/RegisterUser")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("views/registerUser.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// collect all form data
				Person nPerson = new Person();
				
				nPerson.setId(Integer.parseInt(req.getParameter("inputId")));
				nPerson.setName(req.getParameter("inputName"));
				nPerson.setLastName(req.getParameter("inputLastName"));
				nPerson.setGender(req.getParameter("selectGender"));
				nPerson.setAddress("inputAddress");
		
		
				User nUser = new User();
		
				nUser.setName(req.getParameter("inputUsername"));
				nUser.setPassword(req.getParameter("inputPin"));
				//nUser.setIdPerson();
				

				// call DAO layer and save the user object to DB
				ApplicationDao dao = new ApplicationDao();
				
				int rows = dao.registerPerson(nPerson);
				try {
					nPerson = dao.getPerson();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				nUser.setIdPerson(nPerson.getId());
				rows = rows + dao.registerUser(nUser);
				

				// prepare an information message for user about the success or failure of the operation
				String infoMessage = null;
				if(rows==0){
					infoMessage="Sorry, an error occurred!";
				}
				else{
					infoMessage="User registered successfully!";
					//set up the HTTP session
					HttpSession session = req.getSession();
					
					//set the session attributes
					session.setAttribute("idUser", nUser.getUserId());
					session.setAttribute("username", nUser.getName());
					req.getRequestDispatcher("views/dashboard.jsp").forward(req, resp);
				}
	}

}
