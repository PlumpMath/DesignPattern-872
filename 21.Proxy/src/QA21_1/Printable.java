package QA21_1;

public interface Printable {
    public abstract void setPrinterName(String name);   // ���O�̐ݒ�
    public abstract String getPrinterName();            // ���O�̎擾
    public abstract void print(String string);          // ������\��(�v�����g�A�E�g)
}
