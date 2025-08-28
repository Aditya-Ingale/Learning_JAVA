package Project_I;

public class QuestionService {
    
    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1, "Which programming language was invented in 1995?", "CPP", "Java", "Python", "C", "Java");
        questions[1] = new Question(2, "Which of the following is NOT a programming language?", "CPP", "Java", "HTML", "C", "HTML");
        questions[2] = new Question(3, "What does HTML stand for?", "Hyper Trainer Marking Language", "Hyper Text Markup Language", "Hyper Transfer Markup Language", "High Text Marking Language", "Hyper Text Markup Language");
        questions[3] = new Question(4, "In C, which of the following is the correct way to declare an integer variable?", "integer number", "integer num;", "int = number;", "num int;", "int number;");
        questions[4] = new Question(5, "Which data structure uses FIFO (First In, First Out)?", "Stack", "Queue", "Tree", "Graph", "Queue");
    }

    public void displayQuestions(){
        for(Question q : questions){
            System.out.println(q);
        }
    }
}
