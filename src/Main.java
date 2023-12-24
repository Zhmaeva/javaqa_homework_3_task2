public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double index = bmi.calculate(1.87, 98);

        System.out.println("Индекс массы тела = " + (int)index);

        if (index <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        }
        if (index > 16 && index  <= 18.5) {
            System.out.println("Недостаточная масса тела (дефицит)");
        }
        if (index > 18.5 && index <= 25) {
            System.out.println("Норма");
        }
        if (index > 25 && index <= 30) {
            System.out.println("Избыточная масса тела (состояние, предшествующее ожирению)");
        }
        if (index > 30 && index <= 35) {
            System.out.println("Ожирение 1-й степени");
        }
        if (index > 35 && index <= 40) {
            System.out.println("Ожирение 2-й степени");
        }
        if (index > 40) {
            System.out.println("Ожирение 3-й степени");
        }

    }
}