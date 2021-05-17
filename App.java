package com.sebastiaofortes.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class App 
{
	 public static void main( String[] args ) throws SQLException 
	    {

	Conectar nova_conexao = new Conectar();
	Connection conexao = nova_conexao.iniciar();    
	Statement demonstracao = conexao.createStatement();
	ResultSet resultado = demonstracao.executeQuery("select * from usuarios");

	while(resultado.next()){ //o método next() retorna true caso haja mais linhas

	    System.out.print(resultado.getString("matricula")+"\t");

	    System.out.print(resultado.getString("nome")+"\t");

	    System.out.println(resultado.getString("email"));

	 }
		
	    }
}
