package library;

public class Book {
	private String bookname;

	public Book(String bookname) {
		this.bookname = bookname;
	}

	public String getBookname() {
		return this.bookname;
	}

	@Override
	public String toString() {
		return "[ È√˚=" + bookname + "]";
	}

}
