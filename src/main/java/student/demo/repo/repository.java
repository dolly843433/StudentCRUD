package student.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import student.demo.Model.model;

public interface repository extends JpaRepository<model, String>{

}
