package com.cardmanage.app.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="api")
public class CardManagePropertySettings {
	
	private	String url;
	
	private void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrl(){
		return url;
	}
}
