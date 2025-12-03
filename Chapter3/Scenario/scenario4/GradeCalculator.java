package scenario4;

public class GradeCalculator {
    public static String calculateGrade(int score){
        if(score<0 || score>100){
            throw new InvalidScoreException("invalid score for grade calculation "+score);
        }
        else if(score>=90){
            return "A+";
        }
        else if(score>=80){
            return "A";
        }
        else if(score>=70){
            return "B";
        }
        else if(score>=60){
            return "C";
        }
        else if(score>=50){
            return "D";
        }
        else if(score>=40){
            return "E";
        }
        else return "F";
    }
}
