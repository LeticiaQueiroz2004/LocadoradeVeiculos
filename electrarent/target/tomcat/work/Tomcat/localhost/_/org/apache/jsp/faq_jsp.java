/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-11-29 23:12:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>ElectraRent</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/faq.css\">\r\n");
      out.write("    <link rel=\"icon\" type=\"shorticon\" href=\"https://img.freepik.com/vetores-premium/compre-o-compartilhamento-de-compra-ou-o-logotipo-do-carro-alugado-com-o-negociante-de-carros-de-icones-planos-da-as-chaves-ao-comprador-ilustracao-vetorial-isolada_108855-3539.jpg?w=360\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/StyleComponentes.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div id=\"header-container\"></div>\r\n");
      out.write("    <script src=\"/componentes/Cabecalho.js\"></script>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"faqContainer\">\r\n");
      out.write("    <header>\r\n");
      out.write("        <h1>FAQ - Perguntas frequentes </h1>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"faq\">\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>1. Como faÃ§o para alugar um veÃ­culo elÃ©trico?</h2>\r\n");
      out.write("            <p>Para alugar um veÃ­culo elÃ©trico, vocÃª pode visitar nossa pÃ¡gina de reservas online ou entrar em contato conosco pelo telefone.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>2. Quais sÃ£o os requisitos para alugar um carro elÃ©trico?</h2>\r\n");
      out.write("            <p>Os requisitos variam, mas geralmente incluem idade mÃ­nima, carteira de motorista vÃ¡lida e um mÃ©todo de pagamento aceito.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>3. O que estÃ¡ incluÃ­do no custo do aluguel?</h2>\r\n");
      out.write("            <p>O custo do aluguel geralmente inclui o aluguel do veÃ­culo, quilometragem padrÃ£o e seguro bÃ¡sico. Taxas adicionais podem ser aplicadas para serviÃ§os extras.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>4. Como funciona o processo de carregamento?</h2>\r\n");
      out.write("            <p>VocÃª pode carregar o veÃ­culo em estaÃ§Ãµes de carregamento especÃ­ficas. Fornecemos informaÃ§Ãµes sobre locais prÃ³ximos e instruÃ§Ãµes no momento do aluguel.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>5. Posso devolver o veÃ­culo em uma localizaÃ§Ã£o diferente?</h2>\r\n");
      out.write("            <p>Dependendo da disponibilidade, podemos oferecer opÃ§Ãµes de devoluÃ§Ã£o em locais diferentes. Entre em contato conosco para discutir suas necessidades.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>6. Existe uma taxa por quilometragem adicional?</h2>\r\n");
      out.write("            <p>Alguns planos de aluguel incluem quilometragem ilimitada, enquanto outros podem ter uma taxa por quilÃ´metro adicional. Verifique os detalhes do seu plano ao reservar.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>7. Quais sÃ£o as opÃ§Ãµes de pagamento aceitas?</h2>\r\n");
      out.write("            <p>Aceitamos diversas formas de pagamento, incluindo cartÃµes de crÃ©dito e dÃ©bito. Consulte nossa pÃ¡gina de pagamentos para obter mais informaÃ§Ãµes.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>8. Posso alugar um carro elÃ©trico se nÃ£o tiver uma estaÃ§Ã£o de carregamento em casa?</h2>\r\n");
      out.write("            <p>Sim, vocÃª pode alugar um carro elÃ©trico mesmo se nÃ£o tiver uma estaÃ§Ã£o de carregamento em casa. Existem muitas estaÃ§Ãµes pÃºblicas disponÃ­veis para recarga.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>9. Qual Ã© a polÃ­tica de cancelamento?</h2>\r\n");
      out.write("            <p>Nossa polÃ­tica de cancelamento varia com base no tempo de antecedÃªncia do cancelamento. Consulte os detalhes no momento da reserva ou entre em contato conosco para mais informaÃ§Ãµes.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"question\">\r\n");
      out.write("            <h2>10. Posso levar o veÃ­culo para fora do paÃ­s?</h2>\r\n");
      out.write("            <p>Normalmente, nossos veÃ­culos estÃ£o restritos a fronteiras nacionais. Entre em contato conosco antecipadamente se planeja levar o veÃ­culo para fora do paÃ­s.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"rodape-container\"></div>\r\n");
      out.write("<script src=\"/componentes/Rodape.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
