class Fish extends Animal implements AnimalMove {
    private String GenMaria61677;



    public Fish(){
        super();
        GenMaria61677 =" ";
    }
    public Fish(String name,int age , int weight , String General_type){
        super(name,age,weight);
        this.GenMaria61677 =General_type;
    }
    public Fish(int age , String General_type){
        super(age);
        this.GenMaria61677 =General_type;
    }

    public void Search_For_Food(){System.out.println("im looking for food ");}

    @Override
    public void getVoiceMaria61677() {
        System.out.println("Blub Blub Blub");
    }
    @Override
    public void eatMaria61677(String meal) {
        System.out.println("Fish is eating a "+ meal);
    }
    public String getGTypeMaria61677(){return this.GenMaria61677;};
    public void setTypeMaria61677(String w){this.GenMaria61677 =w;};
    public String ToString(){
        return "Fish :\n "+"General Type of Fish : "+ GenMaria61677;
    }

    @Override
    public void move() {
        System.out.println("Fish move");
    }
}