/** Operadores de Incremento

Os operadores de incremento são responsáveis pelo acréscimo de uma unidade ao valor da variável. Assim, sendo unário, será um operador que não necessitará do uso de outra variável na execução do seu processo.

**/
public class incremento {
	//Método principal da classe
	public static void main (String [] args) {
		
		int x = 8;
		int y = ++x;//pré-incremento
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}//fim do método
}//fim da classe

/**
Um código PRÉ-INCREMENTO, é quando o operador de incremento ainda não foi aplicado.
Com a inserção do operador de incremento(PÓS-INCREMENTO) o códio ficará assim:

		int x = 8;
		int y = x++;//pós-incremento
		
	Então para executar códigos temos duas opções:
	
		PRÉ-INCREMENTO = --x
		PÓS-INCREMENTO = x++
**/