package com.vmware.taurus.base;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Controls if a feature is enabled/disabled.
 * To toggle feature specify featureflag.featureName.enabled .
 *
 * TODO: https://github.com/Unleash/unleash looks powerful
 * and potentially useful for operations team to use to do gradual roll-out of features, canary testing, A/B testing.
 */
@Configuration
@Getter
public class FeatureFlags {

   @Value("${featureflag.security.enabled:false}")
   private boolean securityEnabled = true;

   @Value("${featureflag.authorization.enabled:false}")
   boolean authorizationEnabled = false;

}