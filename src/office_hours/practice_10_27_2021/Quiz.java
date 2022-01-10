package office_hours.practice_10_27_2021;

public class Quiz {

    String topic;
    int numberOfQuestions;
    double totalPoints;

    public Quiz(String topic, int numberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.numberOfQuestions = numberOfQuestions;
        this.totalPoints = totalPoints;
    }

    public void takeQuiz(){
        System.out.println("Taking " + topic + " Quiz");

    }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", numberOfQuestions=" + numberOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
/*
[Canvas] Advance Class & Object Practice (Big Task – No Encapsulation or Inheritance) create a class Quiz
instance variables:
- topic (String)
- total number of questions (int) - total points (double)
constructor:
- initialize all variables
methods:
- toString: print all the quiz information
- takeQuiz(): print: Taking the $topic quiz
 */