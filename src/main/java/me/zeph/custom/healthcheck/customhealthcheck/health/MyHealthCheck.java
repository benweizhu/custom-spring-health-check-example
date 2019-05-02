package me.zeph.custom.healthcheck.customhealthcheck.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthCheck implements HealthIndicator {
  @Override
  public Health health() {
    if (!this.isRedisConnected()) {
      return Health.down().build();
    }
    return Health.up().build();
  }

  private boolean isRedisConnected() {
    return false;
  }
}
