package practice08;
public class Q03_VolumeRunner {
    public static void main(String[] args) {
        Q03_Volume volume = new Q03_Volume();

        System.out.println( volume.calculateVolume(5));
        System.out.println(volume.calculateVolume(5, 10));
        System.out.println(volume.calculateVolume(1,2,3));

    }
}