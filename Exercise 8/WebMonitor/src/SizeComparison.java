import java.time.LocalDateTime;

public class SizeComparison implements WebsiteComparison {
    @Override
    public boolean hasUpdated(String url, LocalDateTime lastChecked) {
        // Simulate update check by size
        return Math.random() > 0.5;
    }
}