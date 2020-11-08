public class Jogo {
    private String estiloDeJogo;
    private String nome;
    private String dificuldade;
    private boolean jogar;    
    
    public Jogo(String t, String n, String d){
        this.estiloDeJogo = t;
        this.nome = n;
        this.dificuldade = d;
        this.jogar = false;
    }
    
    public void setEstiloDeJogo(String t) {
        this.estiloDeJogo = t;
    }
   
    public String getEstiloDeJogo() {
        return estiloDeJogo;
    }

   
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setDificuldade(String d) {
        this.dificuldade = d;
    } 

    public String getDificuldade() {
        return dificuldade;
    }
    
    public void iniciando(){
        this.jogar = false;
    }  
    
    public void status(){
    System.out.println("SOBRE O JOGO ESCOLHIDO " );
    System.out.println("Estilo do jogo:" + this.getEstiloDeJogo());
    System.out.println("Nome do jogo:" + this.getNome());
    System.out.println("Dificuldade escolhida: " + this.getDificuldade()); 
    
    if(this.jogar = true){
        System.out.println("Sua partida iniciou!!");
    } else {
        System.out.println("Nao iniciou");
    }
    
    System.out.println();       
    }


}