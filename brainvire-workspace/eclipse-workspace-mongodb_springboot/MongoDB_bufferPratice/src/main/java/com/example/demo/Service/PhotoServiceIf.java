package com.example.demo.Service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Collection.BinaryPhoto;

public interface PhotoServiceIf {

	String addPhoto(String originalFilename, MultipartFile image) throws IOException;

	BinaryPhoto getPhoto(String id);

}
