import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String name;
    private String email;
    private String programmingLanguage;
    private List<String> skills;

    // Constructor
    public Developer(String name, String email, String programmingLanguage) {
        setName(name);
        setEmail(email);
        setProgrammingLanguage(programmingLanguage);
        this.skills = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with integrity check
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email with integrity check
    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }

    // Getter for programming language
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Setter for programming language with integrity check
    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
            throw new IllegalArgumentException("Programming language cannot be null or empty");
        }
        this.programmingLanguage = programmingLanguage;
    }

    // Getter for skills
    public List<String> getSkills() {
        return new ArrayList<>(skills); // Return a copy to preserve encapsulation
    }

    // Method to add a skill with integrity check
    public void addSkill(String skill) {
        if (skill == null || skill.trim().isEmpty()) {
            throw new IllegalArgumentException("Skill cannot be null or empty");
        }
        this.skills.add(skill);
    }
} 