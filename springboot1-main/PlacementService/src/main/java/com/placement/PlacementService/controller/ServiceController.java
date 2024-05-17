package com.placement.PlacementService.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.placement.PlacementService.entity.PlacementService;


@RestController
public class ServiceController {
@Autowired
com.placement.PlacementService.repository.Repository repo;
@PostMapping ("/placement")
public PlacementService addStudent(@RequestBody PlacementService r) {
	return repo.save(r);
}
@GetMapping("placement")
public List<PlacementService> getStudent(){
	return repo.findAll();
}
@GetMapping("/placement/{id}")
public PlacementService getstd(@PathVariable long id) {
	return repo.findById(id).get();
}
@DeleteMapping("/placement/{id}")
	public void delete(@PathVariable long id) {
	repo.deleteById(id);
	}

}