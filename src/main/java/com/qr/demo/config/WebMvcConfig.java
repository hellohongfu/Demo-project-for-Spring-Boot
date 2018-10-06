package com.qr.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ConfigurationProperties(prefix = "file")

public class WebMvcConfig extends WebMvcConfigurationSupport  {

    private String dirQr;
	public String getDirQr() {
     

		return dirQr;
	}
	public void setDirQr(String dirQr) {
		this.dirQr = dirQr;
	}
    

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/qr/**").addResourceLocations("file:"+dirQr+"/");
    }
}

