package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import formes.Cercle;



public class DAOCercle extends DAO<Cercle> {

	SQLConnexion SQLconnect = new SQLConnexion();
	Connection conn = SQLConnexion.getInstance();
	
	
	@Override
	public boolean create(Cercle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"INSERT INTO cercle (id, type, x1, y1, rayon) VALUES(?, ?, ?, ?, ?");
		
		prepare.setString(1, p.getId());
		prepare.setString(2, p.getType());
		prepare.setDouble(3, p.getx());
		prepare.setDouble(4, p.gety());
		prepare.setDouble(5, p.getRayon());
		
		prepare.executeUpdate();
		
		conn.close();
		return true;
	}

	@Override
	public Cercle read(String id) throws SQLException {
		PreparedStatement prepare = conn.prepareStatement(
				"SELECT * FROM cercle WHERE id = ?");
		prepare.setString(1, id);
		ResultSet result = prepare.executeQuery();
		
		Cercle t = new Cercle(result.getString("id"), result.getDouble("x1"),  result.getDouble("y1"),  result.getDouble("rayon"));
		
		conn.close();
		return t;
	}

	@Override
	public boolean update(Cercle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"UPDATE cercle SET (x1, y1, rayon) VALUES(?,?,?) WHERE id = ?");
		
		prepare.setString(4, p.getId());
		prepare.setDouble(1, p.getx());
		prepare.setDouble(2, p.gety());
		prepare.setDouble(3, p.getRayon());
		
		prepare.executeUpdate();
		
		conn.close();
		return true;
	}

	@Override
	public boolean delete(Cercle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"DELETE FROM cercle WHERE id = ?");
		prepare.setString(1, p.getId());
		return false;
	}
		
}
