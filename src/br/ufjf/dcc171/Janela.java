package br.ufjf.dcc171;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

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
    private final JList<Raio> lstRaios = new JList<>(new DefaultListModel<>());
    private final JList<Detalhes> lstDetalhes = new JList<>(new DefaultListModel());
    
    public Janela() throws HeadlessException {
        super("Ocorrência de Raios");
        JPanel painel1 = new JPanel(new GridLayout(5,2));
        
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
        add(painel1, BorderLayout.EAST);
        
        lstRaios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new JScrollPane(lstRaios), BorderLayout.WEST);
        
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raio r1 = new Raio(Float.parseFloat(txtLat.getText()), Float.parseFloat(txtLong.getText()), txtDataHora.getText(), txtDescricao.getText());
            }
        });
        
    }

}
