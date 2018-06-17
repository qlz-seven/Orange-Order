package com.orange.service;

import java.sql.SQLException;

import java.util.List;

import com.orange.dao.DishDao;
import com.orange.domain.Dish;
import com.orange.exception.DishException;



public class DishService {
	
	DishDao dd = new DishDao();

	public Dish findDishById(String dishId) throws DishException {
		try {
			return dd.findDishById(dishId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过id查找商品失败！");
		}
	}

	/*public Dish findDishByKind(String kind) throws DishException {
		try {
			return dd.findDishByKind(kind);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过种类查找美食失败！");
		}
	}*/

	public Dish findDishByDishname(String dishName, int storeId) throws DishException {
		try {
			return dd.findDishByDishname(dishName,storeId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过名称查找商品失败！");

		}
	}

	/*public Dish findDishByPrice(String minprice, String maxprice) throws DishException {
		try {
			return dd.findDishByPrice(minprice,maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过价格区间查找美食失败！");
		}
	}*/

	/*public Dish findDishByIdAndKind(String id, String kind) throws DishException {
		try {
			return dd.findDishByIdAndKind(id,kind);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食编号和美食种类查找美食失败！");
		}
	}*/

	/*public Dish findDishByIdAndDishname(String id, String dishname) throws DishException {
		try {
			return dd.findDishByIdAndDishname(id,dishname);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食编号和美食名称查找美食失败！");
		}
	}*/

	/*public Dish findDishByIdAndPrice(String id, String minprice, String maxprice) throws DishException {
		try {
			return dd.findDishByIdAndPrice(id,minprice,maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食编号和美食价格区间查找美食失败！");
		}
	}*/

	/*public Dish findDishByKindAndDishname(String kind, String dishname) throws DishException {
		try {
			return dd.findDishByKindAndDishname(kind,dishname);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食种类和美食名称查找美食失败！");
		}
	}*/

	/*public Dish findDishByKindAndPrice(String kind, String minprice, String maxprice) throws DishException {
		try {
			return dd.findDishByKindAndPrice(kind,minprice,maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食种类和美食价格查找美食失败！");
		}
	}*/

	/*public Dish findDishByDishnameAndPrice(String dishname, String minprice, String maxprice) throws DishException {
		try {
			return dd.findDishByDishnameAndPrice(dishname,minprice,maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食名称和价格查找美食失败！");
		}
	}*/

	/*public Dish findDishByIdKindDishname(String id, String kind, String dishname) throws DishException {
		try {
			return dd.findDishByIdKindDishname(id,kind,dishname);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食编号，种类，名称查找美食失败！");
		}
	}*/

	/*public Dish findDishByIdKindPrice(String id, String kind, String minprice, String maxprice) throws DishException {
		try {
			return dd.findDishByIdKindPrice(id,kind,minprice,maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食编号，种类，价格查找美食失败！");
		}
	}*/

	/*public Dish findDishByKindDishnamePrice(String kind, String dishname, String minprice, String maxprice) throws DishException {
		try {
			return dd.findDishByKindDishnamePrice(kind,dishname,minprice,maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食种类，名称，价格查找美食失败！");
		}
	}*/

	/*public Dish findDishByAll(String id, String kind, String dishname, String minprice, String maxprice) throws DishException {
		try {
			return dd.findDishByAll(id,kind,dishname,minprice,maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("通过美食编号，种类，名称，价格查找美食失败！");
		}
	}*/

	

	public void modifyDish(Dish dish) throws DishException {
		try {
			dd.modifyDish(dish);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("商品信息修改失败！");
		}
	}

	public void addDish(Dish dish) throws DishException {
		try {
			dd.addDish(dish);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("商品添加失败！");
		}
	}

	public int delDish(int dishId) throws DishException {
		try {
			return dd.delDish(dishId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("商品删除失败！");
		}
	}

	public List<Dish> findAlldish(int storeId) throws DishException {
		try {
			return dd.findAlldish(storeId);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DishException("美食查找失败！");
		}
	}

}
