import java.io.*;  
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JJText implements ActionListener{ 

static JTextArea tt;
static JTextField ttt;
static int nn;
static JComboBox cc;
static JButton bb;
static JScrollPane scrollPane = new JScrollPane();
static int Num;
static String ter;
static int Length = 2017;
static String text;
static int Fnt = 18;



public static void main(String[] args)
{
JFrame frm = new JFrame("JJText");
      
      Container contentPane = frm.getContentPane();
      Font font = new Font("Times New Roman", Font.PLAIN,Fnt);
      tt = new JTextArea();
      tt.setBackground(Color.BLUE);
      tt.setForeground(Color.YELLOW);
      tt.setCaretColor(Color.YELLOW);
      tt.setSelectionColor(Color.YELLOW);
      tt.setFont(font);  
      JScrollPane tmp = new JScrollPane(tt);
      JPanel pank = new JPanel(new GridLayout());
      JLabel z = new JLabel("Powered by JblockTech || EST: " + Length );
      z.setBackground(Color.BLACK);
      z.setForeground(Color.YELLOW);
      JLabel zz = new JLabel("<html><font size =6><b>Options: \n</b></html>", JLabel.CENTER);
      zz.setBackground(Color.BLACK);
      zz.setForeground(Color.YELLOW);
      JPanel pak = new JPanel(new FlowLayout());
      JPanel pannkk = new JPanel(new FlowLayout());
      JPanel pankk = new JPanel(new GridLayout(10,0));
      JPanel pun = new JPanel(new GridLayout(7,0));
      pun.setBackground(Color.BLACK);
      JPanel punz = new JPanel(new GridLayout(7,0));
      pannkk.setBackground(Color.BLACK);
      pannkk.add(z);
      pak.add(zz, BorderLayout.NORTH);
      pak.setBackground(Color.BLACK);
      pankk.setBackground(Color.BLACK);
      pankk.add(bb = new JButton("Save as:"));
      bb.setBackground(Color.YELLOW);
         bb.addActionListener(new ActionListener(){  
                  public void actionPerformed(ActionEvent e){
         JFrame frm = new JFrame("SAVE");
         Container contentPane = frm.getContentPane();
         contentPane.setLayout(new FlowLayout());
         JLabel zzz = new JLabel("Save as: "); 
            /* Beginning Block. Seth Here is the block of Code you'll modify. 
            So the User can Save as whatever file they'd like. Add an Action-
            listener and put your code there. */
         zzz.setBackground(Color.BLACK);
         zzz.setForeground(Color.YELLOW);
         JPanel p = new JPanel(new GridLayout(1,0));
         p.add(ttt = new JTextField("", 10));
         contentPane.setBackground(Color.BLACK);
         contentPane.setForeground(Color.YELLOW);
         contentPane.add(zzz);
         contentPane.add(p);
         JPanel dadss = new JPanel(new FlowLayout());
         dadss.add(bb = new JButton("Enter"));
         bb.setBackground(Color.GREEN);
         bb.setForeground(Color.BLACK);
            bb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            try {
            String title = ttt.getText();
            FileWriter fw = new FileWriter(new File(title+".bat"));
            fw.write(tt.getText());
            fw.close();
            }
            catch (IOException IOE){
            System.out.println("no");
            }
            }
            }); 
      dadss.setBackground(Color.BLACK);
      contentPane.add(dadss);
      frm.pack();
		frm.setSize(750, 305);
      frm.setResizable(false);
      frm.setVisible(true);
      return;
      }
      });

      
      pankk.add(bb = new JButton("Color Settings:"));
      bb.setBackground(Color.YELLOW);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         JFrame frm = new JFrame("Color Settings");
         Container contentPane = frm.getContentPane();
         contentPane.setLayout(new FlowLayout());
         JLabel Backg = new JLabel("<html><font size =6><b>Change your Background to the following colors:\n</b></html>" );
         Backg.setBackground(Color.BLUE);
         Backg.setForeground(Color.YELLOW);
         JLabel Foreg = new JLabel("<html><font size =6><b>Change your Text to the following colors:\n</b></html>" );
         Foreg.setBackground(Color.BLUE);
         Foreg.setForeground(Color.YELLOW);
         contentPane.add(Backg);
         JPanel p1 = new JPanel(new GridLayout(2,4, 2,2));
         p1.setBackground(Color.BLUE);
         p1.add(bb = new JButton("Green"));
         bb.setBackground(Color.GREEN);
            bb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            tt.setBackground(Color.GREEN);
            }
            });
            p1.add(bb = new JButton("Blue"));
            bb.setForeground(Color.YELLOW);
            bb.setBackground(Color.BLUE);
            bb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            tt.setBackground(Color.BLUE);
            }
            });
         p1.add(bb = new JButton("Magenta"));
         bb.setBackground(Color.MAGENTA);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setBackground(Color.MAGENTA);
         }
         });
         p1.add(bb = new JButton("Red"));
         bb.setBackground(Color.RED);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setBackground(Color.RED);
         }
         });
         p1.add(bb = new JButton("Black"));
         bb.setBackground(Color.BLACK);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setBackground(Color.BLACK);
         }
         });
         p1.add(bb = new JButton("White"));
         bb.setBackground(Color.WHITE);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setBackground(Color.WHITE);
         }
         });
         p1.add(bb = new JButton("Yellow"));
         bb.setBackground(Color.YELLOW);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setBackground(Color.YELLOW);
         }
         });
         p1.add(bb = new JButton("Orange"));
         bb.setBackground(Color.ORANGE);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setBackground(Color.ORANGE);
         }
         });
         contentPane.add(p1);
         JPanel p2 = new JPanel(new GridLayout(2,4, 2,2));
         p2.setBackground(Color.BLUE);
         p2.add(bb = new JButton("Green"));
         bb.setBackground(Color.GREEN);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setForeground(Color.GREEN);
         tt.setCaretColor(Color.GREEN);
         tt.setSelectionColor(Color.GREEN);
         }
         });
         p2.add(bb = new JButton("Blue"));
         bb.setBackground(Color.BLUE);
         bb.setForeground(Color.YELLOW);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setForeground(Color.BLUE);
         tt.setCaretColor(Color.BLUE);
         tt.setSelectionColor(Color.BLUE);
         }
         });
         p2.add(bb = new JButton("Magenta"));
         bb.setBackground(Color.MAGENTA);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setForeground(Color.MAGENTA);
         tt.setCaretColor(Color.MAGENTA);
         tt.setSelectionColor(Color.MAGENTA);
         }
         });
         p2.add(bb = new JButton("Red"));
         bb.setBackground(Color.RED);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setForeground(Color.RED);
         tt.setCaretColor(Color.RED);
         tt.setSelectionColor(Color.RED);
         }
         });
         p2.add(bb = new JButton("Black"));
         bb.setBackground(Color.BLACK);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setForeground(Color.BLACK);
         tt.setCaretColor(Color.BLACK);
         tt.setSelectionColor(Color.BLACK);
         }
         });
         p2.add(bb = new JButton("White"));
         bb.setBackground(Color.WHITE);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setForeground(Color.WHITE);
         tt.setCaretColor(Color.WHITE);
         tt.setSelectionColor(Color.WHITE);
         }
         });
         p2.add(bb = new JButton("Yellow"));
         bb.setBackground(Color.YELLOW);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setForeground(Color.YELLOW);
         tt.setCaretColor(Color.YELLOW);
         tt.setSelectionColor(Color.YELLOW);
         }
         });
         p2.add(bb = new JButton("Orange"));
         bb.setBackground(Color.ORANGE);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         tt.setForeground(Color.ORANGE);
         tt.setCaretColor(Color.ORANGE);
         tt.setSelectionColor(Color.ORANGE);
         }
         });
      JPanel p3 = new JPanel(new FlowLayout());
      p3.setBackground(Color.BLUE);
      contentPane.setBackground(Color.BLUE);
      contentPane.add(p3);
      contentPane.add(Foreg);
      contentPane.add(p2);
      contentPane.add(p2);
      frm.pack();
		frm.setSize(750, 315);
      frm.setResizable(false);
      frm.setVisible(true);
      return;
      }
      });  
      pankk.add(bb = new JButton("Font:"));
      bb.setBackground(Color.YELLOW);
         bb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         JFrame frm = new JFrame("Font Settings");
         Container contentPane = frm.getContentPane();
         contentPane.setLayout(new FlowLayout());
         JLabel zzz = new JLabel("Enter the new Font: ");
         zzz.setBackground(Color.BLACK);
         zzz.setForeground(Color.YELLOW);
         JPanel p = new JPanel(new GridLayout(1,0));
         p.add(ttt = new JTextField("", 10));
         contentPane.setBackground(Color.BLACK);
         contentPane.setForeground(Color.YELLOW);
         contentPane.add(zzz);
         contentPane.add(p);
         JPanel dadss = new JPanel(new FlowLayout());
         dadss.add(bb = new JButton("Set Font"));
         bb.setBackground(Color.GREEN);
         bb.setForeground(Color.BLACK);
         bb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            nn = Integer.parseInt(ttt.getText());
            int Fnt = nn;
            Font font = new Font("Times New Roman", Font.PLAIN,Fnt);
            tt.setFont(font);
            ttt.setText("");
            }
            });
      dadss.setBackground(Color.BLACK);
      contentPane.add(dadss);
      frm.pack();
		frm.setSize(750, 305);
      frm.setResizable(false);
      frm.setVisible(true);
      return;
      }
      });
      pank.add(tmp);
      pankk.setBackground(Color.BLACK);
      contentPane.setLayout(new BorderLayout());
      contentPane.add(pankk, BorderLayout.WEST);
      contentPane.add(pank, BorderLayout.CENTER);
      contentPane.add(pannkk, BorderLayout.SOUTH);
      contentPane.setBackground(Color.BLACK);
      frm.pack();
		frm.setSize(1300,740);
      frm.setMinimumSize(new Dimension(650, 305));
      frm.setResizable(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
   public void actionPerformed(ActionEvent e){
   return;
   }
}
