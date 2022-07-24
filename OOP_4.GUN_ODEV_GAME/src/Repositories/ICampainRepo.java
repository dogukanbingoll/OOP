package Repositories;

import Entities.Campain;

public interface ICampainRepo {
   Campain addCampain(int id,String name,double price);
    void deleteCampain(int id);
    void update(int id);




}
