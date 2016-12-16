package framework;

import java.util.HashMap;

public class Manager {

	// インスタンス「名前」と「インスタンス」の対応関係を表現
	private HashMap showcase = new HashMap();

	// 製品の名前とインスタンスが付ける
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}

	// インスタンス名を指定し、インスタンスをCloneして、生成する。
	public Product create(String protoname) {
		Product p = (Product) showcase.get(protoname);
		return p.createClone();
	}
}
