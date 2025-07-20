import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class storeGUI extends JFrame {
    // Declare GUI components
    private JTextField storeIdFieldDept, storeNameFieldDept, locationFieldDept, openingHourFieldDept;
    private JTextField totalSalesFieldDept, totalDiscountFieldDept, productNameFieldDept, markedPriceFieldDept;
    private JTextField sellingPriceFieldDept;
   
    private JTextField storeIdFieldRet, storeNameFieldRet, locationFieldRet, openingHourFieldRet;
    private JTextField totalSalesFieldRet, totalDiscountFieldRet, productNameFieldRet, markedPriceFieldRet;
    private JTextField sellingPriceFieldRet, vatInclusivePriceFieldRet, loyaltyPointFieldRet;
    private JCheckBox isPaymentOnlineBox;
    private JComboBox<String> purchasedYearComboBox;
    private JButton addDepartmentBtn, addRetailerBtn, displayBtn, clearBtn, removeProductBtn;

    // ArrayList to store objects
    private ArrayList<store> storeList = new ArrayList<>();

    public storeGUI() {
        // Initialize components and set layout
        setTitle("Store Management System");
        setLayout(null); // Use absolute positioning to match the screenshot layout

        // Department fields (left side)
        JLabel departmentLabel = new JLabel("Department");
        departmentLabel.setBounds(50, 20, 150, 25);
        add(departmentLabel);

        storeIdFieldDept = new JTextField();
        storeIdFieldDept.setBounds(50, 50, 150, 25);
        add(new JLabel("StoreID:")).setBounds(50, 50, 80, 25);
        add(storeIdFieldDept);

        storeNameFieldDept = new JTextField();
        storeNameFieldDept.setBounds(50, 90, 150, 25);
        add(new JLabel("StoreName:")).setBounds(50, 90, 80, 25);
        add(storeNameFieldDept);

        locationFieldDept = new JTextField();
        locationFieldDept.setBounds(50, 130, 150, 25);
        add(new JLabel("Location:")).setBounds(50, 130, 80, 25);
        add(locationFieldDept);

        openingHourFieldDept = new JTextField();
        openingHourFieldDept.setBounds(50, 170, 150, 25);
        add(new JLabel("OpeningHours:")).setBounds(50, 170, 100, 25);
        add(openingHourFieldDept);

        totalSalesFieldDept = new JTextField();
        totalSalesFieldDept.setBounds(50, 210, 150, 25);
        add(new JLabel("TotalSales:")).setBounds(50, 210, 80, 25);
        add(totalSalesFieldDept);

        totalDiscountFieldDept = new JTextField();
        totalDiscountFieldDept.setBounds(50, 250, 150, 25);
        add(new JLabel("TotalDiscount:")).setBounds(50, 250, 100, 25);
        add(totalDiscountFieldDept);

        productNameFieldDept = new JTextField();
        productNameFieldDept.setBounds(50, 290, 150, 25);
        add(new JLabel("ProductName:")).setBounds(50, 290, 100, 25);
        add(productNameFieldDept);

        markedPriceFieldDept = new JTextField();
        markedPriceFieldDept.setBounds(50, 330, 150, 25);
        add(new JLabel("MarkedPrice:")).setBounds(50, 330, 100, 25);
        add(markedPriceFieldDept);

        sellingPriceFieldDept = new JTextField();
        sellingPriceFieldDept.setBounds(50, 370, 150, 25);
        add(new JLabel("SellingPrice:")).setBounds(50, 370, 100, 25);
        add(sellingPriceFieldDept);

        addDepartmentBtn = new JButton("Add Department");
        addDepartmentBtn.setBounds(50, 410, 150, 25);
        add(addDepartmentBtn);

        removeProductBtn = new JButton("Remove Product");
        removeProductBtn.setBounds(50, 450, 150, 25);
        add(removeProductBtn);

        // Retailer fields (right side)
        JLabel retailerLabel = new JLabel("Retailer");
        retailerLabel.setBounds(300, 20, 150, 25);
        add(retailerLabel);

        storeIdFieldRet = new JTextField();
        storeIdFieldRet.setBounds(300, 50, 150, 25);
        add(new JLabel("StoreID:")).setBounds(300, 50, 80, 25);
        add(storeIdFieldRet);

        storeNameFieldRet = new JTextField();
        storeNameFieldRet.setBounds(300, 90, 150, 25);
        add(new JLabel("Store Name:")).setBounds(300, 90, 80, 25);
        add(storeNameFieldRet);

        locationFieldRet = new JTextField();
        locationFieldRet.setBounds(300, 130, 150, 25);
        add(new JLabel("Location:")).setBounds(300, 130, 80, 25);
        add(locationFieldRet);

        openingHourFieldRet = new JTextField();
        openingHourFieldRet.setBounds(300, 170, 150, 25);
        add(new JLabel("Opening hours:")).setBounds(300, 170, 100, 25);
        add(openingHourFieldRet);

        totalSalesFieldRet = new JTextField();
        totalSalesFieldRet.setBounds(300, 210, 150, 25);
        add(new JLabel("Total Sales:")).setBounds(300, 210, 100, 25);
        add(totalSalesFieldRet);

        totalDiscountFieldRet = new JTextField();
        totalDiscountFieldRet.setBounds(300, 250, 150, 25);
        add(new JLabel("Total Discount:")).setBounds(300, 250, 100, 25);
        add(totalDiscountFieldRet);

        productNameFieldRet = new JTextField();
        productNameFieldRet.setBounds(300, 290, 150, 25);
        add(new JLabel("Product Name:")).setBounds(300, 290, 100, 25);
        add(productNameFieldRet);

        markedPriceFieldRet = new JTextField();
        markedPriceFieldRet.setBounds(300, 330, 150, 25);
        add(new JLabel("Marked Price:")).setBounds(300, 330, 100, 25);
        add(markedPriceFieldRet);

        sellingPriceFieldRet = new JTextField();
        sellingPriceFieldRet.setBounds(300, 370, 150, 25);
        add(new JLabel("Selling Price:")).setBounds(300, 370, 100, 25);
        add(sellingPriceFieldRet);

        vatInclusivePriceFieldRet = new JTextField();
        vatInclusivePriceFieldRet.setBounds(300, 410, 150, 25);
        add(new JLabel("VAT Inclusive Price:")).setBounds(300, 410, 120, 25);
        add(vatInclusivePriceFieldRet);

        loyaltyPointFieldRet = new JTextField();
        loyaltyPointFieldRet.setBounds(300, 450, 150, 25);
        add(new JLabel("Loyalty Point:")).setBounds(300, 450, 100, 25);
        add(loyaltyPointFieldRet);

        isPaymentOnlineBox = new JCheckBox("Is payment online?");
        isPaymentOnlineBox.setBounds(300, 490, 150, 25);
        add(isPaymentOnlineBox);

        purchasedYearComboBox = new JComboBox<>(new String[] {"2020", "2021", "2022"});
        purchasedYearComboBox.setBounds(300, 530, 150, 25);
        add(purchasedYearComboBox);

        addRetailerBtn = new JButton("Add Retailer");
        addRetailerBtn.setBounds(300, 570, 150, 25);
        add(addRetailerBtn);

        displayBtn = new JButton("Display");
        displayBtn.setBounds(50, 600, 150, 25);
        add(displayBtn);

        clearBtn = new JButton("Clear");
        clearBtn.setBounds(300, 600, 150, 25);
        add(clearBtn);

        // Event listeners for buttons (remains unchanged)
        // ...


        // Frame settings
        setSize(500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new storeGUI();
    }
}