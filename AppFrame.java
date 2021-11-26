package TodoApp;

import javax.swing.JFrame;

public class AppFrame extends JFrame {

    public AppFrame(){
        super("TodoApp");
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        TarefaFormPainel panel = new TarefaFormPainel();
        add(panel);
        
        setVisible(true);
    }
    
} // FIM DA CLASSE FRAME
