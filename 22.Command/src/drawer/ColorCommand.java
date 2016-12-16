package drawer;

import java.awt.Color;

import command.Command;

public class ColorCommand implements Command {

	protected Drawable drawable;
	//描画色
	private Color color;

	//コンストラクタ
	public ColorCommand(Drawable drawable, Color color) {
		this.drawable = drawable;
		this.color = color;
	}

	//実行
	public void execute() {
		drawable.setColor(color);
	}
}
