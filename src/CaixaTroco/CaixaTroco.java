package CaixaTroco;

import java.util.Scanner;

public class CaixaTroco {

	public static void main(String[] args) {

		Scanner recebe_valor = new Scanner(System.in);
		Scanner recebe_pagamento = new Scanner(System.in);

		boolean faltaDinheiro = true;
		while (faltaDinheiro) {

			System.out.println("Digite o valor do produto");
			double valor_produto = recebe_valor.nextInt();

			System.out.println("Digite o valor de pagamento");
			double pagamento_produto = recebe_pagamento.nextInt();

			double troco;
			troco = pagamento_produto - valor_produto;

			if (pagamento_produto < valor_produto) {
				System.out.println("Valor insuficiente");
			} else if (pagamento_produto == valor_produto) {
				System.out.println("Não há Troco");
				faltaDinheiro = false;
			} else {
				System.out.println("Troco:" + troco);
				faltaDinheiro = false;
			}
		}
	}
}