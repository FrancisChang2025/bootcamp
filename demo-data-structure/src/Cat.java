import java.util.ArrayList;

public class Cat {
  private String name;

  private Cat(String name){
    this.name = name;
  }

  public Object[] objects = new Object[] {new Cat(), 3, 2};

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat cat = (Cat) obj;
    
  }




}
