package cafe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.border.SoftBevelBorder;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.Canvas;

public class Coffee {

	private JFrame frame;
	private JTable table;
	private JTextField Pay;
	private JLabel q1;
	private JLabel q4;
	private JLabel q7;
	private JLabel q2;
	private JLabel q5;
	private JLabel q8;
	private JLabel q3;
	private JLabel q6;
	private JLabel q9;
	private JLabel total;
	private JButton btnNewButton_9_1;
	private JTextArea b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Coffee window = new Coffee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Coffee() {
		initialize();
	}
	public void addtable(int ID, String Name, int Qty, double Price  ) {
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		DecimalFormat df = new DecimalFormat("00.00");
		double totPrice = Price * Double.valueOf(Qty);
		String totalPrice = df.format(totPrice);
		
		
		// for product already add check
		for(int row =0; row<table.getRowCount(); row++) {
			if (Name == table.getValueAt(row, 1)) {
				dt.removeRow(table.convertRowIndexToModel(row));
			}
		}
		
		Vector v= new Vector();
		v.add(ID);
		v.add(Name);
		v.add(Qty);
		v.add(totalPrice);
		dt.addRow(v);
		
	}
	public void cal() {
		//calculate total table values
		int numOfRow=table.getRowCount();
		double tot=0.0;
		for(int i = 0 ; i<numOfRow;i++) {
			double value= Double.valueOf(table.getValueAt(i,3).toString());
			tot +=value;
		}		
		DecimalFormat df = new DecimalFormat("00.00");
		total.setText(df.format(tot));
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1262, 707);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 90, 644, 565);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q1.getText());
				++i;
				q1.setText(String.valueOf(i));
				addtable(1," ZRW Combo",i,7.99);
				cal();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\a.png"));
		btnNewButton.setBounds(10, 10, 200, 140);
		panel.add(btnNewButton);
		
		q1 = new JLabel("0");
		q1.setHorizontalAlignment(SwingConstants.CENTER);
		q1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q1.setBounds(10, 160, 200, 26);
		panel.add(q1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q2.getText());
				++i;
				q2.setText(String.valueOf(i));
				addtable(2," 1pc Combo",i,2.59);
				cal();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\b.png"));
		btnNewButton_1.setBounds(220, 10, 200, 140);
		panel.add(btnNewButton_1);
		
		q2 = new JLabel("0");
		q2.setHorizontalAlignment(SwingConstants.CENTER);
		q2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q2.setBounds(220, 160, 200, 26);
		panel.add(q2);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q3.getText());
				++i;
				q3.setText(String.valueOf(i));
				addtable(3," 2pc Combo",i,7.99);
				cal();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\c.png"));
		btnNewButton_2.setBounds(430, 10, 200, 140);
		panel.add(btnNewButton_2);
		
		q3 = new JLabel("0");
		q3.setHorizontalAlignment(SwingConstants.CENTER);
		q3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q3.setBounds(430, 160, 200, 26);
		panel.add(q3);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q4.getText());
				++i;
				q4.setText(String.valueOf(i));
				addtable(4," Dinner plate",i,9.29);
				cal();
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\d.png"));
		btnNewButton_3.setBounds(10, 196, 200, 140);
		panel.add(btnNewButton_3);
		
		q4 = new JLabel("0");
		q4.setHorizontalAlignment(SwingConstants.CENTER);
		q4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q4.setBounds(10, 346, 200, 26);
		panel.add(q4);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\e.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q5.getText());
				++i;
				q5.setText(String.valueOf(i));
				addtable(5," Mini Bucket",i,8.19);
				cal();
			}
		});
		btnNewButton_4.setBounds(220, 196, 200, 140);
		panel.add(btnNewButton_4);
		
		q5 = new JLabel("0");
		q5.setHorizontalAlignment(SwingConstants.CENTER);
		q5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q5.setBounds(220, 346, 200, 26);
		panel.add(q5);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q6.getText());
				++i;
				q6.setText(String.valueOf(i));
				addtable(6," Colonel Burger",i,3.99);
				cal();
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\f.png"));
		btnNewButton_5.setBounds(430, 196, 200, 140);
		panel.add(btnNewButton_5);
		
		q6 = new JLabel("0");
		q6.setHorizontalAlignment(SwingConstants.CENTER);
		q6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q6.setBounds(430, 346, 200, 26);
		panel.add(q6);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q7.getText());
				++i;
				q7.setText(String.valueOf(i));
				addtable(7," Zinger Burger",i,2.99);
				cal();
			}
		});
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\g.png"));
		btnNewButton_6.setBounds(10, 382, 200, 140);
		panel.add(btnNewButton_6);
		
		q7 = new JLabel("0");
		q7.setHorizontalAlignment(SwingConstants.CENTER);
		q7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q7.setBounds(10, 532, 200, 26);
		panel.add(q7);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q8.getText());
				++i;
				q8.setText(String.valueOf(i));
				addtable(8," Lil' Zinger",i,8.59);
				cal();
			}
		});
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\h.png"));
		btnNewButton_7.setBounds(220, 382, 200, 140);
		panel.add(btnNewButton_7);
		
		q8 = new JLabel("0");
		q8.setHorizontalAlignment(SwingConstants.CENTER);
		q8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q8.setBounds(220, 532, 200, 26);
		panel.add(q8);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =Integer.valueOf(q9.getText());
				++i;
				q9.setText(String.valueOf(i));
				addtable(9," ZRW      ",i,2.29);
				cal();
			}
		});
		btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\rdpar\\eclipse-workspace\\software\\Cafe\\src\\pic\\i.png"));
		btnNewButton_8.setBounds(430, 382, 200, 140);
		panel.add(btnNewButton_8);
		
		q9 = new JLabel("0");
		q9.setHorizontalAlignment(SwingConstants.CENTER);
		q9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		q9.setBounds(430, 532, 200, 26);
		panel.add(q9);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(643, 90, 612, 565);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Qty", "Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(10, 41, 277, 307);
		panel_1.add(table);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(0, 390, 602, 175);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setBounds(53, 25, 103, 33);
		panel_3.add(lblNewLabel);
		
		JLabel lblCash = new JLabel("Cash :");
		lblCash.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblCash.setBounds(55, 73, 103, 33);
		panel_3.add(lblCash);
		
		JLabel lblBalance = new JLabel("Balance :");
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblBalance.setBounds(10, 125, 148, 33);
		panel_3.add(lblBalance);
		
		
		total = new JLabel("00");
		total.setFont(new Font("Tahoma", Font.PLAIN, 36));
		total.setBounds(169, 25, 124, 33);
		panel_3.add(total);
		
		JLabel bal = new JLabel("00");
		bal.setFont(new Font("Tahoma", Font.PLAIN, 36));
		bal.setBounds(168, 125, 125, 33);
		panel_3.add(bal);
		
		btnNewButton_9_1 = new JButton("Price");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// bill print
				try {
					b.setText("\t          Burger King\n");
					b.setText(b.getText()+"	      RDP Road,Maharashtra  \n");
					b.setText(b.getText()+"	             India  \n");
					b.setText(b.getText()+"	           8783560531  \n");
					b.setText(b.getText()+"--------------------------------------------------------------------------------------\n");
					b.setText(b.getText()+" Name \t\t\tQty \tPrice "+"\n");
					b.setText(b.getText()+"--------------------------------------------------------------------------------------\n");
					
					DefaultTableModel df = (DefaultTableModel) table.getModel();
					
					// get product details
					for(int i=0;i<table.getRowCount();i++) {
						String Name = df.getValueAt(i, 1).toString();
						String Qty = df.getValueAt(i, 2).toString();
						String Price = df.getValueAt(i, 3).toString();
						
						b.setText(b.getText() + Name +"\t"+ "\t"+Qty +"\t"+ Price+"\n");
					}
					b.setText(b.getText()+"--------------------------------------------------------------------------------------\n");
					b.setText(b.getText()+"Sub Total : "+total.getText()+"\n");
					b.setText(b.getText()+"Cash         : "+Pay.getText()+"\n");
					b.setText(b.getText()+"Balance    : "+bal.getText()+"\n");
					b.setText(b.getText()+"--------------------------------------------------------------------------------------\n");
					b.setText(b.getText()+"Thanks For Your Coming\n");
					
					
				} catch(Exception ee) {
					
				}
			}
		});
		btnNewButton_9_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnNewButton_9_1.setBounds(440, 25, 118, 133);
		panel_3.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_1_1 = new JButton("Pay");
		btnNewButton_9_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pay btn
				double tot = Double.valueOf(total.getText());
				double paid = Double.valueOf(Pay.getText());
				double balance = paid - tot;
				
				DecimalFormat df = new DecimalFormat("00.00");
				
				bal.setText(String.valueOf(df.format(balance)));
				
				
			}
		});
		btnNewButton_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnNewButton_9_1_1.setBounds(303, 25, 118, 133);
		panel_3.add(btnNewButton_9_1_1);
		
		Pay = new JTextField();
		Pay.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Pay.setBounds(168, 72, 125, 34);
		panel_3.add(Pay);
		Pay.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("Delete");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete some item
				DefaultTableModel dt =(DefaultTableModel) table.getModel();
				String r =dt.getValueAt(table.getSelectedRow(), 0).toString();
				
				// remove Product
				int rw= table.getSelectedRow();
				dt.removeRow(rw);
				
				//Remove Qty Label
				System.out.println(r);
				switch(r) {
				case "1":
					q1.setText("0");
					break;
				case "2":
					q2.setText("0");
					break;
				case "3":
					q3.setText("0");
					break;
				case "4":
					q4.setText("0");
					break;
				case "5":
					q5.setText("0");
					break;
				case "6":
					q6.setText("0");
					break;
				case "7":
					q7.setText("0");
					break;
				case "8":
					q8.setText("0");
					break;
				case "9":
					q9.setText("0");
					break;
					
					default:
						System.out.println("Over");
					
				}
					
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_9.setBounds(184, 354, 103, 30);
		panel_1.add(btnNewButton_9);
		
		b = new JTextArea();
		b.setFont(new Font("Monospaced", Font.PLAIN, 10));
		b.setBounds(297, 5, 305, 379);
		panel_1.add(b);
		
		JFormattedTextField frmtdtxtfldItem = new JFormattedTextField();
		frmtdtxtfldItem.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldItem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmtdtxtfldItem.setText("Item");
		frmtdtxtfldItem.setBounds(80, 6, 63, 25);
		panel_1.add(frmtdtxtfldItem);
		
		JFormattedTextField frmtdtxtfldQty = new JFormattedTextField();
		frmtdtxtfldQty.setText("Qty");
		frmtdtxtfldQty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmtdtxtfldQty.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldQty.setBounds(154, 6, 63, 25);
		panel_1.add(frmtdtxtfldQty);
		
		JFormattedTextField frmtdtxtfldPrice = new JFormattedTextField();
		frmtdtxtfldPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmtdtxtfldPrice.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldPrice.setText("Price");
		frmtdtxtfldPrice.setBounds(227, 6, 60, 25);
		panel_1.add(frmtdtxtfldPrice);
		
		JFormattedTextField frmtdtxtfldItem_1 = new JFormattedTextField();
		frmtdtxtfldItem_1.setText("Item");
		frmtdtxtfldItem_1.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldItem_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmtdtxtfldItem_1.setBounds(10, 6, 60, 25);
		panel_1.add(frmtdtxtfldItem_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 0, 1248, 84);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Burger King");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 41));
		lblNewLabel_1.setBounds(484, 0, 216, 74);
		panel_2.add(lblNewLabel_1);
		
		
	}
}
