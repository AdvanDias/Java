package javapacote;

import java.util.Scanner;

public class TesteJogodavelha {

	public static void main(String[] args) {
		
		Vetorjogovelha c = new Vetorjogovelha();
		/* comentário */
		System.out.println("JOGO DA VELHA");
		System.out.println("ESCOLHA 'X' OU 'O'");
		Scanner escolha = new Scanner(System.in);
		String play1 = escolha.nextLine().toUpperCase();
		String play2;
		if(play1.equals("X")) {
		   play2 = "O";	
		}else {
			play2 ="X";
		}
		c.x1 = play1;
		System.out.println("VOCÊ É O PLAYER1 '"+play1+"'  E O PLAYER2 É '"+play2+"'");
		c.mostrar();
		System.out.println("ESCOLHA A COLUNA E A LINHA ONDE IRÁ MARCAR");
		while(play1.equals("X")||play2.equals("X")) {
			System.out.println("play1: "+play1+" | play2: "+play2+"");
			c.colocar();
			c.mostrar();
			String verif = c.x1;
			int verif2 = c.x2;
			if(verif.equals("ok")) {
				play1 = verif;
				play2 = verif;
			}else if(verif2 == 10) {
				play1 = "Ok";
				play2 = "Ok";
				System.out.println("***--------EMPATE-------***");
			}
			
			
		}
		
		
		System.out.println("FIM DO JOGO");
		
	}

}
