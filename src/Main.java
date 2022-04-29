import srpfacadelab.*;

public class Main {

    public static void main(String[] args) {
        //This is meant to be simple and just show how you could instantiate the structure

        IGameEngine game = new SimpleGameEngine();
        RpgPlayer player1 = new RpgPlayer(game);
        RpgPlayer player2 = new RpgPlayer(game);
        ((SimpleGameEngine) game).addPlayer(player1);
        ((SimpleGameEngine) game).addPlayer(player2);
        ItemHandler itemHandler = new ItemHandler();
        PlayerInventory playerInventory = new PlayerInventory();
        PlayerFacade p1Facade = new PlayerFacade(player1, itemHandler, playerInventory);
        Item rareAndUniqueItem = new Item(1, "bob", 0, 0,1,true, true);
        p1Facade.pickUpItem(rareAndUniqueItem);


        //Here you would create items

        //Here you would tell the history and make the game happen

        //You could make players pick up items
        //You could make players use items
        //etc.
        //You don't need to worry about it for the assignment
        //This is only to show how the 'external world' (client code) would instantiate the core structure.
        //In the assignment, you're supposed to improve the design and not instantiate a game
    }
}
