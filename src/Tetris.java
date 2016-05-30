import javax.swing.*;
import java.awt.*;

/**
 * Created by yasta on 30.05.2016.
 */
public class Tetris extends JFrame{

    private JLabel statusBar;

    public Tetris(){
        statusBar = new JLabel("Lines: "+"0");
        add(statusBar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);


        board.start();

        setSize(360,720);
        setTitle("Game Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JLabel getStatusBar(){
        return statusBar;

    }

    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        tetris.setLocationRelativeTo(null);
        tetris.setVisible(true);

    }


}
