package abstraction;
//Simulating: package music
interface Playable {
 void play();
}

//Simulating: package music.string
class Veena implements Playable {
 public void play() {
     System.out.println("Veena is playing classical music...");
 }
}

//Simulating: package music.wind
class Saxophone implements Playable {
 public void play() {
     System.out.println("Saxophone is playing jazz music...");
 }
}

//Simulating: package live
public class AbsQ6 {
 public static void main(String[] args) {
     // a. Create instance of Veena and call play()
     Veena veena = new Veena();
     veena.play();

     // b. Create instance of Saxophone and call play()
     Saxophone saxophone = new Saxophone();
     saxophone.play();

     // c. Use Playable reference
     Playable p1 = veena;
     Playable p2 = saxophone;

     System.out.println("Using Playable reference:");
     p1.play();
     p2.play();
 }
}

