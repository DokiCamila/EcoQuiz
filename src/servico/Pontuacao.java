package src.servico; 

public class Pontuacao {
	
	private int pontos;

	public Pontuacao(int pontos){
		this.pontos = pontos;
	}

	public int getpontos(){
		return pontos;
	}

	public void setpontos(){
		this.pontos = pontos;
	}

	public void  total(){
		System.out.println("Sua pontuação foi de : "  + pontos);

		if(pontos < 3 ){
			System.out.println("Você destruiu o mundo!");
		}else if(pontos <= 6  ||  pontos >= 3){
				System.out.println("Você quase destriu o MUNDO!");

		}else if(pontos == 7 || pontos == 8 ){
				System.out.println("Você está quase salvando o mundo!");

		}else {
				System.out.println("VOCË SALVOU O MUNDO! PARABÉNS!!!");
		}

	}


}
