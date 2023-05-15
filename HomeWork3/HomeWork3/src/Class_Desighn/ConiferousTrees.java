package Class_Desighn;

public class ConiferousTrees extends DeciduousTrees{
    private String name;
    private int amount;
    private int a;
    private int b;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public ConiferousTrees(int a, int b, String name, int amount, String leafColor, String barkColor) {
        super(leafColor, barkColor);
        this.name = name;
        this.amount = amount;
        this.a = a;
        this.b = b;
    }

    public double getHeight() {
        return a;
    }
    public double getWidth() {
        return b;
    }
}
