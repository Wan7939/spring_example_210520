package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson05Ex05Controller {
	@RequestMapping("/lesson05/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("cherry");
		fruits.add("melon");
		fruits.add("mango");
		fruits.add("orange");
		
		model.addAttribute("fruits" , fruits);
		
		//List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();  // 1
		map.put("name", "박경완");
		map.put("age", 24);
		map.put("hobby", "독서");
		users.add(map);
		
		map = new HashMap<>();	// 2
		map.put("name", "박잭팟");
		map.put("age", 10);
		map.put("hobby", "멍멍");
		users.add(map);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
}
