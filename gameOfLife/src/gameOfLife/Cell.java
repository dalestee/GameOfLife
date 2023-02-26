package gameOfLife;

public class Cell {

	private int coordinatesXofTheCell;
	private int coordinatesYofTheCell;
	private boolean isAlive;
	private Plate plate;
	
	public Cell(int coordinatesXofTheCell, int coordinatesYofTheCell, boolean isAlive, Plate plate) {
		super();
		this.coordinatesXofTheCell = coordinatesXofTheCell;
		this.coordinatesYofTheCell = coordinatesYofTheCell;
		this.isAlive = isAlive;
		this.plate = plate;
	}
	
	public Cell(int coordinatesXofTheCell, int coordinatesYofTheCell, Plate plate) {
		super();
		this.coordinatesXofTheCell = coordinatesXofTheCell;
		this.coordinatesYofTheCell = coordinatesYofTheCell;
		this.isAlive = true;
		this.plate = plate;
	}
	
	public int getCoordinatesXofTheCell() {
		return coordinatesXofTheCell;
	}
	public void setCoordinatesXofTheCell(int coordinatesXofTheCell) {
		this.coordinatesXofTheCell = coordinatesXofTheCell;
	}
	
	public int getCoordinatesYofTheCell() {
		return coordinatesYofTheCell;
	}
	
	public void setCoordinatesYofTheCell(int coordinatesYofTheCell) {
		this.coordinatesYofTheCell = coordinatesYofTheCell;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public Cell[] getCellSurroundings() {
		Cell[][] tempPlate = plate.getPlate();
		Cell[] cellSurroundings = new Cell[] {tempPlate[this.coordinatesXofTheCell][this.coordinatesYofTheCell-1],tempPlate[this.coordinatesXofTheCell-1][this.coordinatesYofTheCell-1],tempPlate[this.coordinatesXofTheCell-1][this.coordinatesYofTheCell],tempPlate[this.coordinatesXofTheCell-1][this.coordinatesYofTheCell+1],tempPlate[this.coordinatesXofTheCell][this.coordinatesYofTheCell+1],tempPlate[this.coordinatesXofTheCell+1][this.coordinatesYofTheCell+1],tempPlate[this.coordinatesXofTheCell+1][this.coordinatesYofTheCell],tempPlate[this.coordinatesXofTheCell+1][this.coordinatesYofTheCell-1]};
		return(cellSurroundings);
	}
	
	public boolean isChanging() {
		Cell[] cells = this.getCellSurroundings();
		int nbOfCellsAlive = 0;
		for (Cell cell : cells) {
			if (cell.isAlive) {
				nbOfCellsAlive++;
			}
		}
		return(nbOfCellsAlive>2);
	}
}
