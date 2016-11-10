package test;

public class Main {
	public static void main(String[] args) {

		// 本棚（4本）をインスタンスオフ
		BookShelf bookShelf = new BookShelf();

		// 本（名）を追加
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("Last Friends"));

		// スキャン
		Iterator it = bookShelf.iterator();

		// 本の名前を出力
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
