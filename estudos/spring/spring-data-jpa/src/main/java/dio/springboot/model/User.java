package dio.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //é crucial ser importada daquela importação; p eu ter uma entity, necessito de um ID
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //o id é gerado automaticamente
    @Column(name = "user_id") //chamo a anotação column p dizer que um nome terá uma diferença com o atributo
    private Integer id;
    @Column(length = 50, nullable = false) //tam máx e não nulo 
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
    }
    
}
