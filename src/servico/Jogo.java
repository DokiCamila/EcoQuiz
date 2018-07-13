package src.servico;
import java.util.Scanner;
import src.entidade.Jogador;
import src.servico.Jogo1;


public class  Jogo{
	private int tipoJogo;
	private Jogador nome;

		public Jogo(int tipoJogo){
			this.tipoJogo= tipoJogo;
		}
		public Jogo(Jogador nome){
			this.nome= nome;
		}

	public int getTipoJogo(){
		return tipoJogo;
	}

	public void setTipoJogo(){
		this.tipoJogo = tipoJogo;

	}

	public Jogador getNome(){
		return nome;

	}

	public void setNome(){
		this.nome = nome;
	}

	public  void inicializa(){
		Scanner input = new Scanner(System.in);
		System.out.println("-----BEM VINDO AO NOSSO MUNDO " + nome + "-----");
		System.out.println(" O que deseja fazer hoje ??");
		System.out.println("\t 1- Salvar o mundo? \n\t 2-Conhecer mais sobre o Aquecimento Global? ");
				int opcao=0;
			try{
				opcao = input.nextInt();
				if(opcao == 1 || opcao == 2){
				System.out.println("Sua escolha foi : " + opcao);
				}else{
				System.out.println("Sinto dizer que a opcao escolhida é invalida... tente novamente");
							}
			}catch(Exception ex){
				System.out.println("A opcao escolhida não existe...tente novamente");
			}finally{

				if(opcao == 1){
					System.out.println("Vamos jogar... mas antes algumas regras!\n\t REGRAS: \n\t - Serão feitas algumas afirmativas responda com 0 para falso e 1 para verdadeiro.\n\t - Serão apenas 0 ou 1.");
					System.out.println("------BOA SORTE------");
					Jogo1 play = new Jogo1();
					play.jogar();
				}else {

				}

			}
	}
	

}