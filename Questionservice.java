import java.util.Scanner;

public class Questionservice {
    String select[]= new String[5];
    // int i;
Question [] question = new Question[5];
public   Questionservice(){
    question[0]=new Question(1, "Which programming language is developed in year 1985?","java","python","c++","c#","java");
    question[1]=new Question(2, "Which of the following is responsible for converting bytecode into machine code?","JRE","JDK","JVM","JAVA COMPIER","JVM");
    question[2]=new Question(3, "What is the size of int datatype?","1","2","8","4","4");
    question[3]=new Question(4, "Which operator is used for logical \"AND\" operation?","&&","||","&","|","&&");
    question[4]=new Question(5, "What is the output of the expression true || false?","true","false","null","0","true");



}
public void playquiz(){
    int i=0;
    for(Question q:question)
    {
System.out.println("question no :" +q.getId());
System.out.println( q.getQues());
System.out.println(q.getOpt1());
System.out.println(q.getOpt2());
System.out.println(q.getOpt3());
System.out.println(q.getOpt4());
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
select[i]=sc.nextLine();
i++;
}
System.out.println("Answers Entered are:");
for(String s: select){
    System.out.println(s);
}
}
public void printscore(){
int score=0;
for(int i=0;i<question.length;i++){
    Question que=question[i];
    String actualanswer=que.getAns();
    String useranswer=select[i];
    
    if(actualanswer.equals(useranswer)){
        score++;
    }
    
}
System.out.println("Your Score:" + score);
}
}

