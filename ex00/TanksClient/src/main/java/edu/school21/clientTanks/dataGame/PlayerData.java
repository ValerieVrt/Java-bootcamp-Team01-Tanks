package edu.school21.clientTanks.dataGame;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerData {
    private int layoutPlayerX;

    public PlayerData() {
    }

    public PlayerData(int layoutPlayerX) {
        this.layoutPlayerX = layoutPlayerX;
    }
}
