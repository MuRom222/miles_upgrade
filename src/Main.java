public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 450;
        int miles = service.calculate(price);
        System.out.println(" Ваших бонусных миль = " + miles);
    }
}
