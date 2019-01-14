// this is builder pattern example
import java.util.ArrayList;
import java.util.List;

class Meal {
  private List<Item> ii = new ArrayList<Item>();
  
  public void addItem(Item i) {
    ii.add(i);
  }


  public float getCost() {
    float cost = 0.0f;

    for(Item i : ii) {
      cost += i.price();
    }

    return cost;
  }

  // little side effects
  public void showItemsInConsole() {
    for(Item i : ii) {
      System.out.println(" Item: " + i.name());
      System.out.println(" Packaging: " + i.packaging().pack());
      System.out.println(" $: " + i.price());
    }
  }
}

class MealBuilder {
  public Meal makeStdMeal() {
    Meal m = new Meal();
    m.addItem( new CheeseBurger());
    m.addItem( new Coke());
    return m;
  }

  public Meal makeVegeMeal() {
    Meal v = new Meal();
    v.addItem( new VegeBurger());
    return v;
  }
}

public class builder {
  public static void main(String[] args) {
    System.out.println("Welcome in builder example!");

    MealBuilder b = new MealBuilder();
    Meal m1 = b.makeStdMeal();
    m1.showItemsInConsole();
  }
}
