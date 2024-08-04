package com.raven.form;

import java.awt.event.ItemEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main_Form extends javax.swing.JPanel {
    public Main_Form() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        date_from = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        dept = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        prog = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        catg = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        paper_title = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        authors = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        conference_name = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rollno = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        country = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        thesis = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        setPreferredSize(new java.awt.Dimension(1007, 2153));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(99, 99));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INDIAN INSTITUTE OF TECHNOLOGY BOMBAY");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel39.setText("APPLICATION FOR FUNDING OF INTERNATIONAL CONFERENCE PARTICIPATION");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("*Name:");

        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Date:");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("*Roll No:");

        date_from.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        date_from.setToolTipText("Date format should be dd/mm/yyyy");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Email (L-DAP):");

        email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Mobile No:");

        phone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Department:");

        date.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        date.setToolTipText("Date format should be dd/mm/yyyy");

        dept.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aerospace Engineering", "Biosciences and Bioengineering", "Center For Studies in Resources Engineering", "Centre for Technology Alternatives for Rural Areas (CTARA) ", "Chemical Engineering", "Chemistry", "Civil Engineering", "Computer Science & Engineering", "Earth Sciences", "Economics ", "Electrical Engineering", "Entrepreneurship", "Energy Science and Engineering", "Environmental Science and Engineering (ESED)", "Humanities & Social Sciences", "Industrial Design Centre", "Industrial Engineering and Operations Research", "Mathematics", "Management", "Mechanical Engineering", "Metallurgical Engineering & Materials Science", "Physics", "Statistics and Informatics", "Systems And Control Engineering" }));
        dept.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deptItemStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Program:");

        prog.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        prog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ph.D.", "M.Tech.+Ph.D.", "M.Sc. + Ph.D." }));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Category:");

        catg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        catg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TA", "RA", "SW", "FA", "PS", "CT", "IS", "QIP", "SF", "EX" }));
        catg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                catgItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("*Paper Title :");

        paper_title.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Authors :");

        authors.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setText("*Conference Name (in full) :");

        conference_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        conference_name.setToolTipText("Leave empty if you don't have the conference name");
        conference_name.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                conference_nameCaretUpdate(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("*Dates From:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("*To:");

        rollno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rollno.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rollnoCaretUpdate(evt);
            }
        });

        to.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        to.setToolTipText("Date format should be dd/mm/yyyy");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("*City:");

        city.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("Country: ");

        country.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North America", "South America", "New Zealand", "Australia", "Europe", "Far-East Asia", "Japan", "China", "Korea", "Hong Kong", "Taiwan", "Indonesia", "Africa", "Malayasia", "SriLanka", "Nepal", "Burma", "Bangladesh", "Gulf Countries", "Pakistan", "Singapore", "Thailand", "Maldives" }));
        country.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                countryItemStateChanged(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setText("Answer the Following");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel20.setText("1. The paper is selected on the basis of ");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel21.setText("2. The paper");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel22.setText("3. The paper is selected for ");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel23.setText("4. Have taken funds from IIT Bombay previously for the same purpose ");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel24.setText("5. You have received assistance for travel, registration etc from Conference Organizers for ");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel25.setText("*Date of form received at academy section:");

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton7.setText("Yes");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton8.setText("No");
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton8ItemStateChanged(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField4.setToolTipText("Date format should be dd/mm/yyyy");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel27.setText("Guide Name:");

        jComboBox5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof. A. K. Suresh", "Prof. A. Shriwastav", "Prof. Abhijit Mujumder", "Prof. Abhilash J. Chandy", "Prof. Abhilash J. Chandy                          ", "Prof. Aftab Alam", "Prof. Ajay Singh Panwar", "Prof. Ajay Singh Panwar    ", "Prof. Alankar Alankar", "Prof. Alok Shukla", "Prof. Amartya Mukhopadhyay", "Prof. Amber Shrivastava", "Prof. Amit Agrawal", "Prof. Amit Arora", "Prof. Amit Sethi", "Prof. Anand Rao", "Prof. Anil Kulkarni", "Prof. Anindya Datta", "Prof. Anirban Banerjee", "Prof. Anirban Guha", "Prof. Anish Modi", "Prof. Anshuman Shukla", "Prof. Anurag Garg", "Prof. Anurag Mehra", "Prof. Anush Kapadia", "Prof. Aparna Singh", "Prof. Aparna sinhg", "Prof. Apurba Laha", "Prof. Arindrajit Chowdhury", "Prof. Arpita Mondal", "Prof. Arun Iyer", "Prof. Ashish Pandey", "Prof. Ashutosh Gandhi", "Prof. Ashutosh Kumar", "Prof. Atul Sharma", "Prof. Avijit Chatterjee", "Prof. B. Kavaipatti ", "Prof. Balila Nagmani Jaya", "Prof. Basudev Biswal", "Prof. Bhallamudi Ravi", "Prof. Bhaskaran Murlidharan ", "Prof. Bhaskaran Raman", "Prof. Biplab Banerjee", "Prof. C. Subramaniam", "Prof. Chandra M. R. Volla", "Prof. D. Mukherjee", "Prof. D. Parthsarathy", "Prof. Debabrata Maiti", "Prof. Debjani Paul", "Prof. Deepankar Choudhury", "Prof. Devang Khakhar", "Prof. Dinesh Kabra", "Prof. Dipanka Saha", "Prof. Dipankar Saha", "Prof. Dipti Gupta", "Prof. G. N. Patwari", "Prof. G. Rajaraman", "Prof. Ganesh Viswanathan", "Prof. Girish Kumar", "Prof. Gopal Dixit", "Prof. Gopal Patil", "Prof. Gopalan Rajaraman", "Prof. Gulab Singh", "Prof. Hari M. Varma", "Prof. Hrishikesh Gadgil", "Prof. Indradev Samajdar", "Prof. J. Indu", "Prof. J. Venkateswaran ", "Prof. Jayanta Mukherjee", "Prof. K Narasimhan", "Prof. K. G. Suresh", "Prof. K. P. P. Karunakarana", "Prof. Kamendra Sharma", "Prof. Kiran Kondabagil", "Prof. Kishore Chatterjee", "Prof. Koushik Saha", "Prof. Krishna P. Kaliappan", "Prof. Krishnendu Sinha", "Prof. Kumar Hemant Singh", "Prof. L. S. Panchakarla", "Prof. M. Aslam", "Prof. M. D. Atrey", "Prof. M. P. Gururajan", "Prof. M. Ravikanth", "Prof. M. S. Balakrishna", "Prof. M. shanmugan", "Prof. Mahes S Tirumkudulu", "Prof. Mahesh S. Tirumkudulu", "Prof. Mani Bhushan", "Prof. Manish M. Pande  ", "Prof. Manoj Neergat", "Prof. Mazhar Kamran", "Prof. Milind Atrey", "Prof. MJNV Prasad", "Prof. Mrinal Kumar", "Prof. Munish K. Chandel", "Prof. N. C. Narayanan", "Prof. N. Prabhu", "Prof. Nagamani Balila", "Prof. Nagamani Jaya Balila", "Prof. Nagendra R Velga", "Prof. Nagmani Balila", "Prof. Nand kishore Sharma", "Prof. Narayan Rangaraj", "Prof. Neeta Kanekar", "Prof. P J Guruprasad", "Prof. P. Ramadevi", "Prof. P. S. Gandhi", "Prof. P. Vedagiri", "Prof. Parag Choudhuri", "Prof. Pooja Purang", "Prof. Pradip Kalbar", "Prof. Pramod P. Wangikar", "Prof. Prasenjit Basu", "Prof. Prasenjit Ghosh", "Prof. Prita Pant", "Prof. Pushpak Bhattacharya", "Prof. R. B. Sunoj", "Prof. R. Murugavel", "Prof. Rahul Maitra", "Prof. Rahul Purwar", "Prof. Rajesh Gupta", "Prof. Rajesh Zele", "Prof. Rajiv Dusane", "Prof. Ramkumar Rajendran", "Prof. Ranjan Kumar Panda", "Prof. Ranjith P.", "Prof. Ratheesh Radhakrishnan ", "Prof. Ratul Dasgupta", "Prof. Ravi Banavar", "Prof. Rochish Thaokar", "Prof. Rohit Srivastava", "Prof. Ruchi Anand", "Prof. S P Duttagupta", "Prof. S. S. Major", "Prof. Sachin Patwardhan", "Prof. Salil Kulkarni", "Prof. Samer Maji", "Prof. Samir Maji", "Prof. Samjeev Chaudhari", "Prof. Sandeep Arvind", "Prof. Sandip Kar", "Prof. Sandip Kumar Saha", "Prof. Sankara Sarma V Tatiparti", "Prof. Santanu K. Ghosh", "Prof. Santosh Gharpure", "Prof. Sarika Mehra", "Prof. Shalabh Gupta", "Prof. Shamik Sen", "Prof. Shankar Krishnan", "Prof. Sharayu Moharir", "Prof. Shobha Shukla", "Prof. Shobha Shukla                                                                            ", "Prof. Shobhna Kapoor ", "Prof. Shobhna Kappor", "Prof. Shobna Kapoor", "Prof. Shyam Asolekar", "Prof. Shyamprasad K. ", "Prof. Soumyo Mukherji", "Prof. Subhananda Chakrabarti", "Prof. Subimal Ghosh", "Prof. Subodh Wagle", "Prof. Sudarshan Kumar", "Prof. Sudhir Ghorpade", "Prof. Suneet Singh", "Prof. Suparna Mukherji", "Prof. Suryanarayana Doolla", "Prof. Sushil Mishra", "Prof. Suyash Awate", "Prof. Swati Bhattacharya", "Prof. T. I. Eldho", "Prof. Tara Shankar Shaw", "Prof. U. V. Bhandarkar", "Prof. Usha Ananthakumar", "Prof. V. Jothiprakash", "Prof. V. Jyotiprakash", "Prof. V. S. Raja", "Prof. Varun Bhalerao", "Prof. Vedagiri Perumal", "Prof. Vikram Vishal", "Prof. Vivek Sangawan", "Prof. Y. S. Rao" }));
        jComboBox5.setToolTipText("");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel28.setText("Department: ");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField5.setText("Aerospace Engineering");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel30.setText("For a Ph.D student, who has completed 3 years, please specify the probable date of Submission of thesis");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel31.setText("Guide's Signature:");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel32.setText("Guide's Recommendation:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel33.setText("Head's Recommendation:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel34.setText("Head's Signature:");

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton9.setText("Yes");
        jRadioButton9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton9ItemStateChanged(evt);
            }
        });

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton10.setText("No");
        jRadioButton10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton10ItemStateChanged(evt);
            }
        });

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton11.setText("Yes");

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton12.setText("No");

        jRadioButton13.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton13.setText("Yes");

        jRadioButton14.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton14.setText("No ");

        jRadioButton15.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton15.setText("Yes");

        jRadioButton16.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton16.setText("No");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField7.setText("TA");

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField8.setText("Empty");

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField9.setText("North America");

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField10.setText("No");

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField11.setText("Empty");

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField12.setText("Empty");

        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel35.setText("*Date of committee meeting:");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel36.setText("Amount Approved:");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Application is ");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("Committee Members");

        jTextField16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField16.setToolTipText("Date format should be dd/mm/yyyy");

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(255, 255, 255));
        jTextField17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField17.setText("1,10,000");

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 255, 255));
        jTextField18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(242, 246, 253));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Save to DataBase");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("FOR STUDENTS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/table.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/table1.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/table2.png"))); // NOI18N

        thesis.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        thesis.setToolTipText("Date format should be dd/mm/yyyy");
        thesis.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                thesisCaretUpdate(evt);
            }
        });

        jComboBox7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "abstract", "full" }));

        jComboBox8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "will", "will not" }));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("appear in conference proceedings.");

        jComboBox9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "poster session", "presentation" }));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton3.setBackground(new java.awt.Color(242, 246, 253));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(242, 246, 253));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Save to generate data");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(242, 246, 253));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Print");
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Prof. Abhijeet Kumar", "Prof. Amuthan A. Ramabathiran", "Prof. Abhijit Gogulapati", "Prof. Abhilash J.Chandy", "Prof. Abhishek Chakraborty", "Prof. Abhishek Gupta", "Prof. Alankar Alankar", "Prof. Albert Thomas", "Prof. Alok Goyal", "Prof. Amber Shrivastava", "Prof. Amit Agrawal", "Prof. Amit Das", "Prof. Amit Singh", "Prof. Amitava De", "Prof. Amol A. Gokhale", "Prof. Amritanshu Shriwastav", "Prof. Anand Rao", "Prof. Anirban Guha", "Prof. Anirban Sain", "Prof. Anish Modi", "Prof. Ankit Jain", "Prof. Ankur A. Kulkarni", "Prof. Arghadeep Laskar", "Prof Arti D. Kalro", "Prof. Arindrajit Chowdhury", "Prof. Arnab Maity", "Prof. Arpita Sinha", "Prof. Arunkumar Sridharan", "Prof. Ashish Juneja", "Prof. Ashish Pandey", "Prof. Ashish Singh", "Prof. Asim Tewari", "Prof. Atul Sharma", "Prof. Atul Srivastava", "Prof. Avijit Chatterjee", "Prof. Avijit Maji", "Prof. Avinash Bhardwaj", "Prof. Avishek Ghosh", "Prof. Avishek Ranjan", "Prof. B. Ravi", "Prof. Balaji Ramakrishnan", "Prof. Basudev Biswal", "Prof. Bellie Sivakumar", "Prof. Bhalchandra Puranik", "Prof. Bharatkumar Suthar", "Prof. Chandan Dasgupta", "Prof. D N Singh", "Prof. Darshan S. Shah", "Prof. Dasaka Murty", "Prof. Debasish Chatterjee ", "Prof. Deepak Marla", "Prof. Deepankar Choudhury ", "Prof. Dhanesh N. Manik", "Prof. Dharamveer Singh", "Prof. Dipanshu Bansal", "Prof. Dhwanil Shukla", "Prof. Dnyanesh Pawaskar", "Prof. Eswar Rajasekaran", "Prof. Gajendra Kumar Adil", "Prof. Gopal R Patil", "Prof. Gurminder Singh", "Prof. Harish Phuleria", "Prof. Hemendra Arya", "Prof. Hrishikesh Gadgil", "Prof. Indu J", "Prof. J.C. Mandal", "Prof. Janani Srree Murallidharan", "Prof. Janga Reddy Manne", "Prof. Jangid R S", "Prof. Jayadipta Ghosh", "Prof. K V Krishna Rao", "Prof. K. P. Karunakaran", "Prof. Kapil Gupta", "Prof. Kirankumar Momaya", "Prof. Kowsik Bodi", "Prof. Krishna Jonnalagadda", "Prof. Krishnendu Haldar", "Prof. Krishnendu Sinha", "Prof. Leena Vachhani", "Prof. M C Deo", "Prof. Makarand. Shrikrishna. Kulkarni", "Prof. Manasa Ranjan Behera", "Prof. Mandar Inamdar", "Prof. Manish Kumar", "Prof. Manoranjan Sahu", "Prof. Meera Raghunandan ", "Prof. Milind Atrey", "Prof. Ms. Karuna Jain", "Prof. Ms. Usha Ananthakumar", "Prof. Muhammad Salman", "Prof. Munish Chandel", "Prof. Nagendra Rao Velaga", "Prof. Najeeb Shariff Mohammad", "Prof. Naresh K Chandiramani", "Prof. Nagendra Kumar", "Prof. Navin Khaneja", "Prof. Neeraj Kumbhakarna", "Prof. Nitesh P. Yelve", "Prof. P J Guruprasad", "Prof. P. M. Mujumdar", "Prof. P. S. Gandhi", "Prof. P. S. V. Nataraj", "Prof. P. Seshu", "Prof. Pankaj Dutta", "Prof. Parag U. Tandaiya", "Prof. Pinom Ering", "Prof. Piyush Pandey", "Prof. Prabhu Ramachandran", "Prof. Pradeep A. M.", "Prof. Pradeep Dixit", "Prof. Pradipta Banerji", "Prof. Prakash Nanthagopalan", "Prof. Prasenjit Basu", "Prof. Prashant P. Date", "Prof. Pramod Kumar\t", "Prof. R. Ganesh", "Prof. Rahul Patil", "Prof. Rahul Nabar", "Prof. Rajendra P. Vedula", "Prof. R. K. Pant", "Prof. Rajneesh Bhardwaj", "Prof. Rakesh G. Mote", "Prof. Ramesh Singh", "Prof. Ramkumar Rajendran", "Prof. Ramsankaran Raaj", "Prof. Ravi N. Banavar", "Prof. Ravi Sinha", "Prof. Riddhi Singh", "Prof. Ritayan Mitra", "Prof. Rohan Chinchwadkar", "Prof. Rohit Gupta", "Prof. S. Narayan Rao", "Prof. S. S. Joshi", "Prof. S. S. Pande", "Prof. S. V. Prabhu", "Prof. S.V.D. Nageswara Rao", "Prof. Sahana Murthy", "Prof. Salil S. Kulkarni", "Prof. Sandip Kumar Saha", "Prof. Sanjeev Chaudhari", "Prof. Santiram Chatterjee", "Prof. Sarthak Gaurav", "Prof. Sauvik Banerjee", "Prof. Shripad Mahulikar", "Prof. Shankar Krishnan", "Prof. Shankaranarayanan S", "Prof. Shantanu Tripathi", "Prof. Shashikanth Suryanarayan", "Prof. Shivasubramanian Gopalakrishnan", "Prof. Shivganesh Bhargava", "Prof. Shyam R. Asolekar", "Prof. Shyamprasad Karagadde", "Prof. Siddhartha Ghosh", "Prof. Soham Mujumdar", "Prof. Solomon Debbarma", "Prof. Sreedhara Sheshadri ", "Prof. Sridhar Iyer", "Prof. Srineash V K", "Prof. Srinidhi Balasubramanian", "Prof. Sridhar Balasubramanian", "Prof. Sripriya Ramamoorthy", "Prof. Subhankar Karmakar", "Prof. Subimal Ghosh", "Prof. Sudarshan Kumar", "Prof. Sukumar Srikant", "Prof. Suparna Mukherji", "Prof. Sushil Mishra", "Prof. Susmita Naskar", "Prof. Sunita Srivastava\t", "Prof. Swagata Basu", "Prof. Swatantra Pratap Singh", "Prof. Swathy Manohar", "Prof. Syaamantak Das", "Prof. T I Eldho", "Prof. T. Chandra Sekar", "Prof. Trupti Mishra\t", "Prof. T. T. Niranjan", "Prof. Tabish Nawaz", "Prof. Tanmay K. Bhandakkar", "Prof. Tom V Mathew", "Prof. U. V. Bhandarkar", "Prof. Urjit A Yajnik", "Prof. V Jothiprakash", "Prof. V. Kartik", "Prof. V. Menezes", "Prof. V. S. Vamsi Botlaguduru", "Prof. Varadraj Bapat", "Prof. Vedagiri Perumal", "Prof. Venkata Santosh Kumar Delhi", "Prof. Vineeth Nair", "Prof. Virendra Sethi", "Prof. Viswanadham B V S", "Prof. Vivek Natarajan", "Prof. Vivek Sangwan", "Prof. V. Venkateswara Rao", "Prof. Yogesh Desai", "A P Rajaram\t", "Abhay Karandikar\t", "Abhijit Chatterjee\t", "Abhijit Majumder\t", "Abhiram Ranade\t", "Abir De\t", "Achintya Kumar Dutta\t", "Aditi Chaubal\t", "Aftab Alam\t", "Ahonaa Roy\t", "Ajit A Diwan\t", "Ajit Rajwade\t", "Akash Kumar\t", "Akkihebbal K Suresh\t", "Akshay S\t", "Alok Shukla\t", "Amber Jain\t", "Amit Sethi\t", "Amitabha A Sanyal\t", "Amitabha Nandi\t", "Amol Subhedar\t", "Amrita Banerjee\t", "Ananthnarayan Hariharan\t", "Anil Kottantharayil\t", "Anil Kulkarni\t", "Anil Kumar\t", "Anindya Datta\t", "Aniruddha Sinha\t", "Anish Modi\t", "Anshuman Kumar\t", "Anshuman Shukla\t", "Anupama Kowli\t", "Anurag Garg\t", "Anurag Mehra\t", "Anush Kapadia\t", "Apurba Laha\t", "Archana Pai\t", "Arindam Chowdhury\t", "Arindam Sarkar\t", "Arnab Dutta\t", "Arun Iyer\t", "Ashish Das\t", "Ashutosh Gupta\t", "Ashutosh Mahajan\t", "Ashwin A. Tulapurkar\t", "Ashwin Gumaste\t", "Asish Kumar Sarangi\t", "Asmita Mukherjee\t", "Ateeque Malani\t", "Avinash Bhardwaj\t", "Avinash V. Mahajan\t", "Ayan Bhattacharya\t", "Azizuddin Khan\t", "Balasubramaniam Kavaipatti\t", "Basanta Kumar Nandi\t", "Bata Krishna Das\t", "Baylon G. Fernandes\t", "Bernard Menezes\t", "Bharat G Adsul\t", "Bharath Shekar\t", "Bhaskaran Muralidharan\t", "Bhaskaran Raman\t", "Bikash Kumar Dey\t", "Biswabandan Panda\t", "C. D. Sebastian\t", "Chandra M. R. Volla\t", "Chandramouli Subramaniam\t", "Chetan Singh Solanki\t", "Chidambar Kulkarni\t", "D. Manjunath\t", "D.Parthasarathy\t", "Dayadeep Monder\t", "Debabrata Maiti\t", "Debanjan Bhowmik\t", "Debanjana Mitra\t", "Debasattam Pal\t", "Debraj Chakraborty\t", "Debraj Das\t", "Devang V Khakhar\t", "Dibyendu Das\t", "Dinesh Kabra\t", "Dipankar Saha\t", "Dipendra Prasad\t", "Dr. S Ganeshan\t", "Dwaipayan Mukherjee\t", "G Sivakumar\t", "G. Naresh Patwari\t", "G.K. Srinivasan\t", "Ganesh A Viswanathan\t", "Ganesh Ramkrishnan\t", "Gaurav S Kasbekar\t", "Gopal Dixit\t", "Gopalan Rajaraman\t", "Goutam Kumar Lahiri\t", "Gurubalan Annadurai\t", "Guruswamy Kumaraswamy\t", "Haripriya Gundimeda\t", "Harish K. Pillai\t", "Harsha Hutridurga\t", "Hemant Nanavati\t", "Hemendra Arya\t", "Himadri Shekhar Dhar\t", "Himanshu J. Bahirat\t", "Hridis Kumar Pal\t", "Ilito H. Achumi\t", "Irishi N. N. Namboothiri\t", "Ishita Sengupta\t", "J. K. Nayak\t", "Jason R. Picardo\t", "Jayakrishnan U Nair\t", "Jayanta Mukherjee\t", "Jayendran Venkateswaran\t", "Jayesh Bellare\t", "Jhumpa Adhikari\t", "Joshi, Anirudha\t", "Jugal K. Verma\t", "Jyoti Seth\t", "K. G. Suresh\t", "K. Narayanan\t", "K. Ramasubramanian\t", "K. Suresh Kumar\t", "K. V Venkatesh\t", "K.S. Mallikarjuna Rao\t", "Kamendra P. Sharma\t", "Kameswari Chebrolu\t", "Kannan M Moudgalya\t", "Kantimay Das Gupta\t", "Karthik Sasihithlu\t", "Kasturi Saha\t", "Kavi Arya\t", "Kishore Chatterjee\t", "Koushik Saha\t", "Krishna P. Kaliappan\t", "Krishna Shankar Narayanan\t", "Krishnan Sivasubramanian\t", "Kumar Appaiah\t", "Kumar Rao\t", "Kummari Mallesham\t", "Kushal Deb\t", "Lalit Kumar\t", "Laxmeesha Somappa\t", "M Senthil Kumar\t", "M. Aslam\t", "M. Ravikanth\t", "M. S. Balakrishna\t", "Madhav P. Desai\t", "Madhu N. Belur\t", "Madhu Vinjamur\t", "Madhukar Omkarnath Garg\t", "Madhusudan Manjunath\t", "Mahendra Shahare\t", "Mahesh B. Patil\t", "Mahesh S Tirumkudulu\t", "Maheswaran S.\t", "Malhar A. Kulkarni\t", "Mamata Mukhopadhyay\t", "Manas Thakur\t", "Manaswita Bose\t", "Mani Bhushan\t", "Maniraj Mahalingam\t", "Manjesh Hanawal\t", "Manoj Gopalkrishnan\t", "Manoj K. Keshari\t", "Manoj Neergat\t", "Manoj Prabhakaran\t", "Maryam Shojaei Baghini\t", "Mayukh Mukherjee\t", "Milind A Sohoni\t", "Mithun Kumar Mitra\t", "Monika Bhattacharjee\t", "Mrinal Kaul\t", "Mrinmoyi Kulkarni\t", "Mukta Tripathy\t", "Mukul C. Chandorkar\t", "Murali K. Srinivasan\t", "Mythili Vutukuru\t", "N. Hemachandra\t", "Naina Manjrekar\t", "Nand Kishore\t", "Nandita Madhavan\t", "Narayan Rangaraj\t", "Narendra S Shiradkar\t", "Neela Nataraj\t", "Neha Gupta\t", "Nikhil Karamchandani\t", "Niranjan Balachandran\t", "Nitin Kumar\t", "Nutan Limaye\t", "Ojus Mohan\t", "Om Damani\t", "P .P. Singh\t", "P Balamurugan\t", "P. Ramadevi\t", "P. Sunthar\t", "P. Vellaisamy\t", "Parag Kumar Chaudhuri\t", "Parinda Vasa\t", "Partha Sarathi Goswami\t", "Paulomi Chakraborty\t", "Pooja Purang\t", "Prachi Mahajan\t", "Pradeep R. Nair\t", "Pradeep Sarin\t", "Pradeepkumar P. I.\t", "Pragya Das\t", "Prakash Chandra Ghosh\t", "Pramod P Wangikar\t", "Prasanna Chaporkar\t", "Prasenjit Ghosh\t", "Pratibha Sharma\t", "Pravesh Jung Golay\t", "Preethi Jyothi\t", "Preeti Raman\t", "Preeti Rao\t", "Prem C. Pandey\t", "Prof. Rahul Nabar\t", "Puja Padhi\t", "Punit Parmananda\t", "Purushottam Kulkarni\t", "Pushpak P Bhattacharya\t", "Radeef Chundakkadan\t", "Radhendushka Srivastava\t", "Raghava Varma\t", "Raghunath Chelakkot\t", "Rahul Maitra\t", "Raile R. Ziipao\t", "Rajakishore Nath\t", "Rajarshi Chakrabarti\t", "Rajbabu Velmurugan\t", "Rajdip Bandyopadhyaya\t", "Rajendra M. Sonar\t", "Rajesh Gupta\t", "Rajesh H. Zele\t", "Rama Pal\t", "Ramaswamy Murugavel\t", "Ramesh Bairy T S\t", "Rangan Banerjee\t", "Ranjan K. Panda\t", "Ranjan Kumar Malik\t", "Rashmi Gupta\t", "Ratheesh Radhakrishnan\t", "Ratikanta Panda\t", "Ratul Dasgupta\t", "Ravi Raghunathan\t", "Ravindra D Gudi\t", "Rekha Santhanam\t", "Rochish Madhukar Thaokar\t", "Rodney A. Fernandes\t", "Rohit Gurjar\t", "Ronnie Sebastian\t", "Rowena Robinson\t", "Ruchi Anand\t", "Rushikesh K Joshi\t", "S . S. Major\t", "S Sudarshan\t", "S. Baskar\t", "S. Umasankar\t", "Sachin C Patwardhan\t", "Sachin Patkar\t", "Sadhana Dash\t", "Sagar Mitra\t", "Sai Vinjanampathy\t", "Saikat Mazumdar\t", "Saisundararaman Vishwanathan\t", "Sambasivarao Kotha\t", "Sameer Jadhav\t", "Sandeep Anand\t", "Sandeep Kumar\t", "Sandip Kar\t", "Sandip Mondal\t", "Sandip Roy\t", "Sandip Singh\t", "Sanjay M Mahajani\t", "Sanjeev V. Sabnis\t", "Sanjog S. Nagarkar\t", "Sanjoy Pusti\t", "Sankara Sarma V Tatiparti\t", "Santanu Bandyopadhyay\t", "Santanu Dey\t", "Santosh J. Gharpure\t", "Santosh Noronha\t", "Saptarshi Prosonno Ghosh\t", "Saravanan Vijayakumaran\t", "Sarika Mehra\t", "Sarmistha Pattanaik\t", "Satish Mulleti\t", "Saurabh Lodha\t", "Saurav Bhaumik\t", "Shaibal K Sarkar\t", "Shalabh Gupta\t", "Sharad Bhartiya\t", "Sharat Chandran\t", "Sharayu Moharir\t", "Sharmila\t", "Sharmistha Saha\t", "Shiladri Chakraborty\t", "Shireesh B Kedare\t", "Shivaram Kalyanakrishnan\t", "Shobhna Kapoor\t", "Shreevardhan A. Soman\t", "Shrikrishna V. Kulkarni\t", "Shripad M. Garge\t", "Sibi Raj B Pillai\t", "Siby K George\t", "Siddharth Tallur\t", "Siddhartha Chaudhuri\t", "Siddhartha P Duttagupta\t", "Siddhartha Santra\t", "Siuli Mukhopadhyay\t", "Sivaji Ganesh Sista\t", "Smriti Haricharan\t", "Sonali Das\t", "Soumen Chakrabarti\t", "Soumya Bera\t", "Sourav Pal\t", "Souvik Banerjee\t", "Souvik Mahapatra\t", "Srikanth Srinivasan\t", "Srinivas Seethamraju\t", "Srinivasan Ramakrishnan\t", "Subhabrata Dhar\t", "Subhananda Chakrabarti\t", "Subhasis Chaudhuri\t", "Subrato Banerjee\t", "Sudarshan R. Gurjar\t", "Suddhasatta Mahapatra\t", "Suddhaseel Sen\t", "Sudha Shastri\t", "Sudhir R. Ghorpade\t", "Sujoy Bhore\t", "Sumiran Pujari\t", "Suneet Singh\t", "Sunil R. Potale\t", "Sunita Sarawagi\t", "Supratik Chakraborty\t", "Supreet Saini\t", "Surajit Bhattacharyya\t", "Suryakant Waghmore\t", "Suryanarayana Doolla\t", "Suvarn S. Kulkarni\t", "Suyash P Awate\t", "Swapneel Mahajan\t", "Swaprava Nath\t", "Swaroop Ganguly\t", "Swati Bhattacharya\t", "Tanmay Bhattacharya\t", "Tara Shankar Shaw\t", "Tony J. Puthenpurakal\t", "U.K. Anandavardhanan\t", "Uday Khedker\t", "Udayan Ganguly\t", "Umesh Bellur\t", "Urban Larsson\t", "V. S. S. Pavan Kumar Hari\t", "Vaijayanthi Sarma\t", "Varsha Apte\t", "Varun Bhalerao\t", "Veeraruna Kavitha\t", "Venkat Gundabala\t", "Venkatasailanathan Ramadesigan\t", "Venkateswarlu Yarlagadda\t", "Vibhushan Subba\t", "Vidhya Soundararajan\t", "Vijay M Naik\t", "Vikram M. Gadre\t", "Vikram Rentala\t", "Vikram Singh Sirola\t", "Vinay A Juvekar\t", "Vinay Joseph Ribeiro\t", "Virendra R. Sule\t", "Virendra Singh\t", "Vishnu Narayanan\t", "Vivek Agarwal\t", "Y. S. Mayya\t", "Y. U. Sasidhar\t", "Yogendra Shastri\t", "Zakir Hussain Rather\t", "Dr. Ambarish Kunwar Professor\t", "Dr. Anand Singh\t", "Dr. Anirban Banerjee Professor\t", "Dr. Ashutosh Kumar Professor\t", "Dr. Debjani Paul Professor\t", "Dr. Desikan Ramakrishnan\t", "Dr. Dulal Panda Chair Professor\t", "Dr. Enamundram Chandrasekhar\t", "Dr. George Mathew\t", "Dr. Gollapally Mohan\t", "Dr. Hari Varma Associate Professor\t", "Dr. Hetu Sheth\t", "Dr. Jahnavi Punekar\t", "Dr. Kanchan Pande\t", "Dr. Kiran Kondabagil Professor\t", "Dr. Kumar Hemant Singh\t", "Dr. Malay Mukul\t", "Dr. Mayank Baranwal\t", "Dr. Munukutla Radhakrishna\t", "Dr. Naraga Prabhakar\t", "Dr. Neeta Kanekar Assistant Professor\t", "Dr. Nibedita Rakshit\t", "Dr. Nivethida Thirugnanasambandam Assistant Professor\t", "Dr. Petety V. Balaji Professor\t", "Dr. Prakriti Tayalia\t", "Dr. Prasenjit Bhaumi\t", "Dr. Prashant S. Phale Professor\t", "Dr. Rahul Purwar Associate Professor\t", "Dr. Rajesh Patkar Associate Professor\t", "Dr. Ranjith Padinhateeri Professor\t", "Dr. Rohit Manchanda Professor\t", "Dr. Rohit Srivastava Professor\t", "Dr. Roop Mallik Professor\t", "Dr. S Ganeshan\t", "Dr. Sakthi Saravanan Chinnasamy\t", "Dr. Samir K. Maji Professor\t", "Dr. Sandip Kaledhonkar Assistant Professor\t", "Dr. Sanjeeva Srivastava Professor\t", "Dr. Santanu Banerjee\t", "Dr. Santanu Kumar Ghosh Professor\t", "Dr. Satish Maurya\t", "Dr. Shamik Sen Professor\t", "Dr. Shashi Ranjan Kumar\t", "Dr. Soumyajit Mukherjee\t", "Dr. Soumyo Mukherji\t", "Dr. Sreelaja Nair Associate Professor\t", "Dr. Sudipta Dasgupta\t", "Dr. Sujit S Jogwar\t", "Dr. Suresh Chandra Patel\t", "Dr. Suryendu Dutta\t", "Dr. Sushil Kumar Assistant Professor\t", "Dr. Swapnil Rohidas Shinde Assistant Professor\t", "Dr. Swati Patankar Professor\t", "Dr. Trilok Nath Singh\t", "Dr. Vikram Vishal", "Dr. Vinish Kumar Kathuria", "\t", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setDropMode(javax.swing.DropMode.ON);
        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conference_name, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton14))
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton15)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton11)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel39)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton7)
                                        .addGap(32, 32, 32)
                                        .addComponent(jRadioButton8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField12)
                                    .addComponent(jComboBox1, 0, 190, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thesis, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prog, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(catg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_from, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paper_title, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(authors, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel43))
                                .addGap(510, 510, 510))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton4)
                        .addGap(50, 50, 50)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel41))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel7)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(prog, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(catg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(paper_title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(authors, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(conference_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(date_from, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton7)
                                .addComponent(jRadioButton8))
                            .addComponent(jLabel23))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(43, 43, 43)
                        .addComponent(jCheckBox3)
                        .addGap(46, 46, 46)
                        .addComponent(jCheckBox4)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox5)
                        .addGap(26, 26, 26)
                        .addComponent(jCheckBox6)
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(thesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton11)
                        .addComponent(jRadioButton12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(jRadioButton9)
                        .addComponent(jRadioButton10)
                        .addComponent(jLabel32)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
   
    private void deptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deptItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            try {
                String str = dept.getSelectedItem().toString();
                jTextField5.setText(str);
            }
            catch(Exception ex) {
                System.out.println(ex);
            }     
        }                 
    }//GEN-LAST:event_deptItemStateChanged

    private void countryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_countryItemStateChanged
        // TODO add your handling code here:
        if("North America".equals(country.getSelectedItem())){
            jTextField9.setText("North America");
            jTextField17.setText("1,10,000");
        }
        else if("South America".equals(country.getSelectedItem())){
            jTextField9.setText("South America");
             jTextField17.setText("1,10,000");
        }
        else if("Australia".equals(country.getSelectedItem())){
            jTextField9.setText("Australia");
            jTextField17.setText("1,10,000");
        }
        else if("New Zealand".equals(country.getSelectedItem())){
            jTextField9.setText("New Zealand");
            jTextField17.setText("1,10,000");
        }
        else if("Europe".equals(country.getSelectedItem())){
            jTextField9.setText("Europe");
            jTextField17.setText("85,000");
        }
        else if("Far-East Asia".equals(country.getSelectedItem())){
            jTextField9.setText("Far-East Asia");
            jTextField17.setText("85,000");
        }
        else if ("Japan".equals(country.getSelectedItem())){
            jTextField9.setText("Japan");
            jTextField17.setText("85,000");
        }
        else if ("China".equals(country.getSelectedItem())){
            jTextField9.setText("China");
            jTextField17.setText("85,000");
        }
        else if ("Korea".equals(country.getSelectedItem())){
            jTextField9.setText("Korea");
            jTextField17.setText("85,000");
        }
        else if ("Hong Kong".equals(country.getSelectedItem())){
            jTextField9.setText("Hong Kong");
            jTextField17.setText("85,000");
        }
        else if ("Taiwan".equals(country.getSelectedItem())){
            jTextField9.setText("Taiwan");
            jTextField17.setText("85,000");
        }
        else if ("Indonesia".equals(country.getSelectedItem())){
            jTextField9.setText("Indonesia");
            jTextField17.setText("85,000");
        }
        else if("Africa".equals(country.getSelectedItem())){
            jTextField9.setText("Africa");
             jTextField17.setText("85,000");
        }
        else if("Malayasia".equals(country.getSelectedItem())){
            jTextField9.setText("Malayasia");
            jTextField17.setText("60,000");
        }
        else if("Gulf Countries".equals(country.getSelectedItem())){
            jTextField9.setText("Gulf Countries");
            jTextField17.setText("60,000");
        }
        else if("SriLanka".equals(country.getSelectedItem())){
         jTextField9.setText("SriLanka");
            jTextField17.setText("60,000");
        }
         else if ("Nepal".equals(country.getSelectedItem())){
            jTextField9.setText("Nepal");
            jTextField17.setText("60,000");
        }
        else if ("Bangladesh".equals(country.getSelectedItem())){
            jTextField9.setText("Bangladesh");
            jTextField17.setText("60,000");
        }
        else if ("Pakistan".equals(country.getSelectedItem())){
            jTextField9.setText("Pakistan");
            jTextField17.setText("60,000");
        }
        else if ("Singapore".equals(country.getSelectedItem())){
            jTextField9.setText("Singapore");
            jTextField17.setText("60,000");
        }
        else if ("Thailand".equals(country.getSelectedItem())){
            jTextField9.setText("Thailand");
            jTextField17.setText("60,000");
        }
        else if ("Maldives".equals(country.getSelectedItem())){
            jTextField9.setText("Maldives");
            jTextField17.setText("60,000");
        }
        else{
            jTextField17.setText("Select the country");
        }
             
    }//GEN-LAST:event_countryItemStateChanged

    private void catgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_catgItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED){
            try {
                String no=catg.getSelectedItem().toString();
                jTextField7.setText(no);
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_catgItemStateChanged

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton7.isSelected()) {
            jTextField11.setText("Yes");
            jTextField14.setText("No");
        }
        else {
            jTextField11.setText("No");
            jTextField14.setText("Yes");
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        // TODO add your handling code here:
        if(jRadioButton8.isSelected()) {
            jTextField11.setText("No");
            jTextField14.setText("Yes");
        }
        else {
            jTextField11.setText("Yes");
            jTextField14.setText("No");
        }
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((name.getText().trim().isEmpty())&& (rollno.getText().trim().isEmpty())&& (paper_title.getText().trim().isEmpty())&&(conference_name.getText().trim().isEmpty())&&(date.getText().trim().isEmpty())&& (to.getText().trim().isEmpty())){
            JOptionPane.showMessageDialog(null,"All the * fields are mandatory");
        }
        else if(jTextField18.getText().equals("Approved")){
        Connection con1;
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                File accessFile = new File("src/main/java/com/raven/database/Approved.accdb");
                String jdbcUrl = "jdbc:ucanaccess://" + accessFile.getAbsolutePath();
                con1 = DriverManager.getConnection(jdbcUrl);
                System.out.println("Connection Established");
                PreparedStatement ps = con1.prepareStatement("Insert into approved(Name,Rollno,Department,Program,Category,Paper_title,Conference_Name,Date_from,to,City,country,Date_of_received,Guide_Name,Date_committee_meeting,Amount) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1,name.getText());
                ps.setString(2,rollno.getText());
                ps.setObject(3,dept.getSelectedItem());
                ps.setObject(4,prog.getSelectedItem());
                ps.setObject(5,catg.getSelectedItem());
                ps.setString(6,paper_title.getText());
                ps.setString(7,conference_name.getText());
                ps.setString(8,date_from.getText());
                ps.setString(9,to.getText());
                ps.setString(10,city.getText());
                ps.setObject(11,country.getSelectedItem());
                ps.setString(12,jTextField4.getText());
                ps.setObject(13,jComboBox5.getSelectedItem());
                ps.setString(14,jTextField16.getText());
                ps.setString(15,jTextField17.getText());
                System.out.println("Got Data2");
                ps.executeUpdate();
                System.out.println("Done2");
                //name.setText("");
                //rollno.setText("");
                //paper_title.setText("");
               // conference_name.setText("");
              //  date_from.setText("");
                //to.setText("");
               // city.setText("");
               // jTextField4.setText("");
               // jTextField16.setText("");
                JOptionPane.showMessageDialog(null,"Your record has been recorded");
            }
            catch(Exception ex) {
                System.out.println(ex);
            }  
        }
        else {   
            Connection con2;
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                File accessFile = new File("src/main/java/com/raven/database/Not_Approved.accdb");
                String jdbcUrl = "jdbc:ucanaccess://" + accessFile.getAbsolutePath();
                con2 = DriverManager.getConnection(jdbcUrl);
                System.out.println("Connection Established Not approved");
                PreparedStatement ps = con2.prepareStatement("Insert into not(Name,Rollno,Department,Program,Category,Paper_title,Conference_Name,Date_from,to,City,country,Date_of_received,Guide_Name,Date_committee_meeting,Amount) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1,name.getText());
                ps.setString(2,rollno.getText());
                ps.setObject(3,dept.getSelectedItem());
                ps.setObject(4,prog.getSelectedItem());
                ps.setObject(5,catg.getSelectedItem());
                ps.setString(6,paper_title.getText());
                ps.setString(7,conference_name.getText());
                ps.setString(8,date_from.getText());
                ps.setString(9,to.getText());
                ps.setString(10,city.getText());
                ps.setObject(11,country.getSelectedItem());
                ps.setString(12,jTextField4.getText());
                ps.setObject(13,jComboBox5.getSelectedItem());
                ps.setString(14,jTextField16.getText());
                ps.setString(15,jTextField17.getText());
                System.out.println("Got Data3");
                ps.executeUpdate();
                System.out.println("Done3");
                 JOptionPane.showMessageDialog(null,"Your record has been recorded");
            }
            catch(Exception ex) {
                System.out.println(ex);
            } 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            try {
                jTextField12.setText("Yes");
            }
            catch(Exception ex) {
                System.out.println(ex);
            }     
        }
    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jRadioButton10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton10ItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            try {
                jTextField12.setText("No");
            }
            catch(Exception ex) {
                System.out.println(ex);
            }     
        }
    }//GEN-LAST:event_jRadioButton10ItemStateChanged

    private void thesisCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_thesisCaretUpdate
        // TODO add your handling code here:
        String str2 = rollno.getText();
        char dis = str2.charAt(0);
        char dis1 = str2.charAt(1);
        
        String sen1  = ""+dis+dis1;//taking only first 2 char 
        int b = Integer.parseInt(sen1);
        int ans = b + 3;
            
        String str3 = thesis.getText();
        char dis2 = str3.charAt(8);
        char dis3 = str3.charAt(9);
        String sen2 = ""+dis2+dis3; 
        int b1 = Integer.parseInt(sen2);
        if(ans<=b1) {
            jTextField18.setText("Approved"); 
        }
        else {
            jTextField18.setText("Not Approved"); 
        }
    }//GEN-LAST:event_thesisCaretUpdate

    private void conference_nameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_conference_nameCaretUpdate
        // TODO add your handling code here:
        if(conference_name.getText().trim().isEmpty()){
            jTextField10.setText("No");
        }
        else {
            jTextField10.setText("Yes");
        }
    }//GEN-LAST:event_conference_nameCaretUpdate

    private void rollnoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rollnoCaretUpdate
        // TODO add your handling code here:
        if(rollno.getText().trim().isEmpty()){
            jTextField8.setText("Empty");
        }
        else {
            String str2 = rollno.getText() + "\n";
            char dis = str2.charAt(0);
            char dis1 = str2.charAt(1);
            String sen = "20"+dis+dis1;
            jTextField8.setText(sen); //displaying the year option for that purpose
        }
    }//GEN-LAST:event_rollnoCaretUpdate

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         jTextArea1.setText(jTextArea1.getText()+"                                 INDIAN INSTITUTE OF TECHNOLOGY BOMBAY "+"\n\n");
      jTextArea1.setText(jTextArea1.getText()+"               APPLICATION FOR FUNDING OF INTERNATIONAL CONFERENCE"+"\n");
       jTextArea1.setText(jTextArea1.getText()+"                                            PARTICIPATION FOR STUDENTS "+"\n\n");
      jTextArea1.setText(jTextArea1.getText()+"Name: "+name.getText()+"\t\t\t"+"Date: "+date.getText()+"\n\n");
      jTextArea1.setText(jTextArea1.getText()+"Roll no: "+rollno.getText()+"\t" +"Email: "+email.getText()+"\t" +"Mobile No: "+phone.getText()+"\n\n");
      jTextArea1.setText(jTextArea1.getText()+"Department: "+dept.getSelectedItem()+"\t" +"Program: "+prog.getSelectedItem()+"\t"+" Category: "+catg.getSelectedItem()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"Paper Title: "+paper_title.getText()+"\t\t" +"Author: "+authors.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"Conference Name: "+conference_name.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"Date from: "+date_from.getText()+"\t" +"To: "+to.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"City: "+city.getText()+"\t"+"Country: "+country.getSelectedItem()+"\n\n");
       jTextArea1.setText(jTextArea1.getText()+"Q Answer the Following"+"\n");
       jTextArea1.setText(jTextArea1.getText()+"-----------------------------"+"\n");
        jTextArea1.setText(jTextArea1.getText()+"The paper is selected on the basis of- "+jComboBox7.getSelectedItem()+"\n");
      jTextArea1.setText(jTextArea1.getText()+"The paper "+jComboBox8.getSelectedItem()+" appear in conference proceedings"+"\n");
      jTextArea1.setText(jTextArea1.getText()+"The paper is selected for "+jComboBox9.getSelectedItem()+"\n"); 
      
      if(jRadioButton7.isSelected()){
       jTextArea1.setText(jTextArea1.getText()+"Haven taken funds from IIT Bombay previously for the same purpose- "+jRadioButton7.getText()+"\n");   
      }else{
           jTextArea1.setText(jTextArea1.getText()+"Haven taken funds from IIT Bombay previously for the same purpose- "+jRadioButton8.getText()+"\n"); 
      }
      
      jTextArea1.setText(jTextArea1.getText()+"You have received assisatnce for travel,registration etc from Conference Organizers for- "+jTextField3.getText()+"\n");
      jTextArea1.setText(jTextArea1.getText()+"Date of form received at academy section: "+jTextField4.getText()+"\n\n");
      
      if(jCheckBox1.isSelected()){
          jTextArea1.setText(jTextArea1.getText()+"1.)" +jComboBox7.getSelectedItem()+" paper that was submitted- Yes" +"\n");
      }else{
          jTextArea1.setText(jTextArea1.getText()+"1.)" +jComboBox7.getSelectedItem()+" paper that was submitted- No" +"\n");
      }
       
      if(jCheckBox2.isSelected()){
          jTextArea1.setText(jTextArea1.getText()+"2.) Letter of acceptance for " +jComboBox8.getSelectedItem()+ "- Yes" +"\n");
      }else{
         jTextArea1.setText(jTextArea1.getText()+"2.) Letter of acceptance for " +jComboBox8.getSelectedItem()+"- No" +"\n");
      }
      
       if(jCheckBox3.isSelected()){
          jTextArea1.setText(jTextArea1.getText()+"3.) The paper is selected for: "+jComboBox9.getSelectedItem() +"\n");
      }else{
         jTextArea1.setText(jTextArea1.getText()+"3.) The paper is selected for: "+jComboBox9.getSelectedItem() +"\n");
      }
       
       if(jCheckBox4.isSelected()){
          jTextArea1.setText(jTextArea1.getText()+"3.) Attach some documentary evidence in support of quality of your work(e.g.,comments by,"+"\n");
          jTextArea1.setText(jTextArea1.getText()+"reviewers comments by RPC members, etc.). This will help the committee to arrive at"+"\n");
          jTextArea1.setText(jTextArea1.getText()+"a decision- Yes" +"\n");
          
      }else{
         jTextArea1.setText(jTextArea1.getText()+"3.) Attach some documentary evidence in support of quality of your work(e.g.,comments by,"+"\n");
          jTextArea1.setText(jTextArea1.getText()+"reviewers comments by RPC members, etc.). This will help the committee to arrive at"+"\n");
          jTextArea1.setText(jTextArea1.getText()+"a decision- No" +"\n");
      }
       
       if(jCheckBox4.isSelected()){
          jTextArea1.setText(jTextArea1.getText()+"4.) A letter about any funding reading secured- Yes" +"\n");
      }else{
         jTextArea1.setText(jTextArea1.getText()+"4.) A letter about any funding reading secured- No" +"\n");
      }
       
       if(jCheckBox5.isSelected()){
          jTextArea1.setText(jTextArea1.getText()+"5.) Conference announcement dates, location, registration fees, etc- Yes" +"\n");
      }else{
         jTextArea1.setText(jTextArea1.getText()+"5.) Conference announcement dates, location, registration fees, etc- No" +"\n");
      }
       
       if(jCheckBox6.isSelected()){
          jTextArea1.setText(jTextArea1.getText()+"6.) Attach proof of in-residence status, if you belong to "+catg.getSelectedItem()+" Category- Yes" +"\n\n");
      }else{
         jTextArea1.setText(jTextArea1.getText()+"6.) Attach proof of in-residence status, if you belong to "+catg.getSelectedItem()+" Category- No" +"\n\n");
      }
       jTextArea1.setText(jTextArea1.getText()+"For a Ph.D student, who has completed 3 years, please specify the probable date of submission of "+"\n");
       jTextArea1.setText(jTextArea1.getText()+"thesis- "+thesis.getText()+"\n\n");
       jTextArea1.setText(jTextArea1.getText()+"Guide Name : "+jComboBox5.getSelectedItem()+"\t"+"Department: "+dept.getSelectedItem()+"\n\n");
       jTextArea1.setText(jTextArea1.getText()+"Guide's Signature:_________________________"+"\n\n");
       jTextArea1.setText(jTextArea1.getText()+"Head's Signature:_________________________"+"\n\n");
       jTextArea1.setText(jTextArea1.getText()+"Year: "+jTextField8.getText()+"\t\t"+"Acceptance Letter: "+jComboBox1.getSelectedItem()+"\n\n");
       jTextArea1.setText(jTextArea1.getText()+"Category: "+jTextField7.getText()+"\t\t"+"APS Report: "+jComboBox2.getSelectedItem()+"\n\n");
       jTextArea1.setText(jTextArea1.getText()+"Country: "+jTextField9.getText()+"\t\t"+"Recommended:____________________"+"\n\n");
       jTextArea1.setText(jTextArea1.getText()+"Conference: "+jTextField10.getText()+"\t\t");
       jTextArea1.setText(jTextArea1.getText()+"Earlier Sought Assistance: "+jTextField11.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"Date of committee meeting: "+jTextField16.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"Amount Approved : "+jTextField17.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"Appication is : "+jTextField18.getText()+"\n\n");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            jTextArea1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Main_Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authors;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> catg;
    private javax.swing.JTextField city;
    private javax.swing.JTextField conference_name;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JTextField date;
    private javax.swing.JTextField date_from;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField paper_title;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> prog;
    private javax.swing.JTextField rollno;
    private javax.swing.JTextField thesis;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
