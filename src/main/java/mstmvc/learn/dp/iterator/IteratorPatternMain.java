package mstmvc.learn.dp.iterator;

public class IteratorPatternMain {
	public static void main(String[] args) {
		var bookShelf = new BookShelf(10);
		bookShelf.appendBook(new Book("Book1"));
		bookShelf.appendBook(new Book("Book2"));
		bookShelf.appendBook(new Book("Book3"));
		bookShelf.appendBook(new Book("Book4"));
		bookShelf.appendBook(new Book("Book5"));

		var iter = bookShelf.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
