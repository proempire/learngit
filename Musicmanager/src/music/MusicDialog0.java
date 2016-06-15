package music;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class MusicDialog0 extends javax.swing.JDialog {
	private JTable jTable1;
	private JButton jButton1;
	private JScrollPane jScrollPane1;
	private JLabel jLabel1;
	DefaultTableModel jTable1Model = new DefaultTableModel();

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public MusicDialog0(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setLocation(new java.awt.Point(0, 0));
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1, BorderLayout.NORTH);
				jLabel1.setText("\u6b4c\u66f2\u4fe1\u606f\u5217\u8868");
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1, BorderLayout.CENTER);
				jScrollPane1.setPreferredSize(new java.awt.Dimension(882, 368));
				{
					jTable1Model = 	new DefaultTableModel();
					jTable1Model.setColumnCount(0);
					jTable1Model.addColumn("ID");
					jTable1Model.addColumn("歌名");
					jTable1Model.addColumn("歌手");
					jTable1Model.addColumn("分类");
					jTable1Model.addColumn("时长");
					jTable1Model.setRowCount(0);
					
					jTable1 = new JTable();
					jScrollPane1.setViewportView(jTable1);
					jTable1.setModel(jTable1Model);
					jTable1.setPreferredSize(new java.awt.Dimension(569, 437));
					jTable1.setBackground(new java.awt.Color(255,128,128));
					jTable1.setFont(new java.awt.Font("楷体",0,16));
				}
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1, BorderLayout.SOUTH);
				jButton1.setText("\u8fd4\u56de");
				jButton1.setPreferredSize(new java.awt.Dimension(384, 72));
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						MusicDialog0.this.setVisible(false);
					}
				});
			}
			pack();
			this.setSize(817, 495);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void initTableDatas() {
		ArrayList<Music> musicList=new ArrayList<Music>();
		musicList=Database.select();
		if(musicList==null){
			return;
		}
		
		this.jTable1Model.setRowCount(0);
		for(Music onemusic:musicList){		
			
			this.jTable1Model.addRow(
					new String[]{
							""+onemusic.getId(),onemusic.getName(),
							onemusic.getSinger(),onemusic.getCatalogue(),
							""+onemusic.getLastedtime()
			        }
			);
		}
		
	}
	
	public void initTableDatas1(String name) {
		ArrayList<Music> musicList=new ArrayList<Music>();
		musicList=Database.select1(name);
		if(musicList==null){
			return;
		}
		
		this.jTable1Model.setRowCount(0);
		for(Music onemusic:musicList){		
			
			this.jTable1Model.addRow(
					new String[]{
							""+onemusic.getId(),onemusic.getName(),
							onemusic.getSinger(),onemusic.getCatalogue(),
							""+onemusic.getLastedtime()
			        }
			);
		}
		
	}
	
	public void initTableDatas2(String type) {
		ArrayList<Music> musicList=new ArrayList<Music>();
		musicList=Database.select2(type);
		if(musicList==null){
			return;
		}
		
		this.jTable1Model.setRowCount(0);
		for(Music onemusic:musicList){		
			
			this.jTable1Model.addRow(
					new String[]{
							""+onemusic.getId(),onemusic.getName(),
							onemusic.getSinger(),onemusic.getCatalogue(),
							""+onemusic.getLastedtime()
			        }
			);
		}
		
	}

}
