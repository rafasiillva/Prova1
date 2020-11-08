public class App {
    public static void main(String[] args) throws Exception {
        Jogo joguinho = new Jogo("Luta", "Street Fighter V", "Modo Hard");
        joguinho.status();   
        
        
        Jogador player = new Jogador(24 , "Rafael Henrique", "Brasileiro");
        player.status();
        
        
        Campeonato disputa = new Campeonato(5, 56, 2);
        disputa.status();
   
    }
}