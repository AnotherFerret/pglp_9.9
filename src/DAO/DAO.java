package DAO;

import java.sql.SQLException;

public abstract class DAO<T> {
	
	public abstract boolean create(T p) throws SQLException;
	public abstract T read(String id) throws SQLException;
	public abstract boolean delete(T p) throws SQLException;
	public abstract boolean update(T p) throws SQLException;
}
