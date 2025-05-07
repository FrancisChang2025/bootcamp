import java.util.Objects;

public class ExamSubject {
  // name (English, etc)
  private static int EXAM_CODE = 0;  // across objects
  private long id;
  private Name name;
  // score
  private int score;

  public static ExamSubject ofEnglish() {
    return new ExamSubject(Name.ENGLISH, ++EXAM_CODE);
  }
  public static ExamSubject ofMath() {
    return new ExamSubject(Name.MATH, ++EXAM_CODE);
  }
  public static ExamSubject ofHistory() {
    return new ExamSubject(Name.HISTORY, ++EXAM_CODE);
  }

  // Contructor
  private ExamSubject(Name name, long id){
    this.name = name;
    this.id = id;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) {
      return true;
    }
    if (!(this instanceof ExamSubject)) {
      return false;
    }
    ExamSubject examSubject = (ExamSubject) obj;
    return this.id == examSubject.getID();
  }

  // hashCode
  public int hashCode() {
    return Objects.hash(this.id);
  }

  // toString
  public String toString() {
    return "ExamSubject(" 
      + "id=" + this.id
      + ",name=" + this.name.name()
      + ",score=" + this.score
      + ")";
  }


  // getter, setter
  public long getID() {
    return this.id;
  }

  public void setScore(int score){
    this.score = score;
  }

  public String getName(){
    return this.name.name();
  }

  public int getScore() {
    return this.score;
  }

  // equals(), toString, hashCode()

  public enum Name {
    ENGLISH, MATH, HISTORY,;
  }

  // main
  public static void main(String[] args) {
    ExamSubject es1 = ExamSubject.ofEnglish();
    System.out.println(es1.getName());  // "ENGLISH"
    es1.setScore(80);
    System.out.println(es1.getScore());  // 80

    System.out.println(es1); // ExamSubject(id=1,name=ENGLISH,score=80)

  }
}
