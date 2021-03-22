package cx.mia.samsara.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RoomEnterEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final Room room;

    public RoomEnterEvent(Player player, Room room) {
        this.player = player;
        this.room = room;
        System.out.println("RoomEnterEvent called for room: " + room.getName());
    }

    public Player getPlayer() {
        return this.player;
    }

    public Room getRoom() {
        return this.room;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}