package music;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {

	static public boolean insert(Music newOneMusic) {
		boolean flag = false;
		try {
			// 1.
			Class.forName("org.sqlite.JDBC");
			// 2.
			Connection con = DriverManager
					.getConnection("jdbc:sqlite:Music.db");
			// 3.
			String sql = "INSERT INTO music VALUES(NULL,?,?,?,?,NULL)";
			PreparedStatement stat = con.prepareStatement(sql);

			stat.setString(1, newOneMusic.getName());
			stat.setString(2, newOneMusic.getSinger());
			stat.setString(3, newOneMusic.getCatalogue());
			stat.setDouble(4, newOneMusic.getLastedtime());

			// 4.
			int result = stat.executeUpdate();

			// 5.
			if (result > 0) {
				flag = true;
			} else {

			}
			// 6.
			stat.close();
			con.close();

		} catch (SQLException e) {

		} catch (Exception e) {

		}

		return flag;
	}

	static public boolean delete(int id) {
		boolean flag = false;
		try {
			// 1.
			Class.forName("org.sqlite.JDBC");
			// 2.
			Connection con = DriverManager
					.getConnection("jdbc:sqlite:Music.db");
			// 3.
			String sql = "DELETE FROM music WHERE mscno=?";
			PreparedStatement stat = con.prepareStatement(sql);

			stat.setInt(1, id);

			// 4.
			int result = stat.executeUpdate();

			// 5.
			if (result > 0) {
				flag = true;
			} else {

			}
			// 6.
			stat.close();
			con.close();

		} catch (SQLException e) {

		} catch (Exception e) {

		}

		return flag;
	}

	static public boolean update(Music oldOneMusic) {
		boolean flag = false;
		try {
			// 1.
			Class.forName("org.sqlite.JDBC");
			// 2.
			Connection con = DriverManager
					.getConnection("jdbc:sqlite:Music.db");
			// 3.
			String sql = "UPDATE music SET name=?,singer=?,type=?,msctime=? WHERE mscno=?";
			PreparedStatement stat = con.prepareStatement(sql);

			stat.setString(1, oldOneMusic.getName());
			stat.setString(2, oldOneMusic.getSinger());
			stat.setString(3, oldOneMusic.getCatalogue());
			stat.setDouble(4, oldOneMusic.getLastedtime());
			stat.setInt(5, oldOneMusic.getId());

			// 4.
			int result = stat.executeUpdate();

			// 5.
			if (result > 0) {
				flag = true;
			} else {

			}
			// 6.
			stat.close();
			con.close();

		} catch (SQLException e) {

		} catch (Exception e) {

		}

		return flag;
	}

	static public ArrayList<Music> select() {
		
		ArrayList<Music> musicList=new ArrayList<Music>();
		musicList.clear();
		
		try {
			// 1.
			Class.forName("org.sqlite.JDBC");
			// 2.
			Connection con = DriverManager.getConnection("jdbc:sqlite:Music.db");
			
			// 3.
			String sql = "SELECT * FROM music";
			Statement stat = con.createStatement();
			
			// 4.
			ResultSet rs = stat.executeQuery(sql);

			// 5.
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String singer = rs.getString(3);
				String catalogue = rs.getString(4);
				double lastedtime= rs.getDouble(5);
				
				Music oneMusic=new Music(id,name,singer,catalogue,lastedtime,null);
				musicList.add(oneMusic);
			}

			// 6.
			rs.close();
			stat.close();
			con.close();

		} catch (SQLException e) {
			musicList=null;
		} catch (Exception e) {
			musicList=null;
		}

		return musicList;
	}

	static public ArrayList<Music> select1(String name) {
		ArrayList<Music> musicList=new ArrayList<Music>();
		musicList.clear();
		
		try {
			// 1.
			Class.forName("org.sqlite.JDBC");
			
			// 2.
			Connection con = DriverManager.getConnection("jdbc:sqlite:Music.db");
			
			// 3.
			String sql = "SELECT * FROM music WHERE name = ?";
			PreparedStatement stat = con.prepareStatement(sql);
			
			stat.setString(1, name);
			
			// 4.
			ResultSet rs = stat.executeQuery();

			// 5.
			while (rs.next()) {
				int id = rs.getInt(1);
				String name1=rs.getString(2);
				String singer = rs.getString(3);
				String type = rs.getString(4);
				double time = rs.getDouble(5);
				
				Music oneMusic=new Music(id,name1,singer,type,time,null);
				musicList.add(oneMusic);
			}

			// 6.
			rs.close();
			stat.close();
			con.close();

		} catch (SQLException e) {
			musicList=null;
		} catch (Exception e) {
			musicList=null;
		}

		return musicList;
	}

	static public ArrayList<Music> select2(String singer) {
		ArrayList<Music> musicList=new ArrayList<Music>();
		musicList.clear();
		
		try {
			// 1.
			Class.forName("org.sqlite.JDBC");
			
			// 2.
			Connection con = DriverManager.getConnection("jdbc:sqlite:Music.db");
			
			// 3.
			String sql = "SELECT * FROM music WHERE singer=?";
			PreparedStatement stat = con.prepareStatement(sql);
			stat.setString(1, singer);
			
			// 4.
			ResultSet rs = stat.executeQuery();

			// 5.
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String singer1 = rs.getString(3);
				String type = rs.getString(4);
				double time = rs.getDouble(5);
				
				
				Music oneMusic=new Music(id,name,singer1,type,time,null);
				musicList.add(oneMusic);
			}

			// 6.
			rs.close();
			stat.close();
			con.close();

		} catch (SQLException e) {
			musicList=null;
		} catch (Exception e) {
			musicList=null;
		}

		return musicList;
	}
}
