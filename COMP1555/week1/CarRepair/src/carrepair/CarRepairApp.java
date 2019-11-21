import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author cd05
 */
public class CarRepairApp extends JFrame implements ActionListener {

    DecimalFormat pounds = new DecimalFormat("£#,##0.00");
    JButton calcBtn = new JButton("Calculate Bill ==>");
    JTextField partsTxt = new JTextField(5);
    JTextField hoursTxt = new JTextField(5);
    JTextField billTxt = new JTextField(5);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new CarRepairApp();
    }

    public CarRepairApp() {
        setLayout(new FlowLayout());
        setSize(320, 100);
        setTitle("Car Repair Bill Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Cost of parts:"));
        add(partsTxt);
        add(new JLabel("Hours worked:"));
        add(hoursTxt);
        add(calcBtn);
        calcBtn.addActionListener(this);
        add(billTxt);
        billTxt.setEditable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double parts = Double.parseDouble(partsTxt.getText());
        double hours = Double.parseDouble(hoursTxt.getText());
        CarRepair myRepair = new CarRepair(parts, hours);
        double bill = myRepair.calculateBill();
        billTxt.setText(pounds.format(bill));
    }
}
