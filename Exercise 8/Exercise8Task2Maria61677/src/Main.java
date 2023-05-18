import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
        Animal animal[]= new Animal[6];
        animal[0]= new Mammal("Nara",4,15,"Kombusha");
        animal[1]= new Dog("Kokob",13,10,"America","white");
        animal[2]= new Bird("Aranara",6,3,"Cubis");
        animal[3]= new Fish("heizou",3,4,"Jaw");
        animal[4]= new Blowfish("Susanah",7,11,"France","Blow");
        animal[5]= new Pigeon("Paradon",50,20,"Atlantic",354);

        AnimalBehavior animalBehavior[]= new AnimalBehavior[3];
        animalBehavior[0]= new Dog("Balo",3,10,"Moz","Yellow");
        animalBehavior[1]= (AnimalBehavior) new Pigeon("Curly",2,3,"Sao Paulo",354);
        animalBehavior[2]= new Blowfish("Beniodas",1,2,"England","Red");


        for(Animal a:animal){
            a.move();
        }

        for (Animal a: animal){
            AnimalName.name(a.getNameMaria61677());

        }



    }
}
