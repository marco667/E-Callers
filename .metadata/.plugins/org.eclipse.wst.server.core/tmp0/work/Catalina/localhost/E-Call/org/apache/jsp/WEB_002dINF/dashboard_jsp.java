/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.24
 * Generated at: 2019-06-28 19:37:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/Documents/Cours_L3/JEE/E-Callers/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/E-Call/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153381482000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1559726764333L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"fr\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"E-Callers\">\r\n");
      out.write("  <meta name=\"author\" content=\"Bilounga Abomo Marcelin\">\r\n");
      out.write("\r\n");
      out.write("  <title>ECall</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap Core CSS -->\r\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom Fonts -->\r\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"vendor/simple-line-icons/css/simple-line-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom CSS -->\r\n");
      out.write("  <link href=\"css/stylish-portfolio.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Navigation -->\r\n");
      out.write("  <a class=\"menu-toggle rounded\" href=\"#\">\r\n");
      out.write("    <i class=\"fas fa-bars\"></i>\r\n");
      out.write("  </a>\r\n");
      out.write("  <nav id=\"sidebar-wrapper\">\r\n");
      out.write("    <ul class=\"sidebar-nav\">\r\n");
      out.write("      <li class=\"sidebar-brand\">\r\n");
      out.write("        <a class=\"js-scroll-trigger\" href=\"/E-Call/Restriction\">\r\n");
      out.write("       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionUtilisateur.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionUtilisateur.num_tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("      </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"sidebar-nav-item\">\r\n");
      out.write("        <a class=\"js-scroll-trigger\" href=\"#about\">A Propos</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"sidebar-nav-item\">\r\n");
      out.write("        <a class=\"js-scroll-trigger\" href=\"/E-Call/InfosSupplements\">Ajouter des informations</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"sidebar-nav-item\">\r\n");
      out.write("        <a class=\"js-scroll-trigger\" href=\"#Download\">Telecharger</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"sidebar-nav-item\">\r\n");
      out.write("        <a class=\"js-scroll-trigger\" href=\"#services\">Services</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"sidebar-nav-item\">\r\n");
      out.write("        <a class=\"js-scroll-trigger\" href=\"#contact\">Contact</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"sidebar-nav-item\">\r\n");
      out.write("        <a class=\"js-scroll-trigger\" href=\"#sondages\">Notre blog</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"sidebar-nav-item\">\r\n");
      out.write("        <a class=\"js-scroll-trigger\" href=\"/E-Call/Deconnexion\">Deconnexion</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <!-- Header -->\r\n");
      out.write("  <header class=\"masthead d-flex\">\r\n");
      out.write("    <div class=\"container text-center my-auto\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("         ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         <p class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty form.erreurs ? 'succes' : 'erreur'}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"color:green;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.resultat}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("         ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <h1 class=\"mb-1\">ECall</h1>\r\n");
      out.write("      <h3 class=\"mb-5\">\r\n");
      out.write("        <em> Entrez le numero à identifier </em>\r\n");
      out.write("      </h3>\r\n");
      out.write("      <div class = \"form-group\">\r\n");
      out.write("          <form class= \"form-horizontal\" role=\"form\" method=\"post\" action=\"SearchContact\">\r\n");
      out.write("               <div class = \"form-group\">\r\n");
      out.write("        \t\t\t<div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("        \t\t\t\t<input type=\"tel\" class=\"form-control\" name=\"num_tel\" id=\"tel\" value=\"");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\" placeholder=\"Entrer le numero\"/>     \r\n");
      out.write("        \t\t\t\t<span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.erreurs['num_tel']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("        \t\t\t</div>\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-xl js-scroll-trigger\">Rechercher</button>\r\n");
      out.write("          </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"overlay\"></div>\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
      out.write("   <!-- about -->\r\n");
      out.write("   <section class=\"content-section bg-light\" id=\"about\">\r\n");
      out.write("   \t<div class=\"container text-center\">\r\n");
      out.write("   \t\t<h1 class=\"mx-auto mb-5\">A PROPOS</h1>\r\n");
      out.write("      <div class=\"content-section-heading\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-lg-10 mx-auto\">\r\n");
      out.write("            <h2>Notre application vous donne la possibilité</h2>\r\n");
      out.write("            <p class=\"lead mb-5\"> d'idenfier les numeros inconnus \r\n");
      out.write("            qui vous contacte et vous donne la possibilité de participer aux sondages.\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- Services -->\r\n");
      out.write("  <section class=\"content-section bg-primary text-white text-center\" id=\"services\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"content-section-heading\">\r\n");
      out.write("        <h3 class=\"text-secondary mb-0\">Services</h3>\r\n");
      out.write("        <h2 class=\"mb-5\">Ce que nous vous offrons</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-5 mb-lg-0\">\r\n");
      out.write("          <span class=\"service-icon rounded-circle mx-auto mb-3\">\r\n");
      out.write("            <i class=\"icon-screen-smartphone\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("          <h4>\r\n");
      out.write("            <strong>Responsive</strong>\r\n");
      out.write("          </h4>\r\n");
      out.write("          <p class=\"text-faded mb-0\">Looks great on any screen size!</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-5 mb-lg-0\">\r\n");
      out.write("          <span class=\"service-icon rounded-circle mx-auto mb-3\">\r\n");
      out.write("            <i class=\"icon-pencil\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("          <h4>\r\n");
      out.write("            <strong>Redesigned</strong>\r\n");
      out.write("          </h4>\r\n");
      out.write("          <p class=\"text-faded mb-0\">Freshly redesigned for Bootstrap 4.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-5 mb-md-0\">\r\n");
      out.write("          <span class=\"service-icon rounded-circle mx-auto mb-3\">\r\n");
      out.write("            <i class=\"icon-like\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("          <h4>\r\n");
      out.write("            <strong>Favorited</strong>\r\n");
      out.write("          </h4>\r\n");
      out.write("          <p class=\"text-faded mb-0\">Millions of users\r\n");
      out.write("            <i class=\"fas fa-heart\"></i>\r\n");
      out.write("            Start Bootstrap!</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("          <span class=\"service-icon rounded-circle mx-auto mb-3\">\r\n");
      out.write("            <i class=\"icon-mustache\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("          <h4>\r\n");
      out.write("            <strong>Questions</strong>\r\n");
      out.write("          </h4>\r\n");
      out.write("          <p class=\"text-faded mb-0\">Posez vos questions ...</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  \t <!-- Sondages -->\r\n");
      out.write("  <section class=\"content-section bg-light\" id=\"sondages\">\r\n");
      out.write("   \r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- download apk android -->\r\n");
      out.write("  <section class=\"callout\" id=\"Download\">\r\n");
      out.write("    <div class=\"container text-center\">\r\n");
      out.write("      <h2 class=\"mx-auto mb-5\">ECall versions android ta nouvelle application securisée !</h2>\r\n");
      out.write("      <a class=\"btn btn-primary btn-xl\" href=\"https://startbootstrap.com/template-overviews/stylish-portfolio/\">Telecharger notre application android maintenant !</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("   <!-- connexion -->\r\n");
      out.write("\r\n");
      out.write("  <!-- contact -->\r\n");
      out.write("  <section class=\"content-section bg-primary text-white text-center\" id=\"contact\" >\r\n");
      out.write("  \t\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer -->\r\n");
      out.write("  <footer class=\"footer text-center\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <ul class=\"list-inline mb-5\">\r\n");
      out.write("        <li class=\"list-inline-item\">\r\n");
      out.write("          <a class=\"social-link rounded-circle text-white mr-3\" href=\"\">\r\n");
      out.write("            <i class=\"icon-social-facebook\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"list-inline-item\">\r\n");
      out.write("          <a class=\"social-link rounded-circle text-white mr-3\" href=\"\">\r\n");
      out.write("            <i class=\"icon-social-twitter\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <p class=\"text-muted small mb-0\"> Copyright ECall; Votre site où vous serez securité 2019 </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Scroll to Top Button-->\r\n");
      out.write("  <a class=\"scroll-to-top rounded js-scroll-trigger\" href=\"#page-top\">\r\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("  </a>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Plugin JavaScript -->\r\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom scripts for this template -->\r\n");
      out.write("  <script src=\"js/stylish-portfolio.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/dashboard.jsp(71,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty sessionScope.sessionUtilisateur}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          out.write("\r\n");
          out.write("           <p class=\"succes\">Vous êtes connecté(e) avec l'adresse : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionUtilisateur.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionUtilisateur.num_tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" </p>\r\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/dashboard.jsp(76,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.sessionUtilisateur && !empty requestScope.intervalleConnexions}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                \t<p class=\"info\">(Vous ne vous êtes pas connecté(e) depuis ce navigateur depuis ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.intervalleConnexions}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(")</p>\r\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/dashboard.jsp(87,82) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${utilisateur.num_tel}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
