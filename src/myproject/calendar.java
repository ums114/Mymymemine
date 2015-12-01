package myproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class calendar extends JPanel {
 protected int yy;
 protected int mm, dd;
 protected JButton labs[][];
 protected int leadGap = 0;
 Calendar calendar = new GregorianCalendar(); // 자바에서 달력을 만들어주는 calendar를
             // 선언함.(선언안할시 달력기능 x)
 protected final int thisYear = calendar.get(Calendar.YEAR);
 protected final int thisMonth = calendar.get(Calendar.MONTH);
 private JButton b0;
 private JComboBox monthChoice;
 private JComboBox yearChoice;
 JTextPane textPane;
 JTextArea ta_content;
 SimpleDateFormat sdf;
 GregorianCalendar gc;
 JButton b_save;
 GridBagLayout gbl;
 JTextField tf_date, tf_weather, tf_title; // 날짜, 날씨, 제목
 GridBagConstraints gbc;
 String year;
 String month;
 String day;
 
 calendar() { // 년.월,날짜 (정의)클릭하게 만듬
  super();
  // 여기부터 수정!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  JPanel p = new JPanel(new BorderLayout());
  // 전체 돗자리
  gbl = new GridBagLayout();
  gbc = new GridBagConstraints();
  JPanel p1 = new JPanel(gbl);
  gbc.fill = gbc.BOTH;
  // 컴포넌트가 격자보가 작을때 처리..
  gbc.insets = new Insets(5, 5, 5, 5);
  // 격자와 격자사이의 여백
  tf_date = new JTextField("", 10);
  tf_weather = new JTextField("", 10);
  tf_title = new JTextField("", 10);
  ta_content = new JTextArea("", 8, 10);
  b_save = new JButton("저 장");
  gc = new GregorianCalendar();
  sdf = new SimpleDateFormat("yy.MM.dd HH:mm E요일");
  gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc
    .get(Calendar.DAY_OF_MONTH), gc.get(Calendar.HOUR_OF_DAY), gc
    .get(Calendar.MINUTE));
  tf_date.setText(sdf.format(gc.getTime()));
  tf_date.setEnabled(false);
  JPanel p2 = new JPanel();
  p.add(p2, "South");
  setYYMMDD(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
    calendar.get(Calendar.DAY_OF_MONTH)); // 달 목록
              // 추가(2010년,2011년등...)
  buildGUI(); // 이거 지우면 아예 실행 x
  recompute(); // 이거 지우면 1~31일까지 표시 안됨.(오늘의 날짜도 빨강색으로 표시안됨)
 }
 
 //private JTextPane textPane ;
 

  
 

 private void setYYMMDD(int year, int month, int today) { // 현재날짜 숫자에 맞게
                // 설정해준다 .
  yy = year;
  mm = month;
  dd = today;
 }
 String[] months = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월",
   "10월", "11월", "12월" };
 // 경계(날짜로 달선택하기)
 private void buildGUI() {
  getAccessibleContext().setAccessibleDescription(
    "Calendar not accessible yet. Sorry!");
  setBorder(BorderFactory.createEtchedBorder());
  setLayout(new BorderLayout());
  setLayout(new BorderLayout());// 그냥 1
  JPanel tp = new JPanel(); // 달선택 하는것(전체적인 틀(달력))
  tp.add(monthChoice = new JComboBox()); // (달 선택할수있는것)
  for (int i = 0; i < months.length; i++)
   // 달에 날짜를 선택함.
   monthChoice.addItem(months[i]); // 달의 콤보박스 x
  monthChoice.setSelectedItem(months[mm]); // 지금 현재 달찾는 기능 x
  monthChoice.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) { // 달 선택의 이벤트 처리를 하는
               // 기능.
    int i = monthChoice.getSelectedIndex();
    if (i >= 0) {
     mm = i;
     recompute();
    }
   }
  });
  monthChoice.getAccessibleContext().setAccessibleName("Months"); // 달선택
  monthChoice.getAccessibleContext().setAccessibleDescription(
    "Choose a month of the year"); // 년도 선택
  tp.add(yearChoice = new JComboBox()); // 년도에 관한것들
  yearChoice.setEditable(true);
  for (int i = yy - 5; i < yy + 5; i++)
   yearChoice.addItem(Integer.toString(i));
  yearChoice.setSelectedItem(Integer.toString(yy));
  yearChoice.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
    int i = yearChoice.getSelectedIndex();
    if (i >= 0) {
     yy = Integer.parseInt(yearChoice.getSelectedItem()
       .toString());
     recompute();
    }
   }
  });
  add(BorderLayout.CENTER, tp); // (왼쪽,가운데정렬,오른쪽정렬)
  JPanel bp = new JPanel();
  bp.setLayout(new GridLayout(7, 7)); // 7x7 폼
  labs = new JButton[6][7]; // 6x7 폼
  bp.add(b0 = new JButton("일")); // 월~일까지 버튼에 기입
  bp.add(new JButton("월"));
  bp.add(new JButton("화"));
  bp.add(new JButton("수"));
  bp.add(new JButton("목"));
  bp.add(new JButton("금"));
  bp.add(new JButton("토"));
  ActionListener dateSetter = new ActionListener() { // 27일 눌렀을때 창이 뜨게
               // 하는기능.
   public void actionPerformed(ActionEvent e) {
    // 버튼 이벤트 관한것들.

    
    
    

   }
  };
  for (int i = 0; i < 6; i++)
   // 전체적인 폼을 만듬( 행과열)
   for (int j = 0; j < 7; j++) {
    bp.add(labs[i][j] = new JButton(""));
    labs[i][j].addActionListener(dateSetter);// 151
   }
  add(BorderLayout.SOUTH, bp);
 }
 public final static int dom[] = { 31, 28, 31, 30, /* jan feb mar apr */// 달들에
                   // 있는날짜들을
                   // 빼줌.
   31, 30, 31, 31, /* may jun jul aug */
   30, 31, 30, 31 /* sep oct nov dec */
 };
 // 윤년 만들기
 protected void recompute() {
  if (mm < 0 || mm > 11)
   throw new IllegalArgumentException("Month " + mm
     + " bad, must be 0-11");
  clearDayActive();
  calendar = new GregorianCalendar(yy, mm, dd); // 오늘 날짜 출력(현재날짜 출력)
  leadGap = new GregorianCalendar(yy, mm, 1).get(Calendar.DAY_OF_WEEK) - 1;
  int daysInMonth = dom[mm];
  if (isLeap(calendar.get(Calendar.YEAR)) && mm > 1)
   ++daysInMonth;
  // Blank out the labels before 1st day of month
  for (int i = 0; i < leadGap; i++) {
   labs[0][i].setText("");
  }
  // Fill in numbers for the day of month.
  for (int i = 1; i <= daysInMonth; i++) {
   JButton b = labs[(leadGap + i - 1) / 7][(leadGap + i - 1) % 7];
   b.setText(Integer.toString(i));
  }
  // 7 days/week * up to 6 rows
  for (int i = leadGap + 1 + daysInMonth; i < 6 * 7; i++) {
   labs[(i) / 7][(i) % 7].setText("");
  }
  // Shade current day, only if current month
  if (thisYear == yy && mm == thisMonth)
   setDayActive(dd); // shade the box for today
   // Say we need to be drawn on the screen
  repaint();
 }
 public boolean isLeap(int year) { // 윤년 만들기
  if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
   return true;
  return false;
 }
 public void setDate(int yy, int mm, int dd) { // 윤년 만들기
  this.yy = yy;
  this.mm = mm;
  this.dd = dd;
  recompute();
 }
 // 숫자없으면 데이터 표현 x(다음으로 넘어감)
 private void clearDayActive() {
  JButton b;
  if (activeDay > 0) {
   b = labs[(leadGap + activeDay - 1) / 7][(leadGap + activeDay - 1) % 7];
   b.setBackground(b0.getBackground());
   b.repaint();
   activeDay = -1;
  }
 }
 private int activeDay = -1;
 // 달에 있는 날자 표기함
 public void setDayActive(int newDay) {
  clearDayActive();
  if (newDay <= 0)
   dd = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
  else
   dd = newDay;
  Component square = labs[(leadGap + newDay - 1) / 7][(leadGap + newDay - 1) % 7];
  square.setBackground(Color.red);
  square.repaint();
  activeDay = newDay;
 }
 
 
 //프로그램 메인
 public static void main(String[] av) {
  JFrame f = new JFrame("SMA8"); //cal 폼
  Container c = f.getContentPane(); // 모양을 얻어서 c에 넣겠다.
  c.setLayout(null);
  c.setLayout(new FlowLayout());
  c.add(new calendar()); // 대상추가
  f.pack();
  f.setVisible(true);
  
 
 }
}