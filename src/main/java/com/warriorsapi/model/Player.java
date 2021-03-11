package com.warriorsapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="team")
	private String team;
	
	@Column(name="position")
	private String position;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="league_team")
	private String leagueTeam;
	
	@Column(name="username")
    private String username;
	
    @Column(name="password")
    @JsonIgnore
    private String password;
	
	
	@Column(name="authority")
	private String authority;
	
	

	public Player() {
		
	}

	public Player(int id, String firstName, String lastName, String team, String position, String email,
			String phoneNumber,String leagueTeam, String username, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.leagueTeam = leagueTeam;
		this.username = username;
		this.password = password;
	}

	public Player(String firstName, String lastName, String team, String position, String email, String phoneNumber, String leagueTeam, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.leagueTeam = leagueTeam;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getLeagueTeam() {
		return leagueTeam;
	}

	public void setLeagueTeam(String leagueTeam) {
		this.leagueTeam = leagueTeam;
	}


	public String getAuthority() {
		return authority;
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

}