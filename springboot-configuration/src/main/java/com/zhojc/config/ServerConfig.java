package com.zhojc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
//@Component
@Data
@ConfigurationProperties(prefix = "servers")
@Validated
public class ServerConfig {
  private String ipAddress;
//  @Max(value = 8080, message = "超过最大值8080")
//  @Min(value = 20, message = "小于最小值20")
  private int port;
  private long timeout;
  @DurationUnit(ChronoUnit.MINUTES)
  private Duration duration;
  @DataSizeUnit(DataUnit.MEGABYTES)
  private DataSize dataSize;
}
