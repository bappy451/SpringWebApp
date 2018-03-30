package com.project.travelguide.Commands;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SignUpCommand {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String accPassword;
    private Byte[] profileImage;
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }

    public Byte[] getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Byte[] profileImage) {
        this.profileImage = profileImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
