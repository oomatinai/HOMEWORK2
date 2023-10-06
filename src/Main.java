public class Main {

    public static void main(String[] args) {
        printВозраст(25, 15);   // Можно идти гулять
        printВозраст(18, 20);   // Можно идти гулять
        printВозраст(50, 5);    // Оставайтесь дома
        printВозраст(30, 35);   // Оставайтесь дома
        printВозраст(40, 18);   // Можно идти гулять
    }

    public static void printВозраст(int age, int temperature) {
        String result = "";

        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            result = "На улице классно,не просиживай попу дома и выйди погуять";
        } else {
            result = "На улице холодно,потом на следущий день будешь говорить,что у тебя температура. Нет сиди дома!";
        }

        System.out.println(result);
    }
}
