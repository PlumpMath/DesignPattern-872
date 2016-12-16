package QA21_1;

public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("Printer�̃C���X�^���X�𐶐���");
    }
    public Printer(String name) {                   // �R���X�g���N�^
        this.name = name;
        heavyJob("Printer�̃C���X�^���X(" + name + ")�𐶐���");
    }
    public void setPrinterName(String name) {       // ���O�̐ݒ�
        this.name = name;
    }
    public String getPrinterName() {                // ���O�̎擾
        return name;
    }
    public void print(String string) {              // ���O�t���ŕ\��
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
    private void heavyJob(String msg) {             // �d�����(�̂���)
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("�����B");
    }
}
