package com.thortful.apichallenge.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClearCacheService {

    public static final String MIDNIGHT = "0 0 0 * * *";

    @CacheEvict(value = "pokemon", allEntries = true)
    @Scheduled(cron = MIDNIGHT)
    public void clearPokemonCache() {
        log.info("Pokemon cache cleared");
    }
    @CacheEvict(value = "move", allEntries = true)
    @Scheduled(cron = MIDNIGHT)
    public void clearMoveCache() {
        log.info("Move cache cleared");
    }
    @CacheEvict(value = "berry", allEntries = true)
    @Scheduled(cron = MIDNIGHT)
    public void clearBerryCache() {
        log.info("Berry cache cleared");
    }
}
