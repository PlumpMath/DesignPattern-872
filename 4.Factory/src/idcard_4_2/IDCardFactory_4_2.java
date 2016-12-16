package idcard_4_2;

import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;

public class IDCardFactory_4_2 extends Factory {
	private List owners = new ArrayList();
	private List no = new ArrayList();

	// 連番：100から
	private int serial = 100;

	protected Product createProduct(String owner) {
		// 連番を加算
		return new IDCard_4_2(owner, serial++);
	}

	protected void registerProduct(Product product) {
		owners.add(((IDCard_4_2) product).getNumber());
		owners.add(((IDCard_4_2) product).getOwner());
	}

	public List getOwners() {
		return owners;
	}
}
