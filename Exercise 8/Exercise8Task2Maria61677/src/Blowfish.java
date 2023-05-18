public class Blowfish extends Fish implements AnimalName, AnimalBehavior, AnimalMove {
    private String TypeMaria61677;

    public Blowfish() {
        super();
        TypeMaria61677 = "Super Blow Fish ";
    }

    public Blowfish(String name, int age, int weight, String order, String Type) {
        super(name, age, weight, order);
        this.TypeMaria61677 = Type;
    }

    public Blowfish(int age, String order, String Type) {
        super(age, order);
        this.TypeMaria61677 = Type;
    }

    public void travel() {
        System.out.println("I'm going  _");
    }

    @Override
    public void Search_For_Food() {
        System.out.println("The Blowfish is looking for something to eat ");
    }

    @Override
    public void getVoiceMaria61677() {
        System.out.println("Blub Blub Blub");
    }

    @Override
    public void eatMaria61677(String meal) {
        System.out.println("I am Eating " + meal);
    }

    public String getType() {
        return this.TypeMaria61677;
    }

    ;

    public void setType(String w) {
        this.TypeMaria61677 = w;
    }

    ;

    public String ToString() {
        return "BlowFish :\n " + "Type : " + TypeMaria61677;
    }

    @Override
    public void SleepMaria61677() {

    }

    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzzz";
        System.out.println(Sound);
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
        ;
    }
}
