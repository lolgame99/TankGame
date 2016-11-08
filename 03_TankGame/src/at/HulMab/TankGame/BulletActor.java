package at.HulMab.TankGame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class BulletActor {
	
	private int bulletX, bulletY;
	private Image bullet;
	
	public BulletActor() {
		
		
	}
	
	public void render(Graphics g){
		g.drawImage(this.bullet, bulletX, bulletY);
		
	}
	
	public void init(){
		this.bullet = new Image("/testdata/bullet.")
		
	}

}
