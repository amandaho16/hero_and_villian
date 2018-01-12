package com.lmig.gfc.hero_and_villians.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.hero_and_villians.models.Hero;
import com.lmig.gfc.hero_and_villians.models.Monster;

@Controller
public class homeController {
	
	private Monster monster;
	private Hero hero;
	
	public homeController() {
		
		this.initGame();
		
	}
	
	@RequestMapping("/index")
	public ModelAndView defaultPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("monster", this.monster);
		mv.addObject("hero", this.hero);
		mv.setViewName("index");
		return mv;
	}
	
	public void initGame() {
		this.monster = new Monster("Steve", 80, "Ogre");
		this.hero = new Hero("Amanda Ho", 100, "WonderWoman");
	}
	

}
