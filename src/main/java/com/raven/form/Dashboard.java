package com.raven.form;

import com.raven.model.Model_Card;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.apache.poi.EncryptedDocumentException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

class PieChartExample extends JPanel {

    public PieChartExample(PieDataset data, String str) {
//        setTitle("Pie Chart Example");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create dataset
        PieDataset dataset = data;

        // Create chart
        JFreeChart chart = ChartFactory.createPieChart(str, dataset);
        //chart.setBackgroundPaint(new Color(238, 238, 238));
        chart.getTitle().setPaint(new Color(66, 66, 66));
        chart.getTitle().setFont(new Font("Tahoma", Font.BOLD, 20));

        // Get plot
        PiePlot plot = (PiePlot) chart.getPlot();
        Random random = new Random();

// Loop through each section of the dataset
        for (int i = 0; i < dataset.getItemCount(); i++) {
            // Generate a random RGB color
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);
            Color color = new Color(r, g, b);

            // Set the color of the section
            Comparable key = dataset.getKey(i);
            plot.setSectionPaint(key, color);
        }
        plot.setBackgroundPaint(null);
        plot.setOutlinePaint(null);
        plot.setShadowPaint(null);
        plot.setLabelFont(new Font("Tahoma", Font.PLAIN, 14));
        plot.setLabelBackgroundPaint(null);
        plot.setLabelOutlinePaint(null);
        plot.setLabelShadowPaint(null);

        // Create chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(600, 600));
        chartPanel.setBackground(null);

        // Add chart panel to frame
        add(chartPanel);
    }

}

public class Dashboard extends javax.swing.JPanel {

    JLabel noOfStudents;

    public Dashboard() {
        initComponents();
//        DisplayPie(4, "W.R.T. DEPT");
//        DisplayPie(5, "W.R.T. Guide");
//        DisplayPie(7, "W.R.T. Country");

        // DisplayPieAccess("Country", "W.R.T. Country");
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        chart1.setLayout(gbl);

        JPanel dept = DisplayPieAccess("Department", "W.R.T. Guide");
        JPanel country = DisplayPieAccess("country", "W.R.T. Country");
        JPanel prog = DisplayPieAccess("Program", "W.R.T. Program");
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbl.setConstraints(dept, gbc);
        gbc.gridy = 1;
        gbl.setConstraints(country, gbc);
        gbc.gridy = 2;
        gbl.setConstraints(prog, gbc);
        chart1.add(dept);
        chart1.add(country);
        chart1.add(prog);
        int notApproved = setNoOf("src/main/java/com/raven/database/Not_Approved.accdb", "not");
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/expense.png")), "Not Approved", ""+notApproved));
    }

    private int setNoOf(String fileN, String table) {
        Connection con;
        int stdCount = 0;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            File accessFile = new File(fileN);
            String jdbcUrl = "jdbc:ucanaccess://" + accessFile.getAbsolutePath();
            con = DriverManager.getConnection(jdbcUrl);
            Statement stmt = con.createStatement();

            String query = "SELECT * FROM " + table;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                stdCount++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return stdCount;
    }

    private JPanel DisplayPieAccess(String col, String str) {
        Map<String, Integer> deptAmt;
//        Map<String, Integer> deptCount;
        DefaultPieDataset deptAmtDS = new DefaultPieDataset();
//        DefaultPieDataset deptCountDS = new DefaultPieDataset();
        Connection con;
        int stdCount = 0;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            File accessFile = new File("src/main/java/com/raven/database/Approved.accdb");
            String jdbcUrl = "jdbc:ucanaccess://" + accessFile.getAbsolutePath();
            con = DriverManager.getConnection(jdbcUrl);
            Statement stmt = con.createStatement();

            String query = "SELECT * FROM approved";
            ResultSet rs = stmt.executeQuery(query);

            String amtColIndex = "Amount"; // column index for which we want to find sum
            String deptColIndex = col;
            int sum = 0;
            double currAmount;
            deptAmt = new HashMap<String, Integer>();
            stdCount = 0;

//            deptCount = new HashMap<String, Integer>();
            while (rs.next()) {
                // for getting total
                        stdCount++;         
                if (!rs.getString(amtColIndex).isEmpty()) {
                    Pattern pattern = Pattern.compile("\\d+");
                            Matcher matcher = pattern.matcher(rs.getString(amtColIndex));
                            if (matcher.find()) {
                                currAmount = Double.parseDouble(matcher.group());
                                sum+=currAmount;
                            }
                    
//                    if (deptAmt.containsKey(deptName)) {
//                        deptAmt.put(deptName, deptAmt.get(deptName) + currAmount);
//                    } else {
//                        deptAmt.put(deptName, currAmount);
//                    }
                    }
                
                String deptName = rs.getString(deptColIndex);
                if (deptAmt.containsKey(deptName)) {
                    deptAmt.put(deptName, deptAmt.get(deptName) + 1);
                } else {
                    deptAmt.put(deptName, 1);
                }

            }

            for (Map.Entry<String, Integer> entry : deptAmt.entrySet()) {
                // System.out.println(entry.getKey() + " : " + entry.getValue());
                deptAmtDS.setValue(entry.getKey(), entry.getValue());
            }
//            for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
//                // System.out.println(entry.getKey() + " : " + entry.getValue());
//                deptCountDS.setValue(entry.getKey(), entry.getValue());
//            }
            card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/expense.png")), "Approved", ""+stdCount));
            card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/other_income.png")), "Total Expenses", "Rs "+sum));

            //System.out.println("Sum: " + sum);
            //System.out.println("No of students: " + stdCount);
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        PieChartExample deptAmtPie = new PieChartExample(deptAmtDS, str);
//        PieChartExample deptCountPie = new PieChartExample(deptCountDS);
        deptAmtPie.setVisible(true);
        return deptAmtPie;
//        deptCountPie.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        chart1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1007, 656));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1092, 2220));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 110, 207));
        jLabel1.setText("Dashboard");

        chart1.setBackground(new java.awt.Color(255, 255, 255));
        chart1.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout chart1Layout = new javax.swing.GroupLayout(chart1);
        chart1.setLayout(chart1Layout);
        chart1Layout.setHorizontalGroup(
            chart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chart1Layout.setVerticalGroup(
            chart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1875, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chart1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chart1, javax.swing.GroupLayout.DEFAULT_SIZE, 1875, Short.MAX_VALUE)
                .addGap(87, 87, 87))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private javax.swing.JPanel chart1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
