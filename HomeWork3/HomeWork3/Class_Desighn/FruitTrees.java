package Class_Desighn;

import java.util.Objects;

public class FruitTrees extends DeciduousTrees {
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
    public FruitTrees() {
        super("black","black");
        this.name = null;
        this.amount = 0;
    }


    public FruitTrees(String name, int amount, String leafColor, String barkColor) {
        super(leafColor,barkColor);
        this.name = name;
        this.amount = amount;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public void quantity(boolean increase, int multiplayer) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitTrees that = (FruitTrees) o;
        return amount == that.amount && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        return getClass() + "\nname: " + name + "\namount: " + amount + "\nleafColor: " + leafColor + "\nbarkColor: " + barkColor;
    }
}
