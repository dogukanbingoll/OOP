import Entities.Campain;
import Entities.Game;
import Entities.Offer;
import Entities.Player;
import Services.CampainService;
import Services.GameService;
import Services.OfferService;
import Services.PlayerService;

public class Main4 {
    public static void main(String[] args) {

        PlayerService playerService=new PlayerService();
        Player player= playerService.addPlayer(1,"Doğukan","Bingöl",1995);

        GameService gameService=new GameService();
        Game game= gameService.addGame(1,"God of War",100);


        CampainService campainService=new CampainService();
        Campain campain=campainService.addCampain(1,"75 Discount",75);

        OfferService offerService=new OfferService();
        Offer offer=offerService.addOffer(1,player,game,campain);



    }
}

