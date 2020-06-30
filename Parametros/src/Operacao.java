
public class Operacao {
	
	void trocar (int n) {
		n = 20;
	}
	
	void alterarValor(Valor valor) {  //copia por referencia
		valor = new Valor();
		valor.v = 20;
	}
}
