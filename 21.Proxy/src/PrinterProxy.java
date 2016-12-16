public class PrinterProxy implements Printable {
	//名前
	private String name;
	//本人
	private Printer real;

	public PrinterProxy() {
	}

	//コンストラクタ
	public PrinterProxy(String name) {
		this.name = name;
	}

	//名前の設定
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	//名前の取得
	public String getPrinterName() {
		return name;
	}

	//表示
	public void print(String string) {
		realize();
		real.print(string);
	}

	//「本人」を生成
	private synchronized void realize() {
		if (real == null) {
			real = new Printer(name);
		}
	}
}
