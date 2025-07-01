import java.time.LocalDateTime;

public interface WebsiteComparison {
    boolean hasUpdated(String url, LocalDateTime lastChecked);
}
