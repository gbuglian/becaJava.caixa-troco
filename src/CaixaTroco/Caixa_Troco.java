package CaixaTroco;

import java.util.Scanner;

public class Caixa_Troco {
	public int ValorProduto;
	public int ValorPago;
	public int Troco;

	public void ReceberProduto() {
		Scanner receberValor = new Scanner(System.in);
		System.out.println("Digite o Valor do produto");
		this.ValorProduto = receberValor.nextInt();
	}

	public void ReceberPagamento() {
		Scanner recebePagamento = new Scanner(System.in);
		System.out.println("Digite o valor pago");
		this.ValorPago = recebePagamento.nextInt();
	}

	public void Calcular() {
		Troco = ValorPago - ValorProduto;

		if (ValorPago > ValorProduto) {
			System.out.println("Troco a ser recebido: " + Troco);
		} else {
			System.out.println("Não há troco a ser recebido");
		}
	}
}
