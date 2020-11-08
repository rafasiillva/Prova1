public class Campeonato {
    private int adversarios;
    private int pontos;
    private int classificacao;
    private double pont;
    

    
    public Campeonato(int q, int p, int n){
        this.adversarios = q;
        this.pontos = p;
        this.classificacao = n;
        this.pont = 10;
    }
    
    public void setQtdAdversarios(int q) {
        this.adversarios = q;
    }
    
    public int getQtdAdversarios() {
        return adversarios;
    }

   
    public void setPontuacao(int p) {
        this.pontos = p;
    } 

    public int getPontuacao() {
        return pontos;
    }

    
    public void setClassificacao(int n) {
        this.classificacao = n;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void partida (){
        System.out.print("Voce ganhou o campeonato e conquistou: ");
        ganhar();
        
    }

    private void ganhar(){
        System.out.println(56 + pont + " pontos");
    }


    public void status(){
        System.out.println("SOBRE O CAMPEONATO");
        System.out.println("Quantidade de adversarios: " + getQtdAdversarios());
        System.out.println("Sua pontuação atual: " + getPontuacao());
        System.out.println("Sua classificação: " + getClassificacao());
        System.out.println("Sua classificação: ");
        partida();

        System.out.println();
    }

}
