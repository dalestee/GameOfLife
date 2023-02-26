package gameOfLife;
import java.util.Random;

public class Plate {
	Cell [][]plate;
	
	Random random = new Random();

	public Cell[][] getPlate() {
		return plate;
	}

	public Plate(Cell[][] plate) {
		this.plate = plate;
	}
	
	public Plate(int length, int depth) {
		this(new Cell[length][depth]);
		for (int i = 0;i<length;i++) {
			for (int j = 0;j<depth;j++) {
				this.plate[i][j] = new Cell(i,j,false,this);
			}
		}
	}
	
	public Plate(int length, int depth, int numberCells) {
		this(length,depth);
		for (int i = 0;i<numberCells;i++) {
			int x = random.nextInt(depth);
			int y = random.nextInt(length);
			this.plate[x][y] = new Cell(x,y,this);
		}
		for (int i = 0;i<length;i++) {
			for (int j = 0;j<depth;j++) {
				if(this.plate[i][j]==null) {
					this.plate[i][j] = new Cell(i,j,false,this);
				}
			}
		}
	}

}
