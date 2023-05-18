package Class_Desighn;

public abstract class DeciduousTrees {
    String name;
    int amount;

    String leafColor;
    String barkColor;
    public DeciduousTrees(String leafColor,String barkColor){
        this.leafColor=leafColor;
        this.barkColor=barkColor;
    }

    public abstract double getHeight();
    public abstract double getWidth();

    public abstract void quantity(boolean increase, int multiplayer);
}