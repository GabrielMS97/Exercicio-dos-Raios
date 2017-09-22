package br.ufjf.dcc171;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Janela extends JFrame {

    private final JLabel lblLat = new JLabel("Latitude");
    private final JLabel lblLong = new JLabel("Longitude");
    private final JLabel lblDataHora = new JLabel("Data e Hora:");
    private final JTextField txtLat = new JTextField(10);
    private final JTextField txtLong = new JTextField(10);
    private final JTextField txtDataHora = new JTextField(10);
    private final JButton btnSalvar = new JButton("Salvar");
    private final JButton btnExcluir = new JButton("Excluir");
    private final JLabel lblDescricao = new JLabel("Descrição");
    private final JTextField txtDescricao = new JTextField(10);
    private final JLabel lblEventoRaio = new JLabel("Envento de Raio");
    private final DefaultListModel lista = new DefaultListModel();
    private final JList<Raio> lstLista = new JList<>(lista);
    private final DefaultListModel lista2 = new DefaultListModel();
    private final JList<Detalhes> lstLista2 = new JList<>(lista2);
    private final JButton btnAddEvento = new JButton("Adicionar Evento");

    private int numEventos = 0;

    public Janela() throws HeadlessException {
        super("Ocorrência de Raios");
        
        //lstLista.setModel(new RaioListModel(lista));
                
        JPanel painel1 = new JPanel(new GridLayout(6, 2));
        JPanel painel2 = new JPanel(new BorderLayout());
        JPanel painel3 = new JPanel(new BorderLayout());

        painel1.add(lblLat);
        painel1.add(txtLat);
        painel1.add(lblLong);
        painel1.add(txtLong);
        painel1.add(lblDataHora);
        painel1.add(txtDataHora);
        painel1.add(lblDescricao);
        painel1.add(txtDescricao);
        painel1.add(btnSalvar);
        painel1.add(btnExcluir);
        painel1.add(btnAddEvento);
        add(painel1, BorderLayout.EAST);

        painel2.add(lstLista);
        add(new JScrollPane(lstLista), BorderLayout.WEST);

        painel3.add(lstLista2);
        add(new JScrollPane(lstLista2), BorderLayout.CENTER);

        btnAddEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numEventos++;
                lista.addElement("Evento " + numEventos);
            }
        });

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lstLista.getSelectedValue();

                lista2.addElement("Latitude: " + Float.parseFloat(txtLat.getText()));
                lista2.addElement("Longitude: " + Float.parseFloat(txtLong.getText()));
                lista2.addElement("Data/Hora: " + txtDataHora.getText());
                lista2.addElement("Descrição: " + txtDescricao.getText());
            }
        });

        

       /*lstLista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Raio selecionado = lstLista.getSelectedValue();
                if (selecionado != null) {
                    System.out.println(selecionado);
                    lstLista2.setModel((new DetalhesListModel()));
                } else {
                    lstLista2.setModel((new DefaultListModel<>()));
                }
            }
        });*/

        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List selecionados = lstLista.getSelectedValuesList();
                for (Object selecionado : selecionados) {
                    lista.removeElement(selecionado);
                }
            }
        });
    }

}
