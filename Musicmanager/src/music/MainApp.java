package music;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainApp extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private ButtonGroup buttonGroup1;
	private JTextField jTextField3;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField4;
	private JLabel jLabel10;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JButton jButton1;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JComboBox jComboBox2;
	private JTextField jTextField2;
	private JTextField jTextField1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainApp inst = new MainApp();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MainApp() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u97f3\u4e50\u5e93\u7ba1\u7406\u7cfb\u7edf");
			getContentPane().setBackground(new java.awt.Color(255,128,128));
			getContentPane().add(getJLabel8());
			getContentPane().add(getJLabel10());
			getContentPane().add(getJTextField4());
			getContentPane().add(getJTextField6());
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("\u6b22\u8fce\u6765\u5230\u97f3\u4e50\u5e93\u7ba1\u7406\u7cfb\u7edf\uff01");
				jLabel1.setBounds(232, 12, 268, 30);
				jLabel1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄",3,22));
				jLabel1.setForeground(new java.awt.Color(0,0,255));
				jLabel1.setOpaque(true);
				jLabel1.setBackground(new java.awt.Color(255,128,128));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("\u6b4c\u540d");
				jLabel2.setBounds(49, 56, 41, 27);
				jLabel2.setOpaque(true);
				jLabel2.setBackground(new java.awt.Color(255,128,128));
				jLabel2.setForeground(new java.awt.Color(0,0,255));
				jLabel2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄",0,14));
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("\u6b4c\u624b");
				jLabel3.setBounds(49, 110, 41, 17);
				jLabel3.setForeground(new java.awt.Color(0,0,255));
				jLabel3.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄",0,14));
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("\u65f6\u957f");
				jLabel4.setBounds(49, 158, 41, 17);
				jLabel4.setForeground(new java.awt.Color(0,0,255));
				jLabel4.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄",0,14));
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("\u7c7b\u522b");
				jLabel5.setBounds(49, 205, 41, 17);
				jLabel5.setForeground(new java.awt.Color(0,0,255));
				jLabel5.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄",0,14));
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(116, 59, 102, 24);
				jTextField1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jTextField1.actionPerformed, event="+evt);
						//TODO add your code for jTextField1.actionPerformed
					}
				});
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(116, 108, 102, 24);
				jTextField2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jTextField2.actionPerformed, event="+evt);
						//TODO add your code for jTextField2.actionPerformed
					}
				});
			}
			{
				ComboBoxModel jComboBox2Model = 
						new DefaultComboBoxModel(
								new String[] { "«È∏Ë", "√Ò“•" ,"¥ø“Ù¿÷","“°πˆ"});
				jComboBox2 = new JComboBox();
				getContentPane().add(jComboBox2);
				jComboBox2.setModel(jComboBox2Model);
				jComboBox2.setBounds(116, 203, 102, 24);
				jComboBox2.setEditable(true);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("\u6dfb\u52a0");
				jButton1.setBounds(329, 54, 156, 96);
				jButton1.setBackground(new java.awt.Color(0,255,0));
				jButton1.setFont(new java.awt.Font("ø¨ÃÂ",1,20));
				jButton1.setForeground(new java.awt.Color(255,0,0));
				jButton1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						//int id;
						String name=jTextField1.getText();
						String singer=jTextField2.getText();
						String catalogue=(String) jComboBox2.getSelectedItem();
						double lastedtime=Double.parseDouble(jTextField5.getText());
						Music newmusic = new Music(0,name,singer,catalogue,lastedtime,null);
						Database.insert(newmusic);
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("\u67e5\u627e");
				jButton2.setBounds(485, 54, 160, 96);
				jButton2.setBackground(new java.awt.Color(255,128,0));
				jButton2.setFont(new java.awt.Font("ø¨ÃÂ",1,20));
				jButton2.setForeground(new java.awt.Color(0,255,0));
				jButton2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						MusicDialog0 dlg = new MusicDialog0(MainApp.this);
						dlg.setLocationRelativeTo(null);
						if (!jTextField4.getText().trim().equals("")){
							dlg.initTableDatas1(jTextField4.getText());
						}else{
							if (!jTextField6.getText().trim().equals("")){
								dlg.initTableDatas2(jTextField6.getText());
							}else{
								dlg.initTableDatas();
							}
						}
						dlg.setModal(true);
						dlg.setVisible(true);
					}
				});
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("\u4fee\u6539");
				jButton3.setBounds(329, 150, 156, 97);
				jButton3.setBackground(new java.awt.Color(255,0,255));
				jButton3.setFont(new java.awt.Font("ø¨ÃÂ",1,20));
				jButton3.setForeground(new java.awt.Color(0,0,0));
				jButton3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						int id = Integer.parseInt(jTextField3.getText());
						String name=jTextField1.getText();
						String singer=jTextField2.getText();
						String catalogue=(String) jComboBox2.getSelectedItem();
						double lastedtime=Double.parseDouble(jTextField5.getText());
						Music newmusic = new Music(id,name,singer,catalogue,lastedtime,null);
						Database.update(newmusic);
					}
				});
			}
			{
				jButton4 = new JButton();
				getContentPane().add(jButton4);
				jButton4.setText("\u5220\u9664");
				jButton4.setBounds(485, 150, 160, 97);
				jButton4.setBackground(new java.awt.Color(255,0,0));
				jButton4.setFont(new java.awt.Font("ø¨ÃÂ",1,20));
				jButton4.setForeground(new java.awt.Color(128,0,255));
				jButton4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
					
						int id = Integer.parseInt(jTextField3.getText());
						Database.delete(id);
					}
				});
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("\u5c71\u6709\u6728\u516e\u6728\u6709\u679d");
				jLabel6.setBounds(90, 292, 157, 25);
				jLabel6.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄",0,16));
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("\u8981\u4fee\u6539/\u5220\u9664\u7684\u6b4c\u66f2id");
				jLabel7.setBounds(329, 297, 122, 17);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				getContentPane().add(getJLabel9x());
				getContentPane().add(getJTextField5x());
				jTextField3.setBounds(463, 294, 182, 24);
			}
			pack();
			this.setSize(768, 469);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}

	private JTextField getJTextField5() {
		if(jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					System.out.println("jTextField5.actionPerformed, event="+evt);
					//TODO add your code for jTextField5.actionPerformed
				}
			});
		}
		return jTextField5;
	}
	
	private JLabel getJLabel9() {
		if(jLabel9 == null) {
			jLabel9 = new JLabel();
		}
		return jLabel9;
	}
	
	private JLabel getJLabel8() {
		if(jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("\u6309\u6b4c\u540d\u67e5\u627e\u6b4c\u66f2");
			jLabel8.setBounds(329, 334, 116, 17);
		}
		return jLabel8;
	}
	
	private JLabel getJLabel10() {
		if(jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("\u6309\u6b4c\u624b\u67e5\u627e\u6b4c\u66f2");
			jLabel10.setBounds(329, 371, 116, 17);
		}
		return jLabel10;
	}
	
	private JTextField getJTextField4() {
		if(jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setBounds(463, 331, 182, 24);
		}
		return jTextField4;
	}
	
	private JTextField getJTextField6() {
		if(jTextField6 == null) {
			jTextField6 = new JTextField();
			jTextField6.setBounds(463, 368, 182, 24);
		}
		return jTextField6;
	}
	
	private JLabel getJLabel9x() {
		if(jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setBounds(49, 324, 198, 81);
			jLabel9.setIcon(new ImageIcon(getClass().getClassLoader().getResource("picture/Tulips.jpg")));
		}
		return jLabel9;
	}
	
	private JTextField getJTextField5x() {
		if(jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setBounds(116, 156, 102, 24);
		}
		return jTextField5;
	}

}
