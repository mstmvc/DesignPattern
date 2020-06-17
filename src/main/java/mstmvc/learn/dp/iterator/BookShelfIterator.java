package mstmvc.learn.dp.iterator;

public class BookShelfIterator implements Iterator<Book> {
	private final BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	public boolean hasNext() {
		return index < bookShelf.getLength();
	}

	public Book next() {
		return bookShelf.getBookAt(index++);
	}

}
