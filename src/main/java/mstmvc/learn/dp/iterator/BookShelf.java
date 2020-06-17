package mstmvc.learn.dp.iterator;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int last;

	public BookShelf(int maxsize) {
		books = new Book[maxsize];
	}

	public Book getBookAt(int index) {
		return this.books[index];
	}

	public void appendBook(Book book) {
		books[last++] = book;
	}

	public int getLength() {
		return last;
	}

	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
}
