package Services;

import Entities.Game;
import Repositories.IGameRepo;

import java.util.ArrayList;

public class GameService implements IGameRepo {

    @Override
    public Game addGame(int id, String name, double price) {
        Game game=new Game();
        game.setId(id);
        game.setName(name);
        game.setPrice(price);
        System.out.println(game.getName()+" is added to DB!");
        return game;
    }

    @Override
    public void deleteGame(int id) {
        System.out.println("The game with id:"+id+" is deleted from DB!");

    }

    @Override
    public void updateGame(int id) {
        System.out.println("The game with id:"+id+" is updated on DB!");

    }
}
