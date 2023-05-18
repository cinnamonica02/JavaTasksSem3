public class Dog extends Mammal implements AnimalBehavior,AnimalMove {
    private String FavColorMaria61677;

    Dog() {
        super();
        FavColorMaria61677 = "Blue";
    }

    public Dog(String name, int age, int weight, String order, String favColor) {
        super(name, age, weight, order);
        this.FavColorMaria61677 = favColor;
    }

    public Dog(int age, String order, String favColor) {
        super(age, order);
        this.FavColorMaria61677 = favColor;
    }

    public void WakeUp() {
        System.out.println("I Just Woke Up _");
    }

    @Override
    public void SleepMaria61677() {
        System.out.println("The Dog Is Slepping");
    }

    @Override
    public void getVoiceMaria61677() {
        System.out.println("gukguk");
    }

    @Override
    public void eatMaria61677(String meal) {
        System.out.println("I am Eating my Fish Tuna");
    }

    public String getFavColorMaria61677() {
        return this.FavColorMaria61677;
    }

    ;

    public void setFavColorMaria61677(String w) {
        this.FavColorMaria61677 = w;
    }

    ;

    public String ToString() {
        return "Dog :\n " + "Favorite Color : " + FavColorMaria61677;
    }


    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzz";
        System.out.println(Sound);
    }

    @Override
    public void move() {
        System.out.println("the dog runs");
    }
}