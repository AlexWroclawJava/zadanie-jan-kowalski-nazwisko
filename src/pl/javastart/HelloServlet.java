package pl.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String wiek = request.getParameter("wiek");


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        request.setAttribute("imieAtrybut", imie);
        request.setAttribute("nazwiskoAtrybut", nazwisko);
        request.getRequestDispatcher("WEB-INF/success.jsp").forward(request, response);

    }

   public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
            String imie = request.getParameter("imie");
            String nazwisko = request.getParameter("nazwisko");
            String wiek = request.getParameter("wiek");

            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();

//               if (imie == null)
//                   writer.println("Cześć " + nazwisko + " " + "masz " + wiek + "lat " + ", nie podałeś imienia");
//               else if (nazwisko == null)
//                   writer.println("Cześć " + imie + " " + "masz " + wiek + "lat " + ", nie podałeś nazwiska");
//               else if (wiek == null)
//                   writer.println("Cześć " + imie + " " + nazwisko + ", nie podałeś wieku");
//               else
//                   writer.println("Hello	" + imie +	"	" +	nazwisko + " " + wiek);

            writer.println("<html>");
            writer.println("<head><title> Cześć " + request.getAttribute("imie") + "</title></head>");
            writer.println("<body>");
            writer.println("<h1>Wiem że masz na nazwisko" + request.getAttribute("nazwisko") + "</h1>");
            writer.println("</body>");
            writer.println("</html>");


//            writer.println(imie);
//            writer.println(nazwisko);
//            writer.print(wiek);

//            writer.println("<html>");
//                writer.println("<head>");
//
//                writer.println("/head>");
//
//                writer.println("<body>");
//                    writer.println("<h1>Super Aplikacja</h1>");
//                    writer.println("<p>Witaj w aplikacji, która jeszcze nic nie robi</p>");
//                    writer.println("<p>Ale będzie coś robić</p>");
//
////                    writer.println("<a href="http://usatoday.com">USA TODAY</a>");
////                    writer.println("<img src="cat.jpg">");
//
//                writer.println("</body>");
//            writer.println("</html>");
    }
}
