public class Question {
    String text;
    int answer;
    int answeredCorrectly = 0;
    int difficulty;

    public Question(String text,int answer,int difficulty) {
        this.text = text;
        this.answer = answer;
        this.difficulty = difficulty;
    }
}


