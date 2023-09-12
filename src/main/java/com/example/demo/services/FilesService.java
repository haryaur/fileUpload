package com.example.demo.services;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Files;
import com.example.demo.repositories.FilesRepository;

@Service
public class FilesService {

	  @Autowired
	  private FilesRepository filesRepository;

	  public Files store(MultipartFile file) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    Files files = new Files(fileName, file.getBytes());

	    return filesRepository.save(files);
	  }

	  public Files getFile(int id) {
	    return filesRepository.findById(id).get();
	  }
	  
	  public Stream<Files> getAllFiles() {
		    return filesRepository.findAll().stream();
		  }

}
