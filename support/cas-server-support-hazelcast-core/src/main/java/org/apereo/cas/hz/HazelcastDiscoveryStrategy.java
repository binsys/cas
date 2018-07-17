package org.apereo.cas.hz;

import org.apereo.cas.configuration.model.support.hazelcast.HazelcastClusterProperties;

import com.hazelcast.config.DiscoveryStrategyConfig;

/**
 * This is {@link HazelcastDiscoveryStrategy}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
@FunctionalInterface
public interface HazelcastDiscoveryStrategy {
    /**
     * Get discovery strategy config.
     *
     * @param cluster the cluster
     * @return the discovery strategy config
     */
    DiscoveryStrategyConfig get(HazelcastClusterProperties cluster);
}
