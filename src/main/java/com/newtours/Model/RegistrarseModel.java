package com.newtours.Model;

public class RegistrarseModel {
	
	public static final String REGISTER_PAGE ="registrarseNewtours";
	public static final String FIELD_NOMBRE = "nombre";
	public static final String FIELD_LAST_NAME = "apellido";
	public static final String FIELD_PHONE = "telefono";
	public static final String FIELD_EMAIL = "correo";
	public static final String FIELD_DIR1 = "dir1";
	public static final String FIELD_DIR2 = "dir2";
	public static final String FIELD_CITY = "ciudad";
	public static final String FIELD_STATE = "estado";
	public static final String FIELD_COD_POSTAL = "cod_postal";
	public static final String FIELD_CONTRY = "pais";
	public static final String FIELD_NAME = "username";
	public static final String FIELD_PASSWORD = "password";
	public static final String FIELD_CONFIRM_PASS = "confirm_pass";
	
	String nombre,apellido,telefono,correo,dir1,dir2,
	ciudad,estado,cod_postal,pais,username,password,conf_pass;

	public RegistrarseModel(String nombre, String apellido, String telefono, String correo, String dir1, String dir2,
			String ciudad, String estado, String cod_postal, String pais, String username, String password,
			String conf_pass) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.dir1 = dir1;
		this.dir2 = dir2;
		this.ciudad = ciudad;
		this.estado = estado;
		this.cod_postal = cod_postal;
		this.pais = pais;
		this.username = username;
		this.password = password;
		this.conf_pass = conf_pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDir1() {
		return dir1;
	}

	public void setDir1(String dir1) {
		this.dir1 = dir1;
	}

	public String getDir2() {
		return dir2;
	}

	public void setDir2(String dir2) {
		this.dir2 = dir2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(String cod_postal) {
		this.cod_postal = cod_postal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConf_pass() {
		return conf_pass;
	}

	public void setConf_pass(String conf_pass) {
		this.conf_pass = conf_pass;
	}
}
