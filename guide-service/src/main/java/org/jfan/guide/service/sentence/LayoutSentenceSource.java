/**
 * 
 */
package org.jfan.guide.service.sentence;

import java.util.HashMap;
import java.util.Map;

import org.jfan.an.surfing.SurfingSourceAll;
import org.jfan.guide.service.vo.LayoutVO;
import org.jfan.weapon.probability.random.RandomUtil;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月30日 上午10:12:03
 */
public class LayoutSentenceSource implements SurfingSourceAll<LayoutVO> {

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public Map<String, LayoutVO> toSourceAll() {
		Map<String, LayoutVO> cache = new HashMap<String, LayoutVO>();
		for (String key : RandomUtil.strs)
			cache.put(key, new LayoutVO(key));
		return cache;
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.an.core.sentence.SentenceSource#source(java.lang.Object[])
	 */
	@Override
	public LayoutVO toSource(Object... args) {
		String string = (String) args[0];
		// System.out.println(this + "\tNEW SVO : " + string);
		return new LayoutVO(string);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.an.core.sentence.SentenceSource#tokey(java.lang.Object[])
	 */
	@Override
	public String toKey(Object... args) {
		return (String) args[0];
	}

}
