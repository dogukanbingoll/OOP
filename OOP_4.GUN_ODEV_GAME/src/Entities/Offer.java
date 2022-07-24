package Entities;

public class Offer {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Player player;
   private Game game;
   private Campain campain;
   private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Campain getCampain() {
        return campain;
    }

    public void setCampain(Campain campain) {
        this.campain = campain;
    }
}
