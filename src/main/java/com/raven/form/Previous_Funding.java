package com.raven.form;

import com.raven.model.Model_Card;
import javax.swing.ImageIcon;
import com.raven.model.Model_Card;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.apache.poi.EncryptedDocumentException;
import static org.apache.poi.ss.usermodel.CellType.FORMULA;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

class MyPieChart extends JPanel {
    
    public MyPieChart(PieDataset data, String str) {
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
// to add labels to the chart
//plot.setLabelGenerator(null);
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
        // Remove domain marker
            

        // Create chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(600,600));
       
        chartPanel.setBackground(null);
//to remove legend        
//chartPanel.getChart().removeLegend();
       
        // Add chart panel to frame
        add(chartPanel);
    }
    
}

public class Previous_Funding extends javax.swing.JPanel {

    JLabel noOfStudents;
    JLabel sumL;

    public Previous_Funding() {
        initComponents();
        
        // DisplayPieAccess("Country", "W.R.T. Country");
       
        noOfStudents = new JLabel("Number of students = ");
        noOfStudents.setFont(new Font("Arial", Font.BOLD, 30));
        sumL = new JLabel("Total Expenses = ");
        sumL.setFont(new Font("Arial", Font.BOLD, 30));
        
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        chart1.setLayout(gbl);
        JPanel dept = DisplayPie(4, "W.R.T. DEPT");
        JPanel country = DisplayPie(7, "W.R.T. Country");
//        JPanel guide = DisplayPie(5, "W.R.T. Guide");
//        gbc.gridy = 0;
//        gbl.setConstraints(noOfStudents, gbc);
//        jp.add(noOfStudents);
//        gbl.setConstraints(sumL, gbc);
//        jp.add(sumL);
//        gbc.gridwidth = 2;
//        gbc.gridy = 1;
//        gbc.gridx=0;
//        gbl.setConstraints(dept, gbc);
//        gbc.gridy = 2;
//        gbl.setConstraints(country, gbc);
//        gbc.gridy = 3;
//        gbc.gridheight=2;
//        gbl.setConstraints(guide, gbc);
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbl.setConstraints(dept, gbc);
        gbc.gridy = 1;
        gbl.setConstraints(country, gbc);
        chart1.add(dept);
        chart1.add(country);
//        jp.add(guide);
//        chart1.setVisible(true);
//        JScrollPane sp = new JScrollPane(jp);
//        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        add(sp,BorderLayout.CENTER);
//        sp.setVisible(true);

        
//        gbc.gridy = 0;
//        gbc.gridx=0;
//        gbl.setConstraints(dept, gbc);
//        gbc.gridy = 1;
//        gbl.setConstraints(country, gbc);
//        gbc.gridy = 2;
//        gbc.gridheight=2;
//        gbl.setConstraints(guide, gbc);
//        chart1.setLayout(new BorderLayout());
//        gbc.gridy = 0;
//        gbl.setConstraints(dept, gbc);
//        chart1.add(jp,BorderLayout.CENTER);
       
        
//        chart3.setLayout(new BorderLayout());
//        chart3.add(guide,BorderLayout.CENTER);
    }

    private JPanel DisplayPie(int col, String str) throws NumberFormatException, EncryptedDocumentException {
        Map<String, Double> deptAmt;
//        Map<String, Integer> deptCount;
        DefaultPieDataset deptAmtDS = new DefaultPieDataset();
        int sum = 0;
        int stdCount = 0;
//        DefaultPieDataset deptCountDS = new DefaultPieDataset();
        try {
            InputStream inputStream = new FileInputStream("src/main/java/com/raven/database/Excel_Database.xlsx");
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            
            int amtColIndex = 8; // column index for which we want to find sum
            int deptColIndex = col;
            
            deptAmt = new HashMap<String, Double>();
//            deptCount = new HashMap<String, Integer>();
            for (Row row : sheet) {
                // for getting total

                Cell cell = row.getCell(amtColIndex);
                double currAmount = -1;
                if (cell != null) {
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            currAmount = cell.getNumericCellValue();
                            stdCount++;
                            break;
                        case FORMULA:
                            currAmount = cell.getNumericCellValue();
                            stdCount++;
                            
                            break;
                        case STRING:
                            String cellValue = cell.getStringCellValue();
                            Pattern pattern = Pattern.compile("\\d+");
                            Matcher matcher = pattern.matcher(cellValue);
                            if (matcher.find()) {
                                double numericValue = Double.parseDouble(matcher.group());
                                currAmount = numericValue;
                                
                            }
                            break;
                        default:
                            break;
                    }
                    if (currAmount != -1) {
                        Cell deptCell = row.getCell(deptColIndex);
                        String deptName;
                        if (deptCell != null) {
                            deptName = deptCell.getStringCellValue();
                            
                            sum += currAmount;
                            stdCount++;
                            if (deptAmt.containsKey(deptName)) {
                                deptAmt.put(deptName, deptAmt.get(deptName) + currAmount);
                            } else {
                                deptAmt.put(deptName, currAmount);
                            }
//                            if (deptCount.containsKey(deptName)) {
//                                deptCount.put(deptName, deptCount.get(deptName) + 1);
//                            } else {
//                                deptCount.put(deptName, 1);
//                            }
                        }
                    }
                }
            }
            
            for (Map.Entry<String, Double> entry : deptAmt.entrySet()) {
                // System.out.println(entry.getKey() + " : " + entry.getValue());
                deptAmtDS.setValue(entry.getKey(), entry.getValue());
            }
//            for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
//                // System.out.println(entry.getKey() + " : " + entry.getValue());
//                deptCountDS.setValue(entry.getKey(), entry.getValue());
//            }

            sumL.setText("Total Expenses : " + sum + "Rs");
            noOfStudents.setText("No of students: " + stdCount);
            card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/expense.png")), "Number of students", ""+stdCount));
            card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/other_income.png")), "Total Expenses", "₹ "+sum));
       
            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        MyPieChart deptAmtPie = new MyPieChart(deptAmtDS, str);
//        MyPieChart deptCountPie = new MyPieChart(deptCountDS);
        deptAmtPie.setVisible(true);
        return deptAmtPie;
//        deptCountPie.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        card2 = new com.raven.component.Card();
        card1 = new com.raven.component.Card();
        chart1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1007, 656));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1304, 2702));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1302, 1600));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 110, 207));
        jLabel2.setText("Previous Funding");

        chart1.setBackground(new java.awt.Color(255, 255, 255));
        chart1.setPreferredSize(new java.awt.Dimension(2000, 1000));

        javax.swing.GroupLayout chart1Layout = new javax.swing.GroupLayout(chart1);
        chart1.setLayout(chart1Layout);
        chart1Layout.setHorizontalGroup(
            chart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chart1Layout.setVerticalGroup(
            chart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1259, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chart1, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(328, 328, 328))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chart1, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    public javax.swing.JPanel chart1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
