package com.lambda.inventory_service.spinup.controller;

import com.lambda.inventory_service.config.LambdaAppProperties;
import com.lambda.inventory_service.spinup.view.AppVersionInfoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/spin-up")
public class SpinUpVerifyController {

    @Autowired
    private LambdaAppProperties lambdaAppProperties;

    @GetMapping("/version")
    public ResponseEntity<AppVersionInfoView> getAppVersion() {
        return ResponseEntity.of(Optional.of(new AppVersionInfoView(lambdaAppProperties.getAppName(),
                lambdaAppProperties.getAppVersion())));
    }
}
