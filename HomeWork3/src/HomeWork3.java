import Class_Desighn.ConiferousTrees;
import Class_Desighn.FruitTrees;
public class HomeWork3 {
    public static void main (String [] args) {
        //        Здесь будем смотреть как взаимодействуют классы
        ConiferousTrees myConiferousTrees = new ConiferousTrees("pine",45,"dark_green", "brown");
        FruitTrees myFruitTrees = new FruitTrees("appleTree",3200,"dark_green","light_brown");
        System.out.println(myConiferousTrees);
        System.out.println("_______________");
        System.out.println(myFruitTrees);

    }
}