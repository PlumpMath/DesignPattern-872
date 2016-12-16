package idcard_4_2;

import framework.Product;

public class IDCard_4_2 extends Product {

	private String owner;

	//番号を追加
	private Integer no;

	IDCard_4_2(String owner, Integer no) {
		System.out.println(no + "." + owner + "のカードを作ります。（問題４－２）");
		this.owner = owner;
		//番号を追加
		this.no = no;
	}

	public void use() {
		System.out.println(no + "." + owner + "のカードを使います。（問題４－２）");
	}

	public String getOwner() {
		return owner;
	}

	public Integer getNumber() {
		return no;
	}

}
