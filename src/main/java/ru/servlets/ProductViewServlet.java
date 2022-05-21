package ru.servlets;
import ru.products.Product;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.Port;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "productServlet", urlPatterns = "/products")
    public class ProductViewServlet extends HttpServlet {

        private   Product[] arProd = new Product[]{


         new Product(1, "Carrot", 60.00),
         new Product(2, "Tomato", 120.00),
         new Product(3, "Potato", 89.00),
         new Product(4, "Cabbage", 40.00),
         new Product(5, "Cucumber", 110.00),
         new Product(6, "Corn", 50.00),
         new Product(7, "Garlic", 150.00),
         new Product(8, "Onion", 56.00),
         new Product(9, "Radish", 100.00),
         new Product(10, "Lemon", 190.00)

    };

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + "Product List:" + "</h1>");
            out.println("<br />");
            for (int i = 0; i < arProd.length ; i++) {
                out.println("<h2>" + arProd[i] + "</h2>");
            }
            out.println("<br />");
            out.println("<br />");
            out.println("</body></html>");

            out.close();
        }
  }

