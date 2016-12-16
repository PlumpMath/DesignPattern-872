package QA_6_1;

public abstract class Product implements Cloneable {
	//使用
	public abstract void use(String s);

	//インスタンスの複製
	public abstract Product createClone();
}
