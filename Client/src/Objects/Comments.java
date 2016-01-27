package Objects;

import java.util.List;

import com.upem.bibliotheque.beans.Book;
import com.upem.bibliotheque.beans.Comment;

public class Comments {

	private String title;
	private String author;
	private String description;
	private String content;
	public Comments(String title, String author, String description,
			String content) {
		super();
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
 