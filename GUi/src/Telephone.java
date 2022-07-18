/**

 TwoButtonsTwoListeners.java
 * CSCI 112 spring 2022
 * last edited April  13, 2022 by A. Day
 * This program shows an example of aGUI of a phone
 * each buttion has its own listener
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Telephone extends JFrame implements ActionListener {

    private final String WINDOW_TITLE = "Dayphone";
    private final int WINDOW_WIDTH = 200;
    private final int WINDOW_HEIGHT = 300;
    String input = "";
// The following named controls will appear in the GUI

    private JPanel digitPanel = new JPanel();


    private JLabel displayLabel = new JLabel (" Input number!: ");

    private final JTextField displayTextField = new JTextField(20);


    private final JButton Button1 = new JButton("1");
    private final JButton Button2 = new JButton("2");
    private final JButton Button3 = new JButton("3");
    private final JButton Button4 = new JButton("4");
    private final JButton Button5 = new JButton("5");
    private final JButton Button6 = new JButton("6");
    private final JButton Button7 = new JButton("7");
    private final JButton Button8 = new JButton("8");
    private final JButton Button9 = new JButton("9");
    private final JButton Button0 = new JButton("0");
    private final JButton astrButton = new JButton("del");
    private final JButton boundButton = new JButton("dial");
    public static void main(String[] args) {

        new Telephone(); // the constructor
    }

//Constructor

    public Telephone()
    {

        // creates a panel
        setTitle(WINDOW_TITLE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        textPanel.add(displayLabel,BorderLayout.NORTH);
        textPanel.add(displayTextField,BorderLayout.CENTER);
        textPanel.setBackground(Color.GRAY);


        //button layout
        digitPanel.setLayout(new GridLayout(4,3));
        digitPanel.add(Button1);
        digitPanel.add(Button2);
        digitPanel.add(Button3);
        digitPanel.add(Button4);
        digitPanel.add(Button5);
        digitPanel.add(Button6);
        digitPanel.add(Button7);
        digitPanel.add(Button8);
        digitPanel.add(Button9);
        digitPanel.add(astrButton);
        digitPanel.add(Button0);
        digitPanel.add(boundButton);

        setLayout(new BorderLayout());
        add(textPanel,BorderLayout.NORTH);
        add(digitPanel,BorderLayout.CENTER);
        setVisible(true);

        Button1.addActionListener(this);
        Button2.addActionListener(this);
        Button3.addActionListener(this);
        Button4.addActionListener(this);
        Button5.addActionListener(this);
        Button6.addActionListener(this);
        Button7.addActionListener(this);
        Button8.addActionListener(this);
        Button9.addActionListener(this);
        Button0.addActionListener(this);
        astrButton.addActionListener(this);
        boundButton.addActionListener(this);
        // register Telephone (this method) at the listener for each button


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // every button press adds a number to the cellphone
        if (e.getSource() == Button0)
        {
            input = input + 0;
            System.out.println( input);
        } // end if
        if (e.getSource() == Button1)
        {
            input = input + 1;
            System.out.println( input);

        } // end if
        if (e.getSource() == Button2)
        {
            input = input + 2;
            System.out.println( input);
        } // end if
        if (e.getSource() == Button3)
        {
            input = input + 3;
            System.out.println( input);

        } // end if
        if (e.getSource() == Button4)
        {
            input = input + 4;
            System.out.println( input);

        } // end if
        if (e.getSource() == Button5)
        {
            input = input + 5;
            System.out.println( input);

        } // end if
        if (e.getSource() == Button6)
        {

            input = input + 6;
            System.out.println( input);
        } // end if
        if (e.getSource() == Button7)
        {
            input = input + 7;
            System.out.println( input);

        } // end if
        if (e.getSource() == Button8)
        {
            input = input + 8;
            System.out.println( input);
        } // end if
        if (e.getSource() == Button9)
        {
            input = input + 9;
            System.out.println( input);
        } // end if
        if (e.getSource() == boundButton) {
            int count = 0;

            //Counts each character except space
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != ' ')
                    count++;
            }
            if (count == 10) {
                String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
                System.out.print("calling" + number + "...");            }
            else {
                System.out.println(" error, wrong # of inputs. The input is: " +input+  " and used: "+ count+" numbers. Clearing");
                input = "";
            }


        }
        if (e.getSource() == astrButton)
        {
            input = "";
            System.out.println("Number cleared.");
        } // end if

    }

}// ends telephone