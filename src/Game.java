public class Game {
    public static char[][] maleruudustik;

    public Game() {
        maleruudustik = new char[8][8];
    }
    public static void clearTile(int x, int y){
        maleruudustik[x][y] = ' ';
    }

    public static void main(String[] args) {
        Game male = new Game();

    }
}
