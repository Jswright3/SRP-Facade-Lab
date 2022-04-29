package srpfacadelab;

import java.util.List;

public class PlayerFacade {
    RpgPlayer player;
    ItemHandler itemHandler;
    PlayerInventory playerInventory;

    public PlayerFacade(RpgPlayer player, ItemHandler itemHandler, PlayerInventory playerInventory) {
        this.player = player;
        this.itemHandler = itemHandler;
        this.playerInventory = playerInventory;
    }

    public boolean pickUpItem(Item item){
        return itemHandler.pickUpItem(item, this.player);
    }

    public void useItem(RpgPlayer player, Item item){
        itemHandler.useItem(player, item);
    }

    public boolean checkIfItemExistsInInventory(Item item) {
        return PlayerInventory.checkIfItemExistsInInventory(this.player, item);
    }

    public int calculateInventoryWeight() {
        return PlayerInventory.calculateInventoryWeight(this.player);
    }

    public void takeDamage(int hitDamage){
        player.takeDamage(hitDamage);
    }

    public int getHealth() {
        return player.getHealth();
    }

    public int getMaxHealth() {
        return player.getMaxHealth();
    }

    public List<Item> getInventory() {
        return player.getInventory();
    }

    public int getArmour() {
        return player.getArmour();
    }

    public int getCarryingCapacity() {
        return player.getCarryingCapacity();
    }
}
