package com.ab.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:queue.properties")
@ConfigurationProperties
public class QueuePropertiesConfiguration {

	private String requestQueue;

	public String getRequestQueue() {
		return requestQueue;
	}

	public void setRequestQueue(String requestQueue) {
		this.requestQueue = requestQueue;
	}

}
