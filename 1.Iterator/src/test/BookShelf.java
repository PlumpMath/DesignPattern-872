package test;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
	@SuppressWarnings("rawtypes")
	private ArrayList books;
	private int last = 0;

	// 本棚初期化
	public BookShelf() {
		this.books = new ArrayList<>();
	}

	// 本を取得
	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}

	// 本を追加
	@SuppressWarnings("unchecked")
	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}

	// 本の個数を取得
	public int getLength() {
		return last;
	}

	// 本をスキャン
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
