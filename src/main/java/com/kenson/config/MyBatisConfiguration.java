/**  
 * Project Name:spring-boot-mybatis  
 * File Name:MyBatisConfiguration.java  
 * Package Name:com.kenson.config  
 * Date:Apr 17, 20189:21:16 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

/**  
 * ClassName:MyBatisConfiguration   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 17, 2018 9:21:16 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@Configuration
public class MyBatisConfiguration {
	
	@Bean
	public PageHelper pageHelper() {
		System.out.println("MyBatisConfiguration.pageHelper()");
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		pageHelper.setProperties(properties);
		return pageHelper;
	}

}
  
