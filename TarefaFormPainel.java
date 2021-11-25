package TodoApp;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TarefaFormPainel extends JPanel{
    private GridBagLayout layout;
    private GridBagConstraints constrains;

    public TarefaFormPainel(){
        layout = new GridBagLayout();
        constrains = new GridBagConstraints();
    }

    private void _criarForm(){
        JTextField textField = new JTextField(30);
        add(textField);
    }
} // FIM CLASSE
