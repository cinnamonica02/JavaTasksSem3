public abstract class Animal implements AnimalMove {
    String NameMaria61677;
    int ageMaria61677, weighMaria61677;

    public Animal(int age) {
        this.ageMaria61677 =age;
    }

    public void eatMaria61677(String meal){};
    protected abstract void getVoiceMaria61677();
    public Animal(){
        ageMaria61677 = weighMaria61677 =0;
        NameMaria61677 ="None";
    }
    public Animal(String name,int age , int weight){
        this.NameMaria61677 =name;
        this.ageMaria61677 =age;
        this.weighMaria61677 =weight;
    }
    public String getNameMaria61677(){return NameMaria61677;};
    public void setNameMaria61677(String name){this.NameMaria61677 =name;};
    public int getAgeMaria61677(){return this.ageMaria61677;};
    public void setAgeMaria61677(int w){this.ageMaria61677 =w;};
    public int getWeighMaria61677(){return this.weighMaria61677;};
    public void setWeighMaria61677(int w){this.weighMaria61677 =w;};


}