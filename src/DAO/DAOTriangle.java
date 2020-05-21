package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import formes.Triangle;



public class DAOTriangle extends DAO<Triangle> {

	SQLConnexion SQLconnect = new SQLConnexion();
	Connection conn = SQLConnexion.getInstance();
	
	
	@Override
	public boolean create(Triangle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"INSERT INTO triangle (id, type, x1, x2, y1, y2, c1, c2, c3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?");
		
		prepare.setString(1, p.getId());
		prepare.setString(2, p.getType());
		prepare.setDouble(3, p.getx1());
		prepare.setDouble(4, p.getx2());
		prepare.setDouble(5, p.gety1());
		prepare.setDouble(6, p.gety2());
		prepare.setDouble(7, p.getc1());
		prepare.setDouble(8, p.getc2());
		prepare.setDouble(9, p.getc3());
		
		prepare.executeUpdate();
		
		conn.close();
		return true;
	}

	@Override
	public Triangle read(String id) throws SQLException {
		PreparedStatement prepare = conn.prepareStatement(
				"SELECT * FROM personnel WHERE id = ?");
		prepare.setString(1, id);
		ResultSet result = prepare.executeQuery();
		
		Triangle t = new Triangle(result.getString("id"), result.getDouble("x1"), result.getDouble("x2"),  result.getDouble("y1"),  result.getDouble("y2"),  
				result.getDouble("c1"),  result.getDouble("c2"),  result.getDouble("c3"));
		
		conn.close();
		return t;
	}

	@Override
	public boolean update(Triangle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"UPDATE triangle SET (x1, x2, y1, y2, c1, c2, c3) VALUES(?,?,?,?,?,?,?) WHERE id = ?");
		
		prepare.setString(8, p.getId());
		prepare.setDouble(1, p.getx1());
		prepare.setDouble(2, p.getx2());
		prepare.setDouble(3, p.gety1());
		prepare.setDouble(4, p.gety2());
		prepare.setDouble(5, p.getc1());
		prepare.setDouble(6, p.getc2());
		prepare.setDouble(7, p.getc3());
		
		prepare.executeUpdate();
		
		conn.close();
		return true;
	}

	@Override
	public boolean delete(Triangle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"DELETE FROM triangle WHERE id = ?");
		prepare.setString(1, p.getId());
		return false;
	}
		
}
