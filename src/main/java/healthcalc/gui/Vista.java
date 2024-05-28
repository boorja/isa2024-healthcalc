package healthcalc.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Vista {

	private JFrame frame;
	private JTextField taltura;
	private JTextField tpeso;
	private JTextField tedad;
	private JRadioButton gmasc;
	private JRadioButton gfem;
	private JButton biw;
	private JButton bbmr;
	private JButton bclear;
	private JTextField tRes;
	private ButtonGroup group;

	
	/**
	 * Create the application.
	 */
	
	public Vista() {
		initialize();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(243, 238, 224));
		frame.setBounds(100, 100, 894, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOpaque(false);
		splitPane.setToolTipText("Health Calculator");
		splitPane.setResizeWeight(0.65);
		splitPane.setBounds(0, 118, 875, 380);
		layeredPane.add(splitPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		splitPane.setRightComponent(layeredPane_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setOpaque(false);
		panel_1_1.setBackground(new Color(243, 238, 224));
		panel_1_1.setBounds(0, 22, 284, 100);
		layeredPane_1.add(panel_1_1);
		
		JTextPane txtpnWhat_1 = new JTextPane();
		txtpnWhat_1.setEditable(false);
		txtpnWhat_1.setOpaque(false);
		txtpnWhat_1.setText("What do i want");
		txtpnWhat_1.setForeground(new Color(247, 0, 247));
		txtpnWhat_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 36));
		txtpnWhat_1.setBackground(new Color(243, 238, 224));
		
		JTextPane txtpnWhat = new JTextPane();
		txtpnWhat.setEditable(false);
		txtpnWhat.setOpaque(false);
		txtpnWhat.setForeground(new Color(247, 0, 247));
		txtpnWhat.setBackground(new Color(243, 238, 224));
		txtpnWhat.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 36));
		txtpnWhat.setText("  to calculate?");
		panel_1_1.setLayout(new GridLayout(2, 1, 1, -30));
		panel_1_1.add(txtpnWhat_1);
		panel_1_1.add(txtpnWhat);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1_1.setOpaque(false);
		panel_1_1_1.setBackground(new Color(243, 238, 224));
		panel_1_1_1.setBounds(5, 122, 275, 146);
		layeredPane_1.add(panel_1_1_1);
		
		biw = new JButton("IdealWeight");
		biw.setBounds(9, 12, 253, 58);
		biw.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		panel_1_1_1.setLayout(null);
		biw.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1_1_1.add(biw);
		
		bbmr = new JButton("BMR");
		bbmr.setBounds(9, 76, 253, 58);
		bbmr.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		bbmr.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1_1_1.add(bbmr);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setOpaque(false);
		panel_1_2.setBounds(0, 293, 284, 85);
		layeredPane_1.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		tRes = new JTextField();
		tRes.setEditable(false);
		tRes.setForeground(new Color(0, 0, 255));
		tRes.setBounds(10, 21, 266, 54);
		tRes.setFont(new Font("Comic Sans MS", Font.BOLD, 34));
		panel_1_2.add(tRes);
		tRes.setColumns(10);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBorder(new MatteBorder(0, 0, 0, 5, (Color) new Color(0, 0, 255)));
		splitPane.setLeftComponent(layeredPane_2);
		layeredPane_2.setLayout(null);
		
		tedad = new JTextField();
		tedad.setBorder(new LineBorder(new Color(171, 173, 179), 3, true));
		tedad.setLocation(109, 48);
		tedad.setSize(new Dimension(425, 40));
		tedad.setMinimumSize(new Dimension(6, 6));
		tedad.setMaximumSize(new Dimension(6, 6));
		tedad.setPreferredSize(new Dimension(7, 5));
		tedad.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		tedad.setAlignmentX(0.0f);
		layeredPane_2.add(tedad);
		
		JTextPane txtpnEdad = new JTextPane();
		txtpnEdad.setEditable(false);
		txtpnEdad.setBounds(20, 37, 210, 63);
		txtpnEdad.setPreferredSize(new Dimension(7, 5));
		txtpnEdad.setOpaque(false);
		txtpnEdad.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		txtpnEdad.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtpnEdad.setText("Age:");
		layeredPane_2.add(txtpnEdad);
		
		JTextPane txtpnAlturacm = new JTextPane();
		txtpnAlturacm.setEditable(false);
		txtpnAlturacm.setText("Height (cm):");
		txtpnAlturacm.setPreferredSize(new Dimension(7, 5));
		txtpnAlturacm.setOpaque(false);
		txtpnAlturacm.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		txtpnAlturacm.setAlignmentX(0.0f);
		txtpnAlturacm.setBounds(20, 120, 222, 63);
		layeredPane_2.add(txtpnAlturacm);
		
		taltura = new JTextField();
		taltura.setBorder(new LineBorder(new Color(171, 173, 179), 3, true));
		taltura.setSize(new Dimension(294, 40));
		taltura.setPreferredSize(new Dimension(7, 5));
		taltura.setMinimumSize(new Dimension(6, 6));
		taltura.setMaximumSize(new Dimension(6, 6));
		taltura.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		taltura.setAlignmentX(0.0f);
		taltura.setBounds(240, 131, 294, 40);
		layeredPane_2.add(taltura);
		
		JTextPane txtpnPesokg = new JTextPane();
		txtpnPesokg.setEditable(false);
		txtpnPesokg.setText("Weight (kg):");
		txtpnPesokg.setPreferredSize(new Dimension(7, 5));
		txtpnPesokg.setOpaque(false);
		txtpnPesokg.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		txtpnPesokg.setAlignmentX(0.0f);
		txtpnPesokg.setBounds(20, 203, 222, 63);
		layeredPane_2.add(txtpnPesokg);
		
		tpeso = new JTextField();
		tpeso.setBorder(new LineBorder(new Color(171, 173, 179), 3, true));
		tpeso.setSize(new Dimension(294, 40));
		tpeso.setPreferredSize(new Dimension(7, 5));
		tpeso.setMinimumSize(new Dimension(6, 6));
		tpeso.setMaximumSize(new Dimension(6, 6));
		tpeso.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		tpeso.setAlignmentX(0.0f);
		tpeso.setBounds(240, 214, 294, 40);
		layeredPane_2.add(tpeso);
		
		JTextPane txtpnGnero = new JTextPane();
		txtpnGnero.setEditable(false);
		txtpnGnero.setText("Gender: ");
		txtpnGnero.setPreferredSize(new Dimension(7, 5));
		txtpnGnero.setOpaque(false);
		txtpnGnero.setFont(new Font("Comic Sans MS", Font.ITALIC, 36));
		txtpnGnero.setAlignmentX(0.0f);
		txtpnGnero.setBounds(20, 286, 210, 63);
		layeredPane_2.add(txtpnGnero);
		
		gmasc = new JRadioButton("Masculine");
		gmasc.setOpaque(false);
		gmasc.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		gmasc.setBounds(240, 297, 137, 40);
		layeredPane_2.add(gmasc);
		
		gfem = new JRadioButton("Femenine");
		gfem.setOpaque(false);
		gfem.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		gfem.setBounds(397, 297, 137, 40);
		layeredPane_2.add(gfem);
		
		group = new ButtonGroup();
		group.add(gmasc);
		group.add(gfem);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(202, 214, 255), 5, true));
		panel.setBackground(new Color(13, 67, 255));
		panel.setBounds(20, 8, 835, 100);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnHealthCalculator = new JTextPane();
		txtpnHealthCalculator.setEditable(false);
		txtpnHealthCalculator.setForeground(new Color(255, 255, 255));
		txtpnHealthCalculator.setOpaque(false);
		txtpnHealthCalculator.setFont(new Font("Comic Sans MS", Font.BOLD, 67));
		txtpnHealthCalculator.setText("Health Calculator");
		txtpnHealthCalculator.setBounds(128, -3, 575, 100);
		panel.add(txtpnHealthCalculator);
		
		bclear = new JButton("clear");
		bclear.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		bclear.setOpaque(false);
		bclear.setBorder(new LineBorder(new Color(0, 128, 192), 3, true));
		bclear.setForeground(new Color(0, 128, 192));
		bclear.setHorizontalTextPosition(SwingConstants.CENTER);
		bclear.setIcon(null);
		bclear.setMinimumSize(new Dimension(33, 33));
		bclear.setMaximumSize(new Dimension(33, 33));
		bclear.setBounds(740, 25, 50, 50);
		panel.add(bclear);
		
		frame.setVisible(true);
		
		
	}
	
		
		public JTextField getPeso() {
			return tpeso;
		}

		public JTextField getAltura() {
			return taltura;
		}

		public JRadioButton getMasculino() {
			return gmasc;
		}

		public JRadioButton getFemenino() {
			return gfem;
		}

		public JTextField getEdad() {
			return tedad;
		}

		public JButton getBMR() {
			return bbmr;
		}

		public JButton getIW() {
			return biw;
		}
		
		public void setRes(double bmr) {
			tRes.setText(String.valueOf(bmr));
		}
		
		public void registrarControlador(ActionListener ctrl) {
			bbmr.addActionListener(ctrl);
			bbmr.setActionCommand("BMR");
	        
			biw.addActionListener(ctrl);
			biw.setActionCommand("IdealWeight");
			
			bclear.addActionListener(ctrl);
			bclear.setActionCommand("clear");
	        
		}
				
		public void errorIW(String errCode) {
			JOptionPane.showMessageDialog(frame,
					errCode,
	                "Height or gender not valid",
	                JOptionPane.ERROR_MESSAGE);
		}
		
		public void errorBMR(String errCode) {
			JOptionPane.showMessageDialog(frame,
	                errCode,
	                "Data not valid",
	                JOptionPane.ERROR_MESSAGE);
		}
		
		public void errorVacio() {
			JOptionPane.showMessageDialog(frame,
	                "You have empty fields.",
	                "Empty fields",
	                JOptionPane.ERROR_MESSAGE);
		}
		
		public void clearV() {
			tpeso.setText(null);
			group.clearSelection();
			taltura.setText(null);
			tedad.setText(null);
			tRes.setText(null);
			
		}
}
