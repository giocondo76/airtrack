package com.solution.airtrack.Models.Users;

import javax.persistence.*;

import com.solution.airtrack.Models.Locations.Location;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name="first_name", nullable=false)
    private String firstName;

    @NotEmpty
    @Column(name="last_name", nullable=false)
    private String lastName;

    @Column(name="password")
    private String password;


    @NotEmpty
    @Column(name="email", nullable=false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role_id;

    @ManyToOne
    @JoinColumn(name = "loc_id", nullable = false)
    private Location loc_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole_id() {
        return role_id;
    }

    public void setRole_id(Role role_id) {
        this.role_id = role_id;
    }

    public Location getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(Location loc_id) {
        this.loc_id = loc_id;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", password=" + password
                + ", firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + ", role_id=" + role_id + ", loc_id=" + loc_id + "]";
    }

}