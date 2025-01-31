package com.example.demo.Service;

import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Collection.BinaryPhoto;
import com.example.demo.Repository.PhotoRepository;

@Service
public class PhotoService implements PhotoServiceIf {

	@Autowired
	private PhotoRepository photoRepository;

	@Override
	public String addPhoto(String originalFilename, MultipartFile image) throws IOException {
		// TODO Auto-generated method stub
		BinaryPhoto photo = new BinaryPhoto();
		photo.setTitle(originalFilename);
		photo.setPhoto(new Binary(BsonBinarySubType.BINARY, image.getBytes()));
		return photoRepository.save(photo).getId();
	}

	@Override
	public BinaryPhoto getPhoto(String id) {
		// TODO Auto-generated method stub
		return photoRepository.findById(id).get();
	}

}
