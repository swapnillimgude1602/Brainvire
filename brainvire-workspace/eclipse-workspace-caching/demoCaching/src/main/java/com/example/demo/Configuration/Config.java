package com.example.demo.Configuration;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	CacheManagerCustomizer<ConcurrentMapCacheManager> customizer() {
		return new ConcurrentCustomizer();
	}

	class ConcurrentCustomizer implements CacheManagerCustomizer<ConcurrentMapCacheManager> {

		@Override
		public void customize(ConcurrentMapCacheManager cacheManager) {
			// TODO Auto-generated method stub
			cacheManager.setAllowNullValues(false);
			cacheManager.setStoreByValue(true);	//for this you have to implement serializable
			System.out.println("customizer invoked");
		}

	}
}
