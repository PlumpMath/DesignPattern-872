import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import command.Command;
import command.MacroCommand;
import drawer.ColorCommand;
import drawer.DrawCanvas;
import drawer.DrawCommand;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
	// 描画履歴
	private MacroCommand history = new MacroCommand();
	// 画紙
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	// クリアボタン
	private JButton clearButton = new JButton("clear");
	// 色ボタン（問題22-1）
	private JButton greenButton = new JButton("green");
	private JButton redButton = new JButton("red");
	private JButton blackButton = new JButton("black");
	// 最後に描いた点を削除する（問題22-2）
	private JButton undoButton = new JButton("undo");

	// コンストラクタ
	public Main(String title) {
		super(title);

		//TODO　問題22-3
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e){
//				System.exit(0);
//			}
//		});
//		this.addMouseMotionListener(new MouseMotionAdapter() {
//			public void mouseDragged(MouseEvent e){
//				// 描く
//				Command cmd = new DrawCommand(canvas, e.getPoint());
//				// 履歴に命令を追加
//				history.append(cmd);
//				// 実行
//				cmd.execute();
//			}
//		});

		// Listener
		// Window
		this.addWindowListener(this);
		// Mouse
		canvas.addMouseMotionListener(this);
		// button
		clearButton.addActionListener(this);
		greenButton.addActionListener(this);
		redButton.addActionListener(this);
		blackButton.addActionListener(this);
		undoButton.addActionListener(this);
		// Pannel
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(greenButton);
		buttonBox.add(redButton);
		buttonBox.add(blackButton);
		buttonBox.add(undoButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		// 表示
		pack();
		show();
	}

	// 動作Listener用（ActionListener）
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			// クリアボタンの場合
			// 履歴クリア
			history.clear();
			// 画紙へ反映
			canvas.repaint();
		} else if (e.getSource() == undoButton) {
			// 最後に描いた点を削除する
			history.undo();
			// 画紙へ反映
			canvas.repaint();
		} else if(e.getSource() == greenButton){
			//TODO 色変更追加
			//色を変更
			Command cmd = new ColorCommand(canvas, Color.GREEN);
			// 履歴に命令を追加
			history.append(cmd);
			//実行
			cmd.execute();
		}else if(e.getSource() == redButton){
			//色を変更
			Command cmd = new ColorCommand(canvas, Color.RED);
			// 履歴に命令を追加
			history.append(cmd);
			//実行
			cmd.execute();
		}else if(e.getSource() == blackButton){
			//色を変更
			Command cmd = new ColorCommand(canvas, Color.BLACK);
			// 履歴に命令を追加
			history.append(cmd);
			//実行
			cmd.execute();
		}
	}

	// MouseEventListener用
	public void mouseMoved(MouseEvent e) {
	}

	// mouseDraggedListener用
	public void mouseDragged(MouseEvent e) {
		// 描く
		Command cmd = new DrawCommand(canvas, e.getPoint());
		// 履歴に命令を追加
		history.append(cmd);
		// 実行
		cmd.execute();
	}

	// ウインドを閉じる
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

	public static void main(String[] args) {
		new Main("Command Pattern Sample");
	}
}
