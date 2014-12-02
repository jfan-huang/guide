/**
 * 
 */
package org.jfan.guide.webapi.servlet;

import org.jfan.an.cache.BaseCacheService;
import org.jfan.an.surfing.Surfing;
import org.jfan.an.surfing.SurfingFactory;
import org.jfan.an.surfing.SurfingSource;
import org.jfan.guide.vo.LayoutVO;
import org.jfan.guide.webapi.servlet.abs.AbstractServlet;
import org.jfan.guide.webapi.servlet.abs.Resources;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月30日 上午10:19:57
 */
public class EhCacheServlet extends AbstractServlet {

	private static final long serialVersionUID = -549295062477499831L;

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public Surfing<LayoutVO> getSentence() {
		BaseCacheService cacheService = Resources.getEhcache();
		SurfingSource<LayoutVO> source = getSurfingSource("EhCache");
		return SurfingFactory.newCachedLoadOnly(source, cacheService, 15);
	}

}
