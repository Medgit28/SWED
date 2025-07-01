import java.time.LocalDateTime;

public class TextComparison implements WebsiteComparison {
    @Override
    public boolean hasUpdated(String url, LocalDateTime lastChecked) {
        
        return Math.random() > 0.5;
    }
}