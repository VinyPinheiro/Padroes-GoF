
public class Main {

	public static void main(String[] args) {
		
		// Criar as instancias de comandos do menu
		OpenCommand open = new OpenCommand("/abrir/arquivo.pdf");
		SaveCommand save = new SaveCommand("/salvar/arquivo.pdf");
		CloseCommand close = new CloseCommand();
		CloseAndSaveCommands saveClose = new CloseAndSaveCommands("/salvar_fechar/arquivo.pdf");
		
		// Criar os itens do Menu
		Item openItem = new Item("Abrir Arquivo", open);
		Item saveItem = new Item("Salvar", save);
		Item saveCloseItem = new Item("Salvar e Sair", saveClose);
		Item closeItem = new Item("Sair", close);

		// Executa o command
		openItem.clicked();
		saveItem.clicked();
		closeItem.clicked();
		saveCloseItem.clicked();
	}

}
