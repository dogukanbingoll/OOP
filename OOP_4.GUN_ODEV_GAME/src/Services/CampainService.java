package Services;

import Entities.Campain;
import Repositories.ICampainRepo;

import java.util.ArrayList;

public class CampainService implements ICampainRepo {
    @Override
    public Campain addCampain(int id, String name, double price) {
        Campain campain=new Campain();
        campain.setId(id);
        campain.setName(name);
        campain.setPrice(price);
        System.out.println(campain.getName()+" is added to DB!");
        return campain;

    }

    @Override
    public void deleteCampain(int id) {
        System.out.println("The camapin with id:"+id+" is deleted from DB!");
    }

    @Override
    public void update(int id) {
        System.out.println("The campain with id:"+id+" is updated on DB!");
    }
}
