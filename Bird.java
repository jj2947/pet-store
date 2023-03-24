public class Bird extends Pet {

  private int price;
  private int costPrice;

  public Bird(String name, String animal, String breed, String age, Gender gender) {
    super(name, animal, breed, age, gender);
  }

  @Override
  public int getPrice() {
    price = 50;
    return price;
  }

  @Override
  public int getCostPrice() {
    costPrice = 25;
    return costPrice;
  }

  @Override
  public void getPersonality() {
    System.out.println(
        name + " the " + breed + " " + animal + " likes to be cheeky and imitate what you say");
  }
}
