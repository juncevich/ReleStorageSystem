package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Javastudy.ru MVC_HTML5_Angular</title>\n");
      out.write("    ");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bootstrap}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${startertemplate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("  <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("          <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\">Start Bootstrap</a>\n");
      out.write("      </div>\n");
      out.write("      <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"about.html\">About</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"services.html\">Lessons</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"contact.html\">Contact</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Tutorial<b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"portfolio-1-col.html\">Lesson 1</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"portfolio-2-col.html\">Lesson 2</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"portfolio-3-col.html\">Lesson 3</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"portfolio-4-col.html\">Lesson 5</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"portfolio-item.html\">Lesson 5</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Blog <b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"blog-home-1.html\">Blog Home 1</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"blog-home-2.html\">Blog Home 2</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"blog-post.html\">Blog Post</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">Other Pages <b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"full-width.html\">Full Width Page</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"sidebar.html\">Sidebar Page</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"faq.html\">FAQ</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"404.html\">404</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"pricing.html\">Pricing Table</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!-- /.navbar-collapse -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <!-- Header Carousel -->\n");
      out.write("  <header id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <div class=\"fill\" style=\"background-image:url('http://placehold.it/1900x1080&amp;text=Slide One');\"></div>\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h2>Caption 1</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <div class=\"fill\" style=\"background-image:url('http://placehold.it/1900x1080&amp;text=Slide Two');\"></div>\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h2>Caption 2</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <div class=\"fill\" style=\"background-image:url('http://placehold.it/1900x1080&amp;text=Slide Three');\"></div>\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h2>Caption 3</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"icon-prev\"></span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"icon-next\"></span>\n");
      out.write("    </a>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <!-- Page Content -->\n");
      out.write("  <div class=\"container\">\n");
      out.write("\n");
      out.write("    <!-- Marketing Icons Section -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-12\">\n");
      out.write("        <h1 class=\"page-header\">\n");
      out.write("          Welcome to Modern Business\n");
      out.write("        </h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("            <h4><i class=\"fa fa-fw fa-check\"></i> Bootstrap v3.2.0</h4>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Itaque, optio corporis quae nulla aspernatur in alias at numquam rerum ea excepturi expedita tenetur assumenda voluptatibus eveniet incidunt dicta nostrum quod?</p>\n");
      out.write("            <a href=\"#\" class=\"btn btn-default\">Learn More</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("            <h4><i class=\"fa fa-fw fa-gift\"></i> Free &amp; Open Source</h4>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Itaque, optio corporis quae nulla aspernatur in alias at numquam rerum ea excepturi expedita tenetur assumenda voluptatibus eveniet incidunt dicta nostrum quod?</p>\n");
      out.write("            <a href=\"#\" class=\"btn btn-default\">Learn More</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("            <h4><i class=\"fa fa-fw fa-compass\"></i> Easy to Use</h4>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Itaque, optio corporis quae nulla aspernatur in alias at numquam rerum ea excepturi expedita tenetur assumenda voluptatibus eveniet incidunt dicta nostrum quod?</p>\n");
      out.write("            <a href=\"#\" class=\"btn btn-default\">Learn More</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.row -->\n");
      out.write("\n");
      out.write("    <!-- Portfolio Section -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-12\">\n");
      out.write("        <h2 class=\"page-header\">Portfolio Heading</h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6\">\n");
      out.write("        <a href=\"portfolio-item.html\">\n");
      out.write("          <img class=\"img-responsive img-portfolio img-hover\" src=\"http://placehold.it/700x450\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6\">\n");
      out.write("        <a href=\"portfolio-item.html\">\n");
      out.write("          <img class=\"img-responsive img-portfolio img-hover\" src=\"http://placehold.it/700x450\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6\">\n");
      out.write("        <a href=\"portfolio-item.html\">\n");
      out.write("          <img class=\"img-responsive img-portfolio img-hover\" src=\"http://placehold.it/700x450\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6\">\n");
      out.write("        <a href=\"portfolio-item.html\">\n");
      out.write("          <img class=\"img-responsive img-portfolio img-hover\" src=\"http://placehold.it/700x450\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6\">\n");
      out.write("        <a href=\"portfolio-item.html\">\n");
      out.write("          <img class=\"img-responsive img-portfolio img-hover\" src=\"http://placehold.it/700x450\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6\">\n");
      out.write("        <a href=\"portfolio-item.html\">\n");
      out.write("          <img class=\"img-responsive img-portfolio img-hover\" src=\"http://placehold.it/700x450\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.row -->\n");
      out.write("\n");
      out.write("    <!-- Features Section -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-12\">\n");
      out.write("        <h2 class=\"page-header\">Modern Business Features</h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-6\">\n");
      out.write("        <p>The Modern Business template by Start Bootstrap includes:</p>\n");
      out.write("        <ul>\n");
      out.write("          <li><strong>Bootstrap v3.2.0</strong>\n");
      out.write("          </li>\n");
      out.write("          <li>jQuery v1.11.0</li>\n");
      out.write("          <li>Font Awesome v4.1.0</li>\n");
      out.write("          <li>Working PHP contact form with validation</li>\n");
      out.write("          <li>Unstyled page elements for easy customization</li>\n");
      out.write("          <li>17 HTML pages</li>\n");
      out.write("        </ul>\n");
      out.write("        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis, omnis doloremque non cum id reprehenderit, quisquam totam aspernatur tempora minima unde aliquid ea culpa sunt. Reiciendis quia dolorum ducimus unde.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-6\">\n");
      out.write("        <img class=\"img-responsive\" src=\"http://placehold.it/700x450\" alt=\"\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.row -->\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <!-- Call to Action Section -->\n");
      out.write("    <div class=\"well\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Molestias, expedita, saepe, vero rerum deleniti beatae veniam harum neque nemo praesentium cum alias asperiores commodi.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <a class=\"btn btn-lg btn-default btn-block\" href=\"#\">Call to Action</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("          <p>Copyright © Your Website 2014</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- /.container -->\n");
      out.write("\n");
      out.write("  <!-- jQuery -->\n");
      out.write("  <script src=\"/resources/js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap Core JavaScript -->\n");
      out.write("  <script src=\"/resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Script to Activate the Carousel -->\n");
      out.write("  <script>\n");
      out.write("    $('.carousel').carousel({\n");
      out.write("      interval: 5000 //changes the speed\n");
      out.write("    })\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("resources/css/bootstrap.css");
    _jspx_th_spring_url_0.setVar("bootstrap");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setValue("/resources/css/modern-business.css");
    _jspx_th_spring_url_1.setVar("startertemplate");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }
}
