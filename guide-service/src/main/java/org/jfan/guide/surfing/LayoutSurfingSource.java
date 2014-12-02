/**
 * 
 */
package org.jfan.guide.surfing;

import org.jfan.an.surfing.SurfingSource;
import org.jfan.guide.vo.LayoutVO;

/**
 * <br>
 * <br>
 * 
 * @author JFan - 2014年10月30日 上午10:12:03
 */
public class LayoutSurfingSource implements SurfingSource<LayoutVO> {

	protected String name;

	public LayoutSurfingSource(String name) {
		this.name = name;
	}

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public LayoutVO toSource(Object... args) {
		String string = (String) args[0];
		System.out.println(name + "\tNEW SVO : " + string);
		return new LayoutVO(string);
	}

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public String toKey(Object... args) {
		return (String) args[0];
	}

}
