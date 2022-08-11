package lab_07.Q_1;





import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Address extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH=720;

    private static final int FRAME_HEIGHT=300;

    private static final int FRAME_X_ORIGIN=150;

    private static final int FRAME_Y_ORIGIN=250;

    private static final int INPUT_TEXT_WIDTH=200;

    private static final int INPUT_TEXT_HEIGHT=30;

    private static final int BUTTON_WIDTH=80;

    private static final int BUTTON_HEIGHT=30;

    private JButton submitButton;

    private  JTextField name,street,city,zip,state;

    private  JLabel lable;

    public Address(){
        Container contentPane;
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        setTitle("Address Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contentPane= getContentPane();
        contentPane.setLayout(null);

         name= new JTextField();
        name.setBounds(30,40,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        name.setName("Name");
        contentPane.add(name);
        lable= new JLabel("Name");
        lable.setBounds(30,15,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        contentPane.add(lable);


         street= new JTextField();
        street.setBounds(260,40,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        street.setName("Street");
        contentPane.add(street);
        lable= new JLabel("Street");
        lable.setBounds(260,15,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        contentPane.add(lable);

         city= new JTextField();
        city.setBounds(490,40,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        city.setName("City");
        contentPane.add(city);
        lable= new JLabel("City");
        lable.setBounds(490,15,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        contentPane.add(lable);

         state= new JTextField();
        state.setBounds(130,130,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        state.setName("State");
        contentPane.add(state);
        lable= new JLabel("State");
        lable.setBounds(130,105,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        contentPane.add(lable);

         zip= new JTextField();
        zip.setBounds(360,130,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        zip.setName("Zip");
        contentPane.add(zip);
        lable= new JLabel("Zip");
        lable.setBounds(360,105,INPUT_TEXT_WIDTH,INPUT_TEXT_HEIGHT);
        contentPane.add(lable);

        submitButton= new JButton();
        submitButton.setBounds(320,225,BUTTON_WIDTH,BUTTON_HEIGHT);
        submitButton.addActionListener(this);
        submitButton.setText("Submit");
        contentPane.add(submitButton);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() instanceof JButton){
            System.out.println(name.getText() + "\n"+
                                street.getText()+ "\n"+
                                city.getText()+ ", "+ state.getText()+" "+ zip.getText());
            name.setText("");
            state.setText("");
            city.setText("");
            street.setText("");
            zip.setText("");
        }

    }

    public static void main(String[] args){
        Address address= new Address();
        address.setVisible(true);
    }
}
