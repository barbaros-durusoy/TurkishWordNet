package WordNet.Annotation;

import WordNet.SynSet;

import javax.swing.*;
import java.awt.*;

public class SynSetListCellRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component cell = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof SynSet){
            String literals = ((SynSet) value).representative();
            for (int i = 1; i < ((SynSet) value).getSynonym().literalSize(); i++){
                literals = literals + "|" + ((SynSet) value).getSynonym().getLiteral(i).getName();
            }
            ((JComponent) cell).setToolTipText(literals);
        }
        return this;
    }
}
