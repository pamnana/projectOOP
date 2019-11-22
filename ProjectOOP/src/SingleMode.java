
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.*;
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
 * @author dell
 */
public class SingleMode extends javax.swing.JFrame {

    Answer a = new Answer();
    public String button = "";
    public int score = 7;
    public Vocab vcb1;

    /**
     * Creates new form SingleMode
     */
    public SingleMode() {

        initComponents();

    }

    public static JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                JSONParser parser = new JSONParser();
                try {
                    Object obj = parser.parse(new FileReader("src\\file1.txt"));
                    JSONArray array = (JSONArray) obj;
                    JSONObject obj2;

                    Random r = new Random();
                    int r_int = r.nextInt(array.size() + 1);
                    obj2 = (JSONObject) array.get(r_int);

                    Vocab vcb1 = new Vocab((String) obj2.get("chapter"), (String) obj2.get("word"), (String) obj2.get("meaning"));

                    JSONObject obj_new = new JSONObject();
                    JSONArray array_new = new JSONArray();
                    obj_new.put("chapter", vcb1.getChapter());
                    obj_new.put("set", vcb1.getSet());
                    obj_new.put("word", vcb1.getWord());
                    obj_new.put("meaning", vcb1.getMeaning());
                    array_new.add(obj_new);

                    FileWriter file = new FileWriter("src\\file2.txt");
                    file.write(array_new.toJSONString());
                    file.flush();
                    file.close();
                    new SingleMode().setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }

                try {

                    Object obj = parser.parse(new FileReader("src\\file2.txt"));
                    JSONArray array = (JSONArray) obj;
                    JSONObject obj2;
                    obj2 = (JSONObject) array.get(0);

                    Vocab vcb1 = new Vocab((String) obj2.get("chapter"), (String) obj2.get("word"), (String) obj2.get("meaning"));
                    getjLabel1().setText(vcb1.getWord());
                    
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        }
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        getB = new javax.swing.JButton();
        getC = new javax.swing.JButton();
        getD = new javax.swing.JButton();
        getE = new javax.swing.JButton();
        getF = new javax.swing.JButton();
        getA = new javax.swing.JButton();
        getH = new javax.swing.JButton();
        getG = new javax.swing.JButton();
        getI = new javax.swing.JButton();
        getK = new javax.swing.JButton();
        getL = new javax.swing.JButton();
        getM = new javax.swing.JButton();
        getP = new javax.swing.JButton();
        getJ = new javax.swing.JButton();
        getO = new javax.swing.JButton();
        getQ = new javax.swing.JButton();
        getT = new javax.swing.JButton();
        getN = new javax.swing.JButton();
        getS = new javax.swing.JButton();
        getR = new javax.swing.JButton();
        getY = new javax.swing.JButton();
        getZ = new javax.swing.JButton();
        getV = new javax.swing.JButton();
        getW = new javax.swing.JButton();
        getX = new javax.swing.JButton();
        getU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(1024, 768));

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("RSU", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ลองทายคำศัพท์ดูสิ ..!");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 50, 371, 70);

        getB.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getB.setForeground(new java.awt.Color(51, 51, 51));
        getB.setText("B");
        getB.setToolTipText("");
        getB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBMouseClicked(evt);
            }
        });
        getB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBActionPerformed(evt);
            }
        });
        jPanel2.add(getB);
        getB.setBounds(500, 400, 60, 61);

        getC.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getC.setForeground(new java.awt.Color(51, 51, 51));
        getC.setText("C");
        getC.setToolTipText("");
        getC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getCMouseClicked(evt);
            }
        });
        jPanel2.add(getC);
        getC.setBounds(590, 400, 60, 61);

        getD.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getD.setForeground(new java.awt.Color(51, 51, 51));
        getD.setText("D");
        getD.setToolTipText("");
        getD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getDMouseClicked(evt);
            }
        });
        jPanel2.add(getD);
        getD.setBounds(680, 400, 60, 61);

        getE.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getE.setForeground(new java.awt.Color(51, 51, 51));
        getE.setText("E");
        getE.setToolTipText("");
        getE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getEMouseClicked(evt);
            }
        });
        getE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEActionPerformed(evt);
            }
        });
        jPanel2.add(getE);
        getE.setBounds(770, 400, 60, 61);

        getF.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getF.setForeground(new java.awt.Color(51, 51, 51));
        getF.setText("F");
        getF.setToolTipText("");
        getF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getFMouseClicked(evt);
            }
        });
        jPanel2.add(getF);
        getF.setBounds(860, 400, 60, 61);

        getA.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getA.setForeground(new java.awt.Color(51, 51, 51));
        getA.setText("A");
        getA.setToolTipText("");
        getA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getAMouseClicked(evt);
            }
        });
        jPanel2.add(getA);
        getA.setBounds(410, 400, 60, 61);

        getH.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getH.setForeground(new java.awt.Color(51, 51, 51));
        getH.setText("H");
        getH.setToolTipText("");
        getH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getHMouseClicked(evt);
            }
        });
        jPanel2.add(getH);
        getH.setBounds(410, 480, 60, 61);

        getG.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getG.setForeground(new java.awt.Color(51, 51, 51));
        getG.setText("G");
        getG.setToolTipText("");
        getG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getGMouseClicked(evt);
            }
        });
        jPanel2.add(getG);
        getG.setBounds(950, 400, 60, 61);

        getI.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getI.setForeground(new java.awt.Color(51, 51, 51));
        getI.setText("I");
        getI.setToolTipText("");
        getI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getIMouseClicked(evt);
            }
        });
        jPanel2.add(getI);
        getI.setBounds(500, 480, 60, 61);

        getK.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getK.setForeground(new java.awt.Color(51, 51, 51));
        getK.setText("K");
        getK.setToolTipText("");
        getK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getKMouseClicked(evt);
            }
        });
        jPanel2.add(getK);
        getK.setBounds(680, 480, 60, 61);

        getL.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getL.setForeground(new java.awt.Color(51, 51, 51));
        getL.setText("L");
        getL.setToolTipText("");
        getL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getLMouseClicked(evt);
            }
        });
        jPanel2.add(getL);
        getL.setBounds(770, 480, 60, 61);

        getM.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getM.setForeground(new java.awt.Color(51, 51, 51));
        getM.setText("M");
        getM.setToolTipText("");
        getM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getMMouseClicked(evt);
            }
        });
        jPanel2.add(getM);
        getM.setBounds(860, 480, 60, 61);

        getP.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getP.setForeground(new java.awt.Color(51, 51, 51));
        getP.setText("P");
        getP.setToolTipText("");
        getP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getPMouseClicked(evt);
            }
        });
        getP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPActionPerformed(evt);
            }
        });
        jPanel2.add(getP);
        getP.setBounds(500, 560, 60, 61);

        getJ.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getJ.setForeground(new java.awt.Color(51, 51, 51));
        getJ.setText("J");
        getJ.setToolTipText("");
        getJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getJMouseClicked(evt);
            }
        });
        getJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getJActionPerformed(evt);
            }
        });
        jPanel2.add(getJ);
        getJ.setBounds(590, 480, 60, 61);

        getO.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getO.setForeground(new java.awt.Color(51, 51, 51));
        getO.setText("O");
        getO.setToolTipText("");
        getO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getOMouseClicked(evt);
            }
        });
        jPanel2.add(getO);
        getO.setBounds(410, 560, 60, 61);

        getQ.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getQ.setForeground(new java.awt.Color(51, 51, 51));
        getQ.setText("Q");
        getQ.setToolTipText("");
        getQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getQMouseClicked(evt);
            }
        });
        jPanel2.add(getQ);
        getQ.setBounds(590, 560, 60, 61);

        getT.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getT.setForeground(new java.awt.Color(51, 51, 51));
        getT.setText("T");
        getT.setToolTipText("");
        getT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getTMouseClicked(evt);
            }
        });
        jPanel2.add(getT);
        getT.setBounds(860, 560, 60, 61);

        getN.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getN.setForeground(new java.awt.Color(51, 51, 51));
        getN.setText("N");
        getN.setToolTipText("");
        getN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getNMouseClicked(evt);
            }
        });
        jPanel2.add(getN);
        getN.setBounds(950, 480, 60, 61);

        getS.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getS.setForeground(new java.awt.Color(51, 51, 51));
        getS.setText("S");
        getS.setToolTipText("");
        getS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getSMouseClicked(evt);
            }
        });
        jPanel2.add(getS);
        getS.setBounds(770, 560, 60, 61);

        getR.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getR.setForeground(new java.awt.Color(51, 51, 51));
        getR.setText("R");
        getR.setToolTipText("");
        getR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getRMouseClicked(evt);
            }
        });
        jPanel2.add(getR);
        getR.setBounds(680, 560, 60, 61);

        getY.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getY.setForeground(new java.awt.Color(51, 51, 51));
        getY.setText("Y");
        getY.setToolTipText("");
        getY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getYMouseClicked(evt);
            }
        });
        jPanel2.add(getY);
        getY.setBounds(680, 640, 60, 61);

        getZ.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getZ.setForeground(new java.awt.Color(51, 51, 51));
        getZ.setText("Z");
        getZ.setToolTipText("");
        getZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getZMouseClicked(evt);
            }
        });
        getZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getZActionPerformed(evt);
            }
        });
        jPanel2.add(getZ);
        getZ.setBounds(770, 640, 60, 61);

        getV.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getV.setForeground(new java.awt.Color(51, 51, 51));
        getV.setText("V");
        getV.setToolTipText("");
        getV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getVMouseClicked(evt);
            }
        });
        jPanel2.add(getV);
        getV.setBounds(410, 640, 60, 61);

        getW.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getW.setForeground(new java.awt.Color(51, 51, 51));
        getW.setText("W");
        getW.setToolTipText("");
        getW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getWMouseClicked(evt);
            }
        });
        getW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getWActionPerformed(evt);
            }
        });
        jPanel2.add(getW);
        getW.setBounds(500, 640, 60, 61);

        getX.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getX.setForeground(new java.awt.Color(51, 51, 51));
        getX.setText("X");
        getX.setToolTipText("");
        getX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getXMouseClicked(evt);
            }
        });
        jPanel2.add(getX);
        getX.setBounds(590, 640, 60, 61);

        getU.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        getU.setForeground(new java.awt.Color(51, 51, 51));
        getU.setText("U");
        getU.setToolTipText("");
        getU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getUMouseClicked(evt);
            }
        });
        jPanel2.add(getU);
        getU.setBounds(950, 560, 60, 61);

        jLabel1.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(530, 80, 390, 70);

        jPanel1.setToolTipText("");
        jPanel1.setDoubleBuffered(false);
        jPanel1.setOpaque(false);
        jPanel1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jPanel1VetoableChange(evt);
            }
        });
        jPanel1.setLayout(new java.awt.GridLayout(2, 8));

        jLabel4.setBackground(new java.awt.Color(255, 36, 168));
        jLabel4.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("____");
        jLabel4.setToolTipText("");
        jLabel4.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jLabel4VetoableChange(evt);
            }
        });
        jPanel1.add(jLabel4);

        jLabel6.setBackground(new java.awt.Color(255, 36, 168));
        jLabel6.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("____");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);

        jLabel16.setBackground(new java.awt.Color(255, 36, 168));
        jLabel16.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("____");
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16);

        jLabel17.setBackground(new java.awt.Color(255, 36, 168));
        jLabel17.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("____");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17);

        jLabel18.setBackground(new java.awt.Color(255, 36, 168));
        jLabel18.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("____");
        jLabel18.setToolTipText("");
        jPanel1.add(jLabel18);

        jLabel19.setBackground(new java.awt.Color(255, 36, 168));
        jLabel19.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("____");
        jLabel19.setToolTipText("");
        jPanel1.add(jLabel19);

        jLabel20.setBackground(new java.awt.Color(255, 36, 168));
        jLabel20.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("____");
        jLabel20.setToolTipText("");
        jPanel1.add(jLabel20);

        jLabel21.setBackground(new java.awt.Color(255, 36, 168));
        jLabel21.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("____");
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21);

        jLabel22.setBackground(new java.awt.Color(255, 36, 168));
        jLabel22.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("____");
        jLabel22.setToolTipText("");
        jPanel1.add(jLabel22);

        jLabel23.setBackground(new java.awt.Color(255, 36, 168));
        jLabel23.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("____");
        jLabel23.setToolTipText("");
        jPanel1.add(jLabel23);

        jLabel24.setBackground(new java.awt.Color(255, 36, 168));
        jLabel24.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("____");
        jLabel24.setToolTipText("");
        jPanel1.add(jLabel24);

        jLabel25.setBackground(new java.awt.Color(255, 36, 168));
        jLabel25.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("____");
        jLabel25.setToolTipText("");
        jPanel1.add(jLabel25);

        jLabel26.setBackground(new java.awt.Color(255, 36, 168));
        jLabel26.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("____");
        jLabel26.setToolTipText("");
        jPanel1.add(jLabel26);

        jLabel27.setBackground(new java.awt.Color(255, 36, 168));
        jLabel27.setFont(new java.awt.Font("RSU", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("____");
        jLabel27.setToolTipText("");
        jPanel1.add(jLabel27);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(430, 180, 570, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1.jpg"))); // NOI18N
        jLabel9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel9ComponentShown(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 1020, 750);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void getBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBActionPerformed

    private void getEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getEActionPerformed

    private void getJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getJActionPerformed

    private void getAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getAMouseClicked
        // TODO add your handling code here:
        button = "A";
        score--;
        if (score > 0) {
            getA.setVisible(false);
        }
    }//GEN-LAST:event_getAMouseClicked

    private void getBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBMouseClicked
        // TODO add your handling code here:
        button = "B";
        score--;
        if (score > 0) {
            getB.setVisible(false);
        }
    }//GEN-LAST:event_getBMouseClicked

    private void getCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getCMouseClicked
        // TODO add your handling code here:
        button = "C";
        score--;
        if (score > 0) {
            getC.setVisible(false);
        }
    }//GEN-LAST:event_getCMouseClicked

    private void getDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getDMouseClicked
        // TODO add your handling code here:
        button = "D";
        score--;
        if (score > 0) {
            getD.setVisible(false);
        }
    }//GEN-LAST:event_getDMouseClicked

    private void getEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getEMouseClicked
        // TODO add your handling code here:
        button = "E";
        score--;
        if (score > 0) {
            getE.setVisible(false);
        }
    }//GEN-LAST:event_getEMouseClicked

    private void getFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getFMouseClicked
        // TODO add your handling code here:
        button = "F";
        score--;
        if (score > 0) {
            getF.setVisible(false);
        }
    }//GEN-LAST:event_getFMouseClicked

    private void getGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getGMouseClicked
        // TODO add your handling code here:
        button = "G";
        score--;
        if (score > 0) {
            getG.setVisible(false);
        }
    }//GEN-LAST:event_getGMouseClicked

    private void getHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getHMouseClicked
        // TODO add your handling code here:
        button = "H";
        score--;
        if (score > 0) {
            getH.setVisible(false);
        }
    }//GEN-LAST:event_getHMouseClicked

    private void getIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getIMouseClicked
        // TODO add your handling code here:
        button = "I";
        score--;
        if (score > 0) {
            getI.setVisible(false);
        }
    }//GEN-LAST:event_getIMouseClicked

    private void getJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getJMouseClicked
        // TODO add your handling code here:
        button = "J";
        score--;
        if (score > 0) {
            getJ.setVisible(false);
        }
    }//GEN-LAST:event_getJMouseClicked

    private void getKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getKMouseClicked
        // TODO add your handling code here:
        button = "K";
        score--;
        if (score > 0) {
            getK.setVisible(false);
        }
    }//GEN-LAST:event_getKMouseClicked

    private void getLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getLMouseClicked
        // TODO add your handling code here:
        button = "L";
        score--;
        if (score > 0) {
            getL.setVisible(false);
        }
    }//GEN-LAST:event_getLMouseClicked

    private void getMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getMMouseClicked
        // TODO add your handling code here:
        button = "M";
        score--;
        if (score > 0) {
            getM.setVisible(false);
        }
    }//GEN-LAST:event_getMMouseClicked

    private void getNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getNMouseClicked
        // TODO add your handling code here:
        button = "N";
        score--;
        if (score > 0) {
            getN.setVisible(false);
        }
    }//GEN-LAST:event_getNMouseClicked

    private void getOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getOMouseClicked
        // TODO add your handling code here:
        button = "O";
        score--;
        if (score > 0) {
            getO.setVisible(false);
        }
    }//GEN-LAST:event_getOMouseClicked

    private void getPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getPMouseClicked
        // TODO add your handling code here:
        button = "P";
        score--;
        if (score > 0) {
            getP.setVisible(false);
        }
    }//GEN-LAST:event_getPMouseClicked

    private void getQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getQMouseClicked
        // TODO add your handling code here:
        button = "Q";
        score--;
        if (score > 0) {
            getQ.setVisible(false);
        }
    }//GEN-LAST:event_getQMouseClicked

    private void getRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getRMouseClicked
        // TODO add your handling code here:
        button = "R";
        score--;
        if (score > 0) {
            getR.setVisible(false);
        }
    }//GEN-LAST:event_getRMouseClicked

    private void getSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getSMouseClicked
        // TODO add your handling code here:
        button = "S";
        score--;
        if (score > 0) {
            getS.setVisible(false);
        }
    }//GEN-LAST:event_getSMouseClicked

    private void getTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getTMouseClicked
        // TODO add your handling code here:
        button = "T";
        score--;
        if (score > 0) {
            getT.setVisible(false);
        }
    }//GEN-LAST:event_getTMouseClicked

    private void getUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getUMouseClicked
        // TODO add your handling code here:
        button = "U";
        score--;
        if (score > 0) {
            getU.setVisible(false);
        }
    }//GEN-LAST:event_getUMouseClicked

    private void getVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getVMouseClicked
        // TODO add your handling code here:
        button = "V";
        score--;
        if (score > 0) {
            getV.setVisible(false);
        }
    }//GEN-LAST:event_getVMouseClicked

    private void getWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getWMouseClicked
        // TODO add your handling code here:
        button = "W";
        score--;
        if (score > 0) {
            getW.setVisible(false);
        }
    }//GEN-LAST:event_getWMouseClicked

    private void getXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getXMouseClicked
        // TODO add your handling code here:
        button = "X";
        score--;
        if (score > 0) {
            getX.setVisible(false);
        }
    }//GEN-LAST:event_getXMouseClicked

    private void getYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getYMouseClicked
        // TODO add your handling code here:
        button = "Y";
        score--;
        if (score > 0) {
            getY.setVisible(false);
        }
    }//GEN-LAST:event_getYMouseClicked

    private void getZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getZActionPerformed

    private void getZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getZMouseClicked
        // TODO add your handling code here:
        button = "Z";
        score--;
        if (score > 0) {
            getZ.setVisible(false);
        }
    }//GEN-LAST:event_getZMouseClicked

    private void getPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPActionPerformed

    private void jLabel9ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel9ComponentShown
        // TODO add your handling code here:


    }//GEN-LAST:event_jLabel9ComponentShown

    private void jPanel1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPanel1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1VetoableChange

    private void jLabel4VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jLabel4VetoableChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel4VetoableChange

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
        // TODO add your handling code here:

        jLabel1.setText(vcb1.getMeaning());
        jLabel1.setVisible(true);
    }//GEN-LAST:event_jLabel1ComponentShown

    private void getWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getWActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getA;
    private javax.swing.JButton getB;
    private javax.swing.JButton getC;
    private javax.swing.JButton getD;
    private javax.swing.JButton getE;
    private javax.swing.JButton getF;
    private javax.swing.JButton getG;
    private javax.swing.JButton getH;
    private javax.swing.JButton getI;
    private javax.swing.JButton getJ;
    private javax.swing.JButton getK;
    private javax.swing.JButton getL;
    private javax.swing.JButton getM;
    private javax.swing.JButton getN;
    private javax.swing.JButton getO;
    private javax.swing.JButton getP;
    private javax.swing.JButton getQ;
    private javax.swing.JButton getR;
    private javax.swing.JButton getS;
    private javax.swing.JButton getT;
    private javax.swing.JButton getU;
    private javax.swing.JButton getV;
    private javax.swing.JButton getW;
    private javax.swing.JButton getX;
    private javax.swing.JButton getY;
    private javax.swing.JButton getZ;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
