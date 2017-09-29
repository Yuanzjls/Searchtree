package gui;

import javax.swing.table.*;

public class TimeTable extends AbstractTableModel
{
	private long[][] time;
	private String[] columnNames =  new String[] { "Type", "Insert", "Search", "Delete" };;
	
	@Override
	public int getColumnCount()
	{
		
		return columnNames.length;
	}

	@Override
	public int getRowCount()
	{
		return time.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1)
	{
		if (arg1 == 0)
		{
			if (arg0 == 0)
			{
				return new String("Type #1");
			}
			else
			{
				return new String("Type #2");
			}
		}
		return time[arg0][arg1-1];
	}

	public TimeTable(long [][] time)
	{
		this.time = time;
	}
	
	@Override
	public boolean isCellEditable(int row, int col)
    {
		return false; 
	}
	
	@Override
	public String getColumnName(int col)
	{
        return columnNames[col].toString();
    }
}
