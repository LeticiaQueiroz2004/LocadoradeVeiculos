/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-11-29 23:09:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class planos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/planos.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/StyleComponentes.css\" >\r\n");
      out.write("\r\n");
      out.write("    <title>ElectraRent</title>\r\n");
      out.write("    <link rel=\"icon\" type=\"shorticon\" href=\"https://img.freepik.com/vetores-premium/compre-o-compartilhamento-de-compra-ou-o-logotipo-do-carro-alugado-com-o-negociante-de-carros-de-icones-planos-da-as-chaves-ao-comprador-ilustracao-vetorial-isolada_108855-3539.jpg?w=360\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div id=\"header-container\"></div>\r\n");
      out.write("    <script src=\"componentes/Cabecalho.js\"></script>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"site\">\r\n");
      out.write("    <div class=\"containerPlano-1\">\r\n");
      out.write("        <img src=\"https://garagem360.com.br/wp-content/uploads/2023/05/aluguel-de-veiculos.jpg\" alt=\"Car Image\" width=\"600\" height=\"500px\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"Cont1textos\">\r\n");
      out.write("                <h2 class=\"Cont1Titulo\">DIRIJA COM TODA FACILIDADE QUE VOCÃ MERECE</h2>\r\n");
      out.write("                <div class=\"cont1item\">Escolha seu modelo preferido.</div>\r\n");
      out.write("                <div class=\"cont1item\"> <label class=\"negrito\"> Fique em seguranÃ§a, </label> temos seguro contra roubo e furto para dirigir sem preocupaÃ§Ãµes. </div>\r\n");
      out.write("                <div class=\"cont1item\"> <label class=\"negrito\"> Relaxa e apenas dirija. </label> O IPVA, documentaÃ§Ã£o, emplacamento e toda a parte burocrÃ¡tica fica com a gente!</div>\r\n");
      out.write("                <div class=\"cont1item\"> AssistÃªncia 24h. <label class=\"negrito\"> Conte com a equipe ElectraRent sempre que precisar. </label> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"botao\">\r\n");
      out.write("                <button> Carros disponÃ­veis </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"planos\">\r\n");
      out.write("        <div class=\"contPlanosTitulo\">\r\n");
      out.write("            <div class=\"Cont1Titulo\"> CARROS POR ASSINATURA </div>\r\n");
      out.write("            <div class=\"subtopico\"> ESCOLHA A OPÃÃO IDEAL PARA VOCÃ </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cardPlanos\">\r\n");
      out.write("            <div class=\"planoC\">\r\n");
      out.write("                <h2>ElectraRent<label id=\"l\">MENSAL</label></h2>\r\n");
      out.write("                <div class=\"planoLista\">\r\n");
      out.write("                    <div class=\"listaTopico\">\r\n");
      out.write("                        <img src=\"https://static.thenounproject.com/png/800424-200.png\" width=\"50\"/>\r\n");
      out.write("                        <div class=\"listaItem\"> Alugue um carro por <label class=\"negrito\"> um mÃªs completo.</label> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"listaTopico\">\r\n");
      out.write("                        <img src=\"https://static.thenounproject.com/png/800424-200.png\" width=\"50\"/>\r\n");
      out.write("                        <div class=\"listaItem\">PreÃ§os especiais para locaÃ§Ãµes de longa duraÃ§Ã£o.</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"listaTopico\">\r\n");
      out.write("                        <img src=\"https://static.thenounproject.com/png/800424-200.png\" width=\"50\"/>\r\n");
      out.write("                        <div class=\"listaItem\">ManutenÃ§Ã£o e seguro <label class=\"negrito\"> inclusos no plano.</label> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"listaTopico\">\r\n");
      out.write("                        <img src=\"https://static.thenounproject.com/png/800424-200.png\" width=\"50\"/>\r\n");
      out.write("                        <div class=\"listaItem\">IPVA, documentaÃ§Ã£o e emplacamento <label class=\"negrito\"> inclusos </label></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"select-botao\">\r\n");
      out.write("                    <button> QUERO ESSE </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"planoC\">\r\n");
      out.write("                <h2>ElectraRent<label id=\"l\">SEMANAL</label></h2>\r\n");
      out.write("                <div class=\"planoLista\">\r\n");
      out.write("                    <div class=\"planoLista\">\r\n");
      out.write("                        <div class=\"listaTopico\">\r\n");
      out.write("                            <img src=\"https://static.thenounproject.com/png/800424-200.png\" width=\"50\"/>\r\n");
      out.write("                            <div class=\"listaItem\"> Alugue um carro por <label class=\"negrito\"> um ano completo.</label> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"listaTopico\">\r\n");
      out.write("                            <img src=\"https://static.thenounproject.com/png/800424-200.png\" width=\"50\"/>\r\n");
      out.write("                            <div class=\"listaItem\">PreÃ§os especiais para locaÃ§Ãµes de longa duraÃ§Ã£o.</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"listaTopico\">\r\n");
      out.write("                            <img src=\"https://static.thenounproject.com/png/800424-200.png\" width=\"50\"/>\r\n");
      out.write("                            <div class=\"listaItem\">ManutenÃ§Ã£o e seguro <label class=\"negrito\"> inclusos no plano.</label> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"listaTopico\">\r\n");
      out.write("                            <img src=\"https://static.thenounproject.com/png/800424-200.png\" width=\"50\"/>\r\n");
      out.write("                            <div class=\"listaItem\">IPVA, documentaÃ§Ã£o e emplacamento <label class=\"negrito\"> inclusos </label></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"select-botao\">\r\n");
      out.write("                        <button> QUERO ESSE </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"rodape-container\"></div>\r\n");
      out.write("<script src=\"/componentes/Rodape.js\"></script>\r\n");
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
