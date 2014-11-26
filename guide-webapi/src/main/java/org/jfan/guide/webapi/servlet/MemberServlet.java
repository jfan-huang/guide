/**
 * 
 */
package org.jfan.guide.webapi.servlet;

import java.util.ArrayList;
import java.util.List;

import org.jfan.an.surfing.Surfing;
import org.jfan.an.surfing.impl.MemoryFixedSurfing;
import org.jfan.guide.service.vo.LayoutVO;
import org.jfan.guide.webapi.servlet.abs.AbstractServlet;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月29日 下午5:54:23
 */
public class MemberServlet extends AbstractServlet {

	private static final long serialVersionUID = -233066918108989332L;

	protected List<String> list = new ArrayList<String>();

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.guide.webapi.servlet.abs.AbstractServlet#getSentence()
	 */
	@Override
	public Surfing<LayoutVO> getSentence() {
		return new MemoryFixedSurfing<LayoutVO>(LayoutVO.class);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.guide.webapi.servlet.abs.AbstractServlet#initial()
	 */
	@Override
	public void initial() {
		// System.out.println("********************init start");
		//
		// for (int i = 0; i < 300; i++) {
		// String string = RandomUtil.choice();
		// if (list.contains(string)) {
		// // System.out.println("Key Repeat : " + string);
		// } else
		// list.add(string);
		// }
		//
		// System.out.println("\r\nSIZE : " + list.size());
		// for (String str : list)
		// service.getLayout(str);
		//
		// System.out.println("*******************init end");
	}

}
