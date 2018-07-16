package com.fil.dao;

import java.util.List;

import com.fil.model.Part;

public interface PartDao {
	
	public void addPart(Part p);
	public void deletePart(Part p);
	public List<Part> getAllParts();
	public Part getpart(int id);
	public void closeManager();

}
