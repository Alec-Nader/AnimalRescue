package edu.uc.animalrescue.dao;

import org.springframework.web.multipart.MultipartFile;

import edu.uc.animalrescue.dto.PhotoDTO;

public interface IPhotoDAO {

	/**
	 * savePhotoImage - Saves the image file that a user uploads to the project's local file system
	 * @param image - File that is an image that can be saved to the local file system.
	 * @throws Exception
	 */
	void savePhotoImage(MultipartFile image, PhotoDTO photo) throws Exception;
	
	/**
	 * save - Saves the photo's metadata to the database.
	 * @param photo - PhotoDTO holding metadata for an image.
	 * @throws Exception
	 */
	void save(PhotoDTO photo) throws Exception;

}