package Repositories;

import Entities.Game;

public interface IGameRepo {
    Game addGame(int id,String name,double price);
    void deleteGame(int id);
    void updateGame(int id);


}
