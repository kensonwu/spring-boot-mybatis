/**  
 * Project Name:spring-boot-mybatis  
 * File Name:CatService.java  
 * Package Name:com.kenson  
 * Date:Apr 17, 20185:08:58 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**  
 * ClassName:CatService   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 17, 2018 5:08:58 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@Service
public class CatService {
	
	@Autowired
	private CatMapper catMapper;
	
	public List<Cat> likeName(String name){
		return catMapper.likeName(name);
	}
	
	@Transactional //添加事物
	public void save(Cat cat) {
		catMapper.save(cat);
	}
}
  
