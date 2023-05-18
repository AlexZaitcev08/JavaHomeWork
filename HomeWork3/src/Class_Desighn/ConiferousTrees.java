package Class_Desighn;

import java.util.Objects;

public class ConiferousTrees extends DeciduousTrees implements changeQuantity{
    private String name;

    private int amount;

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
        if (amount>=0) {
            this.amount = amount;
        }
    }
    public ConiferousTrees() {
        super("black","black");
        this.name = null;
        this.amount = 0;
    }


    public ConiferousTrees(String name, int amount, String leafColor, String barkColor) {
        super(leafColor, barkColor);
        this.name = name;
        this.amount = amount;
    }

    public double getHeight() {
        return 0;
    }
    public double getWidth() {
        return 0;
    }

    @Override
    public void quantity(boolean increase, int multiplayer) {
        if (increase){
            amount = amount * multiplayer;
        }
        else {
            amount = amount / multiplayer;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConiferousTrees that = (ConiferousTrees) o;
        return amount == that.amount && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return amount*8;
    }
    @Override
    public String toString(){
        return getClass() + "\nname: " + name + "\namount: " + amount + "\nleafColor: " + leafColor + "\nbarkColor: " + barkColor;

    }

}