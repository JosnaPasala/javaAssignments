package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {
 Playable p=new Veena();
 p.play();
 p=new Saxophone();
 p.play();
}
}
