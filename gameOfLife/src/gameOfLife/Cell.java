package gameOfLife;

public class Cell {
	private int coordinatesXofTheCell;
	private int coordinatesYofTheCell;
	private boolean isAlive;
	
	
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
}
