package src.app;

import java.util.Scanner;
import src.entidade.Jogador;
import src.servico.Jogo;


public class Executavel {
    public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     
     System.out.println("DIGITE SEU NOME: ");
     String nome = input.next();

     Jogador jogador = new Jogador(nome);
     Jogo jogo = new Jogo(jogador);
     jogo.inicializa();

    
    }
}