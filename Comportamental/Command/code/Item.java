
public class Item {
	private String text;
	private Command command;

	public Item(String text, Command command) {
		this.setText(text);
		this.setCommand(command);
	}
	

	public void clicked(){
		command.execute();
	}
	
	
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	

}
