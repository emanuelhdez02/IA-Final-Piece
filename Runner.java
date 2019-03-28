import java.util.Scanner;
public class Runner {
    public static void main(String[]args){
        QuestionGroup qq = new QuestionGroup();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <qq.gameLength; i++){
            Question q = qq.determineQuestion();
            System.out.println(q.text);

            int answer = sc.nextInt();

            if (answer == q.answer) {
                q.answeredCorrectly = 2;
                qq.lastQuestionCorrect = true;
                qq.lastQuestionDifficulty = q.difficulty;
            }else{
                q.answeredCorrectly = 1;
                qq.lastQuestionCorrect = false;
            }
        }
        qq.computeResult();
    }
}
