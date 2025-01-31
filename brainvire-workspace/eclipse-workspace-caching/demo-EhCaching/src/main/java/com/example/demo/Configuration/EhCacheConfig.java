package com.example.demo.Configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@EnableCaching
@Configuration
public class EhCacheConfig {

	@Bean
	public CacheManager cacheManager() {
		return new EhCacheCacheMaCachingProvidernager(cacheMangerFactory().getObject());
	}

	@Bean
	public EhCacheManagerFactoryBean cacheMangerFactory() {
		EhCacheManagerFactoryBean bean = new EhCacheManagerFactoryBean();
		bean.setConfigLocation(new ClassPathResource("ehcache.xml"));
		bean.setShared(true);
		return bean;
	}

//	public javax.cache.CacheManager EhcacheManager() {
//		CacheConfiguration<String, Book> cachecConfig = CacheConfigurationBuilder
//				.newCacheConfigurationBuilder(String.class,Book.class,
//	             ResourcePoolsBuilder.newResourcePoolsBuilder()
//	             .offheap(10, MemoryUnit.MB)
//	             .build())
//				.withExpiry(ExpiryPolicyBuilder.timeToIdleExpiration(Duration.ofSeconds(10)))
//				.build();
//		
//	     CachingProvider cachingProvider = Caching.getCachingProvider();
//	     javax.cache.CacheManager cacheManager = cachingProvider.getCacheManager();
//	     
//	     javax.cache.configuration.Configuration<String, Book> configuration = Eh107Configuration.fromEhcacheCacheConfiguration(cachecConfig);
//	        cacheManager.createCache("cacheStore", configuration);
//	        return cacheManager;
//
//	}

}
