import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class bubblesort  extends JFrame implements ActionListener{
  JLabel label1, swaps1,swaps2,swaps3,swaps4, comparisons1,comparisons2,comparisons3,comparisons4;
  JTextField text1;
  JButton b1,b2, b3,b4, b5;
  String qsort;
  JPanel panel1, panel2, panel, panel3, panel4, panel5, panel6, inp1, inp2, inp3, inp4;
  int random, numbers, flag=0, temp, random2=0, hi, lo;
  int[] a={random};
  int[] bs;
  int[]b, aa, c;
  int[] swap=new int[4];
  int[] comp=new int[4];
  int start, n, lowest, lowpos, finish;
  JList list, list1, list2, list3, list4;
  JScrollPane scroll, scroll2;
  DefaultListModel model, model1, model2, model3, model4;
  
  public static void main(String[ ] args)
  {
    new bubblesort ();
  }
  public bubblesort  ()
  {
    //panel
    panel=new JPanel();
    this.add(panel);
    panel.setLayout(null);
    panel1=new JPanel();
    panel.add(panel1);
    
    label1=new JLabel("How many random numbers?");
    panel1.add(label1);
    
    text1= new JTextField("10");
    panel1.add(text1);
    b1=new JButton("Enter");
    b1.addActionListener(this);
    panel1.add(b1);
    
    panel1.setBounds(0,0,500,100);
    
    //panel2 
    panel2=new JPanel();
    panel.add(panel2);
    model=new DefaultListModel();
    model1=new DefaultListModel();
    list=new JList(model);
    list1=new JList(model1); 
    scroll=new JScrollPane(list);
    scroll2=new JScrollPane(list1);
    panel2.add(scroll);
    b2=new JButton("Bubble Sort");
    b2.addActionListener(this);
    panel2.add(b2);
    panel2.add(scroll2);
    panel2.setBackground(Color.BLUE);
    panel2.setBounds(10,100,100,480);
    b2.setPreferredSize(new Dimension(40, 40));
    
    panel2.setLayout(new GridLayout(3,1));
    
    //panel3
    panel3=new JPanel();
    panel.add(panel3);
    panel3.setBackground(Color.GREEN);
    b3=new JButton("Selection");
    b3.addActionListener(this);
    list1=new JList(model);
    scroll=new JScrollPane(list1);
    model2=new DefaultListModel();
    list2=new JList(model2);
    scroll2=new JScrollPane(list2);
    panel3.setBounds(150,100,100,480);
    panel3.add(scroll);
    panel3.add(b3);
    panel3.add(scroll2);
    panel3.setLayout(new GridLayout(3,1));
    
    //panel4
    b4=new JButton("Insertion");
    b4.addActionListener(this); 
    panel4=new JPanel();
    panel.add(panel4);
    panel4.setBackground(Color.RED);
    list1=new JList(model);
    scroll=new JScrollPane(list1);
    model3=new DefaultListModel();
    list3=new JList(model3);
    scroll2=new JScrollPane(list3);
    panel4.add(scroll);
    panel4.add(b4);
    panel4.add(scroll2);
    panel4.setBounds(280,100,100,480);
    panel4.setLayout(new GridLayout(3,1));
    
    //panel5
    b5=new JButton("Quick Sort ");
    b5.addActionListener(this); 
    panel5=new JPanel();
    panel.add(panel5);
    panel5.setBackground(Color.YELLOW);
    list1=new JList(model);
    scroll=new JScrollPane(list1);
    model4=new DefaultListModel();
    list4=new JList(model4);
    scroll2=new JScrollPane(list4);
    panel5.add(scroll);
    panel5.add(b5);
    panel5.add(scroll2);
    panel5.setBounds(400,100,100,480);
    panel5.setLayout(new GridLayout(3,1));
    
    //panel6
    panel6=new JPanel();
    panel.add(panel6);
    
    inp1=new JPanel();
    panel6.add(inp1);
    swaps1=new JLabel("Swaps:");
    comparisons1=new JLabel("Comparisons:");
    inp1.add(comparisons1);
    inp1.add(swaps1);    
    
    inp2=new JPanel();
    panel6.add(inp2);
    swaps2=new JLabel("Swaps:");
    comparisons2=new JLabel("Comparisons:");
    inp2.add(comparisons2);
    inp2.add(swaps2);    
    
    inp3=new JPanel();
    panel6.add(inp3);
    swaps3=new JLabel("Swaps:");
    comparisons3=new JLabel("Comparisons:");
    inp3.add(comparisons3);
    inp3.add(swaps3);    
    
    inp4=new JPanel();
    panel6.add(inp4);
    swaps4=new JLabel("Swaps:");
    comparisons4=new JLabel("Comparisons:");
    inp4.add(comparisons4);
    inp4.add(swaps4);    
    
    panel6.setBounds(10,600,500,90);
    panel6.setLayout(new GridLayout(1,4, 5,5));
    
    
    this.setSize(550,730);
    this.setVisible(true);
    this.setLayout(null);
  }
  public void actionPerformed(ActionEvent e) {
    
    if (e.getSource()==b1)
    {
      numbers = Integer.parseInt(text1.getText()); 
      a=new int [numbers];
      for (int b=0; b<numbers; b++)
      {
        random = (int )(Math. random() * numbers )+ 1;
        System.out.println(random);
        model.addElement(random);
        a[b]=random;
      }
    }
    if (e.getSource()==b2) {
      swap[0]=0;
      comp[0]=0;
      bs=new int[numbers];
      for(int bb=0;bb<numbers;bb++){
        bs[bb]=a[bb];
        System.out.println("a"+a[bb]);
      }
      
      for (int m=numbers-1;m>=1;m--){
        flag=0;
        for (int n=0;n<m;n++){
          comp[0]++;
          if (bs[n+1]<bs[n]){
            temp=bs[n+1];
            bs[n+1]=bs[n];
            bs[n]=temp;
            flag=1;
            swap[0]++;
          }
        }
        
        if (flag==0){
          m=0;
        }
      }
      for(int bb=0;bb<numbers;bb++){
        System.out.println("b"+bs[bb]);
        model1.addElement(bs[bb]);
      }
      System.out.println("swaps "+swap[0]+" comparison "+comp[0]);
      swaps1.setText("Swaps="+swap[0]);
      comparisons1.setText("Comparisions="+comp[0]);
    }
    
    if (e.getSource()==b3){
      swap[0]=0;
      comp[0]=0;
      System.out.println("Work");
      for (int n=0;n<numbers;n++){
        lowest=a[n];
        lowpos=n;
        
        for (int m=n+1;m<numbers;m++){
          comp[0]++;
          if (a[m]<lowest){
            lowest=a[m];
            lowpos=m;
            swap[0]++;
          }
        }
        temp=a[n];
        a[n]=a[lowpos];
        a[lowpos]=temp;
        System.out.println("Selection sort"+ a[n]);
        System.out.println("swaps "+swap[0]+" comparison "+comp[0]);
        model2.addElement(a[n]);
        swaps2.setText("Swaps="+swap[0]);
        comparisons2.setText("Comparisions="+comp[0]);
      }
    }
    if (e.getSource()==b4){
      System.out.print("OOOO");
      aa=new int [numbers];
      b=new int [numbers];

      b[0]=a[0];
      
      for (int m=1;m<numbers;m++){
        flag=0;
        for (int n=0;n<m;n++){
          
          if (a[m]<b[n]){
            flag=1;
            for (int o=m;o>n;o--){
              b[o]=b[o-1];
              swap[0]++;
            }
            b[n]=a[m];
            n=m;
          }
        }
        if (flag==0)
          b[m]=a[m];
        comp[0]++;
      }
      
      for(int ab=0;ab<numbers;ab++){
        System.out.println("seomthing "+b[ab]);
        model3.addElement(b[ab]);
        swaps3.setText("Swaps="+swap[0]);
        comparisons3.setText("Comparisions="+comp[0]);
      }
    }
    
    if (e.getSource()==b5){
      c=new int[numbers];
      lo = a[0];
      hi = numbers+1;
      flag=0;
      if (lo >= hi) {
        return;
      }
      int pivot = a[lo];
      while (lo < hi) {
        flag=0;
        while (lo<hi && flag==0) {
          hi--;
          if (a[hi]<pivot){
            flag=1;
            a[lo]=a[hi];
          }
        }
        flag=0;
        while (lo<hi && flag==0) {
          lo++;
          if (a[lo]>pivot){
            flag=1;
            a[hi]=a[lo];
            System.out.println("Sort"+c[hi]);
          }
        }
      }
      if (lo==hi)
      {
        a[hi]=pivot;
      }

      
    }
  }
}




