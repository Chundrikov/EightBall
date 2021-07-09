import java.io.*;
import java.util.Random;


public class EightBall {

    public String tellTheTruth() throws IOException {


        System.out.println("Задай свой вопрос магическому шару");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String question = bufferedReader.readLine();

         String[] variants = new String[]{"У тебя все получится, дерзай!",
                                        "Лучше выпей винишка",
                                        "Не сегодня",
                                        "Даже не думай",
                                        "Да",
                                        "Лучше поработай",
                                        "Посмотри сериал и закажи мак, ты этого достойна",
                                        "Нет",
                                        "Будущее туманно, иди поспи"};

        String randomAnswer = variants[new Random().nextInt(variants.length)];
        return randomAnswer;
    }

    public static void main(String[] args) throws IOException {
        EightBall eightBall = new EightBall();
        System.out.println(eightBall.tellTheTruth());
    }
}
