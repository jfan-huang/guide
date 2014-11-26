/**
 * 
 */
package org.jfan.guide.webapi.servlet;

import org.jfan.an.cache.BaseCacheService;
import org.jfan.an.cache.ehcache.EhCacheServiceImpl;
import org.jfan.an.surfing.Surfing;
import org.jfan.an.surfing.SurfingFactory;
import org.jfan.an.surfing.SurfingSource;
import org.jfan.guide.service.vo.LayoutVO;
import org.jfan.guide.webapi.servlet.abs.AbstractServlet;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月30日 上午10:19:57
 */
public class EhCacheServlet extends AbstractServlet {

	private static final long serialVersionUID = -549295062477499831L;

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.guide.webapi.servlet.abs.AbstractServlet#getSentence()
	 */
	@Override
	public Surfing<LayoutVO> getSentence() {
		BaseCacheService cacheService = new EhCacheServiceImpl();
		SurfingSource<LayoutVO> source = getSurfingSource();
		int expSeconds = 30;
		return SurfingFactory.newCached(source, cacheService, expSeconds);
	}

}
