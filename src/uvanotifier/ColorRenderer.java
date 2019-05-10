package uvanotifier;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 * <a href="http://twitter.com/author">@author</a> ashraf_sarhan
 * 
 */
public class ColorRenderer implements TableCellRenderer {

	public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

        @Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table,
				value, isSelected, hasFocus, row, column);

		// Apply zebra style on table rows
		if (row <= 2) {
			c.setForeground(Color.decode("#008000"));
		} else if (row >= Uvanotifier.start.friendlist_table.getRowCount() - 3) 
                        {
			c.setForeground(Color.RED);
		}
                else
                {
                    c.setForeground(Color.BLACK);
                }

	/*	if (column == Constants.CHANGE_IDX
				|| column == Constants.PERCENTAGE_CHANGE_IDX) {
			Object priceChangeObj = table.getModel().getValueAt(row,
					Constants.CHANGE_IDX);
			double priceChange = Double.parseDouble(priceChangeObj.toString());
			Color color;
			if (priceChange > 0) {
				color = Constants.PRICE_UP_COLOR;
			} else {
				color = Constants.PRICE_DOWN_COLOR;
			}
			c.setForeground(color);
		} else {
			c.setForeground(Constants.DEFAULT_FOREGROUND_COLOR);
		}

                */
		return c;
	}

}