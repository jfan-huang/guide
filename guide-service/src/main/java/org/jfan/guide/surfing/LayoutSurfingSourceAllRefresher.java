/**
 * 
 */
package org.jfan.guide.surfing;

import org.jfan.an.surfing.SurfingSourceAllRefresher;
import org.jfan.guide.vo.LayoutVO;
import org.jfan.weapon.probability.random.RandomUtil;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月30日 上午10:12:03
 */
public class LayoutSurfingSourceAllRefresher extends LayoutSurfingSourceAll implements SurfingSourceAllRefresher<LayoutVO> {

	public LayoutSurfingSourceAllRefresher(String name) {
		super(name);
	}

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public long intervalMilliseconds() {
		return RandomUtil.nextInt(300, 1200);
	}

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public boolean withFixedDelay() {
		return false;
	}

}
