/**
 * 
 */
package org.jfan.guide.webapi.servlet;

import java.io.IOException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;

import org.jfan.an.cache.memcached.MemcachedServiceImpl;
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
public class MemcachedServlet extends AbstractServlet {

	private static final long serialVersionUID = -549295062477499831L;

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.guide.webapi.servlet.abs.AbstractServlet#getSentence()
	 */
	@Override
	public Surfing<LayoutVO> getSentence() {
		MemcachedClient mc;
		try {
			mc = mc();
		} catch (IOException e) {
			throw new RuntimeException("The Init MemcachedClient ERROR.");
		}

		MemcachedServiceImpl cacheService = new MemcachedServiceImpl();
		cacheService.setMemcachedClient(mc);

		SurfingSource<LayoutVO> source = getSurfingSource();

		return SurfingFactory.newCached(source, cacheService, 30);
	}

	private MemcachedClient mc() throws IOException {
		MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses("localhost:11211"));
		return builder.build();
	}

}
