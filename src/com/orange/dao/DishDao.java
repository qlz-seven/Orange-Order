package com.orange.dao;

import java.sql.SQLException;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import com.orange.domain.Dish;

import com.orange.utils.C3P0Util;


public class DishDao {
	//通过id查找商品
	public Dish findDishById(String dishId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where dishId=?", new BeanHandler<Dish>(Dish.class), dishId);
	}
	//通过美食种类查找美食
	/*public Dish findDishByKind(String kind) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where kind=?", new BeanHandler<Dish>(Dish.class), kind);
	}*/
	//通过美食名称查找美食
	public Dish findDishByDishname(String dishName,int storeId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where dishName=? and storeId=?", new BeanHandler<Dish>(Dish.class), dishName,storeId);
	}
	//通过价格查找美食
	/*public Dish findDishByPrice(String minprice, String maxprice) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where price between ? and ?", new BeanHandler<Dish>(Dish.class), minprice,maxprice);
	}*/
	//通过美食编号和美食种类查找美食
	/*public Dish findDishByIdAndKind(String id, String kind) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where id=? and kind=?", new BeanHandler<Dish>(Dish.class), id,kind);
	}*/
	//通过美食编号和美食名称查找美食
	/*public Dish findDishByIdAndDishname(String id, String dishname) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where id=? and dishname=?", new BeanHandler<Dish>(Dish.class), id,dishname);
	}*/
	//通过美食编号和价格区间查找美食
	/*public Dish findDishByIdAndPrice(String id, String minprice, String maxprice) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where id=? and price>=? and price<=?", new BeanHandler<Dish>(Dish.class), id,minprice,maxprice);
	}*/
	//通过美食种类和美食名称查找美食
	/*public Dish findDishByKindAndDishname(String kind, String dishname) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where kind=? and dishname=?", new BeanHandler<Dish>(Dish.class), kind,dishname);
	}*/
	//通过美食种类和价格查找美食
	/*public Dish findDishByKindAndPrice(String kind, String minprice, String maxprice) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where kind=? and price>=? and price<=?", new BeanHandler<Dish>(Dish.class), kind,minprice,maxprice);
	}*/
	//通过美食名称和价格查找美食
	/*public Dish findDishByDishnameAndPrice(String dishname, String minprice, String maxprice) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where dishname=? and price>=? and price<=?", new BeanHandler<Dish>(Dish.class), dishname,minprice,maxprice);
	}*/
	//通过美食编号，种类，名称查找美食
	/*public Dish findDishByIdKindDishname(String id, String kind, String dishname) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where id=? and kind=? and dishname=?", new BeanHandler<Dish>(Dish.class), id,kind,dishname);
	}*/
	//通过美食编号，种类，价格查找美食
	/*public Dish findDishByIdKindPrice(String id, String kind, String minprice, String maxprice) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where id=? and kind=? and price>=? and price<=?", new BeanHandler<Dish>(Dish.class), id,kind,minprice,maxprice);
	}*/
	//通过美食种类，名称，价格查找美食
	/*public Dish findDishByKindDishnamePrice(String kind, String dishname, String minprice, String maxprice) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where kind=? and dishname=? and price>=? and price<=?", new BeanHandler<Dish>(Dish.class), kind,dishname,minprice,maxprice);
	}*/
	//通过美食编号，种类，名称，价格查找美食
	/*public Dish findDishByAll(String id, String kind, String dishname, String minprice, String maxprice) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from s_dish where id=? and kind=? and dishname=? and price>=? and price<=?", new BeanHandler<Dish>(Dish.class), id,kind,dishname,minprice,maxprice);
	}*/
	
	public void modifyDish(Dish dish) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("update s_dish set dishName=?, dishType=?, price=?, num=?, dishImg=?, dishDescription=? where dishid=?",dish.getDishName(),dish.getDishType(),dish.getPrice(),dish.getNum(),dish.getDishImg(),dish.getDishDescription(),dish.getDishId());
		
	}
	public void addDish(Dish dish) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		String sql = "INSERT INTO S_DISH(dishName,dishType,price,num,dishImg,dishDescription,storeId)"+"VALUES(?,?,?,?,?,?,?)";
		qr.update(sql, dish.getDishName(),dish.getDishType(),dish.getPrice(),dish.getNum(),dish.getDishImg(),dish.getDishDescription(),dish.getStoreId());
	}
	public int delDish(int dishId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.update("delete from s_dish where dishId=?", dishId);
	}
	public List<Dish> findAlldish(int storeId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("SELECT * FROM `s_dish` where storeId=?", new BeanListHandler<Dish>(Dish.class),storeId);
	}
}
