package com.orange.service;

import java.sql.SQLException;

import java.util.List;

import com.orange.dao.FoodDao;
import com.orange.domain.Food;
import com.orange.exception.FoodException;



public class FoodService {
	
	FoodDao dd = new FoodDao();

	public Food findFoodById(String foodId) throws FoodException {
		try {
			return dd.findFoodById(foodId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FoodException("通过id查找商品失败！");
		}
	}

	

	public Food findFoodByFoodname(String foodName, int storeId) throws FoodException {
		try {
			return dd.findFoodByFoodname(foodName,storeId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FoodException("通过名称查找商品失败！");

		}
	}

	
	

	public void modifyFood(Food food) throws FoodException {
		try {
			dd.modifyFood(food);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FoodException("商品信息修改失败！");
		}
	}

	public void addFood(Food food) throws FoodException {
		try {
			dd.addFood(food);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FoodException("商品添加失败！");
		}
	}

	public int delFood(int foodId) throws FoodException {
		try {
			return dd.delFood(foodId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FoodException("商品删除失败！");
		}
	}

	public List<Food> findAllfood(int storeId) throws FoodException {
		try {
			return dd.findAllfood(storeId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FoodException("美食查找失败！");
		}
	}

}
