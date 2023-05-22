package student.demo.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.demo.Model.model;
import student.demo.repo.repository;
import student.demo.service.service;

@Service
public class ServiceImplementation implements service{
	
	@Autowired
	repository repo;

	@Override
	public String insertstudent(model mdl) {
		// TODO Auto-generated method stub
		mdl.setId(UUID.randomUUID().toString());
		repo.save(mdl);
		return "Data Added.";
	}

	@Override
	public List<model> getstudent() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public String deletestudent(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted.";
	}

	@Override
	public String updatestudent(String id, model mdl) {
		// TODO Auto-generated method stub
		if(repo.findById(id).isPresent()) {
		model m=repo.findById(id).get();
		m.setStud_name(mdl.getStud_name());
		m.setAdress(mdl.getAdress());
		m.setEmail_id(mdl.getEmail_id());
		m.setPhone(mdl.getPhone());
		repo.save(m);
		return "Updated";
		}else {
			return "This data is not present.";
		}
	}

}
