/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author shinji
 */
public class NoteView extends JFrame {
    
    
  static String JSON_FILE_NAME = "/Users/shinji/Mydata/personalmarketing/english/canada/school/CICCC/subject/202/Note/javafinalproject-eaa83-firebase-adminsdk-fb4es-75ae0e7d75.json";
  static String URL = "https://javafinalproject-eaa83.firebaseio.com";
    
    private JPanel controlPanel;
    private JButton loadButton = new JButton("Load Data");
    private JButton writeButton = new JButton("Write Data");
    private JTextArea txtArea = new JTextArea("",5,10);
    private JTree tree;
    
    public NoteView() throws FileNotFoundException{
        controlPanel = new JPanel();
//        this.setTitle("Load Data");
//        this.setLayout(new GridLayout(3, 3));
//        
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(500, 600);

//        DefaultMutableTreeNode root = new DefaultMutableTreeNode("JavaDrive");
//
//        DefaultMutableTreeNode swing = new DefaultMutableTreeNode("Swing");
//        DefaultMutableTreeNode java2d = new DefaultMutableTreeNode("Java2D");
//        DefaultMutableTreeNode java3d = new DefaultMutableTreeNode("Java3D");
//        DefaultMutableTreeNode javamail = new DefaultMutableTreeNode("JavaMail");
//
//        DefaultMutableTreeNode swingSub1 = new DefaultMutableTreeNode("JLabel");
//        DefaultMutableTreeNode swingSub2 = new DefaultMutableTreeNode("JButton");
//        DefaultMutableTreeNode swingSub3 = new DefaultMutableTreeNode("JTextField");
//
//        swing.add(swingSub1);
//        swing.add(swingSub2);
//        swing.add(swingSub3);
//
//        root.add(swing);
//        root.add(java2d);
//        root.add(java3d);
//        root.add(javamail);
//        
//
//        String[] treedata = {"Swing", "Java2D", "Java3D", "JavaMail"};
//        
//        // 1 way
////        DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode("Swing"));
////        tree = new JTree(model);
//        
//        // 2 way
//        tree = new JTree(treedata);
//        DefaultTreeModel model = (DefaultTreeModel)tree.getModel();
//        
//        JScrollPane scrollPane = new JScrollPane();
//        scrollPane.getViewport().setView(tree);
//        scrollPane.setPreferredSize(new Dimension(180, 120));
//        
//        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
////        model.insertNodeInto(new DefaultMutableTreeNode("another_child"), root, root.getChildCount());
//
//        // informing change contents
////        model.nodeChanged(node);
//        root.add(new DefaultMutableTreeNode("another_child"));
////        
////        node.setUserObject(new DefaultMutableTreeNode("new name"));
//
//        model.reload();
//        
//
//        
////        controlPanel.add(tree);
////        controlPanel.add(scrollPane);
////        controlPanel.add(txtArea);
////        controlPanel.add(writeButton);
////        controlPanel.add(loadButton);
//        this.add(controlPanel);
        
        
        

//For each component to be added to this container:
//...Create the component...
//...Set instance variables in the GridBagConstraints instance...
//pane.add(theComponent, c);
        



//        Panel p1 = new Panel();
//        Panel p2 = new Panel();
//        Panel p3 = new Panel();
//        Button b1 = new Button("B1");
//        Button b2 = new Button("B2");
//        Button b3 = new Button("B3");
//        Button b4 = new Button("B4");
//
//        setLayout(new GridLayout(1, 3));
//        add(p1);
//        add(p2);
//        add(p3);
//        p1.setLayout(new GridLayout(1, 1));
//        p2.setLayout(new GridLayout(3, 1));
//        p1.add(b1);
//        p2.add(b2);
//        p2.add(b3);
//        p2.add(b4);
//        setSize(300, 200);




//        this.add(pane);
        
        
        


        
        this.setLayout(new GridBagLayout());// set LayoutManager
        GridBagConstraints gbc = new GridBagConstraints();
        Border eBorder = BorderFactory.createEtchedBorder();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        
        //left
        JPanel panelLeft = new JPanel();
        panelLeft.setBorder(BorderFactory.createTitledBorder(eBorder, "20pct"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.weightx = gbc.weighty = 10;
        panelLeft.add(writeButton);
        add(panelLeft, gbc);
        
        //center : editor
        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder(eBorder, "70pct"));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 1;
        gbc.weightx = gbc.weighty = 60;
        add(panel1, gbc); // add compoenet to the COntentPane

//        JPanel panel2 = new JPanel();
//        panel2.setBorder(BorderFactory.createTitledBorder(eBorder, "30pct"));
//        gbc.gridy = 1;
//        gbc.weightx = gbc.weighty = 30;
//        gbc.insets = new Insets(2, 2, 2, 2);
//        add(panel2, gbc); // add component to the COntentPane

        //right : preview
        JPanel panel3 = new JPanel();
        panel3.setBorder(BorderFactory.createTitledBorder(eBorder, "20pct"));
        gbc.gridx =2;
        gbc.gridy = 0;
        gbc.gridwidth = /*gbc.gridheight = */1;
        gbc.gridheight = 2;
        gbc.weightx = /*gbc.weighty = */20;
        gbc.insets = new Insets(2, 2, 2, 2);
        add(panel3, gbc);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 600);
        this.setTitle("タイトル");

//        pack();
        setVisible(true); // important
        
        
        
        
        
        
        
        
        //--------------------------------
        
        //--------------------------------
        
        
        
        
        
        
        
        
        
        // using Firebase 
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setServiceAccount(new FileInputStream(JSON_FILE_NAME))
//                .setDatabaseUrl(URL)
//                .build();
//
//        FirebaseApp.initializeApp(options);
//
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
//
//        reference.child("key1").setValue("こんにちは！");
//        reference.child("key2").setValue("ファイアーベース");
//        reference.child("key3").setValue("よろしくお願いします！");





    }
    
    public void addLoadDataListener(ActionListener listenerforLoadButton){
        loadButton.addActionListener(listenerforLoadButton);
    }
    
    public void addSaveDataListener(ActionListener listenerforSaveButton){
        writeButton.addActionListener(listenerforSaveButton);
    }
    
}
