public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("Printerのインスタンスを生成中");
    }

    //コンストラクタ
    public Printer(String name) {
        this.name = name;
        heavyJob("Printerインスタンス(" + name + ")を生成中");
    }

    //名前の設定
    public void setPrinterName(String name) {
        this.name = name;
    }

    //名前の取得
    public String getPrinterName() {
        return name;
    }

    //名前つきで表示
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    //重い仕事
    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("完了。");
    }
}
