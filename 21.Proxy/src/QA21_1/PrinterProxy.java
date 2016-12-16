package QA21_1;

public class PrinterProxy implements Printable {
    private String name;            // ���O
    private Printable real;         // �u�{�l�v
    private String className;       // �u�{�l�v�̃N���X��
    public PrinterProxy(String name, String className) {      // �R���X�g���N�^
        this.name = name;
        this.className = className;
    }
    public synchronized void setPrinterName(String name) {  // ���O�̐ݒ�
        if (real != null) {
            real.setPrinterName(name);  // �u�{�l�v�ɂ��ݒ肷��
        }
        this.name = name;
    }
    public String getPrinterName() {    // ���O�̎擾
        return name;
    }
    public void print(String string) {  // �\��
        realize();
        real.print(string);
    }
    private synchronized void realize() {   // �u�{�l�v�𐶐�
        if (real == null) {
            try {
            	// 変更箇所
                real = (Printable)Class.forName(className).newInstance();
                real.setPrinterName(name);
            } catch (ClassNotFoundException e) {
                System.err.println("�N���X " + className + " ��������܂���B");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
