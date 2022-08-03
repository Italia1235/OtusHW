import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        int rightAnswerCount = 0;
        int wrongAnswerCount = 0;
        final int variant1 = 1;
        final int variant2 = 2;
        String[] arrayQuestions = {"В каком году умер Виктор цой?", "В каком году умер Александр Пушкин?", "В каком году умер Майкл Джексон "};
        String[][] answerOptions = {{"1)1990 ", "2)1992 ", "3)1994 ", "4)1989 "}, {"1)1834", "2)1837 ", "3)1894", "4)1889"}, {"1)2005 ", "2)2001 ", "3)2009 ", "4)1999 "}};
        int[] niceAnswer = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);

//        for (int i = 0; i < arrayQuestions.length; i++) {
//            System.out.println(arrayQuestions[i]);
//            System.out.println(answerOptions[i][0] + answerOptions[i][1] + answerOptions[i][2] + answerOptions[i][3]);
//            int answerUser = scanner.nextInt();
//            System.out.println("Ваш ответ:" + answerUser);
//
//            if (answerUser == niceAnswer[i]) {
//                System.out.println("Правильно, Вы молодец!");
//                rightAnswerCount++;
//            } else {
//                System.out.println("Упс,неправильно");
//                wrongAnswerCount++;
//            }
//        }
        int i = 0;
        while (i < arrayQuestions.length) {
            System.out.println(arrayQuestions[i]);
            System.out.println(answerOptions[i][0] + answerOptions[i][1] + answerOptions[i][2] + answerOptions[i][3]);
            int answerUser = scanner.nextInt();
            System.out.println("Ваш ответ:" + answerUser);
            switch(answerUser) {
                case 1,2,3,4:
                if (answerUser == niceAnswer[i]) {
                    System.out.println("Right!");
                    rightAnswerCount++;
                } else {
                    System.out.println("You are mistaken");
                    wrongAnswerCount++;
                }
                default:
                    System.out.println("Pls,use only 1,2,3,4");

            }
            i++;
        }

        System.out.println("Результат: правильно " + rightAnswerCount + ", неправильно " + wrongAnswerCount);


    }
}