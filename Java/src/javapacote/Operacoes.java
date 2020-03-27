package javapacote;

public class Operacoes {
public	int entre1 = 0;
public	int entre2 = 0;

	public int Ope(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10,int z, String d) {
		if(d.equals("+") || d.equals("-")|| d.equals("/")|| d.equals("* ")) {
			System.out.println("CAIU NO D: "+d);
			if(z == 1) {
				int entre1 = a1;
				return entre1;
			}else if(z == 10) {
				int entre1 = a1*z+a2;
				return entre1;
			}else if(z == 100) {
				int entre1 = (a1*z)+(10*a2)+a3;
				return entre1;
			}else if(z == 1000) {
				int entre1 = (a1*z)+(100*a2)+(a3*10)+a4;
				return entre1;
			}else if(z == 10000) {
				int entre1 = (a1*z)+(1000*a2)+(a3*100)+(10*a4)+a5;
				return entre1;
			}else if(z == 100000) {
				int entre1 = (a1*z)+(10000*a2)+(a3*1000)+(100*a4)+(10*a5)+a6;
				return entre1;
			}else if(z == 1000000) {
				int entre1 = (a1*z)+(100000*a2)+(a3*10000)+(1000*a4)+(100*a5)+(10*a6)+a7;
				return entre1;
			}else if(z == 10000000) {
				int entre1 = (a1*z)+(1000000*a2)+(a3*100000)+(10000*a4)+(1000*a5)+(100*a6)+(10*a7)+a8;
				return entre1;
			}else if(z == 100000000) {
				int entre1 = (a1*z)+(10000000*a2)+(a3*1000000)+(100000*a4)+(10000*a5)+(1000*a6)+(100*a7)+(10*a8)+a9;
				return entre1;
			}else if(z == 1000000000) {
				int entre1 = (a1*z)+(100000000*a2)+(a3*10000000)+(1000000*a4)+(100000*a5)+(10000*a6)+(1000*a7)+(100*a8)+(10*a9)+a10;
				return entre1;
			}
			    
			
		}else {
			if(z == 1) {
				int entre2 = a1;
				return entre2;
			}else if(z == 10) {
				int entre2 = a1*z+a2;
				return entre2;
			}else if(z == 100f) {
				int entre2 = (a1*z)+(10*a2)+a3;
				return entre2;
			}else if(z == 1000) {
				int entre2 = (a1*z)+(100*a2)+(a3*10)+a4;
				return entre2;
			}else if(z == 10000) {
				int entre2 = (a1*z)+(1000*a2)+(a3*100)+(10*a4)+a5;
				return entre2;
			}else if(z == 100000) {
				int entre2 = (a1*z)+(10000*a2)+(a3*1000)+(100*a4)+(10*a5)+a6;
				return entre2;
			}else if(z == 1000000) {
				int entre2 = (a1*z)+(100000*a2)+(a3*10000)+(1000*a4)+(100*a5)+(10*a6)+a7;
				return entre2;
			}else if(z == 10000000) {
				int entre2 = (a1*z)+(1000000*a2)+(a3*100000)+(10000*a4)+(1000*a5)+(100*a6)+(10*a7)+a8;
				return entre2;
			}else if(z == 100000000) {
				int entre2 = (a1*z)+(10000000*a2)+(a3*1000000)+(100000*a4)+(10000*a5)+(1000*a6)+(100*a7)+(10*a8)+a9;
				return entre2;
			}else if(z == 1000000000) {
				int entre2 = (a1*z)+(100000000*a2)+(a3*10000000)+(1000000*a4)+(100000*a5)+(10000*a6)+(1000*a7)+(100*a8)+(10*a9)+a10;
				return entre2;
			}
			
			
		}
		return entre2;

	}
	
	
	
	
}
