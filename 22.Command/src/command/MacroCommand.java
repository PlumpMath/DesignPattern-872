package command;

import java.util.Iterator;
import java.util.Stack;
//複数の命令をまとめた命令
public class MacroCommand implements Command {
	//命令の集合
	private Stack commands = new Stack();

	//実行
	public void execute() {
		//ループ全ての命令を実行
		Iterator it = commands.iterator();
		while (it.hasNext()) {
			((Command) it.next()).execute();
		}
	}

	//命令追加
	public void append(Command cmd) {
		if (cmd != this) {
			commands.push(cmd);
		}
	}

	//最後の命令削除
	public void undo() {
		if (!commands.empty()) {
			commands.pop();
		}
	}

	//命令クリア
	public void clear() {
		commands.clear();
	}
}
