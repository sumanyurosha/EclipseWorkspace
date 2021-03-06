package com.fil.daoimpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.fil.dao.SupplierDao;
import com.fil.dbcon.DBConnection;
import com.fil.model.Supplier;

public class SupplierDaoImpl implements SupplierDao{

	List<Supplier> list = new ArrayList<>();
	public SupplierDaoImpl(){
		try{
			Statement stmt = DBConnection.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from part");
			while(rs.next()){
				int pid = rs.getInt("pid");
				String pname = rs.getString("pname");
				String color = rs.getString("color");
				Supplier s = new Supplier(pid,pname,color);
				list.add(s);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	
	
	@Override
	public Supplier getSupplier(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public int addSupplier(Supplier s) {
		// TODO Auto-generated method stub
		list.add(s);
		int i=0;
		try {
			PreparedStatement statement = DBConnection.getConnection().prepareStatement("insert into part values(?,?,?)");
			statement.setInt(1,s.getPid());
			statement.setString(2,s.getPname());
			statement.setString(3,s.getColor());
			i = statement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
		
	}

	@Override
	public void deleteSupplier(Supplier s) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement statement = DBConnection.getConnection().prepareStatement("delete from part where pid="+s.getPid());
			statement.execute();
			list.remove(s);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}