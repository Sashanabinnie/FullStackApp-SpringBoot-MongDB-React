package com.example.demo.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Attraction;

@Repository
public interface AttractionRepository extends MongoRepository<Attraction, String>{
	


}
