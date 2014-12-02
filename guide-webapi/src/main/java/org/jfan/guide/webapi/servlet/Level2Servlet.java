/**
 * 
 */
package org.jfan.guide.webapi.servlet;

import org.jfan.an.cache.BaseCacheService;
import org.jfan.an.cache.Level2CacheFactory;
import org.jfan.an.cache.ehcache.EhCacheServiceImpl;
import org.jfan.an.cache.level2.ExpLimit;
import org.jfan.an.cache.level2.LocalNotFoundNotice;
import org.jfan.an.cache.memcached.MemcachedServiceImpl;
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
public class Level2Servlet extends AbstractServlet {

	private static final long serialVersionUID = -549295062477499831L;

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public Surfing<LayoutVO> getSentence() {
		EhCacheServiceImpl localCache = Resources.getEhcache();
		MemcachedServiceImpl amassCache = Resources.getMemcached();

		BaseCacheService cacheService = Level2CacheFactory.newLevel2Cached(localCache, amassCache, new Exp(), new Notice());

		SurfingSource<LayoutVO> source = getSurfingSource("Level2");
		return SurfingFactory.newCachedLoadOnly(source, cacheService, 15);
	}

}

class Exp implements ExpLimit {

	@Override
	public int localExp(int amassExp) {
		return amassExp - 2;
	}

}

class Notice implements LocalNotFoundNotice {

	@Override
	public void notice(String key, Object value) {
		System.out.println("notice ------- " + key + "\t" + value);
	}

}
