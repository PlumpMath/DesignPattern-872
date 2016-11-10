package test;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;

	// 本棚スキャンの初期化
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		// INDEXに0をセット
		this.index = 0;
	}

	// 次があるかどうか
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	// 次の本を取得
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
