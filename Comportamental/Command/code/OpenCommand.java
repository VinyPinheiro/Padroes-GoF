
public class OpenCommand implements Command {
	private String path;

	public OpenCommand(String path) {
		this.setPath(path);
	}

	public void execute() {
		System.out.println("O arquivo '" + this.getPath() + "' foi aberto");
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
