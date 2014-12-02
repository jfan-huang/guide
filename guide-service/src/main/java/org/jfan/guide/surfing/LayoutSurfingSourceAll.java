/**
 * 
 */
package org.jfan.guide.surfing;

import java.util.HashMap;
import java.util.Map;

import org.jfan.an.surfing.SurfingSourceAll;
import org.jfan.guide.vo.LayoutVO;
import org.jfan.weapon.probability.random.RandomUtil;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月30日 上午10:12:03
 */
public class LayoutSurfingSourceAll extends LayoutSurfingSource implements SurfingSourceAll<LayoutVO> {

	public LayoutSurfingSourceAll(String name) {
		super(name);
	}

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public Map<String, LayoutVO> toSourceAll() {
		Map<String, LayoutVO> cache = new HashMap<String, LayoutVO>();
		for (String key : RandomUtil.strs)
			cache.put(key, new LayoutVO(key));
		System.out.println(name + "\t--\ttoSourceAll: " + cache.size());
		return cache;
	}

}
