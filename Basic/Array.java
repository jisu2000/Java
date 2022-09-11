// To represent a cell of display board.
public class Array {

	private int row;
	private int col;
	private CellType cellType;

	public void Cell(int row, int col)
	{
		this.row = row;
		this.col = col;
	}

	public Array(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public CellType getCellType()
	{
		return cellType;
	}

	public void setCellType(CellType cellType)
	{
		this.cellType = cellType;
	}

	public int getRow()
	{
		return row;
	}

	public int getCol()
	{
		return col;
	}
}

