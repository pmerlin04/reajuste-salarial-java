package comandoSwitchCase;

import java.util.Scanner;

public class G3 {

	public static void main(String[] args) {
		int codigo;
		double salAntigo, salNovo, reajuste = 0;
		
	Scanner sc=new Scanner (System.in);
	
	
	
	System.out.println("Digite o c�digo da fun��o");
	codigo = sc.nextInt();
	
	System.out.println("Digite o valor do sal�rio atual");
	salAntigo = sc.nextDouble();
	
	switch(codigo) {
	case 5: reajuste = (salAntigo * 0.05);
		break;
	case 15: reajuste = (salAntigo * 0.10);
		break;
	case 20: reajuste = (salAntigo * 0.15);
		break;
	case 25: reajuste = (salAntigo * 0.20);
		break;
	case 30: reajuste = (salAntigo * 0.25);
		break;
	case 35: reajuste = (salAntigo * 0.30);
		break;
	default: 
		System.out.println("C�digo inv�lido");
	}
	
	salNovo = (salAntigo + reajuste);
	
	System.out.println("O sal�rio antigo era de R$" + salAntigo + "\nReajuste R$ " + reajuste + "\nSal�rio novo R$ " + salNovo);
	
	

	}

}
