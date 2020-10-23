package CaixaTroco;

public class Main {

	public static void main(String[] args) {
		Caixa_Troco caixaLeite = new Caixa_Troco();

		caixaLeite.ReceberProduto();

		do {
			caixaLeite.ReceberPagamento();

			if (caixaLeite.ValorPago == 0) {
				System.out.println("Aplicação encerrada");
				break;
			}

			if (caixaLeite.ValorPago < caixaLeite.ValorProduto)
				System.out.println("Valor insuficiente, tente novamente");
			else
				caixaLeite.Calcular();

		} while (caixaLeite.ValorPago != 0);
	}
}
