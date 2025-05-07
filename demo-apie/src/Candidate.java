public class Candidate {  
  private ExamSubject[] examSubjects;

  public Candidate(){
    this.examSubjects = new ExamSubject[3];
  }

  public void attendEnglishExam() {
    this.examSubjects[0] = ExamSubject.ofEnglish();
  }

  public void attendMathExam() {
    this.examSubjects[2] = ExamSubject.ofMath();
  }

  public void attendHistoryExam() {
    this.examSubjects[1] = ExamSubject.ofHistory();
  }

  public ExamSubject getEnglishSubject() {
    return this.examSubjects[0];  //
  }

  public int getEnglishScore() {
    if (this.examSubjects[0] != null){
    // return this.getEnglishScore(); // ! Wrongly will be Bomb
    return this.examSubjects[0].getScore();
    } else {
      System.out.println("The candidate didn't attend the fEnglish Exam.");
      return -1;
    }
  }

  public int getMathScore() {
    if (this.examSubjects[2] != null) {
      return this.examSubjects[2].getScore();
    } else {
      System.out.println("The candidate didn't attend the Math Exam.");
      return -1;
    }
  }

  public int getHistoryScore() {
    if (this.examSubjects[1] != null) {
      return this.examSubjects[1].getScore();
    } else {
      System.out.println("The candidate didn't attend the History Exam.");
      return -1;
    }
  }

  public void setEnglish(int score) {
    if (this.examSubjects[0] != null) {
      this.examSubjects[0].setScore(score);
    } else {
      System.out.println("The candidate didn't attend the English Exam.");
    }
  }

  public void setMath(int score) {
    if (this.examSubjects[2] != null) {
      this.examSubjects[2].setScore(score);
    } else {
      System.out.println("The candidate didn't attend the Math Exam.");
    }
  }

  public void setHistory(int score) {
    if (this.examSubjects[1] != null) {
      this.examSubjects[1].setScore(score);
    } else {
      System.out.println("The candidate didn't attend the History Exam.");
    }
  }
  
  public static void main(String[] args) {
    Candidate canA = new Candidate();

    canA.attendEnglishExam();
    canA.setEnglish(80);

    canA.attendMathExam();
    canA.setMath(90);

    canA.attendHistoryExam();
    canA.setHistory(45);

    Candidate canB = new Candidate();

    canB.attendEnglishExam();;
    canB.setEnglish(100);

    canB.attendMathExam();
    canB.setMath(90);

    canB.attendHistoryExam();
    canB.setHistory(40);

    System.out.println(canA.getHistoryScore());  // 45
    System.out.println(canB.getHistoryScore() );  // 40
    System.out.println(canA.getEnglishScore());  // 80

    System.out
        .println(canA.getEnglishSubject().equals(canB.getEnglishSubject())); // false

    System.out
        .println(canA.getEnglishSubject().equals(canA.getEnglishSubject()));  // true

    System.out.println(canA.getEnglishSubject().getID());  // 1
    System.out.println(canB.getEnglishSubject().getID());  // 4
  }
}
