package dat3.example.players.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String na

    public Player() {}

    public Player(String player) {
        this.name = player;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String player) {
        this.name = player;
    }
}
