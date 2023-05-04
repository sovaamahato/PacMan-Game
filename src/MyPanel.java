import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {


    private Dimension d;
    private final Font smallFont = new Font("Helvetica", Font.BOLD, 14);
    private boolean inGame = false;
    private final int BLOCK_SIZE = 24;

    //15 ota rows and column
    private final int N_BLOCKS = 15;
    private final int SCREEN_SIZE = N_BLOCKS * BLOCK_SIZE;

    private final int MAX_GHOSTS = 12;

    private final int PACMAN_SPEED=6;

    private final int N_GHOST=6;
    private int  lives,score;

    private int[] dx, dy;

    private int[] ghost_x, ghost_y, ghost_dx, ghost_dy;
    private Image heart, ghost;
    private Image up,down,left,right;
    private int pacman_x,pacman_y ,pacmand_x,pacmand_y;
    private int red_dx,red_dy;
    private  final int validSpeed[]={1,2,3,4,6,8};
    private int currentSpeed =3;
    private int maxSpeed =6;
    private short[] screenData;
    private Timer timer;

    //0=khali thau   4=right border

    //1=left border   8=bottom border
    //2=top border    16=white dots
    //for example:- first box ma left border(1), top border(2) and white dots(16) xa (1+2+16)=19


    private final short levelData[] = {
            19, 26, 26, 26, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 22,
            21, 0, 0, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
            21, 0, 0, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
            21, 0, 0, 0, 17, 16, 16, 24, 16, 16, 16, 16, 16, 16, 20,
            17, 18, 18, 18, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 20,
            17, 16, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 16, 24, 20,
            25, 16, 16, 16, 24, 24, 28, 0, 25, 24, 24, 16, 20, 0, 21,
            1, 17, 16, 20, 0, 0, 0, 0, 0, 0, 0, 17, 20, 0, 21,
            1, 17, 16, 16, 18, 18, 22, 0, 19, 18, 18, 16, 20, 0, 21,
            1, 17, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 20, 0, 21,
            1, 17, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 20, 0, 21,
            1, 17, 16, 16, 16, 16, 16, 18, 16, 16, 16, 16, 20, 0, 21,
            1, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20, 0, 21,
            1, 25, 24, 24, 24, 24, 24, 24, 24, 24, 16, 16, 16, 18, 20,
            9, 8, 8, 8, 8, 8, 8, 8, 8, 8, 25, 24, 24, 24, 28
    };







    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
