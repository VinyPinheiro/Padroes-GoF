
public class SaveCommand  implements Command {
	private String path;

	public SaveCommand(String path) {
		this.setPath(path);
	}

	public void execute() {
		System.out.println("O arquivo foi salvo no caminho: " + this.getPath());
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}