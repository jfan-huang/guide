package org.jfan.guide.webapi.servlet.abs;

import java.io.IOException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;

import org.jfan.an.cache.ehcache.EhCacheServiceImpl;
import org.jfan.an.cache.memcached.MemcachedServiceImpl;

public final class Resources {

	private Resources() {
	}

	private static EhCacheServiceImpl eh;
	private static MemcachedServiceImpl mc;

	static {
		// eh
		eh = new EhCacheServiceImpl();
		// mc
		try {
			MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses("localhost:11211"));
			builder.setConnectionPoolSize(1);
			MemcachedClient build = builder.build();
			MemcachedServiceImpl mcImpl = new MemcachedServiceImpl();
			mcImpl.setMemcachedClient(build);
			mc = mcImpl;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static final EhCacheServiceImpl getEhcache() {
		return eh;
	}

	public static final MemcachedServiceImpl getMemcached() {
		return mc;
	}

}
