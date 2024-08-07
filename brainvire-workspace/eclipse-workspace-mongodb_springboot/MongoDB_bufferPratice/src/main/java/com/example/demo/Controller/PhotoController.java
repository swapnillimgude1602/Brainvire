package com.example.demo.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Collection.BinaryPhoto;
import com.example.demo.Service.PhotoServiceIf;

@RestController
public class PhotoController {

	@Autowired
	private PhotoServiceIf photoService;

	@PostMapping("/addPhoto")
	public String addPhoto(@RequestParam("image") MultipartFile image) throws IOException { // for multipart file you
																							// need to set properties.
		String id = photoService.addPhoto(image.getOriginalFilename(), image);
		return id;

	}

	@GetMapping("/	/{id}")
	public ResponseEntity<Resource> downloadImage(@PathVariable("id") String id){
		BinaryPhoto photo = photoService.getPhoto(id);
		Resource resource = new ByteArrayResource(photo.getPhoto().getData());
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""+photo.getTitle()+"\"")
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.body(resource);
				
		
	}

}
