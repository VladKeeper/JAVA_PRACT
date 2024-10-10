import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        double rub, yuan, ost;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите нужное число юаней: ");
        yuan=input.nextDouble();
        ost = yuan % 10;
        System.out.print("Число рублей за " + yuan);
        if (ost == 1)
            System.out.print(" юань: ");
        else if (ost > 1 && ost < 5)
            System.out.print(" юаня: ");
        else
            System.out.print(" юаней: ");
        rub=ROUBLES_PER_YUAN*yuan;
        System.out.print(rub);}
}
