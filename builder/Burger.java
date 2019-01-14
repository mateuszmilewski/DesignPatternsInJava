public abstract class Burger implements Item {
  @Override
  public Packaging packaging() {
    return new Wrapper();
  }

  @Override
  public abstract float price();
}
