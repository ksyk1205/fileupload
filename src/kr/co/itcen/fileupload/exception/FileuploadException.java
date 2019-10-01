package kr.co.itcen.fileupload.exception;

public class FileuploadException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FileuploadException() {
		super("FileUpload Exception");
	}

	public FileuploadException(String message) {
		super(message);
	}
	
}
