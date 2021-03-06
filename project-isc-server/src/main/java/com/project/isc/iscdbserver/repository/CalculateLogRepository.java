package com.project.isc.iscdbserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.project.isc.iscdbserver.entity.CalculateLog;
@Repository
public interface CalculateLogRepository  extends JpaSpecificationExecutor<CalculateLog>,JpaRepository<CalculateLog, String> {

}
