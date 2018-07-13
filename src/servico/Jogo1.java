package src.servico;
import java.util.Scanner; 
import src.servico.Pontuacao; 

public class Jogo1 {
	
	public String[] pergunta = new String[7];
		

	public int[] resposta ={0,1,1,1,0,1,1};


	public void jogar(){
		pergunta[0] = "\t1. Ao andar na rua com uma garrafa d'água vazia, devemos joga-lá no chão quando não a quisermos mais.";
		pergunta[1] = "\t2. Em um dia ensolarado, devemos utilizar protetor solar em creme, pois os de aerosol preujudicam a atmosfera.";
		pergunta[2] = "\t3. Devo separar o lixo por categoria como papel,plastico,vidro, metal e orgânico.";
		pergunta[3] = "\t4. Andar de bicicleta melhora sua saúde, e ajuda na diminuição de  dióxido de carbono.";
		pergunta[4] = "\t5. No verão, quando estamos na praia, devemos jogar nossos lixos(garrafas, latinhas, papeis..) em qualquer lugar da praia.";
		pergunta[5] = "\t6. Algumas das consequências do agravamento do aquecimento global é a extinção de especies, mudança na fauna e na flora do mundo, aumento no nível do mar causado pelo derretimento das geleiras.";
		pergunta[6] = "\t7. Quando a temperatura ambiente é superior a 37 C, o corpo precisa dissipar calor, porém sua capacidade é reduzida, causando hiper aquecimento e quando o mecanismo de regulação térmica do organismo, transpiração, pode levar o ser humano a morte.";
		int score = 0 ;
	
	Scanner input = new Scanner(System.in);
			 for (int i = 0 ;i<pergunta.length;i++){
				System.out.println(pergunta[i]);
						try{
							int r = input.nextInt();

								if(r == 0 || r == 1){
									if ( r == resposta[i] ){
											score = score + 1;
											
									}else{
										score = score;
										
									}

								}else{
								System.out.println("\nSinto dizer que a resposta escolhida é invalida... tente novamente");
											}
							}catch(Exception ex){
								System.out.println("\nA resposta escolhida não existe...tente novamente");
							}finally{
								
							}

			 }
			
			 Pontuacao ponto = new Pontuacao(score);
			 ponto.total();
		


	}

}