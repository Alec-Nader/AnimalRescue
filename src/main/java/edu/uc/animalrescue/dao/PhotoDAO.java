package edu.uc.animalrescue.dao;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import edu.uc.animalrescue.dto.PhotoDTO;

@Component
public class PhotoDAO implements IPhotoDAO {

	@Autowired
	PhotoRepository photoRepository;
	
	@Override
	public void savePhotoImage(MultipartFile image, PhotoDTO photo) throws Exception {
		// this gets us to src/main/resources without knowing the full path (hardcoding)
		Path currentPath = Paths.get(".");
		Path absolutePath = currentPath.toAbsolutePath();
		photo.setPath(absolutePath + "/src/main/resources/static/photos/");
		byte[] bytes = image.getBytes();
		Path path = Paths.get(photo.getPath() + image.getOriginalFilename());
		Files.write(path, bytes);		
	}
	
	@Override
	public void save(PhotoDTO photo) throws Exception {
		photoRepository.save(photo);
	}

	
}
