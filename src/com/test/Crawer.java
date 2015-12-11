/**
 * 创建于:2015年8月4日 下午7:55:25
 * 所属项目:
 * 文件名称:Crawer.java
 * 作者:jiangchunyan
 * 版权信息:
 */
package com.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.test.model.Fund;

public class Crawer {
	private static String url = "http://www.99fund.com/main/products/newgoufund/index.shtml";
	
	public void crawer() throws Exception{
		Document document = Jsoup.connect(url).get();
		Elements elements = document.select("div[id=con_two_1]");
		Elements trElements = elements.select("tr");
		String fundType = "";
		for(Element trElement : trElements){
			String fundTypeTemp = trElement.select("th div.sn_name a").text();
			if(!"".equals(fundTypeTemp)){
				fundType = fundTypeTemp;
			}
			
			
			Elements tdElements = trElement.select("td");
			if(tdElements.size() > 0){
				Fund fund = new Fund();
				
				// 基金代码
				Element tdElement = tdElements.get(0);
				if(!"sn_subth".equals(tdElement.attr("class"))){
					Elements hrefElements = tdElement.select("a[href]");
					String fundCode = hrefElements.text();
					String fundDetail = hrefElements.attr("href");
					fund.setFundCode(fundCode);
					fund.setFundType(fundType);
				}
				
				// 基金名称
				tdElement = tdElements.get(1);
				Elements hrefElements = tdElement.select("a[href]");
				String fundName = hrefElements.text();
				fund.setFundName(fundName);
				
				// 更新日期 
				tdElement = tdElements.get(1);
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		Crawer crawer = new Crawer();
		crawer.crawer();
	}
}
