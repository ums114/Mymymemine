package test_ex;


import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
class grader extends Frame implements ActionListener, WindowListener{
 private MenuBar mb;
 private Menu mn;
 private MenuItem mi;
 private Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
 private TextField t1,t2,t3;
 private Button b1,b2,b3,b4;
 private TextArea ta;
 private double a,b,res;
 private String s,str,str1,str2,str3,str4,str5;
 private FileDialog fileDialog;      // ���� ���̾�α�(�����Ҷ�) 
 private String fileName;                // ������ �̸��� �Ѿ�� ���� 
 
 public void actionPerformed(ActionEvent e){
  mi = (MenuItem)e.getSource();
   s = mi.getLabel();
  if(s.equals("����")){
   System.exit(0);
  }else{
   
   l1.setText(s+"�л��� ������ �Է��մϴ�");
  }
   }
 class ButtonEventListener implements ActionListener  {   
  public void actionPerformed(ActionEvent ev){
    a = Double.parseDouble(t2.getText());  
    b = Double.parseDouble(t3.getText());  
    res = (0.5*a)+(0.5*b);
    l9.setText(String.valueOf(res));  
   
    
  
   switch((int)res/10){
   case 10:
   case 9:
    l6.setText("A����");
    break;
   case 8:
    l6.setText("B����");
    break;
   case 7:
    l6.setText("C����");
    break;
   case 6:
    l6.setText("D����");
    break;
   default:
    l6.setText("F����");
   }
   b3 = (Button)ev.getSource();
   str = b3.getLabel();
   if(str.equals(" �� �� ȭ ")){
    t1.setText(null);
    t2.setText(null);
    t3.setText(null);
    l9.setText(null);
    l6.setText(null);
   }
   
   b2 = (Button)ev.getSource();
   str1 = b2.getLabel();
   str2 = t1.getText();
   str3 = l9.getText();
   str4 = l6.getText();
   if(str1.equals(" List �Է� ")){
      ta.append("      " + s + "      ");
      ta.append(str2 + "       ");
      ta.append(str3 + "          ");
      ta.append(str4 + "\n");
   }
   
   
   
   String getAction = ev.getActionCommand();    // getAction ������ Ŀ�ǵ� �޼ҵ带!! 
         String fileName = null;        // ���� �̸��� ���� ���� 
         String tempText = null;        // �ؽ�Ʈ ���� �ִ��� ������
         File file;                // ���ϻ������� 
         FileReader fileReader = null;    // ������ �о�ú���(���ϰ���������ָ� ������)   ��� FileInputStream�ۿ�
         FileOutputStream fileOutputStream;    // ������ ������
         PrintStream printStream;            //  ���� ����� ���ñ� ����
         BufferedReader bufferedReader = null;    // �о�� ������ ������ ������ ���� 
         String temp = null;                    // ������ ������ �о�� �ӽ� ������� 
         
         
         
         b4 = (Button)ev.getSource();
         str5 = b4.getLabel();
         if(str5.equals(" �� ��  �� �� ")) 
         { 
            
             fileDialog = new FileDialog(this,"�����մϴ� ",FileDialog.SAVE);        // ���� ���̾�α׸� �����Ѵ�. 
             fileDialog.setVisible(true);                                           // ���̴°�(Ʈ��)
             fileName = fileDialog.getDirectory() + fileDialog.getFile();           // ���ϳ��� ������ ���丮�� ���ϸ��� ���� ���� 
             file = new File(fileName);                                             // ������ ���� ���� 
              
             try 
             {     
                 fileOutputStream = new FileOutputStream(file); 
                 printStream = new PrintStream(fileOutputStream); 
                 printStream.print(ta.getText()); 
             } 
             catch (Exception e)  
             { 
                 e.printStackTrace(); 
             }
             setTitle(fileName); 
         } 
         
         
  }
  
 }