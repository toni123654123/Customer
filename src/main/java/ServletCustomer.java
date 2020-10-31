import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer",urlPatterns = "/h")
public class ServletCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Nguyen Duy Tuan","012345677","Ha Noi","10-06-1999","img1.jpg"));
        customerList.add(new Customer("Hoa Le","012345677","Ha Noi","10-06-1999","img2.jpg"));
        customerList.add(new Customer("Thu Vu","012345677","Ha Noi","10-06-1999","img3.jpg"));
        customerList.add(new Customer("Tuan Anh","012345677","Ha Noi","10-06-1999","img4.jpg"));
        customerList.add(new Customer("The Anh","012345677","Ha Noi","10-06-1999","img1.jpg"));
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");

        request.setAttribute("customer",customerList);
        dispatcher.forward(request,response);
    }
}
