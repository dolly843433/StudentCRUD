package student.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.demo.Model.model;
import student.demo.service.service;

@RestController
@RequestMapping("/api/v1")
public class Contoller {
	
	@Autowired
	service ser;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<model>> getall(){
		return new  ResponseEntity<>(ser.getstudent(),HttpStatus.OK);
				
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> create(@RequestBody model mdl){
		
		return new ResponseEntity<>(ser.insertstudent(mdl),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@PathVariable("id") String id, @RequestBody model mdl){
		return new ResponseEntity<>(ser.updatestudent(id,mdl),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id){
		return new ResponseEntity<>(ser.deletestudent(id),HttpStatus.ACCEPTED);
	}

}
