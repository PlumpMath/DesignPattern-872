import java.util.ArrayList;
import java.util.Iterator;

//visitorの実装
public class FileFindVisitor extends Visitor {
	// 現在注目しているディレクトリ名
	private String currentdir = "";
	private String kakutyo;
	private ArrayList result;

	public FileFindVisitor(String kakutyo) {
		this.kakutyo = kakutyo;
		this.result = new ArrayList();
	}

	public void visit(File file) {
		// 拡張子がある かつ 拡張子=指定拡張子の場合、Iteratorにセット
		int lastDotPosition = file.getName().lastIndexOf(".");
		String fileKakutyo = "";
		if (lastDotPosition != -1) {
			fileKakutyo = "." + file.getName().substring(lastDotPosition + 1);
		}

		if (!fileKakutyo.isEmpty() && kakutyo.equals(fileKakutyo)) {
			result.add(file);
		}
	}

	public void visit(Directory direcotry) {
		// System.out.println(currentdir + "/" + direcotry);
		String savedir = currentdir;
		currentdir = currentdir + "/" + direcotry.getName();
		Iterator it = direcotry.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}

	// 問題13-1
	// 拡張子指定
	public ArrayList getFoundFiles() {
		return result;
	}

}
