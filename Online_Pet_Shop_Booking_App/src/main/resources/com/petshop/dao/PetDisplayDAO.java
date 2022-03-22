package com.petshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import com.petshop.model.PetDisplay;

public class PetDisplayDAO {
	Connection connection=null;;
	public int  resultQuery(String sql ) throws SQLException {
		String url="jdbc:mysql://101.53.133.59:3306/revature_training_db";
		String username="rev_user";
		String password="rev_user";
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println(connection);
		Statement statement=connection.createStatement();
		int rows = statement .executeUpdate(sql);
		connection. close();
		return rows;

	}

	public void petAdd(PetDisplay pd) throws SQLException {

		String sql="INSERT INTO PetDisplay (pet_name,pet_price)VALUES('"+pd.getPetName()+"',"+pd.getPetPrice()+")";
		int rows=resultQuery(sql);
		System.out.println("no.of rows inserted"+rows);
	}

	public void petUpdate(PetDisplay pd) throws SQLException {

		String sql="UPDATE PetDisplay SET pet_price='"+pd.getPetPrice()+"'WHERE pet_name='"+pd.getPetName()+"'";
		int rows=resultQuery(sql);
		System.out.println("no.of rows update"+rows);
	}
	public void petDelete(PetDisplay pd) throws SQLException {

		String sql="DELETE FROM PetDisplay WHERE pet_name='"+pd.getPetName()+"'";
		int rows=resultQuery(sql);
		System.out.println("no.of rows delete"+rows);








	}
}
