package QA13_2;
import java.util.Iterator;

//visitorの実装
public class ListVisitor extends Visitor {
	// 現在注目しているディレクトリ名
	private String currentdir = "";

	public void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	public void visit(Directory direcotry) {
		System.out.println(currentdir + "/" + direcotry);
		String savedir = currentdir;
		currentdir = currentdir + "/" + direcotry.getName();
		Iterator it = direcotry.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}

}
