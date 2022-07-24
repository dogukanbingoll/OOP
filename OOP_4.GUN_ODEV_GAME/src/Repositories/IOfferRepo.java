package Repositories;

import Entities.Campain;
import Entities.Game;
import Entities.Offer;
import Entities.Player;

public interface IOfferRepo {
    Offer addOffer(int id, Player player, Game game, Campain campain);


}
