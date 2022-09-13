package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/index")
	public String dashboard()
	{
		return "index";
	}
	
	@RequestMapping("/vegetable")
	public String veggie()
	{
		return "vegetable";
	}
	
	
	@RequestMapping("/appleHome")
	public String appleHome()
	{
		return "normal/Apple";
	}
	
	
	@RequestMapping("/categoryFruits")
	public String catFruit()
	{
		return "catagory/Category_Fruits";
	}
	
	@RequestMapping("/categoryJuice")
	public String catJuice()
	{
		return "catagory/Category_Juice";
	}
	
	@RequestMapping("/categoryMeat")
	public String catMeat()
	{
		return "catagory/Category_Meat";
	}
	
	@RequestMapping("/categoryVegetable")
	public String catVeggie()
	{
		return "catagory/Category_Vegetable";
	}
	
	@RequestMapping("/categoryCabbage")
	public String catCabbage()
	{
		return "normal/cabbage";
	}
	
	@RequestMapping("/categoryPotato")
	public String catPotato()
	{
		return "normal/potato";
	}
	
	@RequestMapping("/categoryLemon")
	public String catLemon()
	{
		return "normal/lemon";
	}
	
	@RequestMapping("/categoryTomato")
	public String catTomato()
	{
		return "normal/tomato";
	}
	
	@RequestMapping("/categoryCapsicum")
	public String catCapsicum()
	{
		return "normal/capsicum";
	}
}

