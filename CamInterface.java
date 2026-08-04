 /*1. Create an interface  Camera and MusicPlayer with some methods , then implement these methods in Smartphone
class  and display messages according to that */

 public class CamInterface {
     public static void main(String[] args) {
         Smartphone smartphone = new Smartphone();
         smartphone.takePhoto();
         smartphone.recordVideo();
         smartphone.playMusic();
         smartphone.pauseMusic();
     }
 }

  interface Camera {
     void takePhoto();
     void recordVideo();
   }

   interface MusicPlayer {
       void playMusic();
       void pauseMusic();
    }

   class Smartphone implements Camera, MusicPlayer {
    
       public void takePhoto() {
           System.out.println("Taking a photo...");
       }

      
       public void recordVideo() {
           System.out.println("Recording a video...");
       }

    
       public void playMusic() {
           System.out.println("Playing music...");
       }

    
       public void pauseMusic() {
           System.out.println("Pausing music...");
       }
      }
 
