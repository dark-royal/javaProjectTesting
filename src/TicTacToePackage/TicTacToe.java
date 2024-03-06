package TicTacToePackage;

import java.util.Arrays;

public class TicTacToe {
    private final TacConstant[][] table = new TacConstant[3][3];
    private int numberOfPlayers = 2;



    public TicTacToe() {
        for (TacConstant[] tacConstants : table) {
            Arrays.fill(tacConstants, TacConstant.EMPTY);
        }
    }


    public TacConstant[][] checkTable() {
        return table;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayers;
    }

    public void play(int playerId, int playerPosition) {
        if (playerId == 1 && playerPosition == 1) {
            table[0][0] = TacConstant.X;
        }
        if (playerId == 1 && playerPosition == 2) {
            table[0][1] = TacConstant.X;
        }
        if (playerId == 1 && playerPosition == 3) {
            table[0][2] = TacConstant.X;
        }
        if (playerId == 1 && playerPosition == 4) {
            table[1][0] = TacConstant.X;
        }
        if (playerId == 1 && playerPosition == 5) {
            table[1][1] = TacConstant.X;
        }
        if (playerId == 1 && playerPosition == 6) {
            table[1][2] = TacConstant.X;
        }
        if (playerId == 1 && playerPosition == 7) {
            table[2][0] = TacConstant.X;
        }
        if (playerId == 1 && playerPosition == 8) {
            table[2][1] = TacConstant.X;
        }
        if (playerId == 1 && playerPosition == 9) {
            table[2][2] = TacConstant.X;
        }

        if (playerId == 2 && playerPosition == 1) {
            table[0][0] = TacConstant.O;
        }
        if (playerId == 2 && playerPosition == 2) {
            table[0][1] = TacConstant.O;

        }
        if (playerId == 2 && playerPosition == 3) {
            table[0][2] = TacConstant.O;
        }
        if (playerId == 2 && playerPosition == 4) {
            table[1][0] = TacConstant.O;

            if (playerId == 2 && playerPosition == 5) {
                table[1][1] = TacConstant.O;
            }
            if (playerId == 2 && playerPosition == 6) {
                table[1][2] = TacConstant.O;
            }
            if (playerId == 2 && playerPosition == 7) {
                table[2][0] = TacConstant.O;
            }
            if (playerId == 2 && playerPosition == 8) {
                table[2][1] = TacConstant.O;
            }
            if (playerId == 2 && playerPosition == 9) {
                table[2][2] = TacConstant.O;
            } else {
                if (playerId > 2 && playerPosition > 9) {
                    throw new InvalidPlayerAndInvalidPlayerPosition("players should be  2: and player POSITION SHOULD NOT BE MORE THAN NINE");
                }

            }
        }
    }

    public void validatePlay(int playerId, int playerPosition) {
        if (playerId > 3 && playerPosition > 9) {
            play(1, 2);
        } else {
            throw new IllegalArgumentException("board index should be empty before playing");
        }
    }
}




