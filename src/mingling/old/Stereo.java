package mingling.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 12:41
 */
public class Stereo {
    static int volume = 0;
    public void On(){
        System.out.println("Stereo On");
    }

    public void Off(){
        System.out.println("Stereo Off");
    }

    public void SetCd(){
        System.out.println("Stereo SetCd");
    }

    public void SetVol(int i){
        volume = i;
        System.out.println("Stereo volume="+volume);
    }

    public int GetVol(){
        return volume;
    }

    public void Start(){
        System.out.println("Stereo Start");
    }
}
