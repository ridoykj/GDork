/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdork;

import com.sun.org.apache.xerces.internal.xni.grammars.Grammar;
import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.w3c.dom.css.RGBColor;
import sun.awt.DesktopBrowse;
import sun.swing.ImageIconUIResource;

/**
 *
 * @author Ridoy
 */
public class WorkS extends javax.swing.JFrame {

    /**
     * Creates new form WorkS
     */
    public WorkS() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/gdork/srg/mask1.png")));
        jPanel2.setVisible(false);
    }
    public static String transf = "";
    public String a1 = "", a2 = "", a3 = "", a4 = "", a5 = "", a6 = "", a7 = "";
    public String ss1 = "", ss2 = "", ss3 = "", ss4 = "", ss5 = "", ss6 = "", ss7 = "";
    public int mager = 0;    
    private void bhide()
    {
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        s5.setVisible(false);
        s6.setVisible(false);
        s7.setVisible(false);
    }
    private void cmusic()
    {
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        s1.setText(".mp3");
        s2.setText(".aa");
        s3.setText(".aac");
        s4.setText(".wav");
        s5.setText(" ");
        s6.setText(" ");
        s7.setText(" ");
        a1 = "mp3";
        a2 = "aa";
        a3 = "aac";
        a4 = "wav";
    }
    private void cbook()
    {
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        s1.setText(".pdf");
        s2.setText(".txt");
        s3.setText(".doc");
        s4.setText(".docx");
        s5.setText(" ");
        s6.setText(" ");
        s7.setText(" ");
        a1 = "pdf";
        a2 = "text";
        a3 = "doc";
        a4 = "docx";
    }
    private void cvideo()
    {
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        s5.setVisible(true);
        s6.setVisible(true);
        s7.setVisible(true);
        s1.setText(".mp4");
        s2.setText(".mkv");
        s3.setText(".flv");
        s4.setText(".mov");
        s5.setText(".avi");
        s6.setText(".aaf");
        s7.setText(".dat");
        a1 = "mp4";
        a2 = "mkv";
        a3 = "flv";
        a4 = "mov";
        a5 = "avi";
        a6 = "aaf";
        a7 = "dat";
    }
    private void cfont()
    {
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        s1.setText(".ttf");
        s2.setText(".txt");
        s3.setText(".otf");
        s4.setText(".chr");
        s5.setText(" ");
        s6.setText(" ");
        s7.setText(" ");
        a1 = "ttf";
        a2 = "txt";
        a3 = "otf";
        a4 = "chr";
    }
    private void csoft()
    {
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        s1.setText(".exe");
        s2.setText(".deb");
        s3.setText(".msi");
        s4.setText(".apk");
        s5.setText(" ");
        s6.setText(" ");
        s7.setText(" ");
        a1 = "exe";
        a2 = "deb";
        a3 = "msi";
        a4 = "apk";
    }
    private void cimage()
    {
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        s1.setText(".jpg");
        s2.setText(".png");
        s3.setText(".gif");
        s4.setText(".ai");
        s5.setText(" ");
        s6.setText(" ");
        s7.setText(" ");
        a1 = "jpg";
        a2 = "png";
        a3 = "gif";
        a4 = "ai";
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inText = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        book = new javax.swing.JToggleButton();
        video = new javax.swing.JToggleButton();
        music = new javax.swing.JToggleButton();
        font = new javax.swing.JToggleButton();
        image = new javax.swing.JToggleButton();
        soft = new javax.swing.JToggleButton();
        cimg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        s1 = new javax.swing.JToggleButton();
        s4 = new javax.swing.JToggleButton();
        s2 = new javax.swing.JToggleButton();
        s3 = new javax.swing.JToggleButton();
        s5 = new javax.swing.JToggleButton();
        s6 = new javax.swing.JToggleButton();
        s7 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GDork (ridoykj@gmail.com)");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        inText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inTextActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(62, 197, 74));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setFocusPainted(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        book.setBackground(new java.awt.Color(62, 197, 74));
        book.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setSelected(true);
        book.setText("Book");
        book.setFocusPainted(false);
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        video.setBackground(new java.awt.Color(62, 197, 74));
        video.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        video.setForeground(new java.awt.Color(255, 255, 255));
        video.setSelected(true);
        video.setText("Video");
        video.setFocusPainted(false);
        video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videoActionPerformed(evt);
            }
        });

        music.setBackground(new java.awt.Color(62, 197, 74));
        music.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        music.setForeground(new java.awt.Color(255, 255, 255));
        music.setSelected(true);
        music.setText("Music");
        music.setFocusPainted(false);
        music.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicActionPerformed(evt);
            }
        });

        font.setBackground(new java.awt.Color(62, 197, 74));
        font.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        font.setForeground(new java.awt.Color(255, 255, 255));
        font.setSelected(true);
        font.setText("Font");
        font.setFocusPainted(false);
        font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontActionPerformed(evt);
            }
        });

        image.setBackground(new java.awt.Color(62, 197, 74));
        image.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        image.setForeground(new java.awt.Color(255, 255, 255));
        image.setSelected(true);
        image.setText("Image");
        image.setFocusPainted(false);
        image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageActionPerformed(evt);
            }
        });

        soft.setBackground(new java.awt.Color(62, 197, 74));
        soft.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        soft.setForeground(new java.awt.Color(255, 255, 255));
        soft.setSelected(true);
        soft.setText("Soft");
        soft.setFocusPainted(false);
        soft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softActionPerformed(evt);
            }
        });

        cimg.setForeground(new java.awt.Color(255, 255, 255));
        cimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngimg/info.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(134, 135, 136));

        s1.setBackground(new java.awt.Color(153, 153, 255));
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("1");
        s1.setFocusPainted(false);
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        s4.setBackground(new java.awt.Color(153, 153, 255));
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("4");
        s4.setFocusPainted(false);
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });

        s2.setBackground(new java.awt.Color(153, 153, 255));
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("2");
        s2.setFocusPainted(false);
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        s3.setBackground(new java.awt.Color(153, 153, 255));
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("3");
        s3.setFocusPainted(false);
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });

        s5.setBackground(new java.awt.Color(153, 153, 255));
        s5.setForeground(new java.awt.Color(255, 255, 255));
        s5.setText("5");
        s5.setFocusPainted(false);
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });

        s6.setBackground(new java.awt.Color(153, 153, 255));
        s6.setForeground(new java.awt.Color(255, 255, 255));
        s6.setText("6");
        s6.setFocusPainted(false);
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });

        s7.setBackground(new java.awt.Color(153, 153, 255));
        s7.setForeground(new java.awt.Color(255, 255, 255));
        s7.setText("7");
        s7.setFocusPainted(false);
        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdork/srg/tlogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(cimg)
                                .addGap(51, 51, 51)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(music, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(video, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(font, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soft, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inText, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(video, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(font, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soft, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(cimg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inTextActionPerformed

    private void check()
    {
        if(s1.isSelected())
        {
            ++mager;
            if(mager == 1)
            {
                transf = transf + a1;
            }
            else
            {
                transf = transf + "%7C" + a1;
            }
        }
        else
        {
            transf.replace(a1, "");
        }
        if(s2.isSelected())
        {
            ++mager;
            if(mager == 1)
            {
                transf = transf + a2;
            }
            else
            {
                transf = transf + "%7C" + a2;
            }
        }
        else
        {
            transf.replace(a2, "");
        }
        if(s3.isSelected())
        {
            ++mager;
            if(mager == 1)
            {
                transf = transf + a3;
            }
            else
            {
                transf = transf + "%7C" + a3;
            }
        }
        else
        {
            transf.replace(a3, "");
        }
        if(s4.isSelected())
        {
            ++mager;
            if(mager == 1)
            {
                transf = transf + a4;
            }
            else
            {
                transf = transf + "%7C" + a4;
            }
        }
        else
        {
            transf.replace(a4, "");
        }
        if(s5.isSelected())
        {
            ++mager;
            if(mager == 1)
            {
                transf = transf + a5;
            }
            else
            {
                transf = transf + "%7C" + a5;
            }
        }
        else
        {
            transf.replace(a5, "");
        }
        if(s6.isSelected())
        {
            ++mager;
            if(mager == 1)
            {
                transf = transf + a6;
            }
            else
            {
                transf = transf + "%7C" + a6;
            }
        }
        else
        {
            transf.replace(a6, "");
        }
        if(s7.isSelected())
        {
            ++mager;
            if(mager == 1)
            {
                transf = transf + a7;
            }
            else
            {
                transf = transf + "%7C" + a7;
            }
        }
        else
        {
            transf.replace(a7, "");
        }
    }
    private void dselect()
    {
        s1.setSelected(false);
        s2.setSelected(false);
        s3.setSelected(false);
        s4.setSelected(false);
        s5.setSelected(false);
        s6.setSelected(false);
        s7.setSelected(false);
    }
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:        
        String s, google, inurl, intitle, last_modified, parent_directory, file_type;
        check();
        intitle = "+intitle%3A%22index+of%22";
        last_modified = "+%2B%22last+modified%22";
        parent_directory = "+%2B%22parent+directory%22";
        file_type = "+%2B%28"+transf+"%29";
        inurl = "-inurl%3A(html%7Cphp%7Casp)";
        s = inText.getText();        
        s = s.replace("+", "%2B");
        s = "+%22" + s.replace(' ','+') + "%22";        
        google = "http://www.google.com/search?q=";
        s = google + inurl + intitle + last_modified + parent_directory + file_type + s;
        Desktop dp = Desktop.getDesktop();
        try {
            dp.browse(new URI(s));
        } catch (URISyntaxException ex) {
            Logger.getLogger(WorkS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WorkS.class.getName()).log(Level.SEVERE, null, ex);
        }
        dselect();
        transf = "";
        mager = 0;
    }//GEN-LAST:event_searchActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
        if(!book.isSelected())
        {
            jPanel2.setVisible(true);
            bhide();
            dselect();
            transf = "";
            cbook();
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/ibook.png")));
            video.setSelected(true);
            image.setSelected(true);
            font.setSelected(true);
            music.setSelected(true);
            soft.setSelected(true);
        }
        else
        {
            jPanel2.setVisible(false);
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/info.png")));
        }
    }//GEN-LAST:event_bookActionPerformed

    private void videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videoActionPerformed
        // TODO add your handling code here:
        if(!video.isSelected())
        {
            jPanel2.setVisible(true);
            bhide();
            dselect();
            transf = "";
            cvideo();
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/ivideo.png")));
            book.setSelected(true);
            image.setSelected(true);
            font.setSelected(true);
            music.setSelected(true);
            soft.setSelected(true);
        }
        else
        {
            jPanel2.setVisible(false);
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/info.png")));
        }
    }//GEN-LAST:event_videoActionPerformed

    private void musicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicActionPerformed

         if(!music.isSelected())
        {   
            jPanel2.setVisible(true);
            bhide();
            dselect();
            transf = "";
            cmusic();
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/imusic.png")));
            video.setSelected(true);
            book.setSelected(true);
            image.setSelected(true);
            font.setSelected(true);
            soft.setSelected(true);            
        }
        else
        {
            jPanel2.setVisible(false);
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/info.png")));
        }
         
    }//GEN-LAST:event_musicActionPerformed

    private void fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontActionPerformed
        // TODO add your handling code here:
        if(!font.isSelected())
        {
            jPanel2.setVisible(true);
            bhide();
            dselect();
            transf = "";
            cfont();
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/ifont.png")));
            video.setSelected(true);
            book.setSelected(true);
            image.setSelected(true);
            music.setSelected(true);
            soft.setSelected(true);
        }
        else
        {
            jPanel2.setVisible(false);
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/info.png")));
        }
    }//GEN-LAST:event_fontActionPerformed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed
        // TODO add your handling code here:
        if(!image.isSelected())
        {
            jPanel2.setVisible(true);
            bhide();
            dselect();
            transf = "";
            cimage();
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/iimg.png")));
            video.setSelected(true);
            book.setSelected(true);
            font.setSelected(true);
            music.setSelected(true);
            soft.setSelected(true);
        }
        else
        {
            jPanel2.setVisible(false);
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/info.png")));
        }
    }//GEN-LAST:event_imageActionPerformed

    private void softActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softActionPerformed
        // TODO add your handling code here:
        if(!soft.isSelected())
        {
            jPanel2.setVisible(true);
            bhide();
            dselect();
            transf = "";
            csoft();
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/isoft.png")));
            video.setSelected(true);
            book.setSelected(true);
            image.setSelected(true);
            font.setSelected(true);
            music.setSelected(true);
        }
        else
        {
            jPanel2.setVisible(false);
            cimg.setIcon(new ImageIcon(getClass().getResource("/pngimg/info.png")));
        }
    }//GEN-LAST:event_softActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:        
        
    }//GEN-LAST:event_s1ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_s4ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_s3ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_s5ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_s6ActionPerformed

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_s7ActionPerformed

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
            java.util.logging.Logger.getLogger(WorkS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton book;
    private javax.swing.JLabel cimg;
    private javax.swing.JToggleButton font;
    private javax.swing.JToggleButton image;
    private javax.swing.JTextField inText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton music;
    public javax.swing.JToggleButton s1;
    public javax.swing.JToggleButton s2;
    public javax.swing.JToggleButton s3;
    public javax.swing.JToggleButton s4;
    public javax.swing.JToggleButton s5;
    public javax.swing.JToggleButton s6;
    public javax.swing.JToggleButton s7;
    private javax.swing.JButton search;
    private javax.swing.JToggleButton soft;
    private javax.swing.JToggleButton video;
    // End of variables declaration//GEN-END:variables
}
