/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaboybrewing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import static javax.swing.GroupLayout.Alignment.TRAILING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author gpbli
 */
public class MAINFRAME extends javax.swing.JFrame {

    //PizzaBoyBrewing backend = new PizzaBoyBrewing();
    public int ingredNum;

    JTextField[][] textArr = new JTextField[10][2]; //[x][y] [row][feild1/feild2]
    public int totalRows = 10;
    public int totalRowsUsed = 0;
    /**
     * Creates new form MAINFRAME
     */
    //MAINFRAME frame = new MAINFRAME();
    JTextField[] ingredients;
    JTextField[] quantity;
    ingredient[] ingredObj;

    ImageIcon img = new ImageIcon("logo_resized.png");

    public MAINFRAME() {
        //initComponents();         <-- KEEP COMMENTED
        //startingComponents();     <-- KEEP COMMENTED
        //initInputScreen();
        //create();
        make();
    }


    /* public void startingComponents(){
        //this.setLocation(1920/2, 1080/2);       // set size of frame
        
        BoxLayout box = new BoxLayout(homescreen,BoxLayout.Y_AXIS);
        homescreen.setLayout(box);
        numOfIngredLabel.setText("How many Ingredients");
        numOfIngred.setText("");
        okButton.setText("OK");
        logo.setText(" ");
        logo.setIcon(img);
        
        add(homescreen);
        homescreen.add(logo);
        homescreen.add(numOfIngredLabel);
        homescreen.add(numOfIngred);
        homescreen.add(okButton);
        
        numOfIngredLabel.setVisible(true);
        numOfIngred.setVisible(true);
        okButton.setVisible(true);
        logo.setVisible(true);
        
        
        
        pack();
        revalidate();
        
        
    } */  //NOT IN USE
    public void initIngred(int num, JPanel left, JPanel right) {
        for (int x = 1; x < num + 1; x++) {
            JTextField ingredTemp = new JTextField();
            JTextField quantTemp = new JTextField();
            left.add(ingredTemp);
            right.add(quantTemp);
            textArr[x][0] = ingredTemp;
            textArr[x][1] = quantTemp;
            totalRowsUsed += 1;

        }
        pack();
        revalidate();
    }

    public JPanel numIngredPanel() {
        JSeparator div = new JSeparator();
        JSeparator div2 = new JSeparator();
        div.setOrientation(SwingConstants.HORIZONTAL);

        //JPanel bottom = new JPanel();
        JPanel body = new JPanel();
        JPanel top = new JPanel();
        JPanel m = new JPanel();
        JPanel b = new JPanel();
        
        //BoxLayout boxV = new BoxLayout(bottom, BoxLayout.Y_AXIS);
        FlowLayout boxH = new FlowLayout();
        FlowLayout mid = new FlowLayout();
        FlowLayout bot = new FlowLayout();
        
        
        BoxLayout border = new BoxLayout(body,BoxLayout.Y_AXIS);

        TitledBorder title = new TitledBorder("Inputs");
        Border margin = new EmptyBorder(0, 0, 0, 0);
        body.setBorder(new CompoundBorder(title, margin));

        m.setLayout(mid);
        b.setLayout(bot);
        //bottom.setLayout(boxV);
        body.setLayout(border);
        top.setLayout(boxH);

        JLabel numOfIngred = new JLabel();
        numOfIngred.setText("Number of Additions: ");
        top.add(numOfIngred);

        JLabel note = new JLabel("Note*: Number of times you add to mash after initial");
        note.setAlignmentX(LEFT_ALIGNMENT);
        JSpinner quant = new JSpinner();
        top.add(quant);

        JButton submit = new JButton();
        submit.setText("SUBMIT");
        submit.setAlignmentX(RIGHT_ALIGNMENT);
        
        body.add(top);
        //body.add(bottom, border.SOUTH);
        body.add(div);
        body.add(m);
        m.add(submit);
        body.add(div2);
        body.add(b);
        b.add(note);

        pack();
        //me.add(body);
        pack();
        revalidate();
        return body;

    }

    public JPanel batchSize() {
        JPanel body = new JPanel(); //boxLayout vert

        //JPanel inner = new JPanel();  // borderlayout
        JPanel topHorz = new JPanel();
        JPanel midHorz = new JPanel();
        JPanel midBorder = new JPanel();
        JPanel lowerHorz = new JPanel();
        JPanel bottomHorz = new JPanel();
        TitledBorder title = new TitledBorder("Batch Size");
        Border margin = new EmptyBorder(0, 0, 0, 0);
        body.setBorder(new CompoundBorder(title, margin));

        BorderLayout borderM = new BorderLayout();
        FlowLayout boxT = new FlowLayout();
        FlowLayout boxM = new FlowLayout();
        FlowLayout boxL = new FlowLayout();
        FlowLayout boxB = new FlowLayout();
        BoxLayout box = new BoxLayout(body, BoxLayout.Y_AXIS);
        //BorderLayout border = new BorderLayout();
        JSeparator div = new JSeparator();
        JSeparator div2 = new JSeparator();
        JSeparator div3 = new JSeparator();
        midBorder.setLayout(borderM);
        body.setLayout(box);
        //inner.setLayout(border);
        topHorz.setLayout(boxT);
        midHorz.setLayout(boxM);
        lowerHorz.setLayout(boxL);
        bottomHorz.setLayout(boxB);

        JButton okButton = new JButton();
        okButton.setText("SUBMIT");
        okButton.setAlignmentX(CENTER_ALIGNMENT);
        body.add(topHorz);
        body.add(div);

        body.add(midHorz);
        body.add(lowerHorz);
        body.add(div2);

        body.add(okButton);
        body.add(div3);

        body.add(bottomHorz);
        //midHorz.add(midBorder);

        JLabel initSizeLabel = new JLabel("Initial Batch Size: ");
        //JLabel multiLabel = new JLabel();
        //JLabel newSizeLabel = new JLabel();
        JLabel totalLabel = new JLabel("TOTAL (gallons): ");
        JLabel output = new JLabel("*size*");

        JRadioButton mult = new JRadioButton();
        JRadioButton size = new JRadioButton();
        mult.setText("initial batch multiplier: ");
        size.setText("new batch size (gallons): ");

        mult.setAlignmentX(0.0f);
        size.setAlignmentX(0.0f);

        ButtonGroup group = new ButtonGroup();
        group.add(mult);
        group.add(size);

        JSpinner init = new JSpinner();
        JSpinner batchMult = new JSpinner();
        JSpinner batchSize = new JSpinner();

        topHorz.add(initSizeLabel);
        topHorz.add(init);
        midHorz.add(mult);
        midHorz.add(batchMult);
        lowerHorz.add(size);
        lowerHorz.add(batchSize);
        bottomHorz.add(totalLabel);
        bottomHorz.add(output);

        //me.add(body);
        pack();
        revalidate();
        return body;
    }

    public JPanel modList() {
        JPanel body = new JPanel();
        JSeparator div = new JSeparator();
        BoxLayout box = new BoxLayout(body, BoxLayout.Y_AXIS);

        JPanel guts = new JPanel();
        FlowLayout main = new FlowLayout();
        guts.setLayout(main);

        JPanel left = new JPanel();
        JPanel right = new JPanel();
        BoxLayout leftV = new BoxLayout(left, BoxLayout.Y_AXIS);
        BoxLayout rightV = new BoxLayout(right, BoxLayout.Y_AXIS);
        left.setBorder(new EmptyBorder(5, 10, 5, 5));
        right.setBorder(new EmptyBorder(5, 5, 5, 10));

        left.setLayout(leftV);
        right.setLayout(rightV);
        body.setLayout(box);

        JRadioButton malt = new JRadioButton("Malt");
        JRadioButton yeast = new JRadioButton("Yeast");
        JRadioButton hops = new JRadioButton("Hops");

        JButton add = new JButton();
        JButton del = new JButton();

        add.setText("Add");
        del.setText("Remove");

        ButtonGroup opt = new ButtonGroup();
        opt.add(add);
        opt.add(del);

        ButtonGroup group = new ButtonGroup();
        group.add(malt);
        group.add(yeast);
        group.add(hops);

        malt.setAlignmentX(LEFT_ALIGNMENT);
        yeast.setAlignmentX(LEFT_ALIGNMENT);
        hops.setAlignmentX(LEFT_ALIGNMENT);
        JLabel note = new JLabel();

        note.setText("Note*: removes last field on list.");

        TitledBorder title = new TitledBorder("List Modifiers");
        Border margin = new EmptyBorder(0, 0, 0, 0);
        body.setBorder(new CompoundBorder(title, margin));

        add.setAlignmentX(CENTER_ALIGNMENT);
        del.setAlignmentX(CENTER_ALIGNMENT);
        note.setAlignmentX(CENTER_ALIGNMENT);
        guts.add(left);
        guts.add(right);

        left.add(malt);
        left.add(yeast);
        left.add(hops);

        right.add(add);
        right.add(del);

        body.add(guts);
        body.add(div);
        body.add(note);

        pack();
        revalidate();
        return body;
    }

    public JPanel batchInfo() {
        JPanel center = new JPanel();
        JPanel body = new JPanel();
        JPanel tHorz = new JPanel();
        JPanel bHorz = new JPanel();
        JPanel horzT = new JPanel();
        JPanel horzB = new JPanel();

        BorderLayout border = new BorderLayout();
        FlowLayout Tbox = new FlowLayout();    // bottom set
        FlowLayout Bbox = new FlowLayout();
        BoxLayout box = new BoxLayout(body, BoxLayout.Y_AXIS);
        FlowLayout boxT = new FlowLayout();    //top set
        FlowLayout boxB = new FlowLayout();

        center.setLayout(border);
        center.add(body);
        horzT.setLayout(Tbox);
        horzB.setLayout(Bbox);
        body.setLayout(box);
        tHorz.setLayout(boxT);
        bHorz.setLayout(boxB);

        //Dimension b = new Dimension(250,600);
        //body.setPreferredSize(b);
        TitledBorder title = new TitledBorder("Batch Info");
        Border margin = new EmptyBorder(0, 0, 0, 0);
        body.setBorder(new CompoundBorder(title, margin));

        JSeparator div = new JSeparator();

        JLabel initHeader = new JLabel("Initial:");
        initHeader.setAlignmentX(CENTER_ALIGNMENT);
        JLabel newHeader = new JLabel("New:");
        newHeader.setAlignmentX(CENTER_ALIGNMENT);
        JLabel initWater = new JLabel("Water(gallons):");
        JLabel initTemp = new JLabel("Tempertaure(F):");
        JLabel newWater = new JLabel("Water(gallons):");
        newWater.setAlignmentX(LEFT_ALIGNMENT);

        JLabel newTemp = new JLabel("Tempertaure(F):");
        newTemp.setAlignmentX(LEFT_ALIGNMENT);
        JLabel waterDisplay = new JLabel("*water*");
        JLabel tempDisplay = new JLabel("*temp*");

        JSpinner initWaterVal = new JSpinner();
        JSpinner initTempVal = new JSpinner();

        JButton ok = new JButton("SUBMIT");
        ok.setAlignmentX(CENTER_ALIGNMENT);
        tHorz.add(initWater);
        tHorz.add(initWaterVal);
        bHorz.add(initTemp);
        bHorz.add(initTempVal);

        horzT.add(newWater);
        horzT.add(waterDisplay);
        horzB.add(newTemp);
        horzB.add(tempDisplay);

        //body.add(header);
        body.add(initHeader);
        body.add(tHorz);
        body.add(bHorz);
        body.add(ok);
        body.add(div);
        body.add(newHeader);
        body.add(horzT);
        body.add(horzB);
        //me.add(body);
        pack();
        revalidate();
        return body;
    }

    public JPanel maltPanel() {
        JPanel body = new JPanel();
        FlowLayout main = new FlowLayout();
        body.setLayout(main);

        JPanel left = new JPanel();
        JPanel right = new JPanel();
        BoxLayout leftV = new BoxLayout(left, BoxLayout.Y_AXIS);
        BoxLayout rightV = new BoxLayout(right, BoxLayout.Y_AXIS);
        left.setLayout(leftV);
        right.setLayout(rightV);

        left.setBorder(new EmptyBorder(2, 5, 5, 5));
        right.setBorder(new EmptyBorder(2, 5, 5, 5));

        TitledBorder title = new TitledBorder("Malt");
        Border margin = new EmptyBorder(0, 5, 5, 5);
        body.setBorder(new CompoundBorder(title, margin));

        JLabel ingredHead = new JLabel("Ingredient");
        JLabel quantHead = new JLabel("Quantity");

        JTextField temp1 = new JTextField("Name");
        JTextField temp2 = new JTextField("Number");

        JSeparator div = new JSeparator();
        JSeparator div2 = new JSeparator();

        left.add(ingredHead);
        left.add(div);
        left.add(temp1);

        right.add(quantHead);
        right.add(div2);
        right.add(temp2);

        body.add(left);
        body.add(right);

        pack();
        revalidate();

        return body;
    }

    public JPanel yeastPanel() {
        JPanel body = new JPanel();
        FlowLayout main = new FlowLayout();
        body.setLayout(main);

        JPanel left = new JPanel();
        JPanel right = new JPanel();
        BoxLayout leftV = new BoxLayout(left, BoxLayout.Y_AXIS);
        BoxLayout rightV = new BoxLayout(right, BoxLayout.Y_AXIS);
        left.setLayout(leftV);
        right.setLayout(rightV);

        left.setBorder(new EmptyBorder(2, 5, 5, 5));
        right.setBorder(new EmptyBorder(2, 5, 5, 5));

        TitledBorder title = new TitledBorder("Yeast");
        Border margin = new EmptyBorder(0, 5, 5, 5);
        body.setBorder(new CompoundBorder(title, margin));

        JLabel ingredHead = new JLabel("Ingredient");
        JLabel quantHead = new JLabel("Quantity");

        JTextField temp1 = new JTextField("Name");
        JTextField temp2 = new JTextField("Number");

        JSeparator div = new JSeparator();
        JSeparator div2 = new JSeparator();

        left.add(ingredHead);
        left.add(div);
        left.add(temp1);

        right.add(quantHead);
        right.add(div2);
        right.add(temp2);

        body.add(left);
        body.add(right);

        pack();
        revalidate();

        return body;
    }

    public JPanel hopPanel() {
        JPanel body = new JPanel();
        FlowLayout main = new FlowLayout();
        body.setLayout(main);

        JPanel left = new JPanel();
        JPanel right = new JPanel();
        BoxLayout leftV = new BoxLayout(left, BoxLayout.Y_AXIS);
        BoxLayout rightV = new BoxLayout(right, BoxLayout.Y_AXIS);
        left.setLayout(leftV);
        right.setLayout(rightV);

        left.setBorder(new EmptyBorder(2, 5, 5, 5));
        right.setBorder(new EmptyBorder(2, 5, 5, 5));

        TitledBorder title = new TitledBorder("Hops");
        Border margin = new EmptyBorder(0, 5, 5, 5);
        body.setBorder(new CompoundBorder(title, margin));

        JLabel ingredHead = new JLabel("Ingredient");
        JLabel quantHead = new JLabel("Quantity");

        JTextField temp1 = new JTextField("Name");
        JTextField temp2 = new JTextField("Number");

        JSeparator div = new JSeparator();
        JSeparator div2 = new JSeparator();

        left.add(ingredHead);
        left.add(div);
        left.add(temp1);

        right.add(quantHead);
        right.add(div2);
        right.add(temp2);

        body.add(left);
        body.add(right);

        pack();
        revalidate();

        return body;
    }

    public JPanel ingredList() {
        JPanel body = new JPanel();
        FlowLayout border = new FlowLayout();

        JPanel guts = new JPanel();
        BoxLayout gb = new BoxLayout(guts, BoxLayout.Y_AXIS);
        //JPanel left = new JPanel();
        //JPanel right = new JPanel();
        //BoxLayout LV = new BoxLayout(left, BoxLayout.Y_AXIS);
        //BoxLayout RV = new BoxLayout(right, BoxLayout.Y_AXIS);

        JPanel malt = maltPanel();
        JPanel yeast = yeastPanel();
        JPanel hops = hopPanel();

        TitledBorder title = new TitledBorder("Ingredient List");
        Border margin = new EmptyBorder(0, 0, 0, 0);
        body.setBorder(new CompoundBorder(title, margin));

        guts.setLayout(gb);
        body.setLayout(border);

        body.add(guts);
        guts.add(malt);
        guts.add(yeast);
        guts.add(hops);
        //left.setLayout(LV);
        //right.setLayout(RV);

        //left.setBorder(new EmptyBorder(10, 10, 10, 10));
        //right.setBorder(new EmptyBorder(10, 10, 10, 10));
        //JLabel ingred = new JLabel("Ingredients");
        //JLabel quant = new JLabel("Quantity");
        //left.add(ingred);
        //right.add(quant);
        //body.add(left, border.WEST);
        //body.add(right, border.EAST);
        //me.add(body);
        pack();
        revalidate();
        return body;
    }

    public void make() {
        JPanel body = new JPanel();
        JPanel body2 = new JPanel();
        JPanel leftBody = new JPanel();
        JPanel rightBody = new JPanel();
        JPanel leftBorder = new JPanel();
        JPanel bottom = new JPanel();
        
        FlowLayout bot = new FlowLayout();
        BorderLayout border = new BorderLayout();
        BoxLayout box1 = new BoxLayout(leftBody, BoxLayout.Y_AXIS);
        BoxLayout box = new BoxLayout(body2, BoxLayout.Y_AXIS);
        FlowLayout flow = new FlowLayout();
        BoxLayout box2 = new BoxLayout(rightBody, BoxLayout.Y_AXIS);
        rightBody.setLayout(box2);
        body.setLayout(flow);
        body2.setLayout(box);
        leftBody.setLayout(box1);
        leftBorder.setLayout(border);
        bottom.setLayout(bot);
        JLabel header = new JLabel("PizzaBoy Brewing");
        header.setAlignmentX(CENTER_ALIGNMENT);
        header.setFont(new Font("Serif", Font.BOLD, 40));

        JButton calcButton = new JButton("CALCULATE");
        calcButton.setAlignmentX(RIGHT_ALIGNMENT);
        body2.add(header);
        body2.add(body);
        leftBorder.add(leftBody, border.NORTH);
        body.add(leftBody);

        JPanel numIngredPanel = numIngredPanel();
        numIngredPanel.setAlignmentX(LEFT_ALIGNMENT);
        JPanel modList = modList();
        modList.setAlignmentX(LEFT_ALIGNMENT);

        leftBody.add(numIngredPanel);
        leftBody.add(modList);

        JPanel ingredList = ingredList();
        ingredList.setAlignmentY(TOP_ALIGNMENT);
        Dimension D = new Dimension(300, 400);
        ingredList.setPreferredSize(D);
        body.add(ingredList);

        JPanel batchSize = batchSize();
        JPanel batchInfo = batchInfo();
        rightBody.add(batchSize);
        rightBody.add(batchInfo);

        body.add(rightBody);
        
        body2.add(bottom);
        bottom.add(calcButton);
        this.add(body2);
        pack();
        revalidate();

    }

    public void create() {
        Dimension s = new Dimension(1920 / 2, 1080 / 2);
        this.setPreferredSize(s);
        this.setMinimumSize(s);
        JPanel body = new JPanel();
        JPanel guts = new JPanel();
        GridLayout grid = new GridLayout(1, 3);
        BorderLayout border = new BorderLayout();
        body.setLayout(border);
        guts.setLayout(grid);

        JPanel right = new JPanel();
        JPanel left = new JPanel();
        BoxLayout lv = new BoxLayout(left, BoxLayout.Y_AXIS);
        left.setLayout(lv);
        BoxLayout rv = new BoxLayout(right, BoxLayout.Y_AXIS);
        right.setLayout(rv);
        JLabel header = new JLabel("PizzaBoy Brewing");
        header.setFont(new Font("Serif", Font.BOLD, 40));
        header.setForeground(Color.yellow);

        JButton Calculate = new JButton("CALCULATE");

        JPanel numIngredPanel = numIngredPanel();
        JPanel batchSize = batchSize();
        JPanel modList = modList();
        JPanel ingredList = ingredList();
        JPanel batchInfo = batchInfo();
        left.add(numIngredPanel);
        right.add(batchSize);
        batchSize.setAlignmentX(0.0f);

        left.add(modList);
        right.add(batchInfo);

        numIngredPanel.setAlignmentX(0.0f);
        batchSize.setAlignmentX(0.0f);
        modList.setAlignmentX(0.0f);
        body.add(guts, border.CENTER);
        body.add(header, border.NORTH);
        guts.add(left);
        body.add(Calculate, border.SOUTH);
        guts.add(ingredList);
        guts.add(right);

        Dimension d = new Dimension(200, 20);
        batchInfo.setPreferredSize(d);

        //numIngredPanel.setAlignmentX(5);
        //batchSize.setAlignmentX(5);
        //modList.setAlignmentX(5);
        this.add(body);
        pack();
        revalidate();

    }

    public void initInputScreen() {      // create text feilds for desired number of ingredients

        // CREATE JPanels //
        JPanel inputScreen = new JPanel();      //main JPanel
        JPanel centerBorderLayout = new JPanel();   // center border layout panel
        JPanel leftVertBoxLayout = new JPanel();   // center left colulmn panel
        JPanel rightVertBoxLayout = new JPanel();  // center right column panel
        JPanel bottomHorzBoxLayout = new JPanel(); // center SOUTH row panel
        JPanel ingredPanel = new JPanel();          // top left enter ingredient quantity
        //JPanel inputScreenNORTH = new JPanel();
        JPanel inputScreenEAST = new JPanel();
        JPanel topBorderLayout = new JPanel();
        // CREATE LAYOUTS//
        BorderLayout topBorder = new BorderLayout();
        //BoxLayout boxNORTH = new BoxLayout(inputScreenNORTH, BoxLayout.X_AXIS);
        BoxLayout boxEAST = new BoxLayout(inputScreenEAST, BoxLayout.Y_AXIS);
        BorderLayout inBorder = new BorderLayout();
        BorderLayout border = new BorderLayout();       // creates border layout 
        BoxLayout BoxVL = new BoxLayout(leftVertBoxLayout, BoxLayout.Y_AXIS);    //creates left vertical box layout
        BoxLayout BoxVR = new BoxLayout(rightVertBoxLayout, BoxLayout.Y_AXIS);   // creates right vertical box layout
        BoxLayout BoxHS = new BoxLayout(bottomHorzBoxLayout, BoxLayout.X_AXIS);
        BoxLayout box = new BoxLayout(ingredPanel, BoxLayout.Y_AXIS);

        // SET LAYOUTS //
        topBorderLayout.setLayout(topBorder);
        inputScreenEAST.setLayout(boxEAST);
        inputScreen.setLayout(border);                  //set inputSceen layout
        centerBorderLayout.setLayout(inBorder);           //set center panel layout to border
        leftVertBoxLayout.setLayout(BoxVL);             // set center left panel layout to BoxVL
        rightVertBoxLayout.setLayout(BoxVR);            // set center right panel layout to BoxVR
        bottomHorzBoxLayout.setLayout(BoxHS);
        ingredPanel.setLayout(box);
        //inputScreenNORTH.setLayout(boxNORTH);

        // SET BORDERS //
        /*inputScreen.setBorder(new EmptyBorder(250, 500, 250, 500));
        centerBorderLayout.setBorder(new EmptyBorder(10, 10, 10, 10));
        leftVertBoxLayout.setBorder(new EmptyBorder(10, 10, 10, 10));
        rightVertBoxLayout.setBorder(new EmptyBorder(10, 10, 10, 10));
        bottomHorzBoxLayout.setBorder(new EmptyBorder(10, 10, 10, 10));*/
        // COLOR BORDERS //
        /*Border blackline = BorderFactory.createLineBorder(Color.black);
        inputScreen.setBorder(blackline);
        ingredPanel.setBorder(blackline);
        centerBorderLayout.setBorder(blackline);*/
        //leftVertBoxLayout.setBorder(blackline);
        //rightVertBoxLayout.setBorder(blackline);
        //bottomHorzBoxLayout.setBorder(blackline);
        // ADD CONTAINERS //
        inputScreen.add(inputScreenEAST, border.EAST);
        inputScreen.add(topBorderLayout, border.NORTH);
        topBorderLayout.add(ingredPanel, topBorder.CENTER);
        inputScreen.add(centerBorderLayout, border.CENTER);
        centerBorderLayout.add(bottomHorzBoxLayout, inBorder.SOUTH);
        centerBorderLayout.add(leftVertBoxLayout, inBorder.WEST);         // add box layout panels to centerPanel
        centerBorderLayout.add(rightVertBoxLayout, inBorder.EAST);
        this.add(inputScreen);

        // CREATE SEPARATORS //
        JSeparator split = new JSeparator();

        // ADD SEPARATORS //
        //inputScreenNORTH.add(split);
        //centerBorderLayout.add(split,inBorder.SOUTH);
        // CREATE JLabels //
        JLabel header = new JLabel();
        JLabel ingredLabel = new JLabel();
        JLabel ingredientLabel = new JLabel();
        JLabel quantLabel = new JLabel();

        // SET JLabel TEXT //   
        header.setText("HEADER");
        ingredLabel.setText("Number of Ingredients:");
        ingredientLabel.setText("ingredients");
        quantLabel.setText("quantity");

        // ADD JLabels //
        topBorderLayout.add(header, topBorder.NORTH);
        ingredPanel.add(ingredLabel);
        ingredPanel.add(split);
        leftVertBoxLayout.add(ingredientLabel);
        rightVertBoxLayout.add(quantLabel);

        // SET JLabel FONT //
        // CREATE TEXTFIELDS //
        JTextField ingredNumText = new JTextField();

        // SET TEXTFEILD TEXT //
        ingredNumText.setText("");

        // ADD TEXTFIELD //
        ingredPanel.add(ingredNumText);

        // CREATE BUTTONS //
        JButton addIngred = new JButton();                  // implement addIngredient button
        JButton okButton = new JButton();
        JButton delIngred = new JButton();
        JButton calc = new JButton();                       // implement calculate button

        // SET BUTTON TEXT //
        addIngred.setText("Add Ingredient");
        okButton.setText("OK");
        delIngred.setText("Remove Ingredient");
        calc.setText("Calculate");

        // BUTTONS LISTENERS //
        okButton.addActionListener(new ActionListener() {        //THIS WORKS FOR BUTTON PRESS
            public void actionPerformed(ActionEvent e) {

                ingredNum = Integer.parseInt(ingredNumText.getText());
                initIngred(ingredNum, leftVertBoxLayout, rightVertBoxLayout);

            }
        });
        addIngred.addActionListener(new ActionListener() {           // adds another ingredient feild
            public void actionPerformed(ActionEvent e) {

                JTextField tempText = new JTextField();
                JTextField tempQuan = new JTextField();
                leftVertBoxLayout.add(tempText);
                rightVertBoxLayout.add(tempQuan);
                if (totalRowsUsed == totalRows) {
                    header.setText("LIST FULL");
                    //textArr[totalRows+1][0] = tempText;
                    //textArr[totalRows+1][1] = tempText;
                    //totalRowsUsed+=1;
                    //totalRows+=1;
                } else {
                    textArr[totalRowsUsed + 1][0] = tempText;
                    textArr[totalRowsUsed + 1][1] = tempQuan;
                    totalRowsUsed += 1;
                }
                pack();
                revalidate();
            }

        });
        delIngred.addActionListener(new ActionListener() {   // deletes an existing ingredient field
            public void actionPerformed(ActionEvent e) {
                leftVertBoxLayout.remove(textArr[totalRowsUsed][0]);
                rightVertBoxLayout.remove(textArr[totalRowsUsed][1]);
                textArr[totalRowsUsed][0] = null;
                textArr[totalRowsUsed][1] = null;
                totalRowsUsed -= 1;

                pack();
                revalidate();
            }
        });
        calc.addActionListener(new ActionListener() {        // performs the calculations
            public void actionPerformed(ActionEvent e) {
                calc.setBackground(Color.orange);
                pack();
                revalidate();
            }
        });

        // ADD BUTTONS //
        ingredPanel.add(okButton);
        bottomHorzBoxLayout.add(addIngred);  // add to innner border layout
        bottomHorzBoxLayout.add(delIngred);
        inputScreen.add(calc, border.SOUTH);                // add to border layout

        inputScreen.setVisible(true);
        pack();
        revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PizzaBoy Brewing");
        setSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MAINFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAINFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAINFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAINFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAINFRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
