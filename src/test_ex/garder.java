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
 private FileDialog fileDialog;      // 파일 다이얼로그(저장할때) 
 private String fileName;                // 파일의 이름이 넘어올 변수 
 
 public void actionPerformed(ActionEvent e){
  mi = (MenuItem)e.getSource();
   s = mi.getLabel();
  if(s.equals("종료")){
   System.exit(0);
  }else{
   
   l1.setText(s+"학생의 성적을 입력합니다");
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
    l6.setText("A학점");
    break;
   case 8:
    l6.setText("B학점");
    break;
   case 7:
    l6.setText("C학점");
    break;
   case 6:
    l6.setText("D학점");
    break;
   default:
    l6.setText("F학점");
   }
   b3 = (Button)ev.getSource();
   str = b3.getLabel();
   if(str.equals(" 초 기 화 ")){
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
   if(str1.equals(" List 입력 ")){
      ta.append("      " + s + "      ");
      ta.append(str2 + "       ");
      ta.append(str3 + "          ");
      ta.append(str4 + "\n");
   }
   
   
   
   String getAction = ev.getActionCommand();    // getAction 변수에 커맨드 메소드를!! 
         String fileName = null;        // 파일 이름을 받을 변수 
         String tempText = null;        // 텍스트 에어리어가 있는지 없는지
         File file;                // 파일생성변수 
         FileReader fileReader = null;    // 파일을 읽어올변수(파일경로지정해주면 읽힌다)   사실 FileInputStream밖에
         FileOutputStream fileOutputStream;    // 파일을 쓸변수
         PrintStream printStream;            //  파일 저장용 뭐시기 같다
         BufferedReader bufferedReader = null;    // 읽어온 파일의 내용을 저장할 버퍼 
         String temp = null;                    // 버퍼의 내용을 읽어올 임시 저장공간 
         
         
         
         b4 = (Button)ev.getSource();
         str5 = b4.getLabel();
         if(str5.equals(" 자 료  저 장 ")) 
         { 
            
             fileDialog = new FileDialog(this,"저장합니다 ",FileDialog.SAVE);        // 파일 다이얼로그를 생성한다. 
             fileDialog.setVisible(true);                                           // 보이는거(트루)
             fileName = fileDialog.getDirectory() + fileDialog.getFile();           // 파일네임 변수에 디렉토리와 파일명을 합쳐 저장 
             file = new File(fileName);                                             // 저장할 파일 생성 
              
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