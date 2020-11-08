public class Jogador {
    private int idade;
    private String nome;
    private String nacionalidade;
    private boolean informacoes;

    public Jogador(int i, String n, String n1){
        this.idade = i;
        this.nome = n;
        this.nacionalidade = n1;
        this.informacoes = true;
    }
    
    
    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return idade;
    }

    
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }


    public void setNacionalidade(String n1) {
        this.nacionalidade = n1;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void pronto(){
        this.informacoes = true;
    }

    public void status(){
        System.out.println("INFORMAÇÕES SOBRE O JOGADOR");
        System.out.println("Idade do Jogador: " + getIdade());
        System.out.println("Nome do Jogador: " + getNome());
        System.out.println("Nacionalidade do Jogador: " + getNacionalidade());
        
        
        if(this.informacoes = true){
            System.out.println("O jogador já inseriu as informações necessarias, Bom jogo!");
        } else {
            System.out.println("Por favor, responda as informações necessarias !!");
        }

        System.out.println();
    }

}
