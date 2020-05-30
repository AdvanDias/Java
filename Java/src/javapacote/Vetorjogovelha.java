package javapacote;

import java.util.Scanner;

public class Vetorjogovelha {
	public String n3[] = {" "," "," "," "," "," "," "," "," "};
	Scanner teclado = new Scanner(System.in);
	Scanner teclado2 = new Scanner(System.in);
	Scanner teclado3 = new Scanner(System.in);
	public String x1;
	public int x2;
	public int linha;
	public int coluna;
	public int num1 = 0;
	public String ok;
	

	
	public void colocar () {
		System.out.print("COLUNA: ");
		coluna = teclado2.nextInt();
		System.out.print("LINHA: ");
		linha = teclado3.nextInt();

		if(linha == 1 && coluna == 1) {
			  if(n3[0].equals("X") || n3[0].equals("O")) {
				System.out.println("está opção já está preenchida");  
			  }else {
				n3[0] = x1;
				if(x1.equals("X")) {
					x1 = "O";
				}else {
					x1 = "X";
				}
			  }	
		}else if(linha == 1 && coluna == 2) {
			 if(n3[1].equals("X") || n3[1].equals("O")) {
					System.out.println("está opção já está preenchida");  
				  }else {
					n3[1] = x1;
					if(x1.equals("X")) {
						x1 = "O";
					}else {
						x1 = "X";
					}
				  }	
		}else if(linha == 1 && coluna == 3) {
			 if(n3[2].equals("X") || n3[2].equals("O")) {
					System.out.println("está opção já está preenchida");  
				  }else {
					n3[2] = x1;
					if(x1.equals("X")) {
						x1 = "O";
					}else {
						x1 = "X";
					}
				  }	
		}else if(linha == 2 && coluna == 1) {
			 if(n3[3].equals("X") || n3[3].equals("O")) {
					System.out.println("está opção já está preenchida");  
				  }else {
					n3[3] = x1;
					if(x1.equals("X")) {
						x1 = "O";
					}else {
						x1 = "X";
					}
				  }	
		
	   }else if(linha == 2 && coluna == 2) {
			 if(n3[4].equals("X") || n3[4].equals("O")) {
					System.out.println("está opção já está preenchida");  
				  }else {
					n3[4] = x1;
					if(x1.equals("X")) {
						x1 = "O";
					}else {
						x1 = "X";
					}
				  }	
		
	   }else if(linha == 2 && coluna == 3) {
			 if(n3[5].equals("X") || n3[5].equals("O")) {
					System.out.println("está opção já está preenchida");  
				  }else {
					n3[5] = x1;
					if(x1.equals("X")) {
						x1 = "O";
					}else {
						x1 = "X";
					}
				  }	
		
	   }else if(linha == 3 && coluna == 1) {
			 if(n3[6].equals("X") || n3[6].equals("O")) {
					System.out.println("está opção já está preenchida");  
				  }else {
					n3[6] = x1;
					if(x1.equals("X")) {
						x1 = "O";
					}else {
						x1 = "X";
					}
				  }	
		
	   }else if(linha == 3 && coluna == 2) {
			 if(n3[7].equals("X") || n3[7].equals("O")) {
					System.out.println("está opção já está preenchida");  
				  }else {
					n3[7] = x1;
					if(x1.equals("X")) {
						x1 = "O";
					}else {
						x1 = "X";
					}
				  }	
		
	   }else if(linha == 3 && coluna == 3) {
			 if(n3[8].equals("X") || n3[8].equals("O")) {
					System.out.println("está opção já está preenchida");  
				  }else {
					n3[8] = x1;
					if(x1.equals("X")) {
						x1 = "O";
					}else {
						x1 = "X";
					}
				  }	
		
	   }
		
		
	}
	
	
	 public void mostrar() {	
			System.out.println("      1     2     3");
			System.out.print("  1-");
		for (int a=0; a < n3.length; a++) {
			
			System.out.print("|_"+n3[a]+"_| ");
			
			if(a == 2) {
				
				System.out.println(" ");
				System.out.print("  2-");
			}
			
			if(a == 5) {
				System.out.println(" ");
				System.out.print("  3-");
			}
			
			
			
		}
		
		System.out.println(" ");
		if(n3[0].equals("X")&&n3[1].equals("X")&&n3[2].equals("X")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[0].equals("O")&&n3[1].equals("O")&&n3[2].equals("O")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[3].equals("X")&&n3[4].equals("X")&&n3[5].equals("X")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[3].equals("O")&&n3[4].equals("O")&&n3[5].equals("O")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[6].equals("X")&&n3[7].equals("X")&&n3[8].equals("X")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[6].equals("O")&&n3[7].equals("O")&&n3[8].equals("O")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[0].equals("X")&&n3[3].equals("X")&&n3[6].equals("X")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[0].equals("O")&&n3[3].equals("O")&&n3[6].equals("O")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[1].equals("X")&&n3[4].equals("X")&&n3[7].equals("X")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[1].equals("O")&&n3[4].equals("O")&&n3[7].equals("O")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[2].equals("X")&&n3[5].equals("X")&&n3[8].equals("X")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[2].equals("O")&&n3[5].equals("O")&&n3[8].equals("O")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[0].equals("X")&&n3[4].equals("X")&&n3[8].equals("X")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[0].equals("O")&&n3[4].equals("O")&&n3[8].equals("O")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[2].equals("X")&&n3[4].equals("X")&&n3[6].equals("X")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}else if(n3[2].equals("O")&&n3[4].equals("O")&&n3[6].equals("O")) {
			System.out.println("Parabéns Você ganhou!");
			 x1 = "ok";
		}
			
		x2++;
		
		
		System.out.println(" ");
		
	  }
	 /*lembrar de subir para o git e melhorar esse codigo rabujo*/
	
}
