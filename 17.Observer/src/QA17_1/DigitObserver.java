package QA17_1;
//観察した数を「数字」で表示する
public class DigitObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        //表示様子をよく見れるため、スピードを遅く
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
