package lab_07.Q_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringUtility extends JFrame implements ActionListener {

    private final int FRAME_WIDTH= 600;

    private final int FRAME_HEIGHT= 200;

    private final int FRAME_X_ORIGIN=150;

    private final int FRAME_Y_ORIGIN= 250;

    private final int BUTTON_WIDTH= 200;

    private final int BUTTON_HEIGHT= 30;

    private final int TextFIELD_WIDTH= 200;

    private final int TEXTFIELD_HEIGHT= 20;

    private JButton count,reverse,remove;

    private JTextField input,output;

    private JLabel label;


    public StringUtility(){
        Container contantPane=getContentPane();

        setTitle("String Utility");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        contantPane.setLayout(null);

        count= new JButton();
        count.setText("Count Letter");
        count.setName("count");
        count.setBounds(50,20,BUTTON_WIDTH,BUTTON_HEIGHT);
        count.addActionListener(this);
        contantPane.add(count);

        reverse= new JButton();
        reverse.setText("Reverse Letter");
        reverse.setName("reverse");
        reverse.addActionListener(this);
        reverse.setBounds(50,60,BUTTON_WIDTH,BUTTON_HEIGHT);
        contantPane.add(reverse);

        remove = new JButton();
        remove.setText("Remove Duplication");
        remove.setName("remove");
        remove.addActionListener(this);
        remove.setBounds(50,100,BUTTON_WIDTH,BUTTON_HEIGHT);
        contantPane.add(remove);

        label=new JLabel("Input");
        label.setBounds(260,30,TextFIELD_WIDTH,TEXTFIELD_HEIGHT);
        contantPane.add(label);

        input= new JTextField();
        input.setBounds(260,50,TextFIELD_WIDTH,TEXTFIELD_HEIGHT);
        contantPane.add(input);

        label= new JLabel("Output");
        label.setBounds(260,70,TextFIELD_WIDTH,TEXTFIELD_HEIGHT);
        contantPane.add(label);

        output= new JTextField();
        output.setBounds(260,90,TextFIELD_WIDTH,TEXTFIELD_HEIGHT);
        contantPane.add(output);



    }


    public void actionPerformed(ActionEvent event){

        if(event.getSource() instanceof JButton){
            JButton button= (JButton) event.getSource();
            String name=button.getName();
            if(name.equals("count")){
                output.setText(countLetter(input.getText()));
            }else if(name.equals("reverse")){
                output.setText(reverseLetter(input.getText()));
            }else if(name.equals("remove")){
                output.setText(removeDuplication(input.getText()));
            }
        }
    }


    public static void main(String[] args){
        StringUtility utility= new StringUtility();
        utility.setVisible(true);
    }

    public String countLetter(String letter){
        Integer count=0;
        letter= letter.toLowerCase();
        for(int i=0; i<letter.length();i++){
            char c= letter.charAt(i);
            if(c >='a' && c<='z'){
                count++;
            }
        }
        return count.toString();
    }

    public String reverseLetter(String letter){
        String output="";
        for(int i=0; i<letter.length();i++){
            output = letter.charAt(i)+output;
        }

           return output;
    }

    public String removeDuplication(String letter){
        String output=""+letter.charAt(0);
        boolean dupplicat;
        for(int i=1; i<letter.length();i++){
            dupplicat=false;
            for(int j=0; j<i; j++){
                if(letter.charAt(j) == letter.charAt(i)) dupplicat= true;
            }
               if(!dupplicat) output+=letter.charAt(i);
        }

        return output;
    }


}
