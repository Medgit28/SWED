import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String name;
    private String email;
    private String programmingLanguage;
    private List<String> skills;

    public Developer(String name, String email, String programmingLanguage) {
        setName(name);
        setEmail(email);
        setProgrammingLanguage(programmingLanguage);
        this.skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null ) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null) {
            throw new IllegalArgumentException("Programming language cannot be null or empty");
        }
        this.programmingLanguage = programmingLanguage;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills); 
    }

    public void addSkill(String skill) {
        if (skill == null || skill.trim().isEmpty()) {
            throw new IllegalArgumentException("Skill cannot be null or empty");
        }
        this.skills.add(skill);
    }


    public static void main(String[] args) {
        Developer dev = new Developer("Mehdi", "Mehdi@example.com", "Java");
        dev.addSkill("Python");
        dev.addSkill("Hibernate");

        System.out.println("Developer Name: " + dev.getName());
        System.out.println("Email: " + dev.getEmail());
        System.out.println("Programming Language: " + dev.getProgrammingLanguage());
        System.out.println("Skills: " + dev.getSkills());
    }
}

