public abstract class Nupp {
    private int reaAsukoht;
    private int veeruAsukoht;
    public abstract void liigu(int r, int v);

    public void hävine(){
        Game.clearTile(reaAsukoht,veeruAsukoht);
    }

}
