package kre18_lab06;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

/**
 *
 * @author fedora
 */
public class MainForm6 extends javax.swing.JFrame {

    /**
     * Creates new form MainForm6
     */
    public MainForm6() {
        initComponents();
//        this.setUndecorated(true);
//        jFrame2.setUndecorated(true);
//        jFrame3.setUndecorated(true);
//        jFrame4.setUndecorated(true);
//        jFrame5.setUndecorated(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton_back2 = new javax.swing.JButton();
        jButton_next2 = new javax.swing.JButton();
        jLabel_picture2 = new javax.swing.JLabel();
        jLabel_choice2 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jCheckBox3_1 = new javax.swing.JCheckBox();
        jButton_back3 = new javax.swing.JButton();
        jButton_next3 = new javax.swing.JButton();
        jCheckBox3_2 = new javax.swing.JCheckBox();
        jCheckBox3_3 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton4_1 = new javax.swing.JRadioButton();
        jRadioButton4_2 = new javax.swing.JRadioButton();
        jRadioButton4_3 = new javax.swing.JRadioButton();
        jRadioButton4_4 = new javax.swing.JRadioButton();
        jRadioButton4_5 = new javax.swing.JRadioButton();
        jButton_back4 = new javax.swing.JButton();
        jButton_next4 = new javax.swing.JButton();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jFrame5 = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_back5 = new javax.swing.JButton();
        jButton_exit5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_exit1 = new javax.swing.JButton();
        jButton_begin1 = new javax.swing.JButton();

        jFrame2.setTitle("???????? 2, ???????? 6");
        jFrame2.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("pictures/icon.jpg")));
        jFrame2.setMinimumSize(new java.awt.Dimension(490, 390));
        jFrame2.setResizable(false);
        jFrame2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jFrame2ComponentHidden(evt);
            }
        });
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame2WindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame2WindowOpened(evt);
            }
        });
        jFrame2.getContentPane().setLayout(null);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "????????", "??????", "????????", "????????????", "????????", "????????" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jComboBox2);
        jComboBox2.setBounds(50, 60, 82, 24);

        jButton_back2.setText("??????????");
        jButton_back2.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_back2.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_back2.setPreferredSize(new java.awt.Dimension(89, 25));
        jButton_back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_back2ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton_back2);
        jButton_back2.setBounds(30, 300, 120, 40);

        jButton_next2.setText("????????????");
        jButton_next2.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_next2.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_next2ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton_next2);
        jButton_next2.setBounds(330, 300, 120, 40);
        jFrame2.getContentPane().add(jLabel_picture2);
        jLabel_picture2.setBounds(270, 30, 180, 227);
        jFrame2.getContentPane().add(jLabel_choice2);
        jLabel_choice2.setBounds(60, 240, 240, 20);

        jFrame2.setLocationRelativeTo(null);

        jFrame3.setTitle("???????? 3, ???????? 6");
        jFrame3.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("pictures/icon.jpg")));
        jFrame3.setMinimumSize(new java.awt.Dimension(490, 390));
        jFrame3.setResizable(false);
        jFrame3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jFrame3ComponentHidden(evt);
            }
        });
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosing(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jCheckBox3_1.setForeground(java.awt.Color.blue);
        jCheckBox3_1.setSelected(true);
        jCheckBox3_1.setText("?????????????? (?? ????????????????)");
        jCheckBox3_1.setActionCommand("question1");
        jCheckBox3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3_1ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox3_1);
        jCheckBox3_1.setBounds(120, 70, 260, 23);

        jButton_back3.setText("??????????");
        jButton_back3.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_back3.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_back3.setPreferredSize(new java.awt.Dimension(89, 25));
        jButton_back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_back3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton_back3);
        jButton_back3.setBounds(30, 300, 120, 40);

        jButton_next3.setText("????????????");
        jButton_next3.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_next3.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_next3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton_next3);
        jButton_next3.setBounds(330, 300, 120, 40);

        jCheckBox3_2.setForeground(java.awt.Color.blue);
        jCheckBox3_2.setSelected(true);
        jCheckBox3_2.setText("???????????? ?? Java (?? ????????????????)");
        jCheckBox3_2.setActionCommand("question2");
        jCheckBox3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3_2ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox3_2);
        jCheckBox3_2.setBounds(120, 100, 260, 23);

        jCheckBox3_3.setForeground(java.awt.Color.blue);
        jCheckBox3_3.setSelected(true);
        jCheckBox3_3.setText("?????? ???????? ???3 (?? ????????????????)");
        jCheckBox3_3.setActionCommand("question3");
        jCheckBox3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3_3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox3_3);
        jCheckBox3_3.setBounds(120, 130, 260, 23);

        jLabel3.setText("?????????????? ???????????????? ?? ?????????????????????? ???? ??????????????:");
        jFrame3.getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 30, 350, 15);

        jFrame3.setLocationRelativeTo(null);

        jFrame4.setTitle("???????? 4, ???????? 6");
        jFrame4.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("pictures/icon.jpg")));
        jFrame4.setMinimumSize(new java.awt.Dimension(490, 390));
        jFrame4.setResizable(false);
        jFrame4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jFrame4ComponentHidden(evt);
            }
        });
        jFrame4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame4WindowClosing(evt);
            }
        });
        jFrame4.getContentPane().setLayout(null);

        jLabel4.setText("?????????? ???????????? ???? ?????????????");
        jFrame4.getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 50, 340, 15);

        buttonGroup4.add(jRadioButton4_1);
        jRadioButton4_1.setText("Fedora");
        jRadioButton4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_1_actionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jRadioButton4_1);
        jRadioButton4_1.setBounds(70, 90, 300, 23);

        buttonGroup4.add(jRadioButton4_2);
        jRadioButton4_2.setText("Mint");
        jRadioButton4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_1_actionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jRadioButton4_2);
        jRadioButton4_2.setBounds(70, 120, 300, 23);

        buttonGroup4.add(jRadioButton4_3);
        jRadioButton4_3.setText("Ubuntu");
        jRadioButton4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_1_actionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jRadioButton4_3);
        jRadioButton4_3.setBounds(70, 150, 300, 23);

        buttonGroup4.add(jRadioButton4_4);
        jRadioButton4_4.setText("????????????");
        jRadioButton4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_1_actionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jRadioButton4_4);
        jRadioButton4_4.setBounds(70, 180, 300, 23);

        buttonGroup4.add(jRadioButton4_5);
        jRadioButton4_5.setText("???? ?????????????????? Linux");
        jRadioButton4_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_1_actionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jRadioButton4_5);
        jRadioButton4_5.setBounds(70, 210, 300, 23);

        jButton_back4.setText("??????????");
        jButton_back4.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_back4.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_back4.setPreferredSize(new java.awt.Dimension(89, 25));
        jButton_back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_back4ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton_back4);
        jButton_back4.setBounds(30, 300, 120, 40);

        jButton_next4.setText("????????????");
        jButton_next4.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_next4.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_next4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_next4ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton_next4);
        jButton_next4.setBounds(330, 300, 120, 40);

        jFrame4.setLocationRelativeTo(null);

        jFrame5.setTitle("???????? 5, ???????? 6");
        jFrame5.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("pictures/icon.jpg")));
        jFrame5.setMinimumSize(new java.awt.Dimension(490, 390));
        jFrame5.setResizable(false);
        jFrame5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jFrame5ComponentHidden(evt);
            }
        });
        jFrame5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame5WindowClosing(evt);
            }
        });
        jFrame5.getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jFrame5.getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(90, 50, 223, 78);

        jButton_back5.setText("??????????");
        jButton_back5.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_back5.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_back5.setPreferredSize(new java.awt.Dimension(89, 25));
        jButton_back5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_back5ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton_back5);
        jButton_back5.setBounds(30, 300, 120, 40);

        jButton_exit5.setText("??????????");
        jButton_exit5.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_exit5.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_exit5.setPreferredSize(new java.awt.Dimension(89, 25));
        jButton_exit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exit5ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton_exit5);
        jButton_exit5.setBounds(330, 300, 120, 40);

        jFrame5.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("???????? 1, ???????? 6");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("pictures/icon.jpg")));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("???????????????????????? ??????????????????, ????????????????????????:");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 390, 220);

        jButton_exit1.setText("??????????");
        jButton_exit1.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_exit1.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_exit1.setPreferredSize(new java.awt.Dimension(89, 25));
        jButton_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_exit1);
        jButton_exit1.setBounds(30, 300, 120, 40);

        jButton_begin1.setText("????????????");
        jButton_begin1.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton_begin1.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton_begin1.setPreferredSize(new java.awt.Dimension(0, 0));
        jButton_begin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_begin1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_begin1);
        jButton_begin1.setBounds(330, 300, 120, 40);

        setSize(new java.awt.Dimension(490, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_next2ActionPerformed
        jFrame3.setVisible(true);
        jFrame2.setVisible(false);
    }//GEN-LAST:event_jButton_next2ActionPerformed

    private void jButton_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_exit1ActionPerformed

    private void jButton_exit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exit5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_exit5ActionPerformed

    private void jButton_begin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_begin1ActionPerformed
        jFrame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_begin1ActionPerformed

    private void jFrame2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame2WindowClosing

    private void jFrame3WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame3WindowClosing

    private void jFrame4WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame4WindowClosing

    private void jFrame5WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame5WindowClosing

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jButton_next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_next3ActionPerformed
        jFrame4.setVisible(true);
        jFrame3.setVisible(false);
    }//GEN-LAST:event_jButton_next3ActionPerformed

    private void jButton_next4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_next4ActionPerformed
        jFrame5.setVisible(true);
        jFrame4.setVisible(false);
    }//GEN-LAST:event_jButton_next4ActionPerformed

    private void jButton_back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_back2ActionPerformed
        this.setVisible(true);
        jFrame2.setVisible(false);
    }//GEN-LAST:event_jButton_back2ActionPerformed

    private void jButton_back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_back3ActionPerformed
        jFrame2.setVisible(true);
        jFrame3.setVisible(false);
    }//GEN-LAST:event_jButton_back3ActionPerformed

    private void jButton_back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_back4ActionPerformed
        jFrame3.setVisible(true);
        jFrame4.setVisible(false);
    }//GEN-LAST:event_jButton_back4ActionPerformed

    private void jButton_back5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_back5ActionPerformed
        jFrame4.setVisible(true);
        jFrame5.setVisible(false);
    }//GEN-LAST:event_jButton_back5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        switch (jComboBox2.getSelectedIndex()) {
            case 0:
                jLabel_choice2.setText("??????????????: \"????????\"");
                jLabel_picture2.setIcon(new ImageIcon(MainForm6.class.getResource("pictures/water.png")));
                break;
            case 1:
                jLabel_choice2.setText("??????????????: \"??????\"");
                jLabel_picture2.setIcon(new ImageIcon(MainForm6.class.getResource("pictures/tea.png")));
                break;
            case 2:
                jLabel_choice2.setText("??????????????: \"????????\"");
                jLabel_picture2.setIcon(new ImageIcon(MainForm6.class.getResource("pictures/coffee.png")));
                break;
            case 3:
                jLabel_choice2.setText("??????????????: \"????????????\"");
                jLabel_picture2.setIcon(new ImageIcon(MainForm6.class.getResource("pictures/milk.png")));
                break;
            case 4:
                jLabel_choice2.setText("??????????????: \"????????\"");
                jLabel_picture2.setIcon(new ImageIcon(MainForm6.class.getResource("pictures/beer.png")));
                break;
            case 5:
                jLabel_choice2.setText("??????????????: \"????????\"");
                jLabel_picture2.setIcon(new ImageIcon(MainForm6.class.getResource("pictures/wine.png")));
                break;
            default:
                jLabel_choice2.setText("");
                break;
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jFrame2WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowOpened
        jComboBox2.setSelectedIndex(0);
    }//GEN-LAST:event_jFrame2WindowOpened

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        jFrame2.setLocation(this.getLocation());
        jFrame3.setLocation(this.getLocation());
        jFrame4.setLocation(this.getLocation());
        jFrame5.setLocation(this.getLocation());
    }//GEN-LAST:event_formComponentHidden

    private void jFrame2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame2ComponentHidden
        this.setLocation(jFrame2.getLocation());
        jFrame3.setLocation(jFrame2.getLocation());
        jFrame4.setLocation(jFrame2.getLocation());
        jFrame5.setLocation(jFrame2.getLocation());
    }//GEN-LAST:event_jFrame2ComponentHidden

    private void jFrame3ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame3ComponentHidden
        this.setLocation(jFrame3.getLocation());
        jFrame2.setLocation(jFrame3.getLocation());
        jFrame4.setLocation(jFrame3.getLocation());
        jFrame5.setLocation(jFrame3.getLocation());
    }//GEN-LAST:event_jFrame3ComponentHidden

    private void jFrame4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame4ComponentHidden
        this.setLocation(jFrame4.getLocation());
        jFrame2.setLocation(jFrame4.getLocation());
        jFrame3.setLocation(jFrame4.getLocation());
        jFrame5.setLocation(jFrame4.getLocation());
    }//GEN-LAST:event_jFrame4ComponentHidden

    private void jFrame5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame5ComponentHidden
        this.setLocation(jFrame5.getLocation());
        jFrame2.setLocation(jFrame5.getLocation());
        jFrame3.setLocation(jFrame5.getLocation());
        jFrame4.setLocation(jFrame5.getLocation());
    }//GEN-LAST:event_jFrame5ComponentHidden

    private void jCheckBox3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3_1ActionPerformed
        if (jCheckBox3_1.isSelected()) {
            jCheckBox3_1.setText("?????????????? (?? ????????????????)");
            jCheckBox3_1.setForeground(Color.BLUE);
        } else {
            jCheckBox3_1.setText("?????????????? (?????? ??????????????)");
            jCheckBox3_1.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jCheckBox3_1ActionPerformed

    private void jCheckBox3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3_2ActionPerformed
        if (jCheckBox3_2.isSelected()) {
            jCheckBox3_2.setText("???????????? ?? Java (?? ????????????????)");
            jCheckBox3_2.setForeground(Color.BLUE);
        } else {
            jCheckBox3_2.setText("???? ???????????? ?? Java (?????? ??????????????)");
            jCheckBox3_2.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jCheckBox3_2ActionPerformed

    private void jCheckBox3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3_3ActionPerformed
        if (jCheckBox3_3.isSelected()) {
            jCheckBox3_3.setText("????, ?????? ???????? ???3");
            jCheckBox3_3.setForeground(Color.BLUE);
        } else {
            jCheckBox3_3.setText("??????, ?????? ???? ???????? ???3");
            jCheckBox3_3.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jCheckBox3_3ActionPerformed

    private void jRadioButton4_1_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_1_actionPerformed
        jRadioButton4_1.setForeground(Color.BLACK);
        jRadioButton4_2.setForeground(Color.BLACK);
        jRadioButton4_3.setForeground(Color.BLACK);
        jRadioButton4_4.setForeground(Color.BLACK);
        jRadioButton4_5.setForeground(Color.BLACK);
        
        JRadioButton button = (JRadioButton) evt.getSource();
        button.setForeground(Color.BLUE);
    }//GEN-LAST:event_jRadioButton4_1_actionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm6.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm6.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm6.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm6.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton_back2;
    private javax.swing.JButton jButton_back3;
    private javax.swing.JButton jButton_back4;
    private javax.swing.JButton jButton_back5;
    private javax.swing.JButton jButton_begin1;
    private javax.swing.JButton jButton_exit1;
    private javax.swing.JButton jButton_exit5;
    private javax.swing.JButton jButton_next2;
    private javax.swing.JButton jButton_next3;
    private javax.swing.JButton jButton_next4;
    private javax.swing.JCheckBox jCheckBox3_1;
    private javax.swing.JCheckBox jCheckBox3_2;
    private javax.swing.JCheckBox jCheckBox3_3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_choice2;
    private javax.swing.JLabel jLabel_picture2;
    private javax.swing.JRadioButton jRadioButton4_1;
    private javax.swing.JRadioButton jRadioButton4_2;
    private javax.swing.JRadioButton jRadioButton4_3;
    private javax.swing.JRadioButton jRadioButton4_4;
    private javax.swing.JRadioButton jRadioButton4_5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
