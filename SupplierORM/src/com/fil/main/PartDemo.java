package com.fil.main;

import java.util.List;

import com.fil.dao.PartDao;
import com.fil.daoimpl.PartDaoImpl;
import com.fil.model.Part;

public class PartDemo {
	
	public static void main(String args[]){
		Part p = new Part(6,"Hammer","brown");
		PartDao dao = new PartDaoImpl();
		dao.addPart(p);
		System.out.println(dao.getpart(p.getPid()));
		dao.deletePart(p);
		List<Part> list = dao.getAllParts();
		for(Part p1: list){
			System.out.println(p1);
		}
	}

}
