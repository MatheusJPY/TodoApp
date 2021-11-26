package TodoApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.util.concurrent.ConcurrentHashMap;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TarefaFormPainel extends JPanel{
    private GridBagLayout layout;
    private GridBagConstraints constraints;

    private JTextField txtId;
    private JTextField txtNome;
    private JTextArea txtDescricao;
    private JButton btnSalvar;
    private JButton btnCancelar;

    public TarefaFormPainel(){
        layout = new GridBagLayout();
        constraints = new GridBagConstraints();
        _criarForm();
        setLayout(layout);
    }

    private void _criarForm(){

        JLabel label;

        label = new JLabel("Id");
        _adicionarComponente(label, 0, 0);
        txtId = new JTextField(5);
        _adicionarComponente(txtId, 0, 1);

        label = new JLabel("Nome");
        _adicionarComponente(label, 1, 0);
        txtNome = new JTextField(30);
        _adicionarComponente(txtNome, 1, 1);

        label = new JLabel("Descricao");
        _adicionarComponente(label, 2, 0);
        txtDescricao = new JTextArea(5, 30);
        JScrollPane pane = new JScrollPane(txtDescricao);
        _adicionarComponente(pane, 2, 1, 1, 5);

        _criarBotoes();

    }

    private void _criarBotoes(){
        JPanel btnPanel = new JPanel();
        FlowLayout flowLayout = (FlowLayout) btnPanel.getLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);

        btnSalvar = new JButton("Salvar");
        btnPanel.add(btnSalvar);

        btnCancelar = new JButton("Cancelar");
        btnPanel.add(btnCancelar);
        
        _adicionarComponente(btnSalvar, 3, 2);
        _adicionarComponente(btnCancelar, 3, 1);
        
    }

    private void _adicionarComponente(JComponent componente, int linha , int coluna){
        _adicionarComponente(componente, linha, coluna, 1, 1);
    }

    private void _adicionarComponente(JComponent componente, int linha , int coluna, int altura, int largura){
        constraints.gridx = coluna;
        constraints.gridy = linha;
        constraints.gridwidth = largura;
        constraints.gridheight = altura;

        constraints.fill = GridBagConstraints.HORIZONTAL;

        layout.setConstraints(componente, constraints);
        add(componente);
    }
} // FIM CLASSE
