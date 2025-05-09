public class Queue {
  private Person[] persons;

  public Person[] getPersons() {
    return this.persons;
  }

  public Person getPerson(int index) {   // this line for test class file 'Person.java'
    return this.persons[index];
  }

  public void setPerson(Person[] persons) {
    this.persons = persons;
  }

  public Person getHead() {    // 誰人排頭位 Head, Array Head is [0], Tail 最尾
    return this.persons[0];
  }
  
  public static void main(String[] args) {
    Queue q1 = new Queue();
    // p1 1.76 74
    // p2 1.64 70
    // p3 1.8 77


    Person p1 = new Person();
    p1.setHeight(1.74);
    p1.setWeight(74);
    System.out.println(p1.getBMI());  // 24.44
    System.out.println(p1.getWeightStatus());  // Normal

    Person p2 = new Person();
    p2.setHeight(1.64);
    p2.setWeight(70);
    System.out.println(p2.getBMI());  // 26.03

    Person p3 = new Person();
    p3.setHeight(1.8);
    p3.setWeight(77);
    System.out.println(p3.getBMI());  // 23.77

    Person[] persons = new Person[3];  // person array
    persons[0] = p1;
    persons[1] = p2;
    persons[2] = p3;

    q1.setPerson(persons);
    
    System.out.println(q1.getHead().getBMI());  // 24.44    Go to R16 run & class Person ".getBMI()"

    for (int i = 0; i < q1.getPersons().length; i++){
      System.out.println(q1.getPerson(i).getWeightStatus());
    }
    // Normal
    // Overweight
    // Normal

    // ! R50 - R53 全部都係即時做，即時運算，no any value/string keep in the memory, all call class file to do.

  }
}
