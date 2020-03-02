/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Abdomen;
import Logica.Absc;
import Logica.Absr;
import Logica.Caminadora;
import Logica.Cardio;
import Logica.Curls;
import Logica.Dominadas;
import Logica.Ejercicio;
import Logica.FlexionDePecho;
import Logica.Lateral;
import Logica.Plank;
import Logica.RemoconBarra;
import Logica.Rutina;
import Logica.Sentadillas;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
@WebServlet(name = "Principal", urlPatterns = {"/Principal"})
public class Principal extends HttpServlet {

    static Ejercicio a;

    public static void Liscov(Ejercicio e) {
        e.mover();
        a = e;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Usuario r = new Usuario();
        r.setNombre(request.getParameter("nombre"));

        Rutina n = new Rutina();
        n.setObjetivo(request.getParameter("objetivo"));

        FlexionDePecho f = new FlexionDePecho();
        Curls c = new Curls();
        Dominadas d = new Dominadas();
        Plank x = new Plank();
        Caminadora k = new Caminadora();
        Lateral l = new Lateral();
        Sentadillas y = new Sentadillas();
        RemoconBarra g = new RemoconBarra();
        Absc o = new Absc();
        Absr t = new Absr();

        if ("Bajar de peso".equals(n.getObjetivo())) {
            k.setTiempo(20);
            k.setDias(4);
            o.setRepeticiones(4);
            o.setSeries(4);
            o.setDias(3);
            f.setSeries(5);
            f.setRepeticiones(20);
            f.setDias(5);
            y.setSeries(5);
            y.setRepeticiones(7);
            y.setDias(4);
            Liscov(f);
            Liscov(k);
            Liscov(y);
            Liscov(o);

        } else if ("Aumentar masa muscular".equals(n.getObjetivo())) {
            d.setDias(4);
            d.setSeries(5);
            d.setRepeticiones(10);
            f.setDias(4);
            f.setSeries(8);
            f.setRepeticiones(30);
            x.setDias(5);
            x.setSeries(5);
            x.setRepeticiones(10);
            c.setDias(4);
            c.setSeries(5);
            c.setRepeticiones(24);
            Liscov(f);
            Liscov(d);
            Liscov(x);
            Liscov(c);

        } else if ("Tonificar".equals(n.getObjetivo())) {
            l.setDias(4);
            l.setSeries(5);
            l.setRepeticiones(10);
            y.setDias(3);
            y.setSeries(10);
            y.setRepeticiones(10);
            x.setDias(4);
            x.setSeries(6);
            x.setRepeticiones(13);
            g.setDias(4);
            g.setSeries(6);
            g.setRepeticiones(35);
            Liscov(l);
            Liscov(y);
            Liscov(x);
            Liscov(g);
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Gimnasio Cracks</title>");
            out.println("</head>");
            out.println("<body background= \"imagenes\\zr.jpg\" >");
            out.println("   <link rel= \"stylesheet\" type =\"text/css\" href=\"Estilos\\estilos.css\">");
            out.println("<table>");

            out.println("<tr>");

            out.println("<td>");
            out.println("<h1> NOMBRE:" + r.getNombre() + " </h1>");
            out.println("</td>");

            out.println("</tr>");
            out.println("<tr>");

            out.println("<td>");
            out.println("<h1> OBJETIVO: </h1>");
            out.println("</td>");

            out.println("<td>");
            out.println("<h1>" + n.getObjetivo() + "</h1>");
            out.println("</td>");

            out.println("</tr>");

            if ("Bajar de peso".equals(n.getObjetivo())) {

                out.println("<tr>");
                out.println("<td>");
                out.println("<h1> EJERCICIO: Caminadora " + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> EJERCICIO: Abdominales cortos " + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> EJERCICIO: Flexiones de pecho " + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> EJERCICIO: Sentadillas " + "</h1>");
                out.println("</td>");
                out.println("</tr>");

                out.println("<tr>");
                out.println("<td>");
                out.println("<h1> DESCRIPCION: " + k.getPostura() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> DESCRIPCION: " + o.getPostura() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> DESCRIPCION: " + f.getPostura() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> DESCRIPCION: " + y.getPostura() + "</h1>");
                out.println("</td>");
                out.println("</tr>");

                out.println("<tr>");
                out.println("<td>");
                out.println("<h1> DIAS A LA SEMANA: " + k.getDias() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> DIAS A LA SEMANA : " + o.getDias() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> DIAS A LA SEMANA : " + f.getDias() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> DIAS A LA SEMANA : " + y.getDias() + "</h1>");
                out.println("</td>");
                out.println("</tr>");

                out.println("<tr>");
                out.println("<td>");
                out.println("<h1> NO APLICA</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> SERIES: " + o.getSeries() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> SERIES: " + f.getSeries() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> SERIES: " + y.getSeries() + "</h1>");
                out.println("</td>");
                out.println("</tr>");

                out.println("<tr>");
                out.println("<td>");
                out.println("<h1> NO APLICA</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> REPETICIONES: " + o.getRepeticiones() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> REPETICIONES: " + f.getRepeticiones() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> REPETICIONES: " + y.getRepeticiones() + "</h1>");
                out.println("</td>");
                out.println("</tr>");

                out.println("<tr>");
                out.println("<td>");
                out.println("<h1> TIEMPO: " + k.getTiempo() + "</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> NO APLICA</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> NO APLICA</h1>");
                out.println("</td>");
                out.println("<td>");
                out.println("<h1> NO APLICA</h1>");
                out.println("</td>");
                out.println("</tr>");

            } else {
                if ("Aumentar masa muscular".equals(n.getObjetivo())) {

                    out.println("<tr>");
                    out.println("<td>");
                    out.println("<h1> EJERCICIO: DOMINADAS " + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> EJERCICIO: FLEXIONES DE PECHO " + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> EJERCICIO: PLANK " + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> EJERCICIO: Curls " + "</h1>");
                    out.println("</td>");
                    out.println("</tr>");

                    out.println("<tr>");
                    out.println("<td>");
                    out.println("<h1> DESCRIPCION: " + d.getPostura() + "</h1>");

                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> DESCRIPCION: " + f.getPostura() + "</h1>");

                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> DESCRIPCION: " + x.getPostura() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> DESCRIPCION: " + c.getPostura() + "</h1>");

                    out.println("</td>");
                    out.println("</tr>");

                    out.println("<tr>");
                    out.println("<td>");
                    out.println("<h1> DIAS A LA SEMANA : " + d.getDias() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> DIAS A LA SEMANA : " + f.getDias() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> DIAS A LA SEMANA : " + x.getDias() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> DIAS A LA SEMANA : " + c.getDias() + "</h1>");
                    out.println("</td>");
                    out.println("</tr>");

                    out.println("<tr>");
                    out.println("<td>");
                    out.println("<h1> SERIES: " + d.getSeries() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> SERIES: " + f.getSeries() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> SERIES: " + x.getSeries() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> SERIES: " + c.getSeries() + "</h1>");
                    out.println("</td>");
                    out.println("</tr>");

                    out.println("<tr>");
                    out.println("<td>");
                    out.println("<h1> REPETICIONES: " + d.getRepeticiones() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> REPETICIONES: " + f.getRepeticiones() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");

                    out.println("<h1> REPETICIONES: " + x.getRepeticiones() + "</h1>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<h1> REPETICIONES: " + c.getRepeticiones() + "</h1>");
                    out.println("</td>");
                    out.println("</tr>");

                } else {
                    if ("Tonificar".equals(n.getObjetivo())) {

                        out.println("<tr>");
                        out.println("<td>");
                        out.println("<h1> EJERCICIO: SENTADILLAS " + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> EJERCICIO: LATERALES " + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> EJERCICIO: PLANK " + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> EJERCICIO: Remo con barra " + "</h1>");
                        out.println("</td>");
                        out.println("</tr>");

                        out.println("<tr>");
                        out.println("<td>");
                        out.println("<h1> DESCRIPCION: " + y.getPostura() + "</h1>");

                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> DESCRIPCION: " + l.getPostura() + "</h1>");

                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> DESCRIPCION: " + x.getPostura() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> DESCRIPCION: " + g.getPostura() + "</h1>");

                        out.println("</td>");
                        out.println("</tr>");

                        out.println("<tr>");
                        out.println("<td>");
                        out.println("<h1> DIAS A LA SEMANA : " + y.getDias() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> DIAS A LA SEMANA : " + l.getDias() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> DIAS A LA SEMANA : " + x.getDias() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> DIAS A LA SEMANA : " + g.getDias() + "</h1>");
                        out.println("</td>");
                        out.println("</tr>");

                        out.println("<tr>");
                        out.println("<td>");
                        out.println("<h1> SERIES: " + y.getSeries() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> SERIES: " + l.getSeries() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> SERIES: " + x.getSeries() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> SERIES: " + g.getSeries() + "</h1>");
                        out.println("</td>");
                        out.println("</tr>");

                        out.println("<tr>");
                        out.println("<td>");
                        out.println("<h1> REPETICIONES: " + y.getRepeticiones() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> REPETICIONES: " + l.getRepeticiones() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");

                        out.println("<h1> REPETICIONES: " + x.getRepeticiones() + "</h1>");
                        out.println("</td>");
                        out.println("<td>");
                        out.println("<h1> REPETICIONES: " + g.getRepeticiones() + "</h1>");
                        out.println("</td>");
                        out.println("</tr>");

                    }
                }
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
