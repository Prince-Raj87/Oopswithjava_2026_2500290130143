Abstract class Device {
    String brand = "Samsung";
    abstract void turnOn();
    void showBrand(){
        System.out.println("Brand: "+brand);
    }
}
interface Camera {
    int MAX_ZOOM = 10;
    void takephotoaInfo();
    default void camerainfo(){
        System.out.println("Camera is ready");
        
    }
}

interface MusicPlayer {
    String TYPE = "Digital";//public static final
    void playMusic();//abstract and public method

    default void musicInfo(){ //concrete method
        System.out.println("Music player is ready");
    }
    
}

//child class 
class Smartphone extends Device implements Camera, MusicPlayer{
    //multiphle inheritance
    void turnOn(){
        System.out.println("Smartphone is turned ON");
    }

    //Implementing abstract method of camera
    public void takePhoto(){
        System.out.println("Taking photo...");
    }
    //Implementing abstract method of MusicPlayer
    public void playMusic(){
        System.out.println("Playing Music....");
    }
}

//main class
public class Abstract_Interface{
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.turnOn();
        s.showBrand();
        s.takePhoto();
        s.playMusic();
        s.camerainfo();
        s.musicInfo();
        System.out.println("Maximumm Zoom: " + Camera.MAX_ZOOM);
        System.out.println("Music Type: " +);
    }
}