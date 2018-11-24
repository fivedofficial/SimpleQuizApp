package www.fived.pk.simplequizapp;

public class Question {

    public String myQuestion[] = {
            "What is the first number in numbers?",
            "What is the second number in numbers?",
            "What is the third number in numbers?",
            "What is the four number in numbers?",
            "What is the five number in numbers?",
            "What is the six number in numbers?",
            "What is the seven number in numbers?",
            "What is the eight number in numbers?",
            "What is the nine number in numbers?",
            "What is the ten number in numbers?"
    };



    private String mChoice[][] = {

            {"0", "1", "2", "3"},
            {"1", "1", "2", "3"},
            {"2", "1", "24", "34"},
            {"3", "15", "23", "3"},
            {"4", "1", "2", "3"},
            {"5", "16", "2", "3"},
            {"6", "1", "22", "53"},
            {"7", "1", "2", "36"},
            {"8", "18", "2", "3"},
            {"9", "11", "2", "34"},
    };


    private String mCorrectAnswer[] = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };



    public String getQuestion(int a){
        String question = myQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String chocie = mChoice[a][0];
        return chocie;
    }

    public String getChoice2(int a){
        String chocie = mChoice[a][1];
        return chocie;
    }

    public String getChoice3(int a){
        String chocie = mChoice[a][2];
        return chocie;
    }

    public String getChoice4(int a){
        String chocie = mChoice[a][3];
        return chocie;
    }



    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
