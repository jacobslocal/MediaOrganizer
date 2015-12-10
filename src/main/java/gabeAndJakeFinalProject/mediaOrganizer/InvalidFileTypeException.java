package gabeAndJakeFinalProject.mediaOrganizer;

import java.util.StringTokenizer;

public class InvalidFileTypeException extends Exception{
	
	public InvalidFileTypeException(String filename){
		
		super(String.format(" is not a valid file type for the Media Organizer, skipping file %s", filename));
	}
	public String getExtension(String filename){
		StringTokenizer st = new StringTokenizer(filename, ".");
		st.nextToken();
		String fileExtension = st.nextToken();
		return fileExtension;
	}
}