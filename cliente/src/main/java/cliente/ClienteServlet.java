package cliente;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/clienteServlet")
public class ClienteServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		
		String ide = req.getParameter("id");
		String nome = req.getParameter("nome");
		String rg = req.getParameter("rg");
		String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sex");
		
		int id = Integer.parseInt(ide);
		
		Cliente objCliente = new Cliente();
		objCliente.setCpf(cpf);
		objCliente.setEmail(email);
		objCliente.setId(id);
		objCliente.setNome(nome);
		objCliente.setRg(rg);
		objCliente.setSexo(sexo);
		
		req.setAttribute("Cli", objCliente);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("ClienteView.jsp");
		dispatcher.forward(req, resp);

	}
	
}
