package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class DetalhesListModel implements ListModel<Detalhes>{
    
    private final List<Detalhes> detalhes;
    private final List<ListDataListener> datalisteners;

    public DetalhesListModel(List<Detalhes> detalhes) {
        this.detalhes  = detalhes;
        this.datalisteners = new ArrayList<>();
    }

    DetalhesListModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        return this.getSize();
    }

    @Override
    public Detalhes getElementAt(int index) {
        return this.getElementAt(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.datalisteners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        this.datalisteners.add(l);
    }

}
