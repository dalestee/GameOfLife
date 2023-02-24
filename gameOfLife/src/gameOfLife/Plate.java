package gameOfLife;

public class Plate {
	Cell [][]plate;

	public Cell[][] getPlate() {
		return plate;
	}

	public Plate(Cell[][] plate) {
		this.plate = plate;
	}
	
	public Plate(int length, int depth) {
		this(new Cell[length][depth]);
	}
}
