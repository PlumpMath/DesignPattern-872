package QA_6_1;

public abstract class ConcreteProduct extends Product {
	//インスタンスの複製
	public Product createClone(){
		Product p = null;
		try{
			p = (Product)clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}
}
