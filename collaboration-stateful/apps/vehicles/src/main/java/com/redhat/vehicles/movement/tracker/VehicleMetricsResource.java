package com.redhat.vehicles.movement.tracker;

import java.util.ArrayList;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.apache.kafka.streams.StoreQueryParameters;


@Path("/vehicle/metrics")
public class VehicleMetricsResource {

    @Inject
    KafkaStreams streams;

    @GET
    public List<VehicleMetrics> list() {
        // TODO: query the store
    }
}