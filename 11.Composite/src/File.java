
public class File extends Entry {
	private String name;
	private int size;
	// パス(問題11-2)
	private String path;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);

	}
}
