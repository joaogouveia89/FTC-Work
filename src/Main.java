import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import estado.Estado;

public class Main {

	public static void main(String[] args) {
		String linha;
		ArrayList<Estado> estadosAfn = new ArrayList<Estado>();
		ArrayList<Estado> estadosAfd = new ArrayList<Estado>();
		String valoresTransicao[];
		Estado estadoAtual = null;
		boolean continua = true;
		
		/* lendo o arquivo de texto entrada.txt e mapeando seus dados no ArrayList
		que corresponde às transições do afn */
		
		try{
			FileReader arq = new FileReader("dados/entrada.txt");
			BufferedReader read = new BufferedReader(arq);
			
			linha = read.readLine();
			while(linha != null){
				valoresTransicao = linha.split(" ");
				
				estadosAfn.add(
						new Estado(
							valoresTransicao[0],
							valoresTransicao[1],
							valoresTransicao[2]
							)
						);
				linha = read.readLine();
			}
		read.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
		//arraylist do afn não pode estar vazio senão para a execução		
		if(!estadosAfn.isEmpty()){ 
			//execução do algorítimo
			//primeira linha é mantida
			estadosAfd.add(estadosAfn.get(0));
			
			while(continua){
				estadoAtual = estadosAfd.get(estadosAfd.size() - 1);
				for(Estado est : estadosAfd){
					if(!estadoAtual.getnome().equals(est.getTransicaoZero())){
						estadosAfd.add(
								new Estado(
										est.getTransicaoZero(),
										null,
										null)
								);
					}
					if(!estadoAtual.getnome().equals(est.getTransicaoUm())){
						estadosAfd.add(
								new Estado(
										est.getTransicaoUm(),
										null,
										null)
								);
					}
				}
			}
		}
	}

}
