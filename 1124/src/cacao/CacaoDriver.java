package cacao;

public class CacaoDriver {

	public static void main(String[] args) {
		CacaoServer cacaoServer = new CacaoServer();
		CacaoApp cacaoApp1 = new CacaoApp(cacaoServer,"server1");
		CacaoApp cacaoApp2 = new CacaoApp(cacaoServer,"server22");
		CacaoApp cacaoApp3 = new CacaoApp(cacaoServer,"server333");
		CacaoApp cacaoApp4 = new CacaoApp(cacaoServer,"server4444");

	}

}
