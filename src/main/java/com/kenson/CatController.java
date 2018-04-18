/**  
 * Project Name:spring-boot-mybatis  
 * File Name:CatController.java  
 * Package Name:com.kenson  
 * Date:Apr 17, 20185:10:28 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

/**  
 * ClassName:CatController   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 17, 2018 5:10:28 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@RestController
public class CatController {
	
	@Autowired
	private CatService catService;
	
	@RequestMapping("/cat")
	public List<Cat> likeName(String name){
		/**
		 * 第一个参数：第几页
		 * 第二个参数： 每页条数
		 */
		
		PageHelper.startPage(1, 2);
		return catService.likeName(name);
	}
	
	@RequestMapping("/save")
	public Cat save() {
		Cat cat = new Cat();
		cat.setCat_age(25);
		cat.setCat_name("Lucy");
		catService.save(cat);
		return cat;
	}

}
  
