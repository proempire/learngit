package music;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.WindowConstants;
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
public class MusicDialog1 extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JButton jButton1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MusicDialog1 inst = new MusicDialog1();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MusicDialog1() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1, "Center");
				jLabel1.setText("\u64cd\u4f5c\u6210\u529f\uff01");
				jLabel1.setBounds(52, 0, 182, 73);
				jLabel1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",1,36));
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("\u8fd4\u56de");
				jButton1.setBounds(0, 85, 261, 40);
				jButton1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",1,18));
			}
			pack();
			this.setSize(277, 163);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
