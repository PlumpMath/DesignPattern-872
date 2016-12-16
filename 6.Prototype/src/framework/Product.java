package framework;

public interface Product extends Cloneable {
	//使用
	public abstract void use(String s);

	//インスタンスの複製
	public abstract Product createClone();
}
