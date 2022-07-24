package Services;

import Entities.Campain;
import Entities.Game;
import Entities.Offer;
import Entities.Player;
import Repositories.IOfferRepo;

import java.util.ArrayList;

public class OfferService implements IOfferRepo {
    @Override
    public Offer addOffer(int id, Player player, Game game, Campain campain) {
        Offer offer=new Offer();
        offer.setId(id);
        offer.setPlayer(player);
        offer.setGame(game);
        offer.setCampain(campain);
        double totalPrice=game.getPrice()-game.getPrice()*campain.getPrice()/100;
        offer.setPrice(totalPrice);
        System.out.println(player.getFirstName()+" "+player.getLastName()+" bought "+game.getName()+" for "+totalPrice+"TL");
        return offer;

    }

}
