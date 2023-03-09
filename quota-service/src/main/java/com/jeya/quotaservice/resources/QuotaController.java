package com.jeya.quotaservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotas")
public class QuotaController
{
  @GetMapping("/")
  public int getVehicle()
  {
    return 1;
  }
}
