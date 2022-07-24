package Services;

import Entities.Player;
import Repositories.IPlayerRepo;

import java.util.ArrayList;
import java.util.Calendar;

public class PlayerService implements IPlayerRepo {


    @Override
    public Player addPlayer(int id, String firstName, String lastName, int dateOfBirth) {
        Player player=new Player();
        player.setId(id);
        player.setFirstName(firstName);
        player.setLastName(lastName);
        player.setDateOfBirth(dateOfBirth);

        System.out.println(player.getFirstName()+" "+player.getLastName()+" is addet to DB!");
        return player;
    }

    @Override
    public void deletePlayer(int id) {
        System.out.println("The player with id:"+id+" is deleted from DB");
    }

    @Override
    public void updatePlayer(int id) {
        System.out.println("The player with id:"+id+" is updated on DB");
    }


}
