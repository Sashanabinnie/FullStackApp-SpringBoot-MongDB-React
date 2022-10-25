package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Attraction;
import com.example.demo.repository.AttractionRepository;

@CrossOrigin
@RestController 
public class AttractionController  {
	
	@Autowired 
	private AttractionRepository attractionRepository;
	
	@PostMapping("/create")
	public void createAttraction(@RequestBody Attraction attraction)
	{
		attractionRepository.insert(attraction);
	}
	@PostMapping("/delete/{id}")
	public void deleteAttraction(@PathVariable String id)
	{
		attractionRepository.deleteById(id);
		
	}
	@GetMapping("/list")
	public List<Attraction> listAttractions()
	{
		return attractionRepository.findAll();
	}

}
