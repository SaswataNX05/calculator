package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
    
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ac, persentange, plus, minus, div, multi, equal, bdot, pow, clr;
    JTextField box;
    String num1 = "";
    String op = "";
    int count = -1;
    double n1, n2;

    Calculator(){
        
        setLayout(null);
        
        box = new JTextField();
        box.setBounds(20, 20, 300, 60);
        box.setFont(new Font("Arial", Font.BOLD, 24));
        box.setBackground(Color.LIGHT_GRAY);
        box.setHorizontalAlignment(JTextField.RIGHT);
        add(box);
        
        ac = new JButton("AC");
        ac.setBounds(20, 120, 60, 60);
        ac.setFont(new Font("Arial", Font.BOLD, 18));
        ac.setBackground(Color.ORANGE);
        ac.addActionListener(this);
        add(ac);
                
        persentange = new JButton("%");
        persentange.setBounds(100, 120, 60, 60);
        persentange.setFont(new Font("Arial", Font.BOLD, 18));
        persentange.setBackground(Color.ORANGE);
        persentange.addActionListener(this);
        add(persentange);
        
        clr = new JButton("CLR");
        clr.setBounds(180, 120, 60, 60);
        clr.setFont(new Font("Arial", Font.BOLD, 12));
        clr.setBackground(Color.ORANGE);
        clr.addActionListener(this);
        add(clr);
        
        div = new JButton("/");
        div.setBounds(260, 120, 60, 60);
        div.setFont(new Font("Arial", Font.BOLD, 18));
        div.setBackground(Color.ORANGE);
        div.addActionListener(this);
        add(div);
        
        b7 = new JButton("7");
        b7.setBounds(20, 200, 60, 60);
        b7.setFont(new Font("Arial", Font.BOLD, 18));
        b7.setBackground(Color.LIGHT_GRAY);
        b7.addActionListener(this);
        add(b7);
        
        b8 = new JButton("8");
        b8.setBounds(100, 200, 60, 60);
        b8.setFont(new Font("Arial", Font.BOLD, 18));
        b8.setBackground(Color.LIGHT_GRAY);
        b8.addActionListener(this);
        add(b8);
        
        b9 = new JButton("9");
        b9.setBounds(180, 200, 60, 60);
        b9.setFont(new Font("Arial", Font.BOLD, 18));
        b9.setBackground(Color.LIGHT_GRAY);
        b9.addActionListener(this);
        add(b9);
        
        multi = new JButton("X");
        multi.setBounds(260, 200, 60, 60);
        multi.setFont(new Font("Arial", Font.BOLD, 18));
        multi.setBackground(Color.ORANGE);
        multi.addActionListener(this);
        add(multi);
        
        b4 = new JButton("4");
        b4.setBounds(20, 280, 60, 60);
        b4.setFont(new Font("Arial", Font.BOLD, 18));
        b4.setBackground(Color.LIGHT_GRAY);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("5");
        b5.setBounds(100, 280, 60, 60);
        b5.setFont(new Font("Arial", Font.BOLD, 18));
        b5.setBackground(Color.LIGHT_GRAY);
        b5.addActionListener(this);
        add(b5);
        
        b6 = new JButton("6");
        b6.setBounds(180, 280, 60, 60);
        b6.setFont(new Font("Arial", Font.BOLD, 18));
        b6.setBackground(Color.LIGHT_GRAY);
        b6.addActionListener(this);
        add(b6);
        
        minus = new JButton("-");
        minus.setBounds(260, 280, 60, 60);
        minus.setFont(new Font("Arial", Font.BOLD, 18));
        minus.setBackground(Color.ORANGE);
        minus.addActionListener(this);
        add(minus);
        
        b1 = new JButton("1");
        b1.setBounds(20, 360, 60, 60);
        b1.setFont(new Font("Arial", Font.BOLD, 18));
        b1.setBackground(Color.LIGHT_GRAY);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("2");
        b2.setBounds(100, 360, 60, 60);
        b2.setFont(new Font("Arial", Font.BOLD, 18));
        b2.setBackground(Color.LIGHT_GRAY);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("3");
        b3.setBounds(180, 360, 60, 60);
        b3.setFont(new Font("Arial", Font.BOLD, 18));
        b3.setBackground(Color.LIGHT_GRAY);
        b3.addActionListener(this);
        add(b3);
        
        plus = new JButton("+");
        plus.setBounds(260, 360, 60, 60);
        plus.setFont(new Font("Arial", Font.BOLD, 18));
        plus.setBackground(Color.ORANGE);
        plus.addActionListener(this);
        add(plus);
        
        pow = new JButton("^");
        pow.setBounds(20, 440, 60, 60);
        pow.setFont(new Font("Arial", Font.BOLD, 18));
        pow.setBackground(Color.ORANGE);
        pow.addActionListener(this);
        add(pow);
        
        b0 = new JButton("0");
        b0.setBounds(100, 440, 60, 60);
        b0.setFont(new Font("Arial", Font.BOLD, 18));
        b0.setBackground(Color.LIGHT_GRAY);
        b0.addActionListener(this);
        add(b0);
        
        bdot = new JButton(".");
        bdot.setBounds(180, 440, 60, 60);
        bdot.setFont(new Font("Arial", Font.BOLD, 18));
        bdot.setBackground(Color.ORANGE);
        bdot.addActionListener(this);
        add(bdot);
        
        equal = new JButton("=");
        equal.setBounds(260, 440, 60, 60);
        equal.setFont(new Font("Arial", Font.BOLD, 18));
        equal.setBackground(Color.ORANGE);
        equal.addActionListener(this);
        add(equal);
        
        setBounds(400, 200, 340, 580);
        getContentPane().setBackground(Color.darkGray);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            num1 = num1+"1";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b2){
            num1 = num1+"2";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b3){
            num1 = num1+"3";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b4){
            num1 = num1+"4";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b5){
            num1 = num1+"5";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b6){
            num1 = num1+"6";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b7){
            num1 = num1+"7";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b8){
            num1 = num1+"8";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b9){
            num1 = num1+"9";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == b0){
            num1 = num1+"0";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == bdot){
            num1 = num1+".";
            box.setText(num1);
            count++;
        }else if(ae.getSource() == ac){
            num1 = "";
            n1 = 0;
            box.setText(num1);
            count = -1;
        }
        else if(ae.getSource() == clr){
            if(num1.equals('\0') || num1.equals("") || count == -1){
                box.setText("Error");
            }else{
                num1  = num1.replace(num1.charAt(count), '\0');
                count--;
                box.setText(num1);
            }
        }else if(num1.equals('\0')){
            num1 = "";
            count = -1;
        }else if(ae.getSource() == plus){
            n1 = Double.parseDouble(num1);
            op = "+";
            box.setText(op);
            num1="";
            count = -1;
        }else if(ae.getSource() == minus){
            n1 = Double.parseDouble(num1);
            op = "-";
            box.setText(op);
            num1="";
            count = -1;
        }else if(ae.getSource() == div){
            n1 = Double.parseDouble(num1);
            op = "/";
            box.setText(op);
            num1="";
            count = -1;
        }else if(ae.getSource() == multi){
            n1 = Double.parseDouble(num1);
            op = "X";
            box.setText(op);
            num1="";
            count = -1;
        }else if(ae.getSource() == pow){
            n1 = Double.parseDouble(num1);
            op = "^";
            box.setText(op);
            num1="";
            count = -1;
        }else if(ae.getSource() == persentange){
            n1 = Double.parseDouble(num1);
            op = "%";
            box.setText(op);
            num1="";
            count = -1;
        }else if(ae.getSource() == pow){
            n1 = Double.parseDouble(num1);
            op = "^";
            box.setText(op);
            num1="";
            count = -1;
        }else if(ae.getSource() == equal){
            if (op == "+"){
                add(n1, Double.parseDouble(num1));
            } if (op == "-"){
                minus(n1, Double.parseDouble(num1));
            } if (op == "X"){
                multiplication(n1, Double.parseDouble(num1));
            } if (op == "/"){
                div(n1, Double.parseDouble(num1));
            } if (op == "^"){
                power(n1, Double.parseDouble(num1));
            }if (op == "%"){
                persantage(n1, Double.parseDouble(num1));
            }
        }
    }
    
    public void add(double a, double b){
        double res = a + b;
        box.setText(""+res);
    }
    
    public void minus(double a, double b){
        double res = a - b;
        box.setText(""+res);
    }
    
    public void div(double a, double b){
        double res = a / b;
        box.setText(""+res);
    }
    
    public void multiplication(double a, double b){
        double res = a * b;
        box.setText(""+res);
    }
    
    public void power(double a, double b){
        double res = Math.pow(a, b);
        box.setText(""+res);
    }
    
    public void persantage(double a, double b){
        double res = (a / b) * 100.0;
        box.setText(""+res);
    }
    
    public static void main(String[] args) {
        new Calculator();
    }

   
}
