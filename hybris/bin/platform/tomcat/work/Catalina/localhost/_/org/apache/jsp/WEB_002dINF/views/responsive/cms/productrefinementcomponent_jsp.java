/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2020-08-04 12:57:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.responsive.cms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productrefinementcomponent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/tags/responsive/nav/implicit.tld", Long.valueOf(1595839846627L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/nav/facetNavAppliedFilters.tag", Long.valueOf(1595839846624L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/nav/facetNavRefinements.tag", Long.valueOf(1595839846626L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/nav/facetNavRefinementFacet.tag", Long.valueOf(1595839846625L));
    _jspx_dependants.put("/WEB-INF/common/tld/ycommercetags.tld", Long.valueOf(1595839846187L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/nav/facetNavRefinementStoresFacet.tag", Long.valueOf(1595839846626L));
  }

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

      out.write("<div id=\"product-facet\" class=\"col-md-12 hidden-sm hidden-xs  product-facet js-product-facet\">\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_nav_005ffacetNavAppliedFilters_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_nav_005ffacetNavRefinements_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
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

  private boolean _jspx_meth_nav_005ffacetNavAppliedFilters_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  nav:facetNavAppliedFilters
    org.apache.jsp.tag.webresponsive.nav.facetNavAppliedFilters_tag _jspx_th_nav_005ffacetNavAppliedFilters_005f0 = (new org.apache.jsp.tag.webresponsive.nav.facetNavAppliedFilters_tag());
    _jsp_instancemanager.newInstance(_jspx_th_nav_005ffacetNavAppliedFilters_005f0);
    _jspx_th_nav_005ffacetNavAppliedFilters_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/responsive/cms/productrefinementcomponent.jsp(5,4) name = pageData type = de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_nav_005ffacetNavAppliedFilters_005f0.setPageData((de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchPageData}", de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_nav_005ffacetNavAppliedFilters_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_nav_005ffacetNavAppliedFilters_005f0);
    return false;
  }

  private boolean _jspx_meth_nav_005ffacetNavRefinements_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  nav:facetNavRefinements
    org.apache.jsp.tag.webresponsive.nav.facetNavRefinements_tag _jspx_th_nav_005ffacetNavRefinements_005f0 = (new org.apache.jsp.tag.webresponsive.nav.facetNavRefinements_tag());
    _jsp_instancemanager.newInstance(_jspx_th_nav_005ffacetNavRefinements_005f0);
    _jspx_th_nav_005ffacetNavRefinements_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/responsive/cms/productrefinementcomponent.jsp(6,4) name = pageData type = de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_nav_005ffacetNavRefinements_005f0.setPageData((de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchPageData}", de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_nav_005ffacetNavRefinements_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_nav_005ffacetNavRefinements_005f0);
    return false;
  }
}
