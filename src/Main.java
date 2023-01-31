public class Main {
    public static void main(String[] args) {
 /*Auto car1 = new Auto(); 1 задача - создание объекта без конструктора
car1.brand = "Lada";
car1.country = "Russia";
car1.model = "Granta";
car1.engineVolume = 1.7;
car1.year = 2015;
car1.color = "yellow";
        System.out.println(car1.toString());*/

        // 2-3 задача - создание объектов с конструктором и условиями
        Auto car1 = new Auto(null, "Granta", "желтый ", "Russia", 2015, 1.7);
        Auto car2= new Auto("Audi", "A8 L TDI quattro", "черный ", "Deutschland", 2020,3.0);
        Auto car3 = new Auto("",null,"черный", "",0, 0); //тест конструкторов на условия
        Auto car4 = new Auto("Kia", "Sportage 4-го поколения", "красный", "Южная Корея", 2018, 2.4);
        Auto car5 = new Auto("Hyundai", "Avant", "оранжевый", "Южная Корея", 2016,1.6);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}