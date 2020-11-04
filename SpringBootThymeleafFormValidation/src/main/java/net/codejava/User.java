package net.codejava;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class User {
	@Pattern(regexp ="([A-Z]{1}([a-z]{2,15})\\ ([A-Z]{1}([a-z]{2,15})))", message = "El nombre y apellido no cumplen con un formato válido")
	private String name;
	
	@NotBlank
	@Pattern(regexp ="[a-zA-Z0-9.]+@[a-zA-Z0-9.-]+\\.([a-zA-Z]{2,4})", message ="El email no cumple con el formato correcto")
	private String email;
	
	@NotBlank
	@Pattern(regexp ="[0-9]{5,10}", message ="Solo debe tener números con máximo 10 caracteres")
	private String password;
	
	@Pattern(regexp ="(3(([0-9]{9})))", message ="El número de telefono no cumple con el formato correcto")
	private String telefono;
	
	
	private int error;
	
	

  public int getError() {
    return error;
  }

  public void setError(int error) {
    this.error = error;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  
  
}
