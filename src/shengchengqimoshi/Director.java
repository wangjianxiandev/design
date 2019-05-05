package shengchengqimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 18:45
 */
public class Director {
    private AbsBuilder absBuilder;
    public Director(AbsBuilder absBuilder){
        this.absBuilder = absBuilder;
    }

    public void setBuilder(AbsBuilder absBuilder){
        this.absBuilder = absBuilder;
    }

    public void construct(){
        absBuilder.buildvacation();
        absBuilder.getVacation().showInfo();
    }
}
