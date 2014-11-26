package org.jfan.guide.service.impl;

import org.jfan.an.surfing.Surfing;
import org.jfan.guide.service.service.LayoutService;
import org.jfan.guide.service.vo.LayoutVO;

public class LayoutServiceImpl implements LayoutService {

	private Surfing<LayoutVO> svos;

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.guide.service.service.LayoutService#getLayout(java.lang.String)
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
