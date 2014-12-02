/**
 * 
 */
package org.jfan.guide.webapi.servlet.abs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfan.an.surfing.Surfing;
import org.jfan.an.surfing.SurfingSource;
import org.jfan.guide.service.LayoutService;
import org.jfan.guide.service.impl.LayoutServiceImpl;
import org.jfan.guide.surfing.LayoutSurfingSourceAll;
import org.jfan.guide.vo.LayoutVO;
import org.jfan.weapon.probability.random.RandomUtil;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月29日 下午2:04:11
 */
public abstract class AbstractServlet extends HttpServlet {

	private static final long serialVersionUID = 3428195650153409260L;

	protected LayoutService service;

	/*
	 * （非 Javadoc）
	 * 
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		super.init();

		Surfing<LayoutVO> svos = getSentence();
		if (null == svos)
			throw new IllegalArgumentException("Thr SentenceImpl is Null.");

		LayoutServiceImpl impl = new LayoutServiceImpl();
		impl.setSvos(svos);

		service = impl;
		// init
		initial();
	}

	public SurfingSource<LayoutVO> getSurfingSource(String name) {
//		return new LayoutSurfingSource(name);
		return new LayoutSurfingSourceAll(name);
//		return new LayoutSurfingSourceAllRefresher(name);
	}

	/**
	 * 返回一个Sentence的具体实现类
	 */
	public abstract Surfing<LayoutVO> getSentence();

	/**
	 * 如果需要初始化的时候做一些事情，请覆盖此方法
	 */
	public void initial() {
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest , javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-type", "text/html;charset=UTF-8");

		String string = RandomUtil.choice();

		// PrintWriter writer = resp.getWriter();
		// writer.write(sentence.get(string).getJson());
		// writer.flush();

		ServletOutputStream out = resp.getOutputStream();
		out.write(service.getLayout(string).getJson().getBytes());
		// out.flush();
	}

}
