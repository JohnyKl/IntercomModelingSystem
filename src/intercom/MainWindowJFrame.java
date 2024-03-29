/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intercom;

/**
 *
 * @author Lenka
 */
public class MainWindowJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainWindowJFrame
     */
    public MainWindowJFrame() {
        initComponents();
        
        enteredCodeBuffer  = "";
        dialogBuffer       = "";
        currentKey         = (String) jcbKeys.getSelectedItem();
        control            = new Control();
        jcbSayAnswerActive = false;
        jcbCallActive      = true;
        
        prepareCB(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpKeyboard = new javax.swing.JPanel();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jbStar = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbSharp = new javax.swing.JButton();
        jbCall = new javax.swing.JButton();
        jbKey = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jtfDisplay = new javax.swing.JTextField();
        jpUserDialog = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpDialog = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jcbKeys = new javax.swing.JComboBox();
        jcbGuestAnswers = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jbSayResponse = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Intercom");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpKeyboard.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jb1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb1.setText("1");
        jb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb1MouseClicked(evt);
            }
        });

        jb2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb2.setText("2");
        jb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb2MouseClicked(evt);
            }
        });

        jb3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb3.setText("3");
        jb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb3MouseClicked(evt);
            }
        });

        jb4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb4.setText("4");
        jb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb4MouseClicked(evt);
            }
        });

        jb5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb5.setText("5");
        jb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb5MouseClicked(evt);
            }
        });

        jb6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb6.setText("6");
        jb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb6MouseClicked(evt);
            }
        });

        jb7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb7.setText("7");
        jb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb7MouseClicked(evt);
            }
        });

        jb8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb8.setText("8");
        jb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb8MouseClicked(evt);
            }
        });

        jb9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb9.setText("9");
        jb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb9MouseClicked(evt);
            }
        });

        jbStar.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbStar.setText("*");
        jbStar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbStarMouseClicked(evt);
            }
        });

        jb0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb0.setText("0");
        jb0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb0MouseClicked(evt);
            }
        });

        jbSharp.setFont(new java.awt.Font("Tahoma", 1, 47)); // NOI18N
        jbSharp.setText("#");
        jbSharp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSharpMouseClicked(evt);
            }
        });

        jbCall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbCall.setText("Call");
        jbCall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCallMouseClicked(evt);
            }
        });

        jbKey.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbKey.setText("Key");
        jbKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbKeyMouseClicked(evt);
            }
        });

        jbCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbCancel.setText("Cancel");
        jbCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCancelMouseClicked(evt);
            }
        });

        jtfDisplay.setEditable(false);
        jtfDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jpKeyboardLayout = new javax.swing.GroupLayout(jpKeyboard);
        jpKeyboard.setLayout(jpKeyboardLayout);
        jpKeyboardLayout.setHorizontalGroup(
            jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKeyboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpKeyboardLayout.createSequentialGroup()
                        .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jb9)
                                .addGroup(jpKeyboardLayout.createSequentialGroup()
                                    .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb1)
                                        .addComponent(jb4))
                                    .addGap(26, 26, 26)
                                    .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jpKeyboardLayout.createSequentialGroup()
                                            .addComponent(jb5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jb6))
                                        .addGroup(jpKeyboardLayout.createSequentialGroup()
                                            .addComponent(jb2)
                                            .addGap(28, 28, 28)
                                            .addComponent(jb3)))))
                            .addComponent(jbStar)
                            .addGroup(jpKeyboardLayout.createSequentialGroup()
                                .addComponent(jb7)
                                .addGap(26, 26, 26)
                                .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb8)
                                    .addGroup(jpKeyboardLayout.createSequentialGroup()
                                        .addComponent(jb0)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbSharp))))
                            .addGroup(jpKeyboardLayout.createSequentialGroup()
                                .addComponent(jbCall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbKey)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbCancel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtfDisplay))
                .addContainerGap())
        );
        jpKeyboardLayout.setVerticalGroup(
            jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKeyboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1)
                    .addComponent(jb2)
                    .addComponent(jb3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4)
                    .addComponent(jb5)
                    .addComponent(jb6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb8)
                        .addComponent(jb9))
                    .addComponent(jb7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbStar)
                    .addComponent(jb0)
                    .addComponent(jbSharp))
                .addGap(18, 18, 18)
                .addGroup(jpKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCall)
                    .addComponent(jbKey)
                    .addComponent(jbCancel))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jtpDialog.setEditable(false);
        jtpDialog.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Діалогове вікно:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jtpDialog.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jtpDialog);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Оберіть ключ");

        jcbKeys.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbKeys.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ключ_1", "Ключ_2", "Ключ_3", "Ключ_4", "Ключ_5" }));
        jcbKeys.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbKeysItemStateChanged(evt);
            }
        });

        jcbGuestAnswers.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Оберіть відповідь:");

        jbSayResponse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSayResponse.setText("Відповісти");
        jbSayResponse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSayResponseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpUserDialogLayout = new javax.swing.GroupLayout(jpUserDialog);
        jpUserDialog.setLayout(jpUserDialogLayout);
        jpUserDialogLayout.setHorizontalGroup(
            jpUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUserDialogLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbKeys, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jpUserDialogLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbGuestAnswers, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSayResponse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpUserDialogLayout.setVerticalGroup(
            jpUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUserDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbKeys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jpUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbGuestAnswers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbSayResponse))
                .addContainerGap())
        );

        jMenu3.setLabel("Exit");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpUserDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpUserDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void prepareCB(){  //заповнити комбо-бокси значеннями      
        for (String answer : control.housemates.positiveResponses) {
            jcbGuestAnswers.addItem(answer);  
        }
        for (String answer : control.housemates.negativeResponses) {
            jcbGuestAnswers.addItem(answer);  
        }
        
        jcbGuestAnswers.setSelectedIndex(0);//встановити індекс вибраного елементу
    }
    
    private void jb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb1MouseClicked
        enteredCodeBuffer += "1";
        
        refresh();
    }//GEN-LAST:event_jb1MouseClicked

    private void jb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb2MouseClicked
        enteredCodeBuffer += "2";
        
        refresh();
    }//GEN-LAST:event_jb2MouseClicked

    private void jb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb3MouseClicked
        enteredCodeBuffer += "3";
        
        refresh();
    }//GEN-LAST:event_jb3MouseClicked

    private void jb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb4MouseClicked
        enteredCodeBuffer += "4";
        
        refresh();
    }//GEN-LAST:event_jb4MouseClicked

    private void jb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb5MouseClicked
        enteredCodeBuffer += "5";
        
        refresh();
    }//GEN-LAST:event_jb5MouseClicked

    private void jb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb6MouseClicked
        enteredCodeBuffer += "6";
        
        refresh();
    }//GEN-LAST:event_jb6MouseClicked

    private void jb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb7MouseClicked
        enteredCodeBuffer += "7";
        
        refresh();
    }//GEN-LAST:event_jb7MouseClicked

    private void jb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb8MouseClicked
        enteredCodeBuffer += "8";
        
        refresh();
    }//GEN-LAST:event_jb8MouseClicked

    private void jb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb9MouseClicked
        enteredCodeBuffer += "9";
        
        refresh();
    }//GEN-LAST:event_jb9MouseClicked

    private void jbStarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbStarMouseClicked
        enteredCodeBuffer += "*";
        
        refresh();
    }//GEN-LAST:event_jbStarMouseClicked

    private void jb0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb0MouseClicked
        enteredCodeBuffer += "0";
        
        refresh();
    }//GEN-LAST:event_jb0MouseClicked

    private void jbSharpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSharpMouseClicked
        enteredCodeBuffer += "#";
        
        refresh();
    }//GEN-LAST:event_jbSharpMouseClicked

    private void jbCallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCallMouseClicked
        if(jcbCallActive){
            
            //dialogBuffer = control.execComand(enteredCodeBuffer,(String)jcbKeys.getSelectedItem());
        
            switch(control.callType){
                case Control.UNDEFINITE_CALL_TYPE:{
                    dialogBuffer = control.execComand(enteredCodeBuffer,null);
                    
                    if(control.callType == Control.APARTMENT_CALL_TYPE)
                    {
                        jcbCallActive      = false;
                        jcbSayAnswerActive = true;                    
                    }
                } break;
                case Control.SETTINGS_CALL_TYPE: {
                    if(control.waitForEnterCode){
                        switch(control.settingType){
                            case Control.ADD_KEY_TYPE:{
                                dialogBuffer = control.execComand(enteredCodeBuffer,(String)jcbKeys.getSelectedItem());                                
                            } break;
                            case Control.DELETE_KEY_TYPE:{
                                dialogBuffer = control.execComand(enteredCodeBuffer,(String)jcbKeys.getSelectedItem());
                            } break;
                            case Control.CHANGE_PASSWORD_TYPE:{
                                dialogBuffer = control.execComand(null, enteredCodeBuffer);
                            }break;
                        }
                    }
                    else {
                        dialogBuffer = control.execComand(enteredCodeBuffer,null);
                    }
                } break;
            }

            enteredCodeBuffer = "";         

            refresh();
        }        
    }//GEN-LAST:event_jbCallMouseClicked

    private void jbKeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbKeyMouseClicked
        dialogBuffer += control.housemates.checkKey(currentKey) + Control.endOfBlock;
        
        refresh();
    }//GEN-LAST:event_jbKeyMouseClicked

    private void jbCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelMouseClicked
        enteredCodeBuffer = "";
        
        refresh();
    }//GEN-LAST:event_jbCancelMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Settings.saveSettings(control.settings);
    }//GEN-LAST:event_formWindowClosing

    private void jcbKeysItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbKeysItemStateChanged
        currentKey = (String) jcbKeys.getSelectedItem();
        currentKey = currentKey.trim();
    }//GEN-LAST:event_jcbKeysItemStateChanged

    private void jbSayResponseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSayResponseMouseClicked
        if(jcbSayAnswerActive){//якщо активна кнопка відповіді
            dialogBuffer += control.housemates.checkGuestResponse((String) jcbGuestAnswers.getSelectedItem()) + Control.endOfBlock;//перевірити відповідь гостя
            
            jcbSayAnswerActive = false;//встановити кнопку відповіді неактивною (еквівалентно відключенню мікрофону)
            jcbCallActive      = true;//встановити кнопку виклику активною
            
            refresh();//оновити значення полів
        }        
    }//GEN-LAST:event_jbSayResponseMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        this.dispose();//звільнити усі ресурси форми, закрити її
    }//GEN-LAST:event_jMenu3MouseClicked

    private void refresh(){
        jtfDisplay.setText(enteredCodeBuffer);//оновити відображуваний введений код
        jtpDialog.setText(dialogBuffer);//оновити діалог
        control.refreshBuffer(dialogBuffer);//оновити буфер діалогу в контролері
    }
    
    private String     enteredCodeBuffer;
    private String     dialogBuffer;
    private String     currentKey;
    
    private final Control    control;
    
    private boolean jcbSayAnswerActive;
    private boolean jcbCallActive;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbCall;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbKey;
    private javax.swing.JButton jbSayResponse;
    private javax.swing.JButton jbSharp;
    private javax.swing.JButton jbStar;
    private javax.swing.JComboBox jcbGuestAnswers;
    private javax.swing.JComboBox jcbKeys;
    private javax.swing.JPanel jpKeyboard;
    private javax.swing.JPanel jpUserDialog;
    private javax.swing.JTextField jtfDisplay;
    private javax.swing.JTextPane jtpDialog;
    // End of variables declaration//GEN-END:variables
}
