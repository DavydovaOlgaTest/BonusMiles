public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        System.out.println();
        System.out.println("price 1000");
        System.out.println(service.calculate(1000));

        System.out.println();
        System.out.println("price 1030");
        System.out.println(service.calculate(1030));
    }
}
