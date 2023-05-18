class Mammal extends Animal implements AnimalMove, AnimalBehavior, AnimalName {
    private String orderMaria61677;



    public Mammal() {
        super();
        orderMaria61677 = " ";
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.orderMaria61677 = order;
    }

    public Mammal(int age, String order) {
        super(age);
        this.orderMaria61677 = order;
    }

    public void SleepMaria61677() {
        System.out.println("zzzZZZZzzz");
    }

    @Override
    public void getVoiceMaria61677() {
        System.out.println("I am Making Sound huahauahuah");
    }

    @Override
    public void eatMaria61677(String meal) {
        System.out.println("Mamal is eating a " + meal);
    }

    public String getOrderMaria61677() {
        return this.orderMaria61677;
    }

    ;

    public void setOrderMaria61677(String w) {
        this.orderMaria61677 = w;
    }

    ;

    public String ToStringBancha56351() {
        return "Mammal :\n " + "Order : " + orderMaria61677;
    }




    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzz";
    }

}
