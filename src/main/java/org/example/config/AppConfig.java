package org.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Configuration
public class AppConfig {
    @Value("${pub-sub.subscription-id}")
    private String subscriptionId;

    @Value("${pub-sub.project-id}")
    private String projectId;
}
