import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество спагетти в граммах:");
        int spaghettiGrams = scanner.nextInt();
        System.out.println("Введите количество томатного соуса в граммах:");
        int sauceGrams = scanner.nextInt();
        System.out.println("Введите количество мясного фарша в граммах:");
        int meatGrams = scanner.nextInt();
        System.out.println("Введите количество лука в граммах:");
        int onionGrams = scanner.nextInt();
        System.out.println("Введите количество чеснока в граммах:");
        int garlicGrams = scanner.nextInt();

        String recipe = createRecipe(spaghettiGrams, sauceGrams, meatGrams, onionGrams, garlicGrams);
        System.out.println(recipe);

        writeToFile(recipe);
    }

    private static String createRecipe(int spaghettiGrams, int sauceGrams, int meatGrams, int onionGrams, int garlicGrams) {
        return "Рецепт спагетти с томатным соусом:\n" +
                "1) Вскипятите воду и добавьте " + spaghettiGrams + " грамм спагетти, варите до готовности.\n" +
                "2) На сковороде обжарьте " + meatGrams + " грамм мясного фарша до готовности.\n" +
                "3) Добавьте " + onionGrams + " грамм нарезанного лука и " + garlicGrams + " грамм чеснока, жарьте до золотистого цвета.\n" +
                "4) Влейте " + sauceGrams + " грамм томатного соуса и тушите на медленном огне 10 минут.\n" +
                "5) Смешайте соус с готовыми спагетти и подавайте к столу.";
    }
    private static void writeToFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("recipe.txt"))) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи файла: " + e.getMessage());
        }
    }
}