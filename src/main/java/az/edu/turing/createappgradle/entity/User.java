package az.edu.turing.createappgradle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private int age;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String photoURL;
}
