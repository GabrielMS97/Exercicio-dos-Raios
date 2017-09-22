package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
public class RaioListModel implements ListModel<Raio> {
    
    private final List<Raio> raios;
    private final List<ListDataListener> dataListeners;

    public RaioListModel(ListModel<Raio> raios) {
        this.raios = (List<Raio>) raios;
        this.dataListeners =  new ArrayList<>();
    }

    @Override
    public int getSize() {
        return this.getSize() ;
    }

    @Override
    public Raio getElementAt(int index) {
        return this.getElementAt(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.dataListeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        this.dataListeners.remove(l);
    }
    
}
