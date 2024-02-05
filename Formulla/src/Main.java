import java.util.Scanner;

// BMR = 447,6 + (9,2 x вес, кг) + (3,1 х рост, cм) – (4,3 х возраст, лет). - жен
// BMR = 88,36 + (13,4 x вес, кг) + (4,8 х рост, см) – (5,7 х возраст, лет) - муж

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вас приветсвует программа по расчету идеального веса!\n");
        System.out.print("------------------------------------------------------\n");
        System.out.print("Укажите ваш пол: \n  1. Мужчина\n  2. Женщина\n");
        int pol = sc.nextInt();
        if (pol == 1) {
            System.out.print("Введите ваш вес:\n");
            int vesm = sc.nextInt();
            System.out.print("Введите ваш рост (в метрах):\n");
            float rostm = sc.nextFloat();
            System.out.print("Введите ваш возраст:\n");
            int letm = sc.nextInt();
            System.out.print("Рассчитываем...\n");
            var imt = vesm / (rostm * rostm);
            var bmr = 88.36 + (13.4 * vesm) + (4.8 * rostm) - (5.7 * letm);
            var idealves = 24.9 * (rostm * rostm);
            System.out.print("ИМТ: " + imt + "\n");
            System.out.print("Идеальный вес: " + idealves + "\n");
            System.out.print("Дневная норма калорий: " + bmr + "\n");
            System.out.print("Выдать рекомендации?\n1. Да \n2. Нет\n");
            int i = sc.nextInt();
            if (i == 1){
                if (imt > 24.9) {
                    var poxyd = vesm - idealves;
                    System.out.print("Рекомендуется снизить вес для достижения идеального веса. Идеальный вес:" + " " + idealves + "\n" + "Необходимо сбросить:" + " " + poxyd + " кг" + "\n" + "Рекомендуемый дневной прием калорий:" + " " + bmr + "\n");
                }
                if (imt < 18.5){
                    var nabor = vesm + idealves;
                    System.out.print("Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес:" + " " + idealves + "\n" + "Необходимо набрать:" + " " + nabor + "кг\n" + "Рекомендуемый дневной прием калорий:" + " " + bmr);
                }
                if (imt > 18.5 && imt < 24.9){
                    System.out.print("Ваш вес находится в пределах нормы. Идеальный вес:" + " " + idealves + "\n" + "Рекомендуемый дневной прием калорий:" + " " + bmr);
                }
            }
            if (i == 2){
                System.out.print("Досвидания!");
            }
        }
        if (pol == 2) {
            System.out.print("Введите ваш вес:\n");
            int vessh = sc.nextInt();
            System.out.print("Введите ваш рост(в метрах):\n");
            float  rostsh = sc.nextFloat();
            System.out.print("Введите ваш возраст:\n");
            int letsh = sc.nextInt();
            System.out.print("Рассчитываем...\n");
            var imt = vessh / (rostsh * rostsh);
            var bmr = 447.6 + (9.2 * vessh) + (3.1 * rostsh) - (4.3 * letsh);
            var idealves = 24.9 * (rostsh * rostsh);
            System.out.print("ИМТ: " + imt + "\n");
            System.out.print("Идеальный вес: " + idealves + "\n");
            System.out.print("Дневная норма калорий: " + bmr + "\n");
            System.out.print("Выдать рекомендации?\n1. Да \n2. Нет\n");
            int i = sc.nextInt();
            if (i == 1){
                if (imt > 24.9) {
                    var poxyd = vessh - idealves;
                    System.out.print("Рекомендуется снизить вес для достижения идеального веса. Идеальный вес:" + " " + idealves + "\n" + "Необходимо сбросить:" + " " + poxyd + " кг" + "\n" + "Рекомендуемый дневной прием калорий:" + " " + bmr + "\n");
                }
                if (imt < 18.5){
                    var nabor = vessh + idealves;
                    System.out.print("Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес:" + " " + idealves + "\n" + "Необходимо набрать:" + " " + nabor + "кг\n" + "Рекомендуемый дневной прием калорий:" + " " + bmr);
                }
                if (imt > 18.5 && imt < 24.9){
                    System.out.print("Ваш вес находится в пределах нормы. Идеальный вес:" + " " + idealves + "\n" + "Рекомендуемый дневной прием калорий:" + " " + bmr);
                }
            }
            if (i == 2){
                System.out.print("Досвидания!");
            }
        }
    }
}
