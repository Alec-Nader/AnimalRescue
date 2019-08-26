package edu.uc.animalrescue.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="photo")
public class PhotoDTO {

	@Id
	@GeneratedValue
	@Column(name="photo_id")
	private int photoId;
	@Column(name="file_name")
	private String fileName;
	@Column(name="path")
	private String path;
	@Column(name="comments")
	private String comments;
	// @JsonIgnore fixes an infinite recursion problem. https://www.baeldung.com/jackson-bidirectional-relationships-and-infinite-recursion
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="pet_id")
	PetDTO petDTO;
	
	public int getPhotoId() {
		return photoId;
	}
	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public PetDTO getPetDTO() {
		return petDTO;
	}
	public void setPetDTO(PetDTO petDTO) {
		this.petDTO = petDTO;
	}
}
