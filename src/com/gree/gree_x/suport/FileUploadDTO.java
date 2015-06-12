package com.gree.gree_x.suport;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadDTO {
	
	 private MultipartFile file;

	    /**
	     * @return Returns the file.
	     */
	    public MultipartFile getFile() {
	        return file;
	    }

	    /**
	     * @param file The file to set.
	     */
	    public void setFile(MultipartFile file) {
	        this.file = file;
	    } 
}
