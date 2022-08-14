import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;




public class Calculator implements ActionListener{
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equaltoButton;
    JButton divButton;
    JButton multiButton;
    JButton subsButton;
    JButton addButton;
    JButton clearButton;
    boolean isOperatorClicked=false;
    String oldValue;
    String whichOperation="none";
    String newValue;
    float oldValueF;
    float newValueF;
    float result;
    

    
    public Calculator()
    {
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(550,600);
        jf.setLocation(400,150); 
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.black);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel=new JLabel();
        displayLabel.setBounds(30,30, 380, 70);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.BOLD,30));
        jf.add(displayLabel);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.BOLD,30));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial", Font.BOLD,30));
        eightButton.addActionListener(this);
        jf.add(eightButton);


        nineButton=new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.BOLD,30));
        nineButton.addActionListener(this);
        jf.add(nineButton);


        fourButton=new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial", Font.BOLD,30));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.BOLD,30));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);


        sixButton=new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial", Font.BOLD,30));
        sixButton.addActionListener(this);
        jf.add(sixButton);


        oneButton=new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial", Font.BOLD,30));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial", Font.BOLD,30));
        twoButton.addActionListener(this);
        jf.add(twoButton);


        threeButton=new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial", Font.BOLD,30));
        threeButton.addActionListener(this);
        jf.add(threeButton);


        dotButton=new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new Font("Arial", Font.BOLD,30));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.BOLD,30));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);


        equaltoButton=new JButton("=");
        equaltoButton.setBounds(230, 430, 80, 80);
        equaltoButton.setFont(new Font("Arial", Font.BOLD,30));
        equaltoButton.setBackground(Color.green);
        equaltoButton.addActionListener(this);
        jf.add(equaltoButton);


        divButton=new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.BOLD,30));
        divButton.setBackground(Color.lightGray);
        divButton.setForeground(Color.BLACK);
        divButton.addActionListener(this);
        jf.add(divButton);

        multiButton=new JButton("*");
        multiButton.setBounds(330, 230, 80, 80);
        multiButton.setFont(new Font("Arial", Font.BOLD,30));
        multiButton.setBackground(Color.lightGray);
        multiButton.setForeground(Color.BLACK);
        multiButton.addActionListener(this);
        jf.add(multiButton);

        subsButton=new JButton("-");
        subsButton.setBounds(330, 330, 80, 80);
        subsButton.setFont(new Font("Arial", Font.BOLD,30));
        subsButton.setBackground(Color.lightGray);
        subsButton.setForeground(Color.BLACK);
        subsButton.addActionListener(this);
        jf.add(subsButton);

        addButton=new JButton("+");
        addButton.setBounds(330, 430, 80, 80);
        addButton.setFont(new Font("Arial", Font.BOLD,30));
        addButton.setBackground(Color.lightGray);
        addButton.setForeground(Color.BLACK);
        addButton.addActionListener(this);
        jf.add(addButton);


        clearButton=new JButton("Clear");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.setFont(new Font("Arial", Font.BOLD,15));
        clearButton.setBackground(Color.red);
        clearButton.setForeground(Color.white);
        clearButton.addActionListener(this);
        jf.add(clearButton);





        


       
        

    }

    public static void main(String[] args) {
        new Calculator();
    }


    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){

            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"7");
            }


        }else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"8");
            }
        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"9");
            }

        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"4");
            }
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"5");
            }

        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"6");
            }
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"1");
            }
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"2");
            }

        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"0");
            }
        }else if(e.getSource()==dotButton){
            if(isOperatorClicked){
                displayLabel.setText(".");
                isOperatorClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+".");
            }
        }else if(e.getSource()==equaltoButton){

            switch(whichOperation){
                case "add":
                newValue=displayLabel.getText();

                oldValueF=Float.parseFloat(oldValue);
                newValueF=Float.parseFloat(newValue);

                result=oldValueF+newValueF;
                displayLabel.setText(result+"");
                break;
                case "subs":
                newValue=displayLabel.getText();

                oldValueF=Float.parseFloat(oldValue);
                newValueF=Float.parseFloat(newValue);

                result=oldValueF-newValueF;
                displayLabel.setText(result+"");
                break;
                case "div":
                newValue=displayLabel.getText();

                oldValueF=Float.parseFloat(oldValue);
                newValueF=Float.parseFloat(newValue);

                result=oldValueF/newValueF;
                displayLabel.setText(result+"");
                break;
                case "multi":
                newValue=displayLabel.getText();

                oldValueF=Float.parseFloat(oldValue);
                newValueF=Float.parseFloat(newValue);

                result=oldValueF*newValueF;
                displayLabel.setText(result+"");
                break;
                
            }
            

        }else if(e.getSource()==addButton){
            isOperatorClicked=true;
            whichOperation="add";
            
            oldValue=displayLabel.getText();

        }else if(e.getSource()==subsButton){
            isOperatorClicked=true;
            whichOperation="subs";
            
            oldValue=displayLabel.getText();
 
        }else if(e.getSource()==divButton){
            isOperatorClicked=true;
            whichOperation="div";
            
            oldValue=displayLabel.getText();

        }else if(e.getSource()==multiButton){
            isOperatorClicked=true;
            whichOperation="multi";
            
            oldValue=displayLabel.getText();
            
        }else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }
    
        
    


              
              
            
        
      
        
    }
}
