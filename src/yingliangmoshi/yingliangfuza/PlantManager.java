package yingliangmoshi.yingliangfuza;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-06
 * Time: 19:50
 */
public class PlantManager {
    private int length = 100000;
    private int[] xArray = new int[length], yArray = new int[length], ageArray = new int[length],typeArray = new int[length];

    private PlantFactory plantFactory;
    public PlantManager(){
        plantFactory = new PlantFactory();
        for(int i = 0;i<length;i++){
            xArray[i] = (int)(Math.random() * length);
            yArray[i] = (int)(Math.random() * length);
            ageArray[i] =(int)(Math.random() * length)%5;
            typeArray[i] =(int)(Math.random() * length)%2;
        }

    }

    public void disPlant(){
        for(int i = 0;i<length;i++){
            plantFactory.getPlant(typeArray[i]).display(xArray[i],yArray[i],ageArray[i]);
        }
    }
}
