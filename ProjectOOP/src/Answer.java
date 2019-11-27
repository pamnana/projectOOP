
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class Answer extends javax.swing.JFrame {

    private Chapter1 main1;
    private Chapter2 main2;
    private Chapter3 main3;
    private Chapter4 main4;
    private Chapter2ForMP main5;

    public int page;
    public static boolean isWinner;

    /**
     * Creates new form Answer
     */
    public Answer() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/images/icon/as.png"));   
    }

    public Answer(Chapter1 a) {
        this.main1 = a;
        page = 1;
        initComponents();
    }

    public Answer(Chapter2 a) {
        this.main2 = a;
        page = 2;
        initComponents();
    }

    public Answer(Chapter3 a) {
        this.main3 = a;
        page = 3;
        initComponents();
    }

    public Answer(Chapter4 a) {
        this.main4 = a;
        page = 4;
        initComponents();
    }
    public Answer(Chapter2ForMP a) {
        this.main5 = a;
        page = 2;
        initComponents();
    }

    public static boolean isIsWinner() {
        return isWinner;
    }

    public static void setIsWinner(boolean isWinner) {
        Answer.isWinner = isWinner;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Answer");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("RSU", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(1064, 728));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 220, 800, 70);

        jLabel6.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("แปลว่า แมว");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setMaximumSize(new java.awt.Dimension(1064, 728));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 300, 1020, 50);

        jLabel4.setFont(new java.awt.Font("RSU", 0, 72)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("aa");
        jLabel4.setToolTipText("");
        jLabel4.setMaximumSize(new java.awt.Dimension(1064, 728));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 50, 1020, 92);

        jButton1.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jButton1.setText("Retry");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 570, 110, 55);

        jButton2.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jButton2.setText("Quit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 570, 110, 55);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/end.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1030, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/json/RandomJSON.json"));
            JSONArray array = (JSONArray) obj;
            JSONObject obj2;
            obj2 = (JSONObject) array.get(0);

            Vocab vcb1 = new Vocab((String) obj2.get("chapter"), (String) obj2.get("word"), (String) obj2.get("meaning"));
            getjLabel6().setText("แปลว่า " + vcb1.getMeaning());
            getjLabel1().setText(vcb1.getWord());
            if (page == 1) {
                if (main1.checkWinner == false) {
                    getjLabel4().setText("DON'T GIVE UP!");
                    try {
                        File musicPath = new File("src/sound/lose.wav");
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                } else if (main1.checkWinner != false) {
                    getjLabel4().setText("Congratulations!");
                    try {
                        File musicPath = new File("src/sound/win.wav");
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else if (page == 2) {
                if (main2.checkWinner == false) {
                    getjLabel4().setText("DON'T GIVE UP!");
                    try {
                        File musicPath = new File("src/sound/lose.wav");
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else if (main2.checkWinner != false) {
                    getjLabel4().setText("Congratulations!");
                    try {
                        File musicPath = new File("src/sound/win.wav");
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else if (page == 3) {
                if (main3.checkWinner == false) {
                    getjLabel4().setText("DON'T GIVE UP!");
                    try {
                        File musicPath = new File("src/sound/lose.wav");
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else if (main3.checkWinner != false) {
                    getjLabel4().setText("Congratulations!");
                    try {
                        File musicPath = new File("src/sound/win.wav");
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else if (page == 4) {
                if (main4.checkWinner == false) {
                    getjLabel4().setText("DON'T GIVE UP!");
                    try {
                        File musicPath = new File("src/sound/lose.wav");
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else if (main4.checkWinner != false) {
                    getjLabel4().setText("Congratulations!");
                    try {
                        File musicPath = new File("src/sound/win.wav");
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        new SelectMode().setVisible(true);
        this.setVisible(false);
        this.dispose();
        try {
            File musicPath = new File("src/sound/click.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new Category().setVisible(true);
        this.setVisible(false);
        this.dispose();

        try {
            File musicPath = new File("src/sound/click.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    public static JLabel getjLabel1() {
        return jLabel1;
    }

    public static void setjLabel1(JLabel jLabel1) {
        Answer.jLabel1 = jLabel1;
    }

    public static JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public static JLabel getjLabel6() {
        return jLabel6;
    }

    public static void setjLabel6(JLabel jLabel6) {
        Answer.jLabel6 = jLabel6;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Answer().setVisible(true);

                //new SingleMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
