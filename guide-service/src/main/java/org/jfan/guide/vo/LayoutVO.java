package org.jfan.guide.vo;

import java.io.Serializable;

import org.jfan.weapon.probability.random.RandomUtil;

public class LayoutVO implements Serializable {

	private static final long serialVersionUID = -4533269610591727753L;

	private String json;

	private int exp;

	public LayoutVO(String string) {
		json = "{\"code\":1,\"msg\":\""
				+ string
				+ "__@@__"
				+ string
				+ "__@@__"
				+ string
				+ "\",\"data\":{\"server_time\":1414491210,\"top_menus_version\":\"3587\",\"bottom_menus_version\":\"278\",\"channel_layout_version\":\"3858\",\"rule_id\":135,\"rule_name\":\"iPhone-A-NH\",\"top_menus\":[{\"id\":40,\"name\":\""
				+ string
				+ "-精选特卖\",\"sort\":1,\"type_id\":0,\"type_value\":\"\",\"tag\":\"#SY140811\",\"new_icon\":\"http://b.appsimg.com/2014/08/29/239/2014/8/29/1409295380301.png\",\"create_time\":\"2014-08-20 15:59:03\",\"update_time\":\"2014-08-29 14:56:24\",\"new_ver\":\"1\",\"channel_id\":\"1\"},{\"id\":41,\"name\":\""
				+ string
				+ "-服饰特卖\",\"sort\":2,\"type_id\":6,\"type_value\":\"\",\"tag\":\"#FS140811\",\"new_icon\":\"http://b.appsimg.com/2014/08/29/859/2014/8/29/1409295393836.png\",\"create_time\":\"2014-08-20 16:00:15\",\"update_time\":\"2014-09-02 18:24:31\",\"new_ver\":\"1\",\"channel_id\":\"8\"},{\"id\":42,\"name\":\""
				+ string
				+ "-美妆特卖\",\"sort\":3,\"type_id\":4,\"type_value\":\"\",\"tag\":\"#MZ140811\",\"new_icon\":\"http://b.appsimg.com/2014/08/29/655/2014/8/29/1409295402802.png\",\"create_time\":\"2014-08-20 16:01:24\",\"update_time\":\"2014-08-29 14:56:49\",\"new_ver\":\"1\",\"channel_id\":\"2\"},{\"id\":43,\"name\":\""
				+ string
				+ "-亲子特卖\",\"sort\":4,\"type_id\":5,\"type_value\":\"\",\"tag\":\"#QZ140811\",\"new_icon\":\"http://b.appsimg.com/2014/08/29/435/2014/8/29/1409295414228.png\",\"create_time\":\"2014-08-20 16:01:58\",\"update_time\":\"2014-08-29 14:56:55\",\"new_ver\":\"1\",\"channel_id\":\"3\"},{\"id\":44,\"name\":\""
				+ string
				+ "-居家特卖\",\"sort\":5,\"type_id\":3,\"type_value\":\"\",\"tag\":\"#JJ140811\",\"new_icon\":\"http://b.appsimg.com/2014/08/29/548/2014/8/29/1409295420293.png\",\"create_time\":\"2014-08-21 11:09:20\",\"update_time\":\"2014-08-29 14:57:01\",\"new_ver\":\"1\",\"channel_id\":\"4\"}],\"bottom_menus\":[{\"id\":3,\"name\":\"首页\",\"link_url\":\"http://www.vip.com/\",\"sort\":1,\"type\":1,\"default_icon\":\"http://b.appsimg.com/2014/08/29/166/2014/8/29/1409283067888.png\",\"click_icon\":\"http://b.appsimg.com/2014/08/29/610/2014/8/29/1409283190607.png\",\"update_time\":\"2014-08-29 11:33:12\"},{\"id\":4,\"name\":\"即将上线\",\"link_url\":\"http://www.vip.com/\",\"sort\":2,\"type\":2,\"default_icon\":\"http://b.appsimg.com/2014/08/29/300/2014/8/29/1409283075885.png\",\"click_icon\":\"http://b.appsimg.com/2014/08/29/187/2014/8/29/1409283078560.png\",\"update_time\":\"2014-09-06 10:06:14\"},{\"id\":5,\"name\":\"收藏\",\"link_url\":\"http://www.vip.com/\",\"sort\":3,\"type\":3,\"default_icon\":\"http://b.appsimg.com/2014/08/29/145/2014/8/29/1409283089817.png\",\"click_icon\":\"http://b.appsimg.com/2014/08/29/234/2014/8/29/1409283091531.png\",\"update_time\":\"2014-08-29 11:31:33\"},{\"id\":10,\"name\":\"购物车\",\"link_url\":\"http://www.vip.com/\",\"sort\":4,\"type\":4,\"default_icon\":\"http://b.appsimg.com/2014/08/29/420/2014/8/29/1409283138846.png\",\"click_icon\":\"http://b.appsimg.com/2014/08/29/603/2014/8/29/1409283145887.png\",\"update_time\":\"2014-08-29 11:32:27\"},{\"id\":11,\"name\":\"我的\",\"link_url\":\"http://www.vip.com/\",\"sort\":5,\"type\":5,\"default_icon\":\"http://b.appsimg.com/2014/08/29/989/2014/8/29/1409283132171.png\",\"click_icon\":\"http://b.appsimg.com/2014/08/29/950/2014/8/29/1409283108769.png\",\"update_time\":\"2014-08-29 11:32:14\"}],\"channel_layout\":[{\"tag\":\"#SY140811\",\"layout\":[{\"section\":\"advertisement\",\"data\":{\"id\":16,\"zoneId\":118,\"zoneName\":\""
				+ string
				+ "-精选特卖广告组件\"}},{\"section\":\"operate\",\"data\":{\"layout_type\":\"col_in_row\",\"block\":[{\"cell\":\"row\",\"size\":25.0,\"child\":[{\"cell\":\"col\",\"size\":33.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":16,\"imageUrl\":\"http://b.appsimg.com/2014/09/11/385/2014/9/11/1410421268344.jpg\",\"targetAction\":3,\"targetParam\":\"#MZ140811\",\"displayType\":\"image\"}},{\"cell\":\"col\",\"size\":0.3,\"paddingLeft\":0.0,\"paddingRight\":0.0,\"paddingTop\":2.0,\"paddingBottom\":2.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}},{\"cell\":\"col\",\"size\":33.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":18,\"imageUrl\":\"http://b.appsimg.com/2014/09/11/914/2014/9/11/1410421286027.jpg\",\"targetAction\":3,\"targetParam\":\"#QZ140811\",\"displayType\":\"image\"}},{\"cell\":\"col\",\"size\":0.3,\"paddingLeft\":0.0,\"paddingRight\":0.0,\"paddingTop\":2.0,\"paddingBottom\":2.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}},{\"cell\":\"col\",\"size\":33.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":17,\"imageUrl\":\"http://b.appsimg.com/2014/09/11/302/2014/9/11/1410421276342.jpg\",\"targetAction\":3,\"targetParam\":\"#JJ140811\",\"displayType\":\"image\"}}]},{\"cell\":\"row\",\"size\":0.3,\"child\":[{\"cell\":\"col\",\"size\":100.0,\"paddingLeft\":2.0,\"paddingRight\":2.0,\"paddingTop\":0.0,\"paddingBottom\":0.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}}]}]}},{\"section\":\"brand\",\"data\":{\"id\":2,\"brandZoneName\":\"精选档期\",\"channelId\":1,\"tsift\":1}}]},{\"tag\":\"#FS140811\",\"layout\":[{\"section\":\"advertisement\",\"data\":{\"id\":10,\"zoneId\":119,\"zoneName\":\""
				+ string
				+ "-服饰特卖广告组件\"}},{\"section\":\"operate\",\"data\":{\"layout_type\":\"col_in_row\",\"block\":[{\"cell\":\"row\",\"size\":25.0,\"child\":[{\"cell\":\"col\",\"size\":50.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":46,\"imageUrl\":\"http://b.appsimg.com/2014/09/04/690/2014/9/4/1409796788182.jpg\",\"targetAction\":5,\"targetParam\":\"id\u003d262673\",\"displayType\":\"image\"}},{\"cell\":\"col\",\"size\":0.3,\"paddingLeft\":0.0,\"paddingRight\":0.0,\"paddingTop\":2.0,\"paddingBottom\":2.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}},{\"cell\":\"col\",\"size\":50.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":47,\"imageUrl\":\"http://b.appsimg.com/2014/09/12/619/2014/9/12/1410512503368.jpg\",\"targetAction\":5,\"targetParam\":\"id\u003d267717\",\"displayType\":\"image\"}}]},{\"cell\":\"row\",\"size\":0.3,\"child\":[{\"cell\":\"col\",\"size\":100.0,\"paddingLeft\":2.0,\"paddingRight\":2.0,\"paddingTop\":0.0,\"paddingBottom\":0.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}}]}]}},{\"section\":\"brand\",\"data\":{\"id\":3,\"brandZoneName\":\"服饰档期\",\"channelId\":8,\"tsift\":0}}]},{\"tag\":\"#MZ140811\",\"layout\":[{\"section\":\"advertisement\",\"data\":{\"id\":17,\"zoneId\":120,\"zoneName\":\""
				+ string
				+ "-美妆特卖广告组件\"}},{\"section\":\"operate\",\"data\":{\"layout_type\":\"col_in_row\",\"block\":[{\"cell\":\"row\",\"size\":25.0,\"child\":[{\"cell\":\"col\",\"size\":33.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":56,\"imageUrl\":\"http://b.appsimg.com/2014/09/29/471/1411986116902.jpg\",\"targetAction\":5,\"targetParam\":\"id\u003d266815\",\"displayType\":\"image\"}},{\"cell\":\"col\",\"size\":0.3,\"paddingLeft\":0.0,\"paddingRight\":0.0,\"paddingTop\":2.0,\"paddingBottom\":2.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}},{\"cell\":\"col\",\"size\":33.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":57,\"imageUrl\":\"http://b.appsimg.com/2014/09/29/996/1411986208653.jpg\",\"targetAction\":5,\"targetParam\":\"id\u003d261887\",\"displayType\":\"image\"}},{\"cell\":\"col\",\"size\":0.3,\"paddingLeft\":0.0,\"paddingRight\":0.0,\"paddingTop\":2.0,\"paddingBottom\":2.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}},{\"cell\":\"col\",\"size\":33.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":58,\"imageUrl\":\"http://b.appsimg.com/2014/09/11/205/2014/9/11/1410425971811.jpg\",\"targetAction\":9,\"targetParam\":\"\",\"displayType\":\"image\"}}]},{\"cell\":\"row\",\"size\":0.3,\"child\":[{\"cell\":\"col\",\"size\":100.0,\"paddingLeft\":2.0,\"paddingRight\":2.0,\"paddingTop\":0.0,\"paddingBottom\":0.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}}]}]}},{\"section\":\"brand\",\"data\":{\"id\":4,\"brandZoneName\":\"美妆档期\",\"channelId\":2,\"tsift\":0}}]},{\"tag\":\"#QZ140811\",\"layout\":[{\"section\":\"advertisement\",\"data\":{\"id\":20,\"zoneId\":121,\"zoneName\":\""
				+ string
				+ "-亲子特卖广告组件\"}},{\"section\":\"operate\",\"data\":{\"layout_type\":\"col_in_row\",\"block\":[{\"cell\":\"row\",\"size\":25.0,\"child\":[{\"cell\":\"col\",\"size\":50.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":66,\"imageUrl\":\"http://b.appsimg.com/2014/09/29/825/1411976217209.jpg\",\"targetAction\":5,\"targetParam\":\"id\u003d268006\",\"displayType\":\"image\"}},{\"cell\":\"col\",\"size\":0.3,\"paddingLeft\":0.0,\"paddingRight\":0.0,\"paddingTop\":2.0,\"paddingBottom\":2.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}},{\"cell\":\"col\",\"size\":50.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":67,\"imageUrl\":\"http://b.appsimg.com/2014/09/29/671/1411976262277.jpg\",\"targetAction\":5,\"targetParam\":\"id\u003d265222\",\"displayType\":\"image\"}}]},{\"cell\":\"row\",\"size\":0.3,\"child\":[{\"cell\":\"col\",\"size\":100.0,\"paddingLeft\":2.0,\"paddingRight\":2.0,\"paddingTop\":0.0,\"paddingBottom\":0.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}}]}]}},{\"section\":\"brand\",\"data\":{\"id\":13,\"brandZoneName\":\"亲子档期\",\"channelId\":3,\"tsift\":0}}]},{\"tag\":\"#JJ140811\",\"layout\":[{\"section\":\"advertisement\",\"data\":{\"id\":18,\"zoneId\":122,\"zoneName\":\""
				+ string
				+ "-居家特卖广告组件\"}},{\"section\":\"operate\",\"data\":{\"layout_type\":\"col_in_row\",\"block\":[{\"cell\":\"row\",\"size\":25.0,\"child\":[{\"cell\":\"col\",\"size\":50.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":74,\"imageUrl\":\"http://b.appsimg.com/2014/09/26/385/1411726494950.jpg\",\"targetAction\":5,\"targetParam\":\"id\u003d266082\",\"displayType\":\"image\"}},{\"cell\":\"col\",\"size\":0.3,\"paddingLeft\":0.0,\"paddingRight\":0.0,\"paddingTop\":2.0,\"paddingBottom\":2.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}},{\"cell\":\"col\",\"size\":50.0,\"paddingLeft\":1.0,\"paddingRight\":1.0,\"paddingTop\":1.0,\"paddingBottom\":1.0,\"data\":{\"id\":75,\"imageUrl\":\"http://b.appsimg.com/2014/09/12/464/2014/9/12/1410512854836.jpg\",\"targetAction\":5,\"targetParam\":\"id\u003d266074\",\"displayType\":\"image\"}}]},{\"cell\":\"row\",\"size\":0.3,\"child\":[{\"cell\":\"col\",\"size\":100.0,\"paddingLeft\":2.0,\"paddingRight\":2.0,\"paddingTop\":0.0,\"paddingBottom\":0.0,\"data\":{\"displayType\":\"line\",\"color\":\"#d6d6d6\"}}]}]}},{\"section\":\"brand\",\"data\":{\"id\":12,\"brandZoneName\":\"居家档期\",\"channelId\":4,\"tsift\":0}}]}]}}";
	}

	public int getExp() {
		if (0 >= exp)
			exp = RandomUtil.nextInt(45, 120);
		return exp;
	}

	public String getJson() {
		return json;
	}

}