public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;
    
    /**
     * 
     * @param question
     * @param ans1
     * @param ans2
     * @param ans3
     * @param ans4
     * @param correctAnswer
     */
    public Question(String question,String ans1,String ans2,String ans3,String ans4, int correctAnswer){
        question=this.question;
        ans1 = answers[0];
        ans2= answers[1];
        ans3 = answers[2];
        ans4 = answers[3];
        correctAnswer = Integer.parseInt(getCorrectAnswer());

    }
    
    /**
     * 
     */
    public String toString(){
        String result =null;
        result += question;
        result +="\n";
        result += "1." +answers[0] +"\n";
        result += "2." +answers[1] +"\n";
        result += "3." +answers[2] + "\n";
        result += "4." +answers[3] + "\n";
        return result;
    }
    
    /**
     * 
     * @param userAnswer
     * @return
     */
    public boolean isCorrrect(int userAnswer){
        if(userAnswer==correctAnswer){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * 
     * @return
     */
    public String getCorrectAnswer(){
        return answers[4];
    }
}
