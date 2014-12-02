/**
 * 
 */
package org.jfan.guide.webapi.servlet;

import org.jfan.an.surfing.Surfing;
import org.jfan.an.surfing.SurfingFactory;
import org.jfan.an.surfing.SurfingSource;
import org.jfan.guide.vo.LayoutVO;
import org.jfan.guide.webapi.servlet.abs.AbstractServlet;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月29日 下午5:54:23
 */
public class MemberServlet extends AbstractServlet {

	private static final long serialVersionUID = -233066918108989332L;

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public Surfing<LayoutVO> getSentence() {
		SurfingSource<LayoutVO> source = getSurfingSource("Member");
		return SurfingFactory.newMemoryFixedSize(source, LayoutVO.class, 1024);
	}

}
