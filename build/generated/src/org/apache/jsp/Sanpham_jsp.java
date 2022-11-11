package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.ProductController;
import Model.Product;
import java.util.ArrayList;

public final class Sanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Soccer Shoes</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/shop-item.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"trangchu\" method=\"post\">\n");
      out.write("            <!-- Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"trangchu.jsp\">Soccershoes.vn</a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <input class=\"btn-dark\"  type=\"submit\" name=\"trangchu\" value=\"Trang chủ\" />\n");
      out.write("                            </li>\n");
      out.write("                            </form>\n");
      out.write("                            <form action=\"ProductController\" method=\"post\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <input class=\"btn-dark\"  type=\"submit\" name=\"sanpham\" value=\"Sản Phẩm\" />\n");
      out.write("                                </li>\n");
      out.write("                            </form>\n");
      out.write("                            <form action=\"CartController\" method=\"post\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <input class=\"btn-dark\"  type=\"submit\" name=\"giohang\" value=\"Giỏ Hàng\" />\n");
      out.write("                                </li>\n");
      out.write("                            </form>\n");
      out.write("                            <form action=\"LoginController\" method=\"post\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <input class=\"btn-dark\"  type=\"submit\" name=\"lg\" value=\"Đăng nhập\" />\n");
      out.write("                                </li>\n");
      out.write("                            </form>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <!-- Page Content -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("\n");
      out.write("                        <h1 class=\"my-4\">VIN Shoes</h1>\n");
      out.write("                        <!-- brand -->\n");
      out.write("                        <form action=\"TypeProductController\" method=\"get\">\n");
      out.write("                            <div class=\"list-group\">\n");
      out.write("\n");
      out.write("                                <input class=\"btn-outline-dark\"  type=\"submit\" name=\"adidas\" value=\"Adidas\" />\n");
      out.write("                                <input class=\"btn-outline-dark\"  type=\"submit\" name=\"nike\" value=\"Nike\" />\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-3 -->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                        <br>\n");
      out.write("                        <!-- Search -->\n");
      out.write("                        <form action=\"ProductController\" method=\"post\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Nhập tên sản phẩm...\" name=\"txtSearch\">\n");
      out.write("                            <button type=\"submit\" name=\"btnSearch\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                            &emsp;&emsp;&emsp;&emsp;\n");
      out.write("                            Giá từ: <input type=\"text\" placeholder=\"\" name=\"from\" style=\"width:  50px\">\n");
      out.write("                            Đến : <input type=\"text\" placeholder=\"\" name=\"to\" style=\"width:  50px\">$\n");
      out.write("                            <button type=\"submit\" name=\"btnSearchGia\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                            &emsp;&emsp;&emsp;&emsp;\n");
      out.write("                            <input class=\"btn-outline-dark\"  type=\"submit\" name=\"asc\" value=\"Giá tăng dần\" />\n");
      out.write("                            <input class=\"btn-outline-dark\"  type=\"submit\" name=\"desc\" value=\"Giá giảm dần\" />\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <!-- list item -->\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            <div style=\"clear: both\"> </div>                                                        \n");
      out.write("                                        <ul class=\"pagination\">\n");
      out.write("                                            ");

                                                Product p = new Product();
                                                ArrayList<Product> arr = new ArrayList<Product>();
                                                arr = p.getListProduct("", "", "", "", "");
                                                int a, b;
                                                int limit = arr.size() / 9;
                                                if (limit * 9 < arr.size()) {
                                                    limit += 1;
                                                }
                                                for (int i = 1; i <= limit; i++) {
                                                    a = (i - 1) * 9;
                                                    b = i * 9;
                                                    if (b > arr.size()) {
                                                        b = arr.size();
                                                    }
                                            
      out.write("\n");
      out.write("                                            <li><a href=\"ProductController?start=");
      out.print( a);
      out.write("&end=");
      out.print( b);
      out.write("&sanpham=sanpham\">");
      out.print(i);
      out.write(" </a></li>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.row -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-9 -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("\n");
      out.write("            <footer class=\"py-5 bg-dark\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <p class=\"m-0 text-center text-white\">Copyright &copy; SoccerShoes.vn</p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container -->\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <!-- Bootstrap core JavaScript -->\n");
      out.write("            <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("            <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lstProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("item");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col-lg-4 col-md-6 mb-4\">\n");
          out.write("                                    <form action=\"ProductDetailController\" method=\"get\">\n");
          out.write("                                        <div class=\"card h-100\">\n");
          out.write("                                            <a href=\"#\"><img class=\"card-img-top\" src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getAnhSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"></a>\n");
          out.write("                                            <div class=\"card-body\">\n");
          out.write("                                                <h4 class=\"card-title\">\n");
          out.write("                                                    <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getTenSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                    <input type=\"hidden\" name=\"masp\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                </h4>\n");
          out.write("                                                <h5>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getGia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"card-footer\">\n");
          out.write("                                                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\n");
          out.write("\n");
          out.write("                                                <input class=\"btn-dark\"  type=\"submit\" name=\"muahang\" value=\"Mua Hàng\" />\n");
          out.write("                                                </form>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>                                             \n");
          out.write("                            </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
