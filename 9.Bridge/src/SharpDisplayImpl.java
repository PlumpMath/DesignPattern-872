//問題9-3
public class SharpDisplayImpl extends DisplayImpl {

	private String string;

	private int width;
	private int index;

	public SharpDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	public void rawOpen() {
	}

	public void rawPrint() {
		System.out.print("|");
		for (int i = 0; i < index; i++) {
			System.out.print(string);
		}

		System.out.println("-");
		index++;
	}

	public void rawClose() {
	}

}
