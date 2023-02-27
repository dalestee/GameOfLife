package gameOfLife;

public class Main {
	public static void main(String[] args){
		Plate plate = new Plate(100,100,100);
		int nTrue = 0;
		for (Cell[] cellTable : plate.getPlate()) {
			for (Cell cell : cellTable) {
				if (cell.isAlive()) {
					nTrue++;
				}
			}
		}
		System.out.println(nTrue);
	}
}
