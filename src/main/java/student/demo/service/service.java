package student.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import student.demo.Model.model;


public interface service {

	public String insertstudent(model mdl);
	public List<model> getstudent();
	public String deletestudent(String id);
	public String updatestudent(String id , model mdl);
}
