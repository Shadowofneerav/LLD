package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> cell;

    public Board(int size) {
        this.size = size;
        this.cell = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            this.cell.add(new ArrayList<>());
            for(int j=0;j<size;j++)
            {
                cell.get(i).add(new Cell(i,j));
            }
        }
    }

    public int getSize() {
        return size;
    }



    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCell() {
        return cell;
    }

    public void setCell(List<List<Cell>> cell) {
        this.cell = cell;
    }
    public boolean isEmpty(int row,int col)
    {
        return cell.get(row).get(col).getCellState() == CellState.EMPTY;
    }
    public void showBoard()
    {
        for(int i=0;i<cell.size();i++)
        {
            for(int j = 0; j<cell.getFirst().size(); j++)
            {
                if(cell.get(i).get(j).isEmpty())
                {
                    System.out.print("|   |");
                }
                else
                {
                    System.out.print("| "+cell.get(i).get(j).getPlayer().getSymbol().getSymbol()+" |");
                }
            }
            System.out.println();
        }
    }
}
