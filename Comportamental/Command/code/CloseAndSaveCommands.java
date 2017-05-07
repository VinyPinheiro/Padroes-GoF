
public class CloseAndSaveCommands implements Command {
	private String path;

	public CloseAndSaveCommands(String path) {
		this.setPath(path);
	}

	public void execute() {
		new SaveCommand(this.getPath()).execute();
		new CloseCommand().execute();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
