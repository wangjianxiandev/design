package yingliangmoshi.yingliangfuza;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-06
 * Time: 19:47
 */
public class PlantFactory {
    private HashMap<Integer, Plant> plantHashMap = new HashMap<Integer, Plant>();
    public PlantFactory(){

    }
    public Plant getPlant(int type){
        if(!plantHashMap.containsKey(type)){
            switch (type){
                case 0:
                    plantHashMap.put(0, new Tree());
                    break;
                case 1:
                    plantHashMap.put(1, new Grass());
                    break;
            }
        }
        return plantHashMap.get(type);
    }
}
