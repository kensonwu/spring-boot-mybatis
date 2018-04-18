/**  
 * Project Name:spring-boot-mybatis  
 * File Name:DemoMapper.java  
 * Package Name:com.kenson  
 * Date:Apr 17, 20185:03:20 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson;  
/**  
 * ClassName:DemoMapper   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 17, 2018 5:03:20 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface CatMapper {
	
	@Select("select * from cat where cat_name=#{name}")
	public List<Cat> likeName(String name);
	
	@Select("select name from cat where id=#{id}")
	public Cat getById(long id);
	
	@Select("select name from cat where id=#{id}")
	public String getNameById(long id);
	
	/**
	 * 保存数据
	 */
	
	@Insert("insert into cat(cat_name, cat_age) values(#{cat_name}, #{cat_age})")
	@Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
	public void save(Cat cat);
}
  
