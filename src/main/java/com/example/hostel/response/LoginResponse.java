package com.example.hostel.response;

public class LoginResponse {
    private String token;
    private String role;
    private String email;
	private String firstName;

   

	public LoginResponse(String token, String role, String email,  String firstName) {
        this.token = token;
        this.role = role;
        this.email = email;
		this.firstName = firstName;
    }



	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}
}