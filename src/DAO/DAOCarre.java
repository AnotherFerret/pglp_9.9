package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import formes.Carre;



public class DAOCarre extends DAO<Carre> {

	SQLConnexion SQLconnect = new SQLConnexion();
	Connection conn = SQLConnexion.getInstance();
	
	
	@Override
	public boolean create(Carre p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"INSERT INTO carre (id, type, x1, x2, y1, y2, cote) VALUES(?, ?, ?, ?, ?, ?, ?");
		
		prepare.setString(1, p.getId());
		prepare.setString(2, p.getType());
		prepare.setDouble(3, p.getx1());
		prepare.setDouble(4, p.getx2());
		prepare.setDouble(5, p.gety1());
		prepare.setDouble(6, p.gety2());
		prepare.setDouble(7, p.getCote());
		
		prepare.executeUpdate();
		
		conn.close();
		return true;
	}

	@Override
	public Carre read(String id) throws SQLException {
		PreparedStatement prepare = conn.prepareStatement(
				"SELECT * FROM carre WHERE id = ?");
		prepare.setString(1, id);
		ResultSet result = prepare.executeQuery();
		
		Carre t = new Carre(result.getString("id"), result.getDouble("x1"), result.getDouble("x2"),  result.getDouble("y1"),  result.getDouble("y2"),  
				result.getDouble("cote"));
		
		conn.close();
		return t;
	}

	@Override
	public boolean update(Carre p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"UPDATE carre SET (x1, x2, y1, y2, cote) VALUES(?,?,?,?,?) WHERE id = ?");
		
		prepare.setString(6, p.getId());
		prepare.setDouble(1, p.getx1());
		prepare.setDouble(2, p.getx2());
		prepare.setDouble(3, p.gety1());
		prepare.setDouble(4, p.gety2());
		prepare.setDouble(5, p.getCote());
		
		prepare.executeUpdate();
		
		conn.close();
		return true;
	}

	@Override
	public boolean delete(Carre p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"DELETE FROM carre WHERE id = ?");
		prepare.setString(1, p.getId());
		return false;
	}
		
}
