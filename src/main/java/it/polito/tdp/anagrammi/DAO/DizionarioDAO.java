package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DizionarioDAO {
	
	public boolean isCorrect(String nome) {
		
		boolean is = false;
		final String sql = "SELECT * "
						+ "FROM parola "
						+ "WHERE nome = ?";
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, nome);
			ResultSet rs = st.executeQuery();


			if(rs.next()) {
				is = true;
			}
			
			conn.close();
			st.close();
			rs.close();
			
		} catch(SQLException e) {
			System.err.println("Errore nel DizionarioDAO");
			e.printStackTrace();
		}
		return is;
	}
}
