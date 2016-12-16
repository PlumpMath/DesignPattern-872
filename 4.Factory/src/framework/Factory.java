package framework;

public abstract class Factory {

	public final Product create(String owner) {
		// 製品を作り
		Product p;
		try {
			p = createProduct(owner);

			// 登録
			registerProduct(p);
			return p;

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}
	}

	// 製品を作り
	// (1) 抽象メソッドにする
	 protected abstract Product createProduct(String owner);

	// (2) デフォルトの実装を用意しておく
	// protected Product createProduct(String owner){
	// Productクラスは抽象クラスにしておくことはできない
	// return new Product(owner);
	// }

//	// (3) エラーにする
//	protected Product createProduct(String owner) throws Exception {
//		throw new Exception("実装していないメソッドが存在しています。");
//	}

	// 登録
	protected abstract void registerProduct(Product product);
}
