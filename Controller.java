import java.awt.event.*;
public class Controller implements ActionListener{
    private Menu menu;
    private Frame frame;
    
    public Controller(){
        menu = new Menu();
        frame = new Frame();
        menu.getStart().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(menu.getStart())){
            frame.getFrame().setVisible(true);
            System.out.println("a");
        }
    }
    	public static void main(String args[]){
		new Controller(); 
	}
}
