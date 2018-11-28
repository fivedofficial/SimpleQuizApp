package www.fived.pk.simplequizapp;

public class QuestionTwo {

    public String myQuestionTwo[] = {
            "What is the first alphabet in alphabet?",
            "What is the second alphabet in alphabet?",
            "What is the third alphabet in alphabet?",
            "What is the four alphabet in alphabet?",
            "What is the five alphabet in alphabet?",
            "What is the six alphabet in alphabet?",
            "What is the seven alphabet in alphabet?",
            "What is the eight alphabet in alphabet?",
            "What is the nine alphabet in alphabet?",
            "What is the ten alphabet in alphabet?"
    };



    private String mChoiceTwo[][] = {

            {"a", "b", "c", "d"},
            {"b", "c", "d", "e"},
            {"f", "c", "h", "z"},
            {"d", "g", "e", "b"},
            {"s", "e", "f", "x"},
            {"f", "q", "k", "i"},
            {"g", "r", "n", "m"},
            {"h", "k", "x", "z"},
            {"i", "e", "b", "l"},
            {"j", "q", "e", "z"},
    };


    private String mCorrectAnswerTwo[] = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"
    };



    public String getQuestionTwo(int a){
        String question = myQuestionTwo[a];
        return question;
    }

    public String getChoice1(int a){
        String chocie = mChoiceTwo[a][0];
        return chocie;
    }

    public String getChoice2(int a){
        String chocie = mChoiceTwo[a][1];
        return chocie;
    }

    public String getChoice3(int a){
        String chocie = mChoiceTwo[a][2];
        return chocie;
    }

    public String getChoice4(int a){
        String chocie = mChoiceTwo[a][3];
        return chocie;
    }



    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswerTwo[a];
        return answer;
    }
}
