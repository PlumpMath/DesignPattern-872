package drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {
	// 描画色
	private Color color = Color.BLACK;
	// 描画点の半径
	private int radius = 6;
	// 履歴
	private MacroCommand history;

	// コンストラクタ
	public DrawCanvas(int width, int height, MacroCommand history) {
		// 画紙サイズ設定
		setSize(width, height);
		// 背景色
		setBackground(Color.white);
		// 履歴
		this.history = history;
	}

	// 履歴全体を再描画
	public void paint(Graphics g) {
		history.execute();
	}

	// 描画
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
