package collections;

public class Book implements Comparable<Book> {
	private String bookName;
	private int numOfBook;
	private String authorName;
	private int editionDate;
	
	public Book(String bookName, int numOfBook, String authorName, int editionDate) {
		super();
		this.bookName = bookName;
		this.numOfBook = numOfBook;
		this.authorName = authorName;
		this.editionDate = editionDate;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.getBookName().compareTo(o.getBookName());
	}



	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNumOfBook() {
		return numOfBook;
	}

	public void setNumOfBook(int numOfBook) {
		this.numOfBook = numOfBook;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getEditionDate() {
		return editionDate;
	}

	public void setEditionDate(int editionDate) {
		this.editionDate = editionDate;
	}

}
