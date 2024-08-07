package com.example.demo.FileUpload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadDynamic {
	public final String uploadPath = new ClassPathResource("static/image").getFile().getAbsolutePath();	
	 public FileUploadDynamic() throws IOException {
		 
	 }
	
	public boolean uploadFile(MultipartFile multipartFile) {
		
		

		boolean fal = false;
		try {
			Files.copy(multipartFile.getInputStream(),
					Paths.get(uploadPath + File.separator + multipartFile.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			fal = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fal;
	}

}
