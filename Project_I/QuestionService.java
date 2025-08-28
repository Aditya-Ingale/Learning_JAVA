package Project_I;
import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "Which programming language was invented in 1995?", "CPP", "Java", "Python", "C", "Java");
        questions[1] = new Question(2, "Which of the following is NOT a programming language?", "CPP", "Java", "HTML", "C", "HTML");
        questions[2] = new Question(3, "What does HTML stand for?", "Hyper Trainer Marking Language", "Hyper Text Markup Language", "Hyper Transfer Markup Language", "High Text Marking Language", "Hyper Text Markup Language");
        questions[3] = new Question(4, "In C, which of the following is the correct way to declare an integer variable?", "integer number", "int num;", "int = number;", "num int;", "int num;");
        questions[4] = new Question(5, "Which data structure uses FIFO (First In, First Out)?", "Stack", "Queue", "Tree", "Graph", "Queue");
    }

    public void playQuiz(){

        int i = 0;
        for(Question q : questions){
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s : selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;

        for(int i = 0; i<questions.length; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is " + score);
    }
}
