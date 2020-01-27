import java.awt.*;

public class BonusBrick extends Brick {

    public BonusBrick(PlayField pf, BrickPile bp, Rectangle p, Image img){
        super(pf,bp,img,p);
    }

    public void hitBy(Puck p) {

        _isDead = true;
        if (_bp.unbrokenCount() == 0) {
            _pf.getMatch().win();
        }
        p.getVelocity().reverseY();
        _pf.addSprite(p.getPs().bonusGet());
    }
}
