package org.jfan.guide.service.impl;

import org.jfan.an.surfing.Surfing;
import org.jfan.guide.service.LayoutService;
import org.jfan.guide.vo.LayoutVO;

public class LayoutServiceImpl implements LayoutService {

	private Surfing<LayoutVO> svos;

	/**
	 * {@inheritDoc} <br>
	 */
	@Override
	public LayoutVO getLayout(String string) {
		return svos.ammunition(string);
	}

	/**
	 * @param svos 要设置的 svos
	 */
	public void setSvos(Surfing<LayoutVO> svos) {
		this.svos = svos;
	}

}
