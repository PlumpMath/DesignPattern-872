package QA13_3;
//訪問者を受け入れるインタフェース
public interface Element {
	public abstract void accept(Visitor v);
}
