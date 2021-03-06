package com.software.lukaszwelnicki.msc.repositories;

import com.software.lukaszwelnicki.msc.measurements.documents.TurbineVibrations;
import reactor.core.publisher.Flux;

public interface TurbineVibrationsRepository extends MeasurementRepository<TurbineVibrations> {
    @Override
    Flux<TurbineVibrations> findBy();
}
