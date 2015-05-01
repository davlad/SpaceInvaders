
public class DefenderShip {

	int x;
	int y;
	int h = 3;
	
	public void setLocation(int xStart, int yStart) {
		// TODO Auto-generated method stub
		x = xStart;
		y = yStart;
	}

	public void hit() {
		if (h > 0) {
			h--;
		}
	}
}
