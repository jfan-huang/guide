package org.jfan.guide.webapi.servlet.print;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月29日 下午2:04:11
 */
public class PrintParamsServlet extends HttpServlet {

	private static final long serialVersionUID = 3428195650153409260L;

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest
	 * , javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String servletPath = req.getServletPath();
		StringBuffer requestURL = req.getRequestURL();
		String requestURI = req.getRequestURI();
		String pathInfo = req.getPathInfo();
		String contextPath = req.getContextPath();
		String queryString = req.getQueryString();
		System.out.println("servletPath : " + servletPath);
		System.out.println("requestURL : " + requestURL);
		System.out.println("requestURI : " + requestURI);
		System.out.println("pathInfo : " + pathInfo);
		System.out.println("contextPath : " + contextPath);
		System.out.println("queryString : " + queryString);

		// cookie
		System.out.println("********Cookies:");
		Cookie[] cookies = req.getCookies();
		if (null != cookies)
			for (Cookie cookie : cookies)
				System.out.println("\tname: " + cookie.getName() + "\t, value: " + cookie.getValue() + "\t, domain: " + cookie.getDomain() + ", path: " + cookie.getPath() //
						+ ", maxAge: " + cookie.getMaxAge() + ", secure: " + cookie.getSecure() + ", comment: " + cookie.getComment() + ", version: " + cookie.getVersion());

		// heards
		System.out.println("********Headers:");
		Enumeration<?> headerNames = req.getHeaderNames();
		if (null != headerNames)
			while (headerNames.hasMoreElements()) {
				String name = (String) headerNames.nextElement();
				Enumeration<?> headers = req.getHeaders(name);
				if (null != headers) {
					List<Object> ls = new ArrayList<Object>();
					while (headers.hasMoreElements())
						ls.add(headers.nextElement());
					System.out.println("\tname: " + name + "\t, values: " + Arrays.toString(ls.toArray()));
				}
			}

		// params
		System.out.println("********Params:");
		Enumeration<?> parameterNames = req.getParameterNames();
		if (null != parameterNames)
			while (parameterNames.hasMoreElements()) {
				String name = (String) parameterNames.nextElement();
				String[] values = req.getParameterValues(name);
				System.out.println("\tname: " + name + "\t, values: " + Arrays.toString(values));
			}

		System.out.println("\r\n");

		resp.setHeader("Content-type", "text/html;charset=UTF-8");
		ServletOutputStream out = resp.getOutputStream();
		out.write(("" + new Date().getTime()).getBytes());
	}

}
