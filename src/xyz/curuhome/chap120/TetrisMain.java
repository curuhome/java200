package xyz.curuhome.chap120;

public class TetrisMain {
    public static void main(String[] args) {
        Tetris tetris = new Tetris(TetrisUtil.TETRISA);
        tetris.printTetris();
        /*
            1 1 1 0
            0 0 1 0
            0 0 1 0
            0 0 1 0
            ========================
         */
        tetris.turnLeft();
        tetris.printTetris();
        /*
            0 0 0 0
            1 1 1 1
            1 0 0 0
            1 0 0 0
            ========================
         */
        tetris.turnLeft();
        tetris.printTetris();
        /*
            0 0 0 0
            1 1 1 1
            1 0 0 0
            1 0 0 0
            ========================
         */
        tetris.turnLeft();
        tetris.printTetris();
        /*
            0 0 0 1
            0 0 0 1
            1 1 1 1
            0 0 0 0
            ========================
         */
        tetris.turnLeft();
        tetris.printTetris();
        /*
            1 1 1 0
            0 0 1 0
            0 0 1 0
            0 0 1 0
            ========================
         */


        tetris.turnRight();
        tetris.printTetris();
        /*
            0 0 0 1
            0 0 0 1
            1 1 1 1
            0 0 0 0
            ========================
         */
        tetris.turnRight();
        tetris.printTetris();
        /*
            0 1 0 0
            0 1 0 0
            0 1 0 0
            0 1 1 1
            ========================
         */
        tetris.turnRight();
        tetris.printTetris();
        /*
            0 0 0 0
            1 1 1 1
            1 0 0 0
            1 0 0 0
            ========================
         */
        tetris.turnRight();
        tetris.printTetris();
        /*
            1 1 1 0
            0 0 1 0
            0 0 1 0
            0 0 1 0
            ========================
         */
    }
}
