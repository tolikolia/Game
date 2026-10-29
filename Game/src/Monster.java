import java.util.Random;
import java.util.Scanner;

public class Monster {
    private String image = "\uD83E\uDDDF";
    private final int x, y;

    Monster(int sizeBoard) {
        Random random = new Random();
        x = 1 + random.nextInt(sizeBoard);
        y = 1 + random.nextInt(sizeBoard - 1);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean conflictPerson(int personX, int personY) {
        return personX == x && personY == y;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        switch (difficultGame){
            case 1:
                int a = random.nextInt(200);
                int b = random.nextInt(200);
                int c = random.nextInt(200);

                int z = random.nextInt(2);
                if (z == 0){
                    int trueAnswer = a + b - c;
                    System.out.println("Реши пример: " + a + " + " + b + " - " + c +" = ?");
                    int answer = scanner.nextInt();

                    if (trueAnswer == answer) {
                        System.out.println("Верно! Ты победил монстра");
                        return true;
                    } else {
                        System.out.println("Ты проиграл эту битву!");
                        return false;
                    }
                }
                else{
                    int trueAnswer = a - b + c;
                    System.out.println("Реши пример: " + a + " - " + b + " + " + c +" = ?");
                    int answer = scanner.nextInt();

                    if (trueAnswer == answer) {
                        System.out.println("Верно! Ты победил монстра");
                        return true;
                    } else {
                        System.out.println("Ты проиграл эту битву!");
                        return false;
                    }
                }
            case 2:
                int a1 = random.nextInt(50);
                int b1 = random.nextInt(20);

                int trueAnswer = a1 * b1;
                System.out.println("Реши пример: " + a1 + " * " + b1 +" = ?");
                int answer = scanner.nextInt();

                if (trueAnswer == answer) {
                    System.out.println("Верно! Ты победил монстра");
                    return true;
                } else {
                    System.out.println("Ты проиграл эту битву!");
                    return false;
                }
            case 3:
                int a2 = random.nextInt(50);
                int b2 = random.nextInt(5);

                int trueAnswer1 = 1;
                for(int i = 0; i < b2; ++i)
                    trueAnswer1 *= a2;
                System.out.println("Реши пример: " + a2 + " ** " + b2 +" = ? / ** - это степень");
                int answer1 = scanner.nextInt();

                if (trueAnswer1 == answer1) {
                    System.out.println("Верно! Ты победил монстра");
                    return true;
                } else {
                    System.out.println("Ты проиграл эту битву!");
                    return false;
                }
            case 4:
                int a3 = random.nextInt(100);
                int b3 = random.nextInt(100);
                int c3 = random.nextInt(100);
                int d3 = random.nextInt(100);

                int trueAnswer3 = a3 * b3 - c3 * d3;
                System.out.println("Реши пример: " + a3 + " * " + b3 + " - " + c3 + " * " + d3 + " = ?");
                int answer3 = scanner.nextInt();

                if (trueAnswer3 == answer3) {
                    System.out.println("Верно! Ты победил монстра");
                    return true;
                } else {
                    System.out.println("Ты проиграл эту битву!");
                    return false;
                }
            case 5:
                int a4 = random.nextInt(100);
                int b4 = random.nextInt(7);
                int c4 = random.nextInt(100);
                int d4 = random.nextInt(7);

                int predanswer1 = 1;
                int predanswer2 = 1;

                for(int i = 0; i < b4; ++i)
                    predanswer1 *= a4;

                for(int i = 0; i < d4; ++i)
                    predanswer2 *= c4;

                int trueAnswer4 = predanswer1 - predanswer2;
                System.out.println("Реши пример: " + a4 + " ** " + b4 + " - " + c4 + " ** " + d4 + " = ? / ** - это степень");
                int answer4 = scanner.nextInt();

                if (trueAnswer4 == answer4) {
                    System.out.println("Верно! Ты победил монстра");
                    return true;
                } else {
                    System.out.println("Ты проиграл эту битву!");
                    return false;
                }
        }
        return false;
    }
}