package com.jeya.adminservice.resources;

import com.jeya.adminservice.models.AdminDBSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AdminController
{
  @Autowired
  private AdminDBSettings adminDBSettings;

  @GetMapping("/db")
  public String getDBSettings()
  {
    return adminDBSettings.getConnection() + "**" + adminDBSettings.getHost() + "**" + adminDBSettings.getPort();
  }
}
