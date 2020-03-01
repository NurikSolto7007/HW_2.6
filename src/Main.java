public class Main {

    public static void main(String[] args) {
Cars <String, Integer, Integer >audi = new Cars ("Audi", 7, 2017);
Cars <String, Integer, Integer >mers = new Cars("Mers",124,1996);
getInfo(audi);
getInfo(mers);
    }
    public static void getInfo(Cars<String, Integer,Integer>a){
        System.out.println("Характеристики:");
        a.print();

    }
}
