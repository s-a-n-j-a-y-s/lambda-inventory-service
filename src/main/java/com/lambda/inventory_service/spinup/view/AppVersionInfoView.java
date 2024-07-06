package com.lambda.inventory_service.spinup.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppVersionInfoView {
    private String appName;
    private String appVersion;
}
