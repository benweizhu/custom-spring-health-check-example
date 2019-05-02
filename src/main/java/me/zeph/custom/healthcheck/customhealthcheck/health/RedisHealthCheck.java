package me.zeph.custom.healthcheck.customhealthcheck.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class RedisHealthCheck extends AbstractHealthIndicator {

  @Override
  protected void doHealthCheck(Health.Builder builder) {
    try {
      this.checkRedis();
    } catch (Exception e) {
      builder.down().withException(e);
    }
  }

  private void checkRedis() throws Exception {
    throw new Exception("redis not connected");
  }
}
