public class Dog extends Pet {

    private int price;
    
    public Dog (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

    @Override
    public int getPrice() {
        price = 300;
        return price;
    } 

    public void getPersonality() {
        System.out.println(name + " likes to play fetch at the beach and go swimming");
    }
}