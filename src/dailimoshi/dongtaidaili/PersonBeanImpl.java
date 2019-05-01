package dailimoshi.dongtaidaili;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 16:03
 */
public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingcount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(rating ==0) {
            return 0;
        }else{
            return (rating/ratingcount);
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
this.rating = rating;
ratingcount++;
    }
}
