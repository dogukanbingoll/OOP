package Repositories;

import Entities.Player;

import java.util.Calendar;

public interface IPlayerRepo {
    Player addPlayer(int id, String firstName, String lastName, int dateOfBirth);

    void deletePlayer(int id);

    void updatePlayer(int id);


}