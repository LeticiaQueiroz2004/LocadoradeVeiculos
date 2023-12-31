/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-11-29 22:55:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <meta name=\"generator\" content=\"\">\r\n");
      out.write("    <meta name=\"theme-color\" content=\"#7952b3\">\r\n");
      out.write("    <title>Car Store</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"/css/home.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/css/StyleComponentes.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- link to default album template -->\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.0/examples/album/\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"site\">\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div id=\"header-container\"></div>\r\n");
      out.write("            <script src=\"/componentes/Cabecalho.js\"></script>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"textoCard\">\r\n");
      out.write("                <div class=\"titulo\"> PRETENDE ALUGAR UM CARRO EM SP? </div>\r\n");
      out.write("                <div class=\"texto\"> A ElectraRent tem a ferramenta mais completa para te ajudar nessa missÃ£o. Aqui vocÃª encontrarÃ¡ os melhores carros elÃ©tricos de SP disponÃ­veis para aluguÃ©is semanais ou mensais. </div>\r\n");
      out.write("                <div class=\"botao\"> <button> <a href=\"/explorar.jsp\"> Carros DisponÃ­veis </a> </button></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container2\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"titulo\"> CARROS DISPONÃVEIS PARA ALUGUEL - SugestÃ£o </div>\r\n");
      out.write("                <div class=\"car-list\">\r\n");
      out.write("                    <div id=\"card-list\"></div>\r\n");
      out.write("                    <script src=\"/componentes/Card.js\"></script>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"botao\"> <button> <a href=\"/explorar.jsp\"> Buscar mais carros disponÃ­veis </a> </button></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container3\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <div id=\"container-esquerda\"></div>\r\n");
      out.write("                <script src=\"/componentes/VantagensTextos.js\"></script>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container4\">\r\n");
      out.write("            <div class=\"img\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"rodape-container\"></div>\r\n");
      out.write("    <script src=\"/componentes/Rodape.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
