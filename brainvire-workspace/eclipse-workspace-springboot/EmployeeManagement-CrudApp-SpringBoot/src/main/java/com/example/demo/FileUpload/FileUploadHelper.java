package com.example.demo.FileUpload;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String uploadPath = "/home/swapnil_limgude/brainvire-workspace/eclipse-workspace-springboot/EmployeeManagement-CrudApp-SpringBoot/src/main/resources/static/images";

	public boolean uploadFile(MultipartFile multipartFile) {

		boolean fal = false;
		try {
//			//read
//			InputStream is =multipartFile.getInputStream();
//			byte data[]=new byte[is.available()];
//			is.read(data);
//			
//			//write
//			FileOutputStream fos = new FileOutputStream(uploadPath+File.separator+multipartFile.getOriginalFilename());
//			fos.write(data);
//			fos.flush();
//			fos.close();
//			
//			fal=true;
//			

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
